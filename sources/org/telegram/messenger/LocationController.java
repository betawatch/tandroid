package org.telegram.messenger;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.LongSparseArray;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$GeoPoint;
import org.telegram.tgnet.TLRPC$InputGeoPoint;
import org.telegram.tgnet.TLRPC$InputMedia;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$TL_channels_readMessageContents;
import org.telegram.tgnet.TLRPC$TL_contacts_getLocated;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_geoPoint;
import org.telegram.tgnet.TLRPC$TL_inputGeoPoint;
import org.telegram.tgnet.TLRPC$TL_inputGeoPointEmpty;
import org.telegram.tgnet.TLRPC$TL_inputMediaGeoLive;
import org.telegram.tgnet.TLRPC$TL_messageActionGeoProximityReached;
import org.telegram.tgnet.TLRPC$TL_messageMediaGeoLive;
import org.telegram.tgnet.TLRPC$TL_messageMediaVenue;
import org.telegram.tgnet.TLRPC$TL_messages_affectedMessages;
import org.telegram.tgnet.TLRPC$TL_messages_editMessage;
import org.telegram.tgnet.TLRPC$TL_messages_getRecentLocations;
import org.telegram.tgnet.TLRPC$TL_messages_readMessageContents;
import org.telegram.tgnet.TLRPC$TL_peerLocated;
import org.telegram.tgnet.TLRPC$TL_updateEditChannelMessage;
import org.telegram.tgnet.TLRPC$TL_updateEditMessage;
import org.telegram.tgnet.TLRPC$Update;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.tgnet.tl.TL_stories$TL_geoPointAddress;
@SuppressLint({"MissingPermission"})
/* loaded from: classes3.dex */
public class LocationController extends BaseController implements NotificationCenter.NotificationCenterDelegate, ILocationServiceProvider.IAPIConnectionCallbacks, ILocationServiceProvider.IAPIOnConnectionFailedListener {
    private static final int BACKGROUD_UPDATE_TIME = 30000;
    private static final long FASTEST_INTERVAL = 1000;
    private static final int FOREGROUND_UPDATE_TIME = 20000;
    private static final int LOCATION_ACQUIRE_TIME = 10000;
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private static final int SEND_NEW_LOCATION_TIME = 2000;
    public static final int TYPE_BIZ = 1;
    public static final int TYPE_STORY = 2;
    private static final long UPDATE_INTERVAL = 1000;
    private static final int WATCH_LOCATION_TIMEOUT = 65000;
    private ILocationServiceProvider.IMapApiClient apiClient;
    private LongSparseArray<Boolean> cacheRequests;
    private ArrayList<TLRPC$TL_peerLocated> cachedNearbyChats;
    private ArrayList<TLRPC$TL_peerLocated> cachedNearbyUsers;
    private FusedLocationListener fusedLocationListener;
    private GpsLocationListener gpsLocationListener;
    private Location lastKnownLocation;
    private boolean lastLocationByMaps;
    private long lastLocationSendTime;
    private long lastLocationStartTime;
    private LongSparseArray<Integer> lastReadLocationTime;
    private long locationEndWatchTime;
    private LocationManager locationManager;
    private ILocationServiceProvider.ILocationRequest locationRequest;
    private boolean locationSentSinceLastMapUpdate;
    public LongSparseArray<ArrayList<TLRPC$Message>> locationsCache;
    private boolean lookingForPeopleNearby;
    private GpsLocationListener networkLocationListener;
    private GpsLocationListener passiveLocationListener;
    private SparseIntArray requests;
    private Boolean servicesAvailable;
    private boolean shareMyCurrentLocation;
    private ArrayList<SharingLocationInfo> sharingLocations;
    private LongSparseArray<SharingLocationInfo> sharingLocationsMap;
    private LongSparseArray<SharingLocationInfo> sharingLocationsMapUI;
    public ArrayList<SharingLocationInfo> sharingLocationsUI;
    private boolean started;
    private boolean wasConnectedToPlayServices;
    private static volatile LocationController[] Instance = new LocationController[4];
    public static String[] unnamedRoads = {"Unnamed Road", "Вulicya bez nazvi", "Нeizvestnaya doroga", "İsimsiz Yol", "Ceļš bez nosaukuma", "Kelias be pavadinimo", "Droga bez nazwy", "Cesta bez názvu", "Silnice bez názvu", "Drum fără nume", "Route sans nom", "Vía sin nombre", "Estrada sem nome", "Οdos xoris onomasia", "Rrugë pa emër", "Пat bez ime", "Нeimenovani put", "Strada senza nome", "Straße ohne Straßennamen"};
    private static HashMap<LocationFetchCallback, Runnable> callbacks = new HashMap<>();

    /* loaded from: classes3.dex */
    public interface LocationFetchCallback {
        void onLocationAddressAvailable(String str, String str2, TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue, TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue2, Location location);
    }

    /* loaded from: classes3.dex */
    public static class SharingLocationInfo {
        public int account;
        public long did;
        public int lastSentProximityMeters;
        public MessageObject messageObject;
        public int mid;
        public int period;
        public int proximityMeters;
        public int stopTime;
    }

    public static String detectOcean(double d, double d2) {
        if (d2 > 65.0d) {
            return "Arctic Ocean";
        }
        if (d <= -88.0d || d >= 40.0d || d2 <= 0.0d) {
            if (d <= -60.0d || d >= 20.0d || d2 > 0.0d) {
                if (d2 > 30.0d || d < 20.0d || d >= 150.0d) {
                    if ((d > 106.0d || d < -60.0d) && d2 > 0.0d) {
                        return "Pacific Ocean";
                    }
                    if ((d > 150.0d || d < -60.0d) && d2 <= 0.0d) {
                        return "Pacific Ocean";
                    }
                    return null;
                }
                return "Indian Ocean";
            }
            return "Atlantic Ocean";
        }
        return "Atlantic Ocean";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$broadcastLastKnownLocation$8(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    @Override // org.telegram.messenger.ILocationServiceProvider.IAPIConnectionCallbacks
    public void onConnectionSuspended(int i) {
    }

    public static LocationController getInstance(int i) {
        LocationController locationController = Instance[i];
        if (locationController == null) {
            synchronized (LocationController.class) {
                locationController = Instance[i];
                if (locationController == null) {
                    LocationController[] locationControllerArr = Instance;
                    LocationController locationController2 = new LocationController(i);
                    locationControllerArr[i] = locationController2;
                    locationController = locationController2;
                }
            }
        }
        return locationController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class GpsLocationListener implements LocationListener {
        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }

        private GpsLocationListener() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            if (LocationController.this.lastKnownLocation == null || (this != LocationController.this.networkLocationListener && this != LocationController.this.passiveLocationListener)) {
                LocationController.this.setLastKnownLocation(location);
            } else if (LocationController.this.started || location.distanceTo(LocationController.this.lastKnownLocation) <= 20.0f) {
            } else {
                LocationController.this.setLastKnownLocation(location);
                LocationController.this.lastLocationSendTime = (SystemClock.elapsedRealtime() - 30000) + 5000;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class FusedLocationListener implements ILocationServiceProvider.ILocationListener {
        private FusedLocationListener() {
        }

        @Override // org.telegram.messenger.ILocationServiceProvider.ILocationListener
        public void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            LocationController.this.setLastKnownLocation(location);
        }
    }

    public LocationController(int i) {
        super(i);
        this.sharingLocationsMap = new LongSparseArray<>();
        this.sharingLocations = new ArrayList<>();
        this.locationsCache = new LongSparseArray<>();
        this.lastReadLocationTime = new LongSparseArray<>();
        this.gpsLocationListener = new GpsLocationListener();
        this.networkLocationListener = new GpsLocationListener();
        this.passiveLocationListener = new GpsLocationListener();
        this.fusedLocationListener = new FusedLocationListener();
        this.locationSentSinceLastMapUpdate = true;
        this.requests = new SparseIntArray();
        this.cacheRequests = new LongSparseArray<>();
        this.sharingLocationsUI = new ArrayList<>();
        this.sharingLocationsMapUI = new LongSparseArray<>();
        this.cachedNearbyUsers = new ArrayList<>();
        this.cachedNearbyChats = new ArrayList<>();
        this.locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        this.apiClient = ApplicationLoader.getLocationServiceProvider().onCreateLocationServicesAPI(ApplicationLoader.applicationContext, this, this);
        ILocationServiceProvider.ILocationRequest onCreateLocationRequest = ApplicationLoader.getLocationServiceProvider().onCreateLocationRequest();
        this.locationRequest = onCreateLocationRequest;
        onCreateLocationRequest.setPriority(0);
        this.locationRequest.setInterval(1000L);
        this.locationRequest.setFastestInterval(1000L);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.this.lambda$new$0();
            }
        });
        loadSharingLocations();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        LocationController locationController = getAccountInstance().getLocationController();
        getNotificationCenter().addObserver(locationController, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(locationController, NotificationCenter.messagesDeleted);
        getNotificationCenter().addObserver(locationController, NotificationCenter.replaceMessagesObjects);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList<TLRPC$Message> arrayList;
        ArrayList<TLRPC$Message> arrayList2;
        boolean z;
        if (i == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue = ((Long) objArr[0]).longValue();
            if (isSharingLocation(longValue) && (arrayList2 = this.locationsCache.get(longValue)) != null) {
                ArrayList arrayList3 = (ArrayList) objArr[1];
                boolean z2 = false;
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    MessageObject messageObject = (MessageObject) arrayList3.get(i3);
                    if (messageObject.isLiveLocation()) {
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                z = false;
                                break;
                            } else if (MessageObject.getFromChatId(arrayList2.get(i4)) == messageObject.getFromChatId()) {
                                arrayList2.set(i4, messageObject.messageOwner);
                                z = true;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (!z) {
                            arrayList2.add(messageObject.messageOwner);
                        }
                        z2 = true;
                    } else if (messageObject.messageOwner.action instanceof TLRPC$TL_messageActionGeoProximityReached) {
                        long dialogId = messageObject.getDialogId();
                        if (DialogObject.isUserDialog(dialogId)) {
                            setProximityLocation(dialogId, 0, false);
                        }
                    }
                }
                if (z2) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(longValue), Integer.valueOf(this.currentAccount));
                }
            }
        } else if (i == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue() || this.sharingLocationsUI.isEmpty()) {
                return;
            }
            ArrayList arrayList4 = (ArrayList) objArr[0];
            long longValue2 = ((Long) objArr[1]).longValue();
            ArrayList arrayList5 = null;
            for (int i5 = 0; i5 < this.sharingLocationsUI.size(); i5++) {
                SharingLocationInfo sharingLocationInfo = this.sharingLocationsUI.get(i5);
                MessageObject messageObject2 = sharingLocationInfo.messageObject;
                if (longValue2 == (messageObject2 != null ? messageObject2.getChannelId() : 0L) && arrayList4.contains(Integer.valueOf(sharingLocationInfo.mid))) {
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                    }
                    arrayList5.add(Long.valueOf(sharingLocationInfo.did));
                }
            }
            if (arrayList5 != null) {
                for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                    removeSharingLocation(((Long) arrayList5.get(i6)).longValue());
                }
            }
        } else if (i == NotificationCenter.replaceMessagesObjects) {
            long longValue3 = ((Long) objArr[0]).longValue();
            if (isSharingLocation(longValue3) && (arrayList = this.locationsCache.get(longValue3)) != null) {
                ArrayList arrayList6 = (ArrayList) objArr[1];
                boolean z3 = false;
                for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                    MessageObject messageObject3 = (MessageObject) arrayList6.get(i7);
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList.size()) {
                            break;
                        } else if (MessageObject.getFromChatId(arrayList.get(i8)) == messageObject3.getFromChatId()) {
                            if (!messageObject3.isLiveLocation()) {
                                arrayList.remove(i8);
                            } else {
                                arrayList.set(i8, messageObject3.messageOwner);
                            }
                            z3 = true;
                        } else {
                            i8++;
                        }
                    }
                }
                if (z3) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(longValue3), Integer.valueOf(this.currentAccount));
                }
            }
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider.IAPIConnectionCallbacks
    public void onConnected(Bundle bundle) {
        this.wasConnectedToPlayServices = true;
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                ApplicationLoader.getLocationServiceProvider().checkLocationSettings(this.locationRequest, new Consumer() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda1
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        LocationController.this.lambda$onConnected$4((Integer) obj);
                    }
                });
            } else {
                startFusedLocationRequest(true);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnected$4(final Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            startFusedLocationRequest(true);
        } else if (intValue == 1) {
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    LocationController.this.lambda$onConnected$2(num);
                }
            });
        } else if (intValue != 2) {
        } else {
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    LocationController.this.lambda$onConnected$3();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnected$2(final Integer num) {
        if (this.lookingForPeopleNearby || !this.sharingLocations.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    LocationController.this.lambda$onConnected$1(num);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnected$1(Integer num) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowPlayServicesAlert, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnected$3() {
        this.servicesAvailable = Boolean.FALSE;
        try {
            this.apiClient.disconnect();
            start();
        } catch (Throwable unused) {
        }
    }

    public void startFusedLocationRequest(final boolean z) {
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.this.lambda$startFusedLocationRequest$5(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startFusedLocationRequest$5(boolean z) {
        if (!z) {
            this.servicesAvailable = Boolean.FALSE;
        }
        if (this.shareMyCurrentLocation || this.lookingForPeopleNearby || !this.sharingLocations.isEmpty()) {
            if (z) {
                try {
                    ApplicationLoader.getLocationServiceProvider().getLastLocation(new Consumer() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda0
                        @Override // androidx.core.util.Consumer
                        public final void accept(Object obj) {
                            LocationController.this.setLastKnownLocation((Location) obj);
                        }
                    });
                    ApplicationLoader.getLocationServiceProvider().requestLocationUpdates(this.locationRequest, this.fusedLocationListener);
                    return;
                } catch (Throwable th) {
                    FileLog.e(th);
                    return;
                }
            }
            start();
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider.IAPIOnConnectionFailedListener
    public void onConnectionFailed() {
        if (this.wasConnectedToPlayServices) {
            return;
        }
        this.servicesAvailable = Boolean.FALSE;
        if (this.started) {
            this.started = false;
            start();
        }
    }

    private boolean checkServices() {
        if (this.servicesAvailable == null) {
            this.servicesAvailable = Boolean.valueOf(ApplicationLoader.getLocationServiceProvider().checkServices());
        }
        return this.servicesAvailable.booleanValue();
    }

    private void broadcastLastKnownLocation(boolean z) {
        int i;
        TLRPC$GeoPoint tLRPC$GeoPoint;
        if (this.lastKnownLocation == null) {
            return;
        }
        if (this.requests.size() != 0) {
            if (z) {
                for (int i2 = 0; i2 < this.requests.size(); i2++) {
                    getConnectionsManager().cancelRequest(this.requests.keyAt(i2), false);
                }
            }
            this.requests.clear();
        }
        if (!this.sharingLocations.isEmpty()) {
            int currentTime = getConnectionsManager().getCurrentTime();
            float[] fArr = new float[1];
            while (i < this.sharingLocations.size()) {
                final SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i);
                TLRPC$Message tLRPC$Message = sharingLocationInfo.messageObject.messageOwner;
                TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
                if (tLRPC$MessageMedia != null && (tLRPC$GeoPoint = tLRPC$MessageMedia.geo) != null && sharingLocationInfo.lastSentProximityMeters == sharingLocationInfo.proximityMeters) {
                    int i3 = tLRPC$Message.edit_date;
                    if (i3 == 0) {
                        i3 = tLRPC$Message.date;
                    }
                    if (Math.abs(currentTime - i3) < 10) {
                        Location.distanceBetween(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long, this.lastKnownLocation.getLatitude(), this.lastKnownLocation.getLongitude(), fArr);
                        i = fArr[0] < 1.0f ? i + 1 : 0;
                    }
                }
                final TLRPC$TL_messages_editMessage tLRPC$TL_messages_editMessage = new TLRPC$TL_messages_editMessage();
                tLRPC$TL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
                tLRPC$TL_messages_editMessage.id = sharingLocationInfo.mid;
                tLRPC$TL_messages_editMessage.flags |= LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM;
                TLRPC$TL_inputMediaGeoLive tLRPC$TL_inputMediaGeoLive = new TLRPC$TL_inputMediaGeoLive();
                tLRPC$TL_messages_editMessage.media = tLRPC$TL_inputMediaGeoLive;
                tLRPC$TL_inputMediaGeoLive.stopped = false;
                tLRPC$TL_inputMediaGeoLive.geo_point = new TLRPC$TL_inputGeoPoint();
                tLRPC$TL_messages_editMessage.media.geo_point.lat = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLatitude());
                tLRPC$TL_messages_editMessage.media.geo_point._long = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLongitude());
                tLRPC$TL_messages_editMessage.media.geo_point.accuracy_radius = (int) this.lastKnownLocation.getAccuracy();
                TLRPC$InputMedia tLRPC$InputMedia = tLRPC$TL_messages_editMessage.media;
                TLRPC$InputGeoPoint tLRPC$InputGeoPoint = tLRPC$InputMedia.geo_point;
                if (tLRPC$InputGeoPoint.accuracy_radius != 0) {
                    tLRPC$InputGeoPoint.flags |= 1;
                }
                int i4 = sharingLocationInfo.lastSentProximityMeters;
                int i5 = sharingLocationInfo.proximityMeters;
                if (i4 != i5) {
                    tLRPC$InputMedia.proximity_notification_radius = i5;
                    tLRPC$InputMedia.flags |= 8;
                }
                tLRPC$InputMedia.heading = getHeading(this.lastKnownLocation);
                tLRPC$TL_messages_editMessage.media.flags |= 4;
                final int[] iArr = {getConnectionsManager().sendRequest(tLRPC$TL_messages_editMessage, new RequestDelegate() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda31
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        LocationController.this.lambda$broadcastLastKnownLocation$7(sharingLocationInfo, iArr, tLRPC$TL_messages_editMessage, tLObject, tLRPC$TL_error);
                    }
                })};
                this.requests.put(iArr[0], 0);
            }
        }
        if (this.shareMyCurrentLocation) {
            UserConfig userConfig = getUserConfig();
            userConfig.lastMyLocationShareTime = (int) (System.currentTimeMillis() / 1000);
            userConfig.saveConfig(false);
            TLRPC$TL_contacts_getLocated tLRPC$TL_contacts_getLocated = new TLRPC$TL_contacts_getLocated();
            TLRPC$TL_inputGeoPoint tLRPC$TL_inputGeoPoint = new TLRPC$TL_inputGeoPoint();
            tLRPC$TL_contacts_getLocated.geo_point = tLRPC$TL_inputGeoPoint;
            tLRPC$TL_inputGeoPoint.lat = this.lastKnownLocation.getLatitude();
            tLRPC$TL_contacts_getLocated.geo_point._long = this.lastKnownLocation.getLongitude();
            tLRPC$TL_contacts_getLocated.background = true;
            getConnectionsManager().sendRequest(tLRPC$TL_contacts_getLocated, new RequestDelegate() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda32
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    LocationController.lambda$broadcastLastKnownLocation$8(tLObject, tLRPC$TL_error);
                }
            });
        }
        getConnectionsManager().resumeNetworkMaybe();
        if (shouldStopGps() || this.shareMyCurrentLocation) {
            this.shareMyCurrentLocation = false;
            stop(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$broadcastLastKnownLocation$7(final SharingLocationInfo sharingLocationInfo, int[] iArr, TLRPC$TL_messages_editMessage tLRPC$TL_messages_editMessage, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            if (tLRPC$TL_error.text.equals("MESSAGE_ID_INVALID")) {
                this.sharingLocations.remove(sharingLocationInfo);
                this.sharingLocationsMap.remove(sharingLocationInfo.did);
                saveSharingLocation(sharingLocationInfo, 1);
                this.requests.delete(iArr[0]);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda20
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationController.this.lambda$broadcastLastKnownLocation$6(sharingLocationInfo);
                    }
                });
                return;
            }
            return;
        }
        if ((tLRPC$TL_messages_editMessage.flags & 8) != 0) {
            sharingLocationInfo.lastSentProximityMeters = tLRPC$TL_messages_editMessage.media.proximity_notification_radius;
        }
        TLRPC$Updates tLRPC$Updates = (TLRPC$Updates) tLObject;
        boolean z = false;
        for (int i = 0; i < tLRPC$Updates.updates.size(); i++) {
            TLRPC$Update tLRPC$Update = tLRPC$Updates.updates.get(i);
            if (tLRPC$Update instanceof TLRPC$TL_updateEditMessage) {
                sharingLocationInfo.messageObject.messageOwner = ((TLRPC$TL_updateEditMessage) tLRPC$Update).message;
            } else if (tLRPC$Update instanceof TLRPC$TL_updateEditChannelMessage) {
                sharingLocationInfo.messageObject.messageOwner = ((TLRPC$TL_updateEditChannelMessage) tLRPC$Update).message;
            }
            z = true;
        }
        if (z) {
            saveSharingLocation(sharingLocationInfo, 0);
        }
        getMessagesController().processUpdates(tLRPC$Updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$broadcastLastKnownLocation$6(SharingLocationInfo sharingLocationInfo) {
        this.sharingLocationsUI.remove(sharingLocationInfo);
        this.sharingLocationsMapUI.remove(sharingLocationInfo.did);
        if (this.sharingLocationsUI.isEmpty()) {
            stopService();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    private boolean shouldStopGps() {
        return SystemClock.elapsedRealtime() > this.locationEndWatchTime;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setNewLocationEndWatchTime() {
        if (this.sharingLocations.isEmpty()) {
            return;
        }
        this.locationEndWatchTime = SystemClock.elapsedRealtime() + 65000;
        start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void update() {
        UserConfig userConfig = getUserConfig();
        if (ApplicationLoader.isScreenOn && !ApplicationLoader.mainInterfacePaused && !this.shareMyCurrentLocation && userConfig.isClientActivated() && userConfig.isConfigLoaded() && userConfig.sharingMyLocationUntil != 0 && Math.abs((System.currentTimeMillis() / 1000) - userConfig.lastMyLocationShareTime) >= 3600) {
            this.shareMyCurrentLocation = true;
        }
        if (!this.sharingLocations.isEmpty()) {
            int i = 0;
            while (i < this.sharingLocations.size()) {
                final SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i);
                if (sharingLocationInfo.stopTime <= getConnectionsManager().getCurrentTime()) {
                    this.sharingLocations.remove(i);
                    this.sharingLocationsMap.remove(sharingLocationInfo.did);
                    saveSharingLocation(sharingLocationInfo, 1);
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda22
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationController.this.lambda$update$9(sharingLocationInfo);
                        }
                    });
                    i--;
                }
                i++;
            }
        }
        if (this.started) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.lastLocationByMaps || Math.abs(this.lastLocationStartTime - elapsedRealtime) > 10000 || shouldSendLocationNow()) {
                this.lastLocationByMaps = false;
                this.locationSentSinceLastMapUpdate = true;
                boolean z = SystemClock.elapsedRealtime() - this.lastLocationSendTime > 2000;
                this.lastLocationStartTime = elapsedRealtime;
                this.lastLocationSendTime = SystemClock.elapsedRealtime();
                broadcastLastKnownLocation(z);
            }
        } else if (!this.sharingLocations.isEmpty() || this.shareMyCurrentLocation) {
            if (this.shareMyCurrentLocation || Math.abs(this.lastLocationSendTime - SystemClock.elapsedRealtime()) > 30000) {
                this.lastLocationStartTime = SystemClock.elapsedRealtime();
                start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$update$9(SharingLocationInfo sharingLocationInfo) {
        this.sharingLocationsUI.remove(sharingLocationInfo);
        this.sharingLocationsMapUI.remove(sharingLocationInfo.did);
        if (this.sharingLocationsUI.isEmpty()) {
            stopService();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    private boolean shouldSendLocationNow() {
        return shouldStopGps() && Math.abs(this.lastLocationSendTime - SystemClock.elapsedRealtime()) >= 2000;
    }

    public void cleanup() {
        this.sharingLocationsUI.clear();
        this.sharingLocationsMapUI.clear();
        this.locationsCache.clear();
        this.cacheRequests.clear();
        this.cachedNearbyUsers.clear();
        this.cachedNearbyChats.clear();
        this.lastReadLocationTime.clear();
        stopService();
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.this.lambda$cleanup$10();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cleanup$10() {
        this.locationEndWatchTime = 0L;
        this.requests.clear();
        this.sharingLocationsMap.clear();
        this.sharingLocations.clear();
        setLastKnownLocation(null);
        stop(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastKnownLocation(Location location) {
        if (location == null || Build.VERSION.SDK_INT < 17 || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.lastKnownLocation = location;
            if (location != null) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda26
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationController.lambda$setLastKnownLocation$11();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setLastKnownLocation$11() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newLocationAvailable, new Object[0]);
    }

    public void setCachedNearbyUsersAndChats(ArrayList<TLRPC$TL_peerLocated> arrayList, ArrayList<TLRPC$TL_peerLocated> arrayList2) {
        this.cachedNearbyUsers = new ArrayList<>(arrayList);
        this.cachedNearbyChats = new ArrayList<>(arrayList2);
    }

    public ArrayList<TLRPC$TL_peerLocated> getCachedNearbyUsers() {
        return this.cachedNearbyUsers;
    }

    public ArrayList<TLRPC$TL_peerLocated> getCachedNearbyChats() {
        return this.cachedNearbyChats;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addSharingLocation(TLRPC$Message tLRPC$Message) {
        final SharingLocationInfo sharingLocationInfo = new SharingLocationInfo();
        sharingLocationInfo.did = tLRPC$Message.dialog_id;
        sharingLocationInfo.mid = tLRPC$Message.id;
        TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
        sharingLocationInfo.period = tLRPC$MessageMedia.period;
        int i = tLRPC$MessageMedia.proximity_notification_radius;
        sharingLocationInfo.proximityMeters = i;
        sharingLocationInfo.lastSentProximityMeters = i;
        sharingLocationInfo.account = this.currentAccount;
        sharingLocationInfo.messageObject = new MessageObject(this.currentAccount, tLRPC$Message, false, false);
        if (sharingLocationInfo.period == Integer.MAX_VALUE) {
            sharingLocationInfo.stopTime = ConnectionsManager.DEFAULT_DATACENTER_ID;
        } else {
            sharingLocationInfo.stopTime = getConnectionsManager().getCurrentTime() + sharingLocationInfo.period;
        }
        final SharingLocationInfo sharingLocationInfo2 = this.sharingLocationsMap.get(sharingLocationInfo.did);
        this.sharingLocationsMap.put(sharingLocationInfo.did, sharingLocationInfo);
        if (sharingLocationInfo2 != null) {
            this.sharingLocations.remove(sharingLocationInfo2);
        }
        this.sharingLocations.add(sharingLocationInfo);
        saveSharingLocation(sharingLocationInfo, 0);
        this.lastLocationSendTime = (SystemClock.elapsedRealtime() - 30000) + 5000;
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.this.lambda$addSharingLocation$12(sharingLocationInfo2, sharingLocationInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addSharingLocation$12(SharingLocationInfo sharingLocationInfo, SharingLocationInfo sharingLocationInfo2) {
        if (sharingLocationInfo != null) {
            this.sharingLocationsUI.remove(sharingLocationInfo);
        }
        this.sharingLocationsUI.add(sharingLocationInfo2);
        this.sharingLocationsMapUI.put(sharingLocationInfo2.did, sharingLocationInfo2);
        startService();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    public boolean isSharingLocation(long j) {
        return this.sharingLocationsMapUI.indexOfKey(j) >= 0;
    }

    public SharingLocationInfo getSharingLocationInfo(long j) {
        return this.sharingLocationsMapUI.get(j);
    }

    public boolean setProximityLocation(final long j, final int i, boolean z) {
        SharingLocationInfo sharingLocationInfo = this.sharingLocationsMapUI.get(j);
        if (sharingLocationInfo != null) {
            sharingLocationInfo.proximityMeters = i;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.this.lambda$setProximityLocation$13(i, j);
            }
        });
        if (z) {
            Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    LocationController.this.lambda$setProximityLocation$14();
                }
            });
        }
        return sharingLocationInfo != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setProximityLocation$13(int i, long j) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE sharing_locations SET proximity = ? WHERE uid = ?");
            executeFast.requery();
            executeFast.bindInteger(1, i);
            executeFast.bindLong(2, j);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setProximityLocation$14() {
        broadcastLastKnownLocation(true);
    }

    public static int getHeading(Location location) {
        float bearing = location.getBearing();
        return (bearing <= 0.0f || bearing >= 1.0f) ? (int) bearing : bearing < 0.5f ? 360 : 1;
    }

    private void loadSharingLocations() {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.this.lambda$loadSharingLocations$18();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadSharingLocations$18() {
        final ArrayList arrayList = new ArrayList();
        final ArrayList<TLRPC$User> arrayList2 = new ArrayList<>();
        final ArrayList<TLRPC$Chat> arrayList3 = new ArrayList<>();
        try {
            ArrayList<Long> arrayList4 = new ArrayList<>();
            ArrayList arrayList5 = new ArrayList();
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
            while (queryFinalized.next()) {
                SharingLocationInfo sharingLocationInfo = new SharingLocationInfo();
                sharingLocationInfo.did = queryFinalized.longValue(0);
                sharingLocationInfo.mid = queryFinalized.intValue(1);
                sharingLocationInfo.stopTime = queryFinalized.intValue(2);
                sharingLocationInfo.period = queryFinalized.intValue(3);
                sharingLocationInfo.proximityMeters = queryFinalized.intValue(5);
                sharingLocationInfo.account = this.currentAccount;
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                if (byteBufferValue != null) {
                    MessageObject messageObject = new MessageObject(this.currentAccount, TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                    sharingLocationInfo.messageObject = messageObject;
                    MessagesStorage.addUsersAndChatsFromMessage(messageObject.messageOwner, arrayList4, arrayList5, null);
                    byteBufferValue.reuse();
                }
                arrayList.add(sharingLocationInfo);
                if (DialogObject.isChatDialog(sharingLocationInfo.did)) {
                    if (!arrayList5.contains(Long.valueOf(-sharingLocationInfo.did))) {
                        arrayList5.add(Long.valueOf(-sharingLocationInfo.did));
                    }
                } else if (DialogObject.isUserDialog(sharingLocationInfo.did) && !arrayList4.contains(Long.valueOf(sharingLocationInfo.did))) {
                    arrayList4.add(Long.valueOf(sharingLocationInfo.did));
                }
            }
            queryFinalized.dispose();
            if (!arrayList5.isEmpty()) {
                getMessagesStorage().getChatsInternal(TextUtils.join(",", arrayList5), arrayList3);
            }
            getMessagesStorage().getUsersInternal(arrayList4, arrayList2);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.this.lambda$loadSharingLocations$17(arrayList2, arrayList3, arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadSharingLocations$17(ArrayList arrayList, ArrayList arrayList2, final ArrayList arrayList3) {
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.this.lambda$loadSharingLocations$16(arrayList3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadSharingLocations$16(final ArrayList arrayList) {
        this.sharingLocations.addAll(arrayList);
        for (int i = 0; i < this.sharingLocations.size(); i++) {
            SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i);
            this.sharingLocationsMap.put(sharingLocationInfo.did, sharingLocationInfo);
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.this.lambda$loadSharingLocations$15(arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadSharingLocations$15(ArrayList arrayList) {
        this.sharingLocationsUI.addAll(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            SharingLocationInfo sharingLocationInfo = (SharingLocationInfo) arrayList.get(i);
            this.sharingLocationsMapUI.put(sharingLocationInfo.did, sharingLocationInfo);
        }
        startService();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    private void saveSharingLocation(final SharingLocationInfo sharingLocationInfo, final int i) {
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.this.lambda$saveSharingLocation$19(i, sharingLocationInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveSharingLocation$19(int i, SharingLocationInfo sharingLocationInfo) {
        try {
            if (i == 2) {
                getMessagesStorage().getDatabase().executeFast("DELETE FROM sharing_locations WHERE 1").stepThis().dispose();
            } else if (i == 1) {
                if (sharingLocationInfo == null) {
                    return;
                }
                SQLiteDatabase database = getMessagesStorage().getDatabase();
                database.executeFast("DELETE FROM sharing_locations WHERE uid = " + sharingLocationInfo.did).stepThis().dispose();
            } else if (sharingLocationInfo == null) {
            } else {
                SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("REPLACE INTO sharing_locations VALUES(?, ?, ?, ?, ?, ?)");
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(sharingLocationInfo.messageObject.messageOwner.getObjectSize());
                sharingLocationInfo.messageObject.messageOwner.serializeToStream(nativeByteBuffer);
                executeFast.bindLong(1, sharingLocationInfo.did);
                executeFast.bindInteger(2, sharingLocationInfo.mid);
                executeFast.bindInteger(3, sharingLocationInfo.stopTime);
                executeFast.bindInteger(4, sharingLocationInfo.period);
                executeFast.bindByteBuffer(5, nativeByteBuffer);
                executeFast.bindInteger(6, sharingLocationInfo.proximityMeters);
                executeFast.step();
                executeFast.dispose();
                nativeByteBuffer.reuse();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void removeSharingLocation(final long j) {
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.this.lambda$removeSharingLocation$22(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSharingLocation$22(long j) {
        final SharingLocationInfo sharingLocationInfo = this.sharingLocationsMap.get(j);
        this.sharingLocationsMap.remove(j);
        if (sharingLocationInfo != null) {
            TLRPC$TL_messages_editMessage tLRPC$TL_messages_editMessage = new TLRPC$TL_messages_editMessage();
            tLRPC$TL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
            tLRPC$TL_messages_editMessage.id = sharingLocationInfo.mid;
            tLRPC$TL_messages_editMessage.flags |= LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM;
            TLRPC$TL_inputMediaGeoLive tLRPC$TL_inputMediaGeoLive = new TLRPC$TL_inputMediaGeoLive();
            tLRPC$TL_messages_editMessage.media = tLRPC$TL_inputMediaGeoLive;
            tLRPC$TL_inputMediaGeoLive.stopped = true;
            tLRPC$TL_inputMediaGeoLive.geo_point = new TLRPC$TL_inputGeoPointEmpty();
            getConnectionsManager().sendRequest(tLRPC$TL_messages_editMessage, new RequestDelegate() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda28
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    LocationController.this.lambda$removeSharingLocation$20(tLObject, tLRPC$TL_error);
                }
            });
            this.sharingLocations.remove(sharingLocationInfo);
            saveSharingLocation(sharingLocationInfo, 1);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    LocationController.this.lambda$removeSharingLocation$21(sharingLocationInfo);
                }
            });
            if (this.sharingLocations.isEmpty()) {
                stop(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSharingLocation$20(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            return;
        }
        getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSharingLocation$21(SharingLocationInfo sharingLocationInfo) {
        this.sharingLocationsUI.remove(sharingLocationInfo);
        this.sharingLocationsMapUI.remove(sharingLocationInfo.did);
        if (this.sharingLocationsUI.isEmpty()) {
            stopService();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    private void startService() {
        try {
            ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, LocationSharingService.class));
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    private void stopService() {
        ApplicationLoader.applicationContext.stopService(new Intent(ApplicationLoader.applicationContext, LocationSharingService.class));
    }

    public void removeAllLocationSharings() {
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.this.lambda$removeAllLocationSharings$25();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAllLocationSharings$25() {
        for (int i = 0; i < this.sharingLocations.size(); i++) {
            SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i);
            TLRPC$TL_messages_editMessage tLRPC$TL_messages_editMessage = new TLRPC$TL_messages_editMessage();
            tLRPC$TL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
            tLRPC$TL_messages_editMessage.id = sharingLocationInfo.mid;
            tLRPC$TL_messages_editMessage.flags |= LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM;
            TLRPC$TL_inputMediaGeoLive tLRPC$TL_inputMediaGeoLive = new TLRPC$TL_inputMediaGeoLive();
            tLRPC$TL_messages_editMessage.media = tLRPC$TL_inputMediaGeoLive;
            tLRPC$TL_inputMediaGeoLive.stopped = true;
            tLRPC$TL_inputMediaGeoLive.geo_point = new TLRPC$TL_inputGeoPointEmpty();
            getConnectionsManager().sendRequest(tLRPC$TL_messages_editMessage, new RequestDelegate() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda27
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    LocationController.this.lambda$removeAllLocationSharings$23(tLObject, tLRPC$TL_error);
                }
            });
        }
        this.sharingLocations.clear();
        this.sharingLocationsMap.clear();
        saveSharingLocation(null, 2);
        stop(true);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.this.lambda$removeAllLocationSharings$24();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAllLocationSharings$23(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            return;
        }
        getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAllLocationSharings$24() {
        this.sharingLocationsUI.clear();
        this.sharingLocationsMapUI.clear();
        stopService();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    public void setMapLocation(Location location, boolean z) {
        Location location2;
        if (location == null) {
            return;
        }
        this.lastLocationByMaps = true;
        if (z || ((location2 = this.lastKnownLocation) != null && location2.distanceTo(location) >= 20.0f)) {
            this.lastLocationSendTime = SystemClock.elapsedRealtime() - 30000;
            this.locationSentSinceLastMapUpdate = false;
        } else if (this.locationSentSinceLastMapUpdate) {
            this.lastLocationSendTime = (SystemClock.elapsedRealtime() - 30000) + 20000;
            this.locationSentSinceLastMapUpdate = false;
        }
        setLastKnownLocation(location);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void start() {
        if (this.started) {
            return;
        }
        this.lastLocationStartTime = SystemClock.elapsedRealtime();
        boolean z = true;
        this.started = true;
        if (checkServices()) {
            try {
                this.apiClient.connect();
            } catch (Throwable th) {
                FileLog.e(th);
            }
            if (z) {
                try {
                    this.locationManager.requestLocationUpdates("gps", 1L, 0.0f, this.gpsLocationListener);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                try {
                    this.locationManager.requestLocationUpdates("network", 1L, 0.0f, this.networkLocationListener);
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                try {
                    this.locationManager.requestLocationUpdates("passive", 1L, 0.0f, this.passiveLocationListener);
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                if (this.lastKnownLocation == null) {
                    try {
                        setLastKnownLocation(this.locationManager.getLastKnownLocation("gps"));
                        if (this.lastKnownLocation == null) {
                            setLastKnownLocation(this.locationManager.getLastKnownLocation("network"));
                            return;
                        }
                        return;
                    } catch (Exception e4) {
                        FileLog.e(e4);
                        return;
                    }
                }
                return;
            }
            return;
        }
        z = false;
        if (z) {
        }
    }

    private void stop(boolean z) {
        if (this.lookingForPeopleNearby || this.shareMyCurrentLocation) {
            return;
        }
        this.started = false;
        if (checkServices()) {
            try {
                ApplicationLoader.getLocationServiceProvider().removeLocationUpdates(this.fusedLocationListener);
                this.apiClient.disconnect();
            } catch (Throwable th) {
                FileLog.e(th, false);
            }
        }
        this.locationManager.removeUpdates(this.gpsLocationListener);
        if (z) {
            this.locationManager.removeUpdates(this.networkLocationListener);
            this.locationManager.removeUpdates(this.passiveLocationListener);
        }
    }

    public void startLocationLookupForPeopleNearby(final boolean z) {
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.this.lambda$startLocationLookupForPeopleNearby$26(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startLocationLookupForPeopleNearby$26(boolean z) {
        boolean z2 = !z;
        this.lookingForPeopleNearby = z2;
        if (z2) {
            start();
        } else if (this.sharingLocations.isEmpty()) {
            stop(true);
        }
    }

    public Location getLastKnownLocation() {
        return this.lastKnownLocation;
    }

    public void loadLiveLocations(final long j) {
        if (this.cacheRequests.indexOfKey(j) >= 0) {
            return;
        }
        this.cacheRequests.put(j, Boolean.TRUE);
        TLRPC$TL_messages_getRecentLocations tLRPC$TL_messages_getRecentLocations = new TLRPC$TL_messages_getRecentLocations();
        tLRPC$TL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(j);
        tLRPC$TL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getRecentLocations, new RequestDelegate() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda30
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                LocationController.this.lambda$loadLiveLocations$28(j, tLObject, tLRPC$TL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadLiveLocations$28(final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.this.lambda$loadLiveLocations$27(j, tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadLiveLocations$27(long j, TLObject tLObject) {
        this.cacheRequests.delete(j);
        TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
        int i = 0;
        while (i < tLRPC$messages_Messages.messages.size()) {
            if (!(tLRPC$messages_Messages.messages.get(i).media instanceof TLRPC$TL_messageMediaGeoLive)) {
                tLRPC$messages_Messages.messages.remove(i);
                i--;
            }
            i++;
        }
        getMessagesStorage().putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
        getMessagesController().putUsers(tLRPC$messages_Messages.users, false);
        getMessagesController().putChats(tLRPC$messages_Messages.chats, false);
        this.locationsCache.put(j, tLRPC$messages_Messages.messages);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j), Integer.valueOf(this.currentAccount));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.tgnet.TLRPC$TL_channels_readMessageContents] */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.telegram.tgnet.TLRPC$TL_messages_readMessageContents] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.tgnet.TLObject] */
    public void markLiveLoactionsAsRead(long j) {
        ArrayList<TLRPC$Message> arrayList;
        ?? tLRPC$TL_messages_readMessageContents;
        if (DialogObject.isEncryptedDialog(j) || (arrayList = this.locationsCache.get(j)) == null || arrayList.isEmpty()) {
            return;
        }
        Integer num = this.lastReadLocationTime.get(j);
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (num == null || num.intValue() + 60 <= elapsedRealtime) {
            this.lastReadLocationTime.put(j, Integer.valueOf(elapsedRealtime));
            int i = 0;
            if (DialogObject.isChatDialog(j)) {
                long j2 = -j;
                if (ChatObject.isChannel(j2, this.currentAccount)) {
                    tLRPC$TL_messages_readMessageContents = new TLRPC$TL_channels_readMessageContents();
                    int size = arrayList.size();
                    while (i < size) {
                        tLRPC$TL_messages_readMessageContents.id.add(Integer.valueOf(arrayList.get(i).id));
                        i++;
                    }
                    tLRPC$TL_messages_readMessageContents.channel = getMessagesController().getInputChannel(j2);
                    getConnectionsManager().sendRequest(tLRPC$TL_messages_readMessageContents, new RequestDelegate() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda29
                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            LocationController.this.lambda$markLiveLoactionsAsRead$29(tLObject, tLRPC$TL_error);
                        }
                    });
                }
            }
            tLRPC$TL_messages_readMessageContents = new TLRPC$TL_messages_readMessageContents();
            int size2 = arrayList.size();
            while (i < size2) {
                tLRPC$TL_messages_readMessageContents.id.add(Integer.valueOf(arrayList.get(i).id));
                i++;
            }
            getConnectionsManager().sendRequest(tLRPC$TL_messages_readMessageContents, new RequestDelegate() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda29
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    LocationController.this.lambda$markLiveLoactionsAsRead$29(tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$markLiveLoactionsAsRead$29(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_messages_affectedMessages) {
            TLRPC$TL_messages_affectedMessages tLRPC$TL_messages_affectedMessages = (TLRPC$TL_messages_affectedMessages) tLObject;
            getMessagesController().processNewDifferenceParams(-1, tLRPC$TL_messages_affectedMessages.pts, -1, tLRPC$TL_messages_affectedMessages.pts_count);
        }
    }

    public static int getLocationsCount() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i += getInstance(i2).sharingLocationsUI.size();
        }
        return i;
    }

    public static void fetchLocationAddress(Location location, LocationFetchCallback locationFetchCallback) {
        fetchLocationAddress(location, 0, locationFetchCallback);
    }

    public static void fetchLocationAddress(final Location location, final int i, final LocationFetchCallback locationFetchCallback) {
        Locale systemDefaultLocale;
        if (locationFetchCallback == null) {
            return;
        }
        Runnable runnable = callbacks.get(locationFetchCallback);
        if (runnable != null) {
            Utilities.globalQueue.cancelRunnable(runnable);
            callbacks.remove(locationFetchCallback);
        }
        if (location == null) {
            locationFetchCallback.onLocationAddressAvailable(null, null, null, null, null);
            return;
        }
        try {
            systemDefaultLocale = LocaleController.getInstance().getCurrentLocale();
        } catch (Exception unused) {
            systemDefaultLocale = LocaleController.getInstance().getSystemDefaultLocale();
        }
        final Locale locale = systemDefaultLocale;
        final Locale locale2 = locale.getLanguage().contains("en") ? locale : Locale.US;
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        Runnable runnable2 = new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.lambda$fetchLocationAddress$31(locale, location, i, locale2, locationFetchCallback);
            }
        };
        dispatchQueue.postRunnable(runnable2, 300L);
        callbacks.put(locationFetchCallback, runnable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03c0, code lost:
        if ("ru".equals(r5) == false) goto L340;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fb A[Catch: Exception -> 0x05e8, TryCatch #7 {Exception -> 0x05e8, blocks: (B:3:0x001d, B:11:0x0053, B:13:0x0059, B:291:0x04c8, B:293:0x04ce, B:62:0x011b, B:67:0x013c, B:70:0x0146, B:88:0x017f, B:90:0x0185, B:92:0x018f, B:94:0x019d, B:96:0x01a3, B:98:0x01a9, B:100:0x01b3, B:102:0x01c3, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01ec, B:114:0x01f5, B:116:0x01fb, B:118:0x0201, B:120:0x020b, B:122:0x0211, B:123:0x0214, B:126:0x021b, B:128:0x0222, B:130:0x022c, B:132:0x023a, B:134:0x0240, B:136:0x0246, B:138:0x0250, B:140:0x0260, B:143:0x0269, B:145:0x026f, B:147:0x0279, B:149:0x0289, B:152:0x0292, B:154:0x0298, B:156:0x029e, B:158:0x02a8, B:160:0x02ae, B:161:0x02b1, B:163:0x02b6, B:166:0x02bd, B:168:0x02c2, B:171:0x02d0, B:175:0x02d8, B:177:0x02de, B:179:0x02e4, B:180:0x02e7, B:182:0x02ec, B:184:0x02f2, B:185:0x02f5, B:188:0x02fb, B:190:0x0305, B:192:0x030b, B:195:0x0319, B:197:0x031f, B:198:0x0322, B:200:0x0328, B:202:0x0332, B:204:0x0338, B:205:0x033b, B:206:0x033e, B:208:0x0348, B:210:0x034e, B:211:0x0351, B:212:0x0354, B:214:0x035e, B:216:0x0364, B:217:0x0367, B:218:0x036a, B:220:0x0378, B:222:0x037e, B:223:0x0381, B:226:0x039a, B:230:0x03ab, B:232:0x03b1, B:234:0x03ba, B:244:0x03e2, B:246:0x03ed, B:248:0x03f5, B:249:0x0409, B:250:0x040c, B:252:0x0412, B:253:0x0415, B:255:0x0421, B:257:0x042b, B:259:0x0431, B:260:0x0434, B:261:0x0437, B:263:0x0441, B:265:0x0447, B:266:0x044a, B:268:0x044f, B:270:0x0459, B:272:0x045f, B:273:0x0462, B:274:0x0465, B:276:0x046f, B:278:0x0475, B:279:0x0478, B:280:0x047b, B:283:0x048b, B:236:0x03c2, B:238:0x03ce, B:241:0x03d5, B:289:0x04a2), top: B:359:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021b A[Catch: Exception -> 0x05e8, TryCatch #7 {Exception -> 0x05e8, blocks: (B:3:0x001d, B:11:0x0053, B:13:0x0059, B:291:0x04c8, B:293:0x04ce, B:62:0x011b, B:67:0x013c, B:70:0x0146, B:88:0x017f, B:90:0x0185, B:92:0x018f, B:94:0x019d, B:96:0x01a3, B:98:0x01a9, B:100:0x01b3, B:102:0x01c3, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01ec, B:114:0x01f5, B:116:0x01fb, B:118:0x0201, B:120:0x020b, B:122:0x0211, B:123:0x0214, B:126:0x021b, B:128:0x0222, B:130:0x022c, B:132:0x023a, B:134:0x0240, B:136:0x0246, B:138:0x0250, B:140:0x0260, B:143:0x0269, B:145:0x026f, B:147:0x0279, B:149:0x0289, B:152:0x0292, B:154:0x0298, B:156:0x029e, B:158:0x02a8, B:160:0x02ae, B:161:0x02b1, B:163:0x02b6, B:166:0x02bd, B:168:0x02c2, B:171:0x02d0, B:175:0x02d8, B:177:0x02de, B:179:0x02e4, B:180:0x02e7, B:182:0x02ec, B:184:0x02f2, B:185:0x02f5, B:188:0x02fb, B:190:0x0305, B:192:0x030b, B:195:0x0319, B:197:0x031f, B:198:0x0322, B:200:0x0328, B:202:0x0332, B:204:0x0338, B:205:0x033b, B:206:0x033e, B:208:0x0348, B:210:0x034e, B:211:0x0351, B:212:0x0354, B:214:0x035e, B:216:0x0364, B:217:0x0367, B:218:0x036a, B:220:0x0378, B:222:0x037e, B:223:0x0381, B:226:0x039a, B:230:0x03ab, B:232:0x03b1, B:234:0x03ba, B:244:0x03e2, B:246:0x03ed, B:248:0x03f5, B:249:0x0409, B:250:0x040c, B:252:0x0412, B:253:0x0415, B:255:0x0421, B:257:0x042b, B:259:0x0431, B:260:0x0434, B:261:0x0437, B:263:0x0441, B:265:0x0447, B:266:0x044a, B:268:0x044f, B:270:0x0459, B:272:0x045f, B:273:0x0462, B:274:0x0465, B:276:0x046f, B:278:0x0475, B:279:0x0478, B:280:0x047b, B:283:0x048b, B:236:0x03c2, B:238:0x03ce, B:241:0x03d5, B:289:0x04a2), top: B:359:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0298 A[Catch: Exception -> 0x05e8, TryCatch #7 {Exception -> 0x05e8, blocks: (B:3:0x001d, B:11:0x0053, B:13:0x0059, B:291:0x04c8, B:293:0x04ce, B:62:0x011b, B:67:0x013c, B:70:0x0146, B:88:0x017f, B:90:0x0185, B:92:0x018f, B:94:0x019d, B:96:0x01a3, B:98:0x01a9, B:100:0x01b3, B:102:0x01c3, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01ec, B:114:0x01f5, B:116:0x01fb, B:118:0x0201, B:120:0x020b, B:122:0x0211, B:123:0x0214, B:126:0x021b, B:128:0x0222, B:130:0x022c, B:132:0x023a, B:134:0x0240, B:136:0x0246, B:138:0x0250, B:140:0x0260, B:143:0x0269, B:145:0x026f, B:147:0x0279, B:149:0x0289, B:152:0x0292, B:154:0x0298, B:156:0x029e, B:158:0x02a8, B:160:0x02ae, B:161:0x02b1, B:163:0x02b6, B:166:0x02bd, B:168:0x02c2, B:171:0x02d0, B:175:0x02d8, B:177:0x02de, B:179:0x02e4, B:180:0x02e7, B:182:0x02ec, B:184:0x02f2, B:185:0x02f5, B:188:0x02fb, B:190:0x0305, B:192:0x030b, B:195:0x0319, B:197:0x031f, B:198:0x0322, B:200:0x0328, B:202:0x0332, B:204:0x0338, B:205:0x033b, B:206:0x033e, B:208:0x0348, B:210:0x034e, B:211:0x0351, B:212:0x0354, B:214:0x035e, B:216:0x0364, B:217:0x0367, B:218:0x036a, B:220:0x0378, B:222:0x037e, B:223:0x0381, B:226:0x039a, B:230:0x03ab, B:232:0x03b1, B:234:0x03ba, B:244:0x03e2, B:246:0x03ed, B:248:0x03f5, B:249:0x0409, B:250:0x040c, B:252:0x0412, B:253:0x0415, B:255:0x0421, B:257:0x042b, B:259:0x0431, B:260:0x0434, B:261:0x0437, B:263:0x0441, B:265:0x0447, B:266:0x044a, B:268:0x044f, B:270:0x0459, B:272:0x045f, B:273:0x0462, B:274:0x0465, B:276:0x046f, B:278:0x0475, B:279:0x0478, B:280:0x047b, B:283:0x048b, B:236:0x03c2, B:238:0x03ce, B:241:0x03d5, B:289:0x04a2), top: B:359:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02de A[Catch: Exception -> 0x05e8, TryCatch #7 {Exception -> 0x05e8, blocks: (B:3:0x001d, B:11:0x0053, B:13:0x0059, B:291:0x04c8, B:293:0x04ce, B:62:0x011b, B:67:0x013c, B:70:0x0146, B:88:0x017f, B:90:0x0185, B:92:0x018f, B:94:0x019d, B:96:0x01a3, B:98:0x01a9, B:100:0x01b3, B:102:0x01c3, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01ec, B:114:0x01f5, B:116:0x01fb, B:118:0x0201, B:120:0x020b, B:122:0x0211, B:123:0x0214, B:126:0x021b, B:128:0x0222, B:130:0x022c, B:132:0x023a, B:134:0x0240, B:136:0x0246, B:138:0x0250, B:140:0x0260, B:143:0x0269, B:145:0x026f, B:147:0x0279, B:149:0x0289, B:152:0x0292, B:154:0x0298, B:156:0x029e, B:158:0x02a8, B:160:0x02ae, B:161:0x02b1, B:163:0x02b6, B:166:0x02bd, B:168:0x02c2, B:171:0x02d0, B:175:0x02d8, B:177:0x02de, B:179:0x02e4, B:180:0x02e7, B:182:0x02ec, B:184:0x02f2, B:185:0x02f5, B:188:0x02fb, B:190:0x0305, B:192:0x030b, B:195:0x0319, B:197:0x031f, B:198:0x0322, B:200:0x0328, B:202:0x0332, B:204:0x0338, B:205:0x033b, B:206:0x033e, B:208:0x0348, B:210:0x034e, B:211:0x0351, B:212:0x0354, B:214:0x035e, B:216:0x0364, B:217:0x0367, B:218:0x036a, B:220:0x0378, B:222:0x037e, B:223:0x0381, B:226:0x039a, B:230:0x03ab, B:232:0x03b1, B:234:0x03ba, B:244:0x03e2, B:246:0x03ed, B:248:0x03f5, B:249:0x0409, B:250:0x040c, B:252:0x0412, B:253:0x0415, B:255:0x0421, B:257:0x042b, B:259:0x0431, B:260:0x0434, B:261:0x0437, B:263:0x0441, B:265:0x0447, B:266:0x044a, B:268:0x044f, B:270:0x0459, B:272:0x045f, B:273:0x0462, B:274:0x0465, B:276:0x046f, B:278:0x0475, B:279:0x0478, B:280:0x047b, B:283:0x048b, B:236:0x03c2, B:238:0x03ce, B:241:0x03d5, B:289:0x04a2), top: B:359:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0305 A[Catch: Exception -> 0x05e8, TryCatch #7 {Exception -> 0x05e8, blocks: (B:3:0x001d, B:11:0x0053, B:13:0x0059, B:291:0x04c8, B:293:0x04ce, B:62:0x011b, B:67:0x013c, B:70:0x0146, B:88:0x017f, B:90:0x0185, B:92:0x018f, B:94:0x019d, B:96:0x01a3, B:98:0x01a9, B:100:0x01b3, B:102:0x01c3, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01ec, B:114:0x01f5, B:116:0x01fb, B:118:0x0201, B:120:0x020b, B:122:0x0211, B:123:0x0214, B:126:0x021b, B:128:0x0222, B:130:0x022c, B:132:0x023a, B:134:0x0240, B:136:0x0246, B:138:0x0250, B:140:0x0260, B:143:0x0269, B:145:0x026f, B:147:0x0279, B:149:0x0289, B:152:0x0292, B:154:0x0298, B:156:0x029e, B:158:0x02a8, B:160:0x02ae, B:161:0x02b1, B:163:0x02b6, B:166:0x02bd, B:168:0x02c2, B:171:0x02d0, B:175:0x02d8, B:177:0x02de, B:179:0x02e4, B:180:0x02e7, B:182:0x02ec, B:184:0x02f2, B:185:0x02f5, B:188:0x02fb, B:190:0x0305, B:192:0x030b, B:195:0x0319, B:197:0x031f, B:198:0x0322, B:200:0x0328, B:202:0x0332, B:204:0x0338, B:205:0x033b, B:206:0x033e, B:208:0x0348, B:210:0x034e, B:211:0x0351, B:212:0x0354, B:214:0x035e, B:216:0x0364, B:217:0x0367, B:218:0x036a, B:220:0x0378, B:222:0x037e, B:223:0x0381, B:226:0x039a, B:230:0x03ab, B:232:0x03b1, B:234:0x03ba, B:244:0x03e2, B:246:0x03ed, B:248:0x03f5, B:249:0x0409, B:250:0x040c, B:252:0x0412, B:253:0x0415, B:255:0x0421, B:257:0x042b, B:259:0x0431, B:260:0x0434, B:261:0x0437, B:263:0x0441, B:265:0x0447, B:266:0x044a, B:268:0x044f, B:270:0x0459, B:272:0x045f, B:273:0x0462, B:274:0x0465, B:276:0x046f, B:278:0x0475, B:279:0x0478, B:280:0x047b, B:283:0x048b, B:236:0x03c2, B:238:0x03ce, B:241:0x03d5, B:289:0x04a2), top: B:359:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0319 A[Catch: Exception -> 0x05e8, TRY_ENTER, TryCatch #7 {Exception -> 0x05e8, blocks: (B:3:0x001d, B:11:0x0053, B:13:0x0059, B:291:0x04c8, B:293:0x04ce, B:62:0x011b, B:67:0x013c, B:70:0x0146, B:88:0x017f, B:90:0x0185, B:92:0x018f, B:94:0x019d, B:96:0x01a3, B:98:0x01a9, B:100:0x01b3, B:102:0x01c3, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01ec, B:114:0x01f5, B:116:0x01fb, B:118:0x0201, B:120:0x020b, B:122:0x0211, B:123:0x0214, B:126:0x021b, B:128:0x0222, B:130:0x022c, B:132:0x023a, B:134:0x0240, B:136:0x0246, B:138:0x0250, B:140:0x0260, B:143:0x0269, B:145:0x026f, B:147:0x0279, B:149:0x0289, B:152:0x0292, B:154:0x0298, B:156:0x029e, B:158:0x02a8, B:160:0x02ae, B:161:0x02b1, B:163:0x02b6, B:166:0x02bd, B:168:0x02c2, B:171:0x02d0, B:175:0x02d8, B:177:0x02de, B:179:0x02e4, B:180:0x02e7, B:182:0x02ec, B:184:0x02f2, B:185:0x02f5, B:188:0x02fb, B:190:0x0305, B:192:0x030b, B:195:0x0319, B:197:0x031f, B:198:0x0322, B:200:0x0328, B:202:0x0332, B:204:0x0338, B:205:0x033b, B:206:0x033e, B:208:0x0348, B:210:0x034e, B:211:0x0351, B:212:0x0354, B:214:0x035e, B:216:0x0364, B:217:0x0367, B:218:0x036a, B:220:0x0378, B:222:0x037e, B:223:0x0381, B:226:0x039a, B:230:0x03ab, B:232:0x03b1, B:234:0x03ba, B:244:0x03e2, B:246:0x03ed, B:248:0x03f5, B:249:0x0409, B:250:0x040c, B:252:0x0412, B:253:0x0415, B:255:0x0421, B:257:0x042b, B:259:0x0431, B:260:0x0434, B:261:0x0437, B:263:0x0441, B:265:0x0447, B:266:0x044a, B:268:0x044f, B:270:0x0459, B:272:0x045f, B:273:0x0462, B:274:0x0465, B:276:0x046f, B:278:0x0475, B:279:0x0478, B:280:0x047b, B:283:0x048b, B:236:0x03c2, B:238:0x03ce, B:241:0x03d5, B:289:0x04a2), top: B:359:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0328 A[Catch: Exception -> 0x05e8, TryCatch #7 {Exception -> 0x05e8, blocks: (B:3:0x001d, B:11:0x0053, B:13:0x0059, B:291:0x04c8, B:293:0x04ce, B:62:0x011b, B:67:0x013c, B:70:0x0146, B:88:0x017f, B:90:0x0185, B:92:0x018f, B:94:0x019d, B:96:0x01a3, B:98:0x01a9, B:100:0x01b3, B:102:0x01c3, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01ec, B:114:0x01f5, B:116:0x01fb, B:118:0x0201, B:120:0x020b, B:122:0x0211, B:123:0x0214, B:126:0x021b, B:128:0x0222, B:130:0x022c, B:132:0x023a, B:134:0x0240, B:136:0x0246, B:138:0x0250, B:140:0x0260, B:143:0x0269, B:145:0x026f, B:147:0x0279, B:149:0x0289, B:152:0x0292, B:154:0x0298, B:156:0x029e, B:158:0x02a8, B:160:0x02ae, B:161:0x02b1, B:163:0x02b6, B:166:0x02bd, B:168:0x02c2, B:171:0x02d0, B:175:0x02d8, B:177:0x02de, B:179:0x02e4, B:180:0x02e7, B:182:0x02ec, B:184:0x02f2, B:185:0x02f5, B:188:0x02fb, B:190:0x0305, B:192:0x030b, B:195:0x0319, B:197:0x031f, B:198:0x0322, B:200:0x0328, B:202:0x0332, B:204:0x0338, B:205:0x033b, B:206:0x033e, B:208:0x0348, B:210:0x034e, B:211:0x0351, B:212:0x0354, B:214:0x035e, B:216:0x0364, B:217:0x0367, B:218:0x036a, B:220:0x0378, B:222:0x037e, B:223:0x0381, B:226:0x039a, B:230:0x03ab, B:232:0x03b1, B:234:0x03ba, B:244:0x03e2, B:246:0x03ed, B:248:0x03f5, B:249:0x0409, B:250:0x040c, B:252:0x0412, B:253:0x0415, B:255:0x0421, B:257:0x042b, B:259:0x0431, B:260:0x0434, B:261:0x0437, B:263:0x0441, B:265:0x0447, B:266:0x044a, B:268:0x044f, B:270:0x0459, B:272:0x045f, B:273:0x0462, B:274:0x0465, B:276:0x046f, B:278:0x0475, B:279:0x0478, B:280:0x047b, B:283:0x048b, B:236:0x03c2, B:238:0x03ce, B:241:0x03d5, B:289:0x04a2), top: B:359:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x035e A[Catch: Exception -> 0x05e8, TryCatch #7 {Exception -> 0x05e8, blocks: (B:3:0x001d, B:11:0x0053, B:13:0x0059, B:291:0x04c8, B:293:0x04ce, B:62:0x011b, B:67:0x013c, B:70:0x0146, B:88:0x017f, B:90:0x0185, B:92:0x018f, B:94:0x019d, B:96:0x01a3, B:98:0x01a9, B:100:0x01b3, B:102:0x01c3, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01ec, B:114:0x01f5, B:116:0x01fb, B:118:0x0201, B:120:0x020b, B:122:0x0211, B:123:0x0214, B:126:0x021b, B:128:0x0222, B:130:0x022c, B:132:0x023a, B:134:0x0240, B:136:0x0246, B:138:0x0250, B:140:0x0260, B:143:0x0269, B:145:0x026f, B:147:0x0279, B:149:0x0289, B:152:0x0292, B:154:0x0298, B:156:0x029e, B:158:0x02a8, B:160:0x02ae, B:161:0x02b1, B:163:0x02b6, B:166:0x02bd, B:168:0x02c2, B:171:0x02d0, B:175:0x02d8, B:177:0x02de, B:179:0x02e4, B:180:0x02e7, B:182:0x02ec, B:184:0x02f2, B:185:0x02f5, B:188:0x02fb, B:190:0x0305, B:192:0x030b, B:195:0x0319, B:197:0x031f, B:198:0x0322, B:200:0x0328, B:202:0x0332, B:204:0x0338, B:205:0x033b, B:206:0x033e, B:208:0x0348, B:210:0x034e, B:211:0x0351, B:212:0x0354, B:214:0x035e, B:216:0x0364, B:217:0x0367, B:218:0x036a, B:220:0x0378, B:222:0x037e, B:223:0x0381, B:226:0x039a, B:230:0x03ab, B:232:0x03b1, B:234:0x03ba, B:244:0x03e2, B:246:0x03ed, B:248:0x03f5, B:249:0x0409, B:250:0x040c, B:252:0x0412, B:253:0x0415, B:255:0x0421, B:257:0x042b, B:259:0x0431, B:260:0x0434, B:261:0x0437, B:263:0x0441, B:265:0x0447, B:266:0x044a, B:268:0x044f, B:270:0x0459, B:272:0x045f, B:273:0x0462, B:274:0x0465, B:276:0x046f, B:278:0x0475, B:279:0x0478, B:280:0x047b, B:283:0x048b, B:236:0x03c2, B:238:0x03ce, B:241:0x03d5, B:289:0x04a2), top: B:359:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0378 A[Catch: Exception -> 0x05e8, TryCatch #7 {Exception -> 0x05e8, blocks: (B:3:0x001d, B:11:0x0053, B:13:0x0059, B:291:0x04c8, B:293:0x04ce, B:62:0x011b, B:67:0x013c, B:70:0x0146, B:88:0x017f, B:90:0x0185, B:92:0x018f, B:94:0x019d, B:96:0x01a3, B:98:0x01a9, B:100:0x01b3, B:102:0x01c3, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01ec, B:114:0x01f5, B:116:0x01fb, B:118:0x0201, B:120:0x020b, B:122:0x0211, B:123:0x0214, B:126:0x021b, B:128:0x0222, B:130:0x022c, B:132:0x023a, B:134:0x0240, B:136:0x0246, B:138:0x0250, B:140:0x0260, B:143:0x0269, B:145:0x026f, B:147:0x0279, B:149:0x0289, B:152:0x0292, B:154:0x0298, B:156:0x029e, B:158:0x02a8, B:160:0x02ae, B:161:0x02b1, B:163:0x02b6, B:166:0x02bd, B:168:0x02c2, B:171:0x02d0, B:175:0x02d8, B:177:0x02de, B:179:0x02e4, B:180:0x02e7, B:182:0x02ec, B:184:0x02f2, B:185:0x02f5, B:188:0x02fb, B:190:0x0305, B:192:0x030b, B:195:0x0319, B:197:0x031f, B:198:0x0322, B:200:0x0328, B:202:0x0332, B:204:0x0338, B:205:0x033b, B:206:0x033e, B:208:0x0348, B:210:0x034e, B:211:0x0351, B:212:0x0354, B:214:0x035e, B:216:0x0364, B:217:0x0367, B:218:0x036a, B:220:0x0378, B:222:0x037e, B:223:0x0381, B:226:0x039a, B:230:0x03ab, B:232:0x03b1, B:234:0x03ba, B:244:0x03e2, B:246:0x03ed, B:248:0x03f5, B:249:0x0409, B:250:0x040c, B:252:0x0412, B:253:0x0415, B:255:0x0421, B:257:0x042b, B:259:0x0431, B:260:0x0434, B:261:0x0437, B:263:0x0441, B:265:0x0447, B:266:0x044a, B:268:0x044f, B:270:0x0459, B:272:0x045f, B:273:0x0462, B:274:0x0465, B:276:0x046f, B:278:0x0475, B:279:0x0478, B:280:0x047b, B:283:0x048b, B:236:0x03c2, B:238:0x03ce, B:241:0x03d5, B:289:0x04a2), top: B:359:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03ed A[Catch: Exception -> 0x05e8, TryCatch #7 {Exception -> 0x05e8, blocks: (B:3:0x001d, B:11:0x0053, B:13:0x0059, B:291:0x04c8, B:293:0x04ce, B:62:0x011b, B:67:0x013c, B:70:0x0146, B:88:0x017f, B:90:0x0185, B:92:0x018f, B:94:0x019d, B:96:0x01a3, B:98:0x01a9, B:100:0x01b3, B:102:0x01c3, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01ec, B:114:0x01f5, B:116:0x01fb, B:118:0x0201, B:120:0x020b, B:122:0x0211, B:123:0x0214, B:126:0x021b, B:128:0x0222, B:130:0x022c, B:132:0x023a, B:134:0x0240, B:136:0x0246, B:138:0x0250, B:140:0x0260, B:143:0x0269, B:145:0x026f, B:147:0x0279, B:149:0x0289, B:152:0x0292, B:154:0x0298, B:156:0x029e, B:158:0x02a8, B:160:0x02ae, B:161:0x02b1, B:163:0x02b6, B:166:0x02bd, B:168:0x02c2, B:171:0x02d0, B:175:0x02d8, B:177:0x02de, B:179:0x02e4, B:180:0x02e7, B:182:0x02ec, B:184:0x02f2, B:185:0x02f5, B:188:0x02fb, B:190:0x0305, B:192:0x030b, B:195:0x0319, B:197:0x031f, B:198:0x0322, B:200:0x0328, B:202:0x0332, B:204:0x0338, B:205:0x033b, B:206:0x033e, B:208:0x0348, B:210:0x034e, B:211:0x0351, B:212:0x0354, B:214:0x035e, B:216:0x0364, B:217:0x0367, B:218:0x036a, B:220:0x0378, B:222:0x037e, B:223:0x0381, B:226:0x039a, B:230:0x03ab, B:232:0x03b1, B:234:0x03ba, B:244:0x03e2, B:246:0x03ed, B:248:0x03f5, B:249:0x0409, B:250:0x040c, B:252:0x0412, B:253:0x0415, B:255:0x0421, B:257:0x042b, B:259:0x0431, B:260:0x0434, B:261:0x0437, B:263:0x0441, B:265:0x0447, B:266:0x044a, B:268:0x044f, B:270:0x0459, B:272:0x045f, B:273:0x0462, B:274:0x0465, B:276:0x046f, B:278:0x0475, B:279:0x0478, B:280:0x047b, B:283:0x048b, B:236:0x03c2, B:238:0x03ce, B:241:0x03d5, B:289:0x04a2), top: B:359:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0412 A[Catch: Exception -> 0x05e8, TryCatch #7 {Exception -> 0x05e8, blocks: (B:3:0x001d, B:11:0x0053, B:13:0x0059, B:291:0x04c8, B:293:0x04ce, B:62:0x011b, B:67:0x013c, B:70:0x0146, B:88:0x017f, B:90:0x0185, B:92:0x018f, B:94:0x019d, B:96:0x01a3, B:98:0x01a9, B:100:0x01b3, B:102:0x01c3, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01ec, B:114:0x01f5, B:116:0x01fb, B:118:0x0201, B:120:0x020b, B:122:0x0211, B:123:0x0214, B:126:0x021b, B:128:0x0222, B:130:0x022c, B:132:0x023a, B:134:0x0240, B:136:0x0246, B:138:0x0250, B:140:0x0260, B:143:0x0269, B:145:0x026f, B:147:0x0279, B:149:0x0289, B:152:0x0292, B:154:0x0298, B:156:0x029e, B:158:0x02a8, B:160:0x02ae, B:161:0x02b1, B:163:0x02b6, B:166:0x02bd, B:168:0x02c2, B:171:0x02d0, B:175:0x02d8, B:177:0x02de, B:179:0x02e4, B:180:0x02e7, B:182:0x02ec, B:184:0x02f2, B:185:0x02f5, B:188:0x02fb, B:190:0x0305, B:192:0x030b, B:195:0x0319, B:197:0x031f, B:198:0x0322, B:200:0x0328, B:202:0x0332, B:204:0x0338, B:205:0x033b, B:206:0x033e, B:208:0x0348, B:210:0x034e, B:211:0x0351, B:212:0x0354, B:214:0x035e, B:216:0x0364, B:217:0x0367, B:218:0x036a, B:220:0x0378, B:222:0x037e, B:223:0x0381, B:226:0x039a, B:230:0x03ab, B:232:0x03b1, B:234:0x03ba, B:244:0x03e2, B:246:0x03ed, B:248:0x03f5, B:249:0x0409, B:250:0x040c, B:252:0x0412, B:253:0x0415, B:255:0x0421, B:257:0x042b, B:259:0x0431, B:260:0x0434, B:261:0x0437, B:263:0x0441, B:265:0x0447, B:266:0x044a, B:268:0x044f, B:270:0x0459, B:272:0x045f, B:273:0x0462, B:274:0x0465, B:276:0x046f, B:278:0x0475, B:279:0x0478, B:280:0x047b, B:283:0x048b, B:236:0x03c2, B:238:0x03ce, B:241:0x03d5, B:289:0x04a2), top: B:359:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x042b A[Catch: Exception -> 0x05e8, TryCatch #7 {Exception -> 0x05e8, blocks: (B:3:0x001d, B:11:0x0053, B:13:0x0059, B:291:0x04c8, B:293:0x04ce, B:62:0x011b, B:67:0x013c, B:70:0x0146, B:88:0x017f, B:90:0x0185, B:92:0x018f, B:94:0x019d, B:96:0x01a3, B:98:0x01a9, B:100:0x01b3, B:102:0x01c3, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01ec, B:114:0x01f5, B:116:0x01fb, B:118:0x0201, B:120:0x020b, B:122:0x0211, B:123:0x0214, B:126:0x021b, B:128:0x0222, B:130:0x022c, B:132:0x023a, B:134:0x0240, B:136:0x0246, B:138:0x0250, B:140:0x0260, B:143:0x0269, B:145:0x026f, B:147:0x0279, B:149:0x0289, B:152:0x0292, B:154:0x0298, B:156:0x029e, B:158:0x02a8, B:160:0x02ae, B:161:0x02b1, B:163:0x02b6, B:166:0x02bd, B:168:0x02c2, B:171:0x02d0, B:175:0x02d8, B:177:0x02de, B:179:0x02e4, B:180:0x02e7, B:182:0x02ec, B:184:0x02f2, B:185:0x02f5, B:188:0x02fb, B:190:0x0305, B:192:0x030b, B:195:0x0319, B:197:0x031f, B:198:0x0322, B:200:0x0328, B:202:0x0332, B:204:0x0338, B:205:0x033b, B:206:0x033e, B:208:0x0348, B:210:0x034e, B:211:0x0351, B:212:0x0354, B:214:0x035e, B:216:0x0364, B:217:0x0367, B:218:0x036a, B:220:0x0378, B:222:0x037e, B:223:0x0381, B:226:0x039a, B:230:0x03ab, B:232:0x03b1, B:234:0x03ba, B:244:0x03e2, B:246:0x03ed, B:248:0x03f5, B:249:0x0409, B:250:0x040c, B:252:0x0412, B:253:0x0415, B:255:0x0421, B:257:0x042b, B:259:0x0431, B:260:0x0434, B:261:0x0437, B:263:0x0441, B:265:0x0447, B:266:0x044a, B:268:0x044f, B:270:0x0459, B:272:0x045f, B:273:0x0462, B:274:0x0465, B:276:0x046f, B:278:0x0475, B:279:0x0478, B:280:0x047b, B:283:0x048b, B:236:0x03c2, B:238:0x03ce, B:241:0x03d5, B:289:0x04a2), top: B:359:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0441 A[Catch: Exception -> 0x05e8, TryCatch #7 {Exception -> 0x05e8, blocks: (B:3:0x001d, B:11:0x0053, B:13:0x0059, B:291:0x04c8, B:293:0x04ce, B:62:0x011b, B:67:0x013c, B:70:0x0146, B:88:0x017f, B:90:0x0185, B:92:0x018f, B:94:0x019d, B:96:0x01a3, B:98:0x01a9, B:100:0x01b3, B:102:0x01c3, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01ec, B:114:0x01f5, B:116:0x01fb, B:118:0x0201, B:120:0x020b, B:122:0x0211, B:123:0x0214, B:126:0x021b, B:128:0x0222, B:130:0x022c, B:132:0x023a, B:134:0x0240, B:136:0x0246, B:138:0x0250, B:140:0x0260, B:143:0x0269, B:145:0x026f, B:147:0x0279, B:149:0x0289, B:152:0x0292, B:154:0x0298, B:156:0x029e, B:158:0x02a8, B:160:0x02ae, B:161:0x02b1, B:163:0x02b6, B:166:0x02bd, B:168:0x02c2, B:171:0x02d0, B:175:0x02d8, B:177:0x02de, B:179:0x02e4, B:180:0x02e7, B:182:0x02ec, B:184:0x02f2, B:185:0x02f5, B:188:0x02fb, B:190:0x0305, B:192:0x030b, B:195:0x0319, B:197:0x031f, B:198:0x0322, B:200:0x0328, B:202:0x0332, B:204:0x0338, B:205:0x033b, B:206:0x033e, B:208:0x0348, B:210:0x034e, B:211:0x0351, B:212:0x0354, B:214:0x035e, B:216:0x0364, B:217:0x0367, B:218:0x036a, B:220:0x0378, B:222:0x037e, B:223:0x0381, B:226:0x039a, B:230:0x03ab, B:232:0x03b1, B:234:0x03ba, B:244:0x03e2, B:246:0x03ed, B:248:0x03f5, B:249:0x0409, B:250:0x040c, B:252:0x0412, B:253:0x0415, B:255:0x0421, B:257:0x042b, B:259:0x0431, B:260:0x0434, B:261:0x0437, B:263:0x0441, B:265:0x0447, B:266:0x044a, B:268:0x044f, B:270:0x0459, B:272:0x045f, B:273:0x0462, B:274:0x0465, B:276:0x046f, B:278:0x0475, B:279:0x0478, B:280:0x047b, B:283:0x048b, B:236:0x03c2, B:238:0x03ce, B:241:0x03d5, B:289:0x04a2), top: B:359:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x044f A[Catch: Exception -> 0x05e8, TryCatch #7 {Exception -> 0x05e8, blocks: (B:3:0x001d, B:11:0x0053, B:13:0x0059, B:291:0x04c8, B:293:0x04ce, B:62:0x011b, B:67:0x013c, B:70:0x0146, B:88:0x017f, B:90:0x0185, B:92:0x018f, B:94:0x019d, B:96:0x01a3, B:98:0x01a9, B:100:0x01b3, B:102:0x01c3, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01ec, B:114:0x01f5, B:116:0x01fb, B:118:0x0201, B:120:0x020b, B:122:0x0211, B:123:0x0214, B:126:0x021b, B:128:0x0222, B:130:0x022c, B:132:0x023a, B:134:0x0240, B:136:0x0246, B:138:0x0250, B:140:0x0260, B:143:0x0269, B:145:0x026f, B:147:0x0279, B:149:0x0289, B:152:0x0292, B:154:0x0298, B:156:0x029e, B:158:0x02a8, B:160:0x02ae, B:161:0x02b1, B:163:0x02b6, B:166:0x02bd, B:168:0x02c2, B:171:0x02d0, B:175:0x02d8, B:177:0x02de, B:179:0x02e4, B:180:0x02e7, B:182:0x02ec, B:184:0x02f2, B:185:0x02f5, B:188:0x02fb, B:190:0x0305, B:192:0x030b, B:195:0x0319, B:197:0x031f, B:198:0x0322, B:200:0x0328, B:202:0x0332, B:204:0x0338, B:205:0x033b, B:206:0x033e, B:208:0x0348, B:210:0x034e, B:211:0x0351, B:212:0x0354, B:214:0x035e, B:216:0x0364, B:217:0x0367, B:218:0x036a, B:220:0x0378, B:222:0x037e, B:223:0x0381, B:226:0x039a, B:230:0x03ab, B:232:0x03b1, B:234:0x03ba, B:244:0x03e2, B:246:0x03ed, B:248:0x03f5, B:249:0x0409, B:250:0x040c, B:252:0x0412, B:253:0x0415, B:255:0x0421, B:257:0x042b, B:259:0x0431, B:260:0x0434, B:261:0x0437, B:263:0x0441, B:265:0x0447, B:266:0x044a, B:268:0x044f, B:270:0x0459, B:272:0x045f, B:273:0x0462, B:274:0x0465, B:276:0x046f, B:278:0x0475, B:279:0x0478, B:280:0x047b, B:283:0x048b, B:236:0x03c2, B:238:0x03ce, B:241:0x03d5, B:289:0x04a2), top: B:359:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x048b A[Catch: Exception -> 0x05e8, TryCatch #7 {Exception -> 0x05e8, blocks: (B:3:0x001d, B:11:0x0053, B:13:0x0059, B:291:0x04c8, B:293:0x04ce, B:62:0x011b, B:67:0x013c, B:70:0x0146, B:88:0x017f, B:90:0x0185, B:92:0x018f, B:94:0x019d, B:96:0x01a3, B:98:0x01a9, B:100:0x01b3, B:102:0x01c3, B:105:0x01cc, B:107:0x01d2, B:109:0x01dc, B:111:0x01ec, B:114:0x01f5, B:116:0x01fb, B:118:0x0201, B:120:0x020b, B:122:0x0211, B:123:0x0214, B:126:0x021b, B:128:0x0222, B:130:0x022c, B:132:0x023a, B:134:0x0240, B:136:0x0246, B:138:0x0250, B:140:0x0260, B:143:0x0269, B:145:0x026f, B:147:0x0279, B:149:0x0289, B:152:0x0292, B:154:0x0298, B:156:0x029e, B:158:0x02a8, B:160:0x02ae, B:161:0x02b1, B:163:0x02b6, B:166:0x02bd, B:168:0x02c2, B:171:0x02d0, B:175:0x02d8, B:177:0x02de, B:179:0x02e4, B:180:0x02e7, B:182:0x02ec, B:184:0x02f2, B:185:0x02f5, B:188:0x02fb, B:190:0x0305, B:192:0x030b, B:195:0x0319, B:197:0x031f, B:198:0x0322, B:200:0x0328, B:202:0x0332, B:204:0x0338, B:205:0x033b, B:206:0x033e, B:208:0x0348, B:210:0x034e, B:211:0x0351, B:212:0x0354, B:214:0x035e, B:216:0x0364, B:217:0x0367, B:218:0x036a, B:220:0x0378, B:222:0x037e, B:223:0x0381, B:226:0x039a, B:230:0x03ab, B:232:0x03b1, B:234:0x03ba, B:244:0x03e2, B:246:0x03ed, B:248:0x03f5, B:249:0x0409, B:250:0x040c, B:252:0x0412, B:253:0x0415, B:255:0x0421, B:257:0x042b, B:259:0x0431, B:260:0x0434, B:261:0x0437, B:263:0x0441, B:265:0x0447, B:266:0x044a, B:268:0x044f, B:270:0x0459, B:272:0x045f, B:273:0x0462, B:274:0x0465, B:276:0x046f, B:278:0x0475, B:279:0x0478, B:280:0x047b, B:283:0x048b, B:236:0x03c2, B:238:0x03ce, B:241:0x03d5, B:289:0x04a2), top: B:359:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$fetchLocationAddress$31(Locale locale, final Location location, int i, Locale locale2, final LocationFetchCallback locationFetchCallback) {
        TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue;
        final TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue2;
        final TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue3;
        final String str;
        final String str2;
        List<Address> list;
        TL_stories$TL_geoPointAddress tL_stories$TL_geoPointAddress;
        String format;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        String str7;
        String str8;
        TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue4;
        String detectOcean;
        String str9;
        int i2;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        boolean z2;
        String subThoroughfare;
        boolean z3;
        String thoroughfare;
        String locality;
        String countryName;
        StringBuilder sb;
        String str16;
        String str17;
        String countryName2;
        String locality2;
        boolean z4;
        String str18;
        String str19;
        String str20;
        String str21;
        boolean z5;
        String str22;
        StringBuilder sb2 = new StringBuilder();
        TL_stories$TL_geoPointAddress tL_stories$TL_geoPointAddress2 = new TL_stories$TL_geoPointAddress();
        TL_stories$TL_geoPointAddress tL_stories$TL_geoPointAddress3 = new TL_stories$TL_geoPointAddress();
        TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue5 = null;
        try {
            List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, locale).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (i != 2) {
                list = null;
            } else if (locale2 == locale) {
                list = fromLocation;
            } else {
                try {
                    list = new Geocoder(ApplicationLoader.applicationContext, locale2).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                } catch (Exception unused) {
                    tLRPC$TL_messageMediaVenue = null;
                    str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                    str = str2;
                    tLRPC$TL_messageMediaVenue3 = tLRPC$TL_messageMediaVenue5;
                    tLRPC$TL_messageMediaVenue2 = tLRPC$TL_messageMediaVenue;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationController.lambda$fetchLocationAddress$30(LocationController.LocationFetchCallback.this, str2, str, tLRPC$TL_messageMediaVenue3, tLRPC$TL_messageMediaVenue2, location);
                        }
                    });
                }
            }
            if (fromLocation.size() > 0) {
                Address address = fromLocation.get(0);
                Address address2 = (list == null || list.size() < 1) ? null : list.get(0);
                if (i == 1) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        str22 = address.getAddressLine(0);
                    } catch (Exception unused2) {
                        str22 = null;
                    }
                    if (TextUtils.isEmpty(str22)) {
                        try {
                            arrayList.add(address.getSubThoroughfare());
                        } catch (Exception unused3) {
                        }
                        try {
                            arrayList.add(address.getThoroughfare());
                        } catch (Exception unused4) {
                        }
                        try {
                            arrayList.add(address.getAdminArea());
                        } catch (Exception unused5) {
                        }
                        try {
                            arrayList.add(address.getCountryName());
                        } catch (Exception unused6) {
                        }
                    } else {
                        arrayList.add(str22);
                    }
                    int i3 = 0;
                    while (i3 < arrayList.size()) {
                        if (arrayList.get(i3) != null) {
                            String[] split = ((String) arrayList.get(i3)).split(", ");
                            if (split.length > 1) {
                                arrayList.remove(i3);
                                for (String str23 : split) {
                                    arrayList.add(i3, str23);
                                    i3++;
                                }
                            }
                        }
                        i3++;
                    }
                    int i4 = 0;
                    while (i4 < arrayList.size()) {
                        if (TextUtils.isEmpty((CharSequence) arrayList.get(i4)) || arrayList.indexOf(arrayList.get(i4)) != i4 || ((String) arrayList.get(i4)).matches("^\\s*\\d{4,}\\s*$")) {
                            arrayList.remove(i4);
                            i4--;
                        }
                        i4++;
                    }
                    format = arrayList.isEmpty() ? null : TextUtils.join(", ", arrayList);
                    str3 = format;
                    tL_stories$TL_geoPointAddress = tL_stories$TL_geoPointAddress3;
                    str4 = null;
                    str5 = null;
                    str7 = null;
                    str8 = null;
                    str11 = null;
                    z4 = true;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    StringBuilder sb4 = new StringBuilder();
                    StringBuilder sb5 = new StringBuilder();
                    StringBuilder sb6 = new StringBuilder();
                    String locality3 = TextUtils.isEmpty(null) ? address.getLocality() : null;
                    if (TextUtils.isEmpty(locality3)) {
                        locality3 = address.getAdminArea();
                    }
                    if (TextUtils.isEmpty(locality3)) {
                        locality3 = address.getSubAdminArea();
                    }
                    String str24 = locality3;
                    if (address2 != null) {
                        str11 = TextUtils.isEmpty(null) ? address2.getLocality() : null;
                        if (TextUtils.isEmpty(str11)) {
                            str11 = address2.getAdminArea();
                        }
                        if (TextUtils.isEmpty(str11)) {
                            str11 = address2.getSubAdminArea();
                        }
                        str10 = address2.getAdminArea();
                    } else {
                        str10 = null;
                        str11 = null;
                    }
                    String thoroughfare2 = (!TextUtils.isEmpty(null) || TextUtils.equals(address.getThoroughfare(), str24) || TextUtils.equals(address.getThoroughfare(), address.getCountryName())) ? null : address.getThoroughfare();
                    if (!TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(address.getSubLocality(), str24)) {
                        str12 = thoroughfare2;
                    } else {
                        str12 = thoroughfare2;
                        if (!TextUtils.equals(address.getSubLocality(), address.getCountryName())) {
                            str13 = address.getSubLocality();
                            if (TextUtils.isEmpty(str13) || TextUtils.equals(address.getLocality(), str24)) {
                                str14 = str13;
                            } else {
                                str14 = str13;
                                if (!TextUtils.equals(address.getLocality(), address.getCountryName())) {
                                    str15 = address.getLocality();
                                    if (!TextUtils.isEmpty(str15) || TextUtils.equals(str15, str24) || TextUtils.equals(str15, address.getCountryName())) {
                                        sb6 = null;
                                    } else {
                                        if (sb6.length() > 0) {
                                            sb6.append(", ");
                                        }
                                        sb6.append(str15);
                                    }
                                    if (address2 != null) {
                                        String thoroughfare3 = (!TextUtils.isEmpty(null) || TextUtils.equals(address2.getThoroughfare(), str24) || TextUtils.equals(address2.getThoroughfare(), address2.getCountryName())) ? null : address2.getThoroughfare();
                                        if (!TextUtils.isEmpty(thoroughfare3) || TextUtils.equals(address2.getSubLocality(), str24)) {
                                            str18 = thoroughfare3;
                                        } else {
                                            str18 = thoroughfare3;
                                            if (!TextUtils.equals(address2.getSubLocality(), address2.getCountryName())) {
                                                str19 = address2.getSubLocality();
                                                if (TextUtils.isEmpty(str19) || TextUtils.equals(address2.getLocality(), str24)) {
                                                    str20 = str19;
                                                } else {
                                                    str20 = str19;
                                                    if (!TextUtils.equals(address2.getLocality(), address2.getCountryName())) {
                                                        str21 = address2.getLocality();
                                                        if (!TextUtils.isEmpty(str21) || TextUtils.equals(str21, str10) || TextUtils.equals(str21, address2.getCountryName())) {
                                                            sb2 = null;
                                                        } else {
                                                            if (sb2.length() > 0) {
                                                                sb2.append(", ");
                                                            }
                                                            sb2.append(str21);
                                                        }
                                                        if (!TextUtils.isEmpty(sb2)) {
                                                            int i5 = 0;
                                                            while (true) {
                                                                String[] strArr = unnamedRoads;
                                                                if (i5 >= strArr.length) {
                                                                    z5 = false;
                                                                    break;
                                                                } else if (strArr[i5].equalsIgnoreCase(sb2.toString())) {
                                                                    z5 = true;
                                                                    break;
                                                                } else {
                                                                    i5++;
                                                                }
                                                            }
                                                            if (z5) {
                                                                sb2 = null;
                                                                sb6 = null;
                                                            }
                                                        }
                                                    }
                                                }
                                                str21 = str20;
                                                if (TextUtils.isEmpty(str21)) {
                                                }
                                                sb2 = null;
                                                if (!TextUtils.isEmpty(sb2)) {
                                                }
                                            }
                                        }
                                        str19 = str18;
                                        if (TextUtils.isEmpty(str19)) {
                                        }
                                        str20 = str19;
                                        str21 = str20;
                                        if (TextUtils.isEmpty(str21)) {
                                        }
                                        sb2 = null;
                                        if (!TextUtils.isEmpty(sb2)) {
                                        }
                                    }
                                    if (TextUtils.isEmpty(str24)) {
                                        z2 = true;
                                    } else {
                                        if (sb5.length() > 0) {
                                            sb5.append(", ");
                                        }
                                        sb5.append(str24);
                                        if (sb6 != null) {
                                            if (sb6.length() > 0) {
                                                sb6.append(", ");
                                            }
                                            sb6.append(str24);
                                        }
                                        z2 = false;
                                    }
                                    subThoroughfare = address.getSubThoroughfare();
                                    if (TextUtils.isEmpty(subThoroughfare)) {
                                        z3 = false;
                                    } else {
                                        sb3.append(subThoroughfare);
                                        z3 = true;
                                    }
                                    thoroughfare = address.getThoroughfare();
                                    boolean z6 = z2;
                                    if (!TextUtils.isEmpty(thoroughfare)) {
                                        if (sb3.length() > 0) {
                                            sb3.append(" ");
                                        }
                                        sb3.append(thoroughfare);
                                        z3 = true;
                                    }
                                    if (!z3) {
                                        String adminArea = address.getAdminArea();
                                        if (!TextUtils.isEmpty(adminArea)) {
                                            if (sb3.length() > 0) {
                                                sb3.append(", ");
                                            }
                                            sb3.append(adminArea);
                                        }
                                        String subAdminArea = address.getSubAdminArea();
                                        if (!TextUtils.isEmpty(subAdminArea)) {
                                            if (sb3.length() > 0) {
                                                sb3.append(", ");
                                            }
                                            sb3.append(subAdminArea);
                                        }
                                    }
                                    locality = address.getLocality();
                                    if (!TextUtils.isEmpty(locality)) {
                                        if (sb3.length() > 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(locality);
                                    }
                                    String countryCode = address.getCountryCode();
                                    countryName = address.getCountryName();
                                    if (TextUtils.isEmpty(countryName)) {
                                        sb = sb2;
                                        tL_stories$TL_geoPointAddress = tL_stories$TL_geoPointAddress3;
                                        str16 = str10;
                                        str17 = countryCode;
                                    } else {
                                        if (sb3.length() > 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(countryName);
                                        sb = sb2;
                                        String language = locale.getLanguage();
                                        str16 = str10;
                                        str17 = countryCode;
                                        if ("US".equals(address.getCountryCode())) {
                                            tL_stories$TL_geoPointAddress = tL_stories$TL_geoPointAddress3;
                                        } else {
                                            tL_stories$TL_geoPointAddress = tL_stories$TL_geoPointAddress3;
                                            if ("AE".equals(address.getCountryCode())) {
                                            }
                                            if ("GB".equals(address.getCountryCode()) && "en".equals(language)) {
                                                String[] split2 = countryName.split(" ");
                                                countryName = "";
                                                for (String str25 : split2) {
                                                    if (str25.length() > 0) {
                                                        countryName = countryName + str25.charAt(0);
                                                    }
                                                }
                                                if (sb5.length() > 0) {
                                                }
                                                sb5.append(countryName);
                                            } else {
                                                if ("US".equals(address.getCountryCode())) {
                                                    countryName = "USA";
                                                }
                                                if (sb5.length() > 0) {
                                                    sb5.append(", ");
                                                }
                                                sb5.append(countryName);
                                            }
                                        }
                                        if (!"en".equals(language)) {
                                            if (!"uk".equals(language)) {
                                            }
                                        }
                                        String[] split22 = countryName.split(" ");
                                        countryName = "";
                                        while (r3 < r5) {
                                        }
                                        if (sb5.length() > 0) {
                                        }
                                        sb5.append(countryName);
                                    }
                                    countryName2 = address.getCountryName();
                                    if (!TextUtils.isEmpty(countryName2)) {
                                        if (sb4.length() > 0) {
                                            sb4.append(", ");
                                        }
                                        sb4.append(countryName2);
                                    }
                                    locality2 = address.getLocality();
                                    if (!TextUtils.isEmpty(locality2)) {
                                        if (sb4.length() > 0) {
                                            sb4.append(", ");
                                        }
                                        sb4.append(locality2);
                                    }
                                    if (!z3) {
                                        String adminArea2 = address.getAdminArea();
                                        if (!TextUtils.isEmpty(adminArea2)) {
                                            if (sb4.length() > 0) {
                                                sb4.append(", ");
                                            }
                                            sb4.append(adminArea2);
                                        }
                                        String subAdminArea2 = address.getSubAdminArea();
                                        if (!TextUtils.isEmpty(subAdminArea2)) {
                                            if (sb4.length() > 0) {
                                                sb4.append(", ");
                                            }
                                            sb4.append(subAdminArea2);
                                        }
                                    }
                                    format = sb3.toString();
                                    str3 = sb4.toString();
                                    str4 = sb5.toString();
                                    str5 = sb6 == null ? null : sb6.toString();
                                    z4 = z6;
                                    sb2 = sb;
                                    str7 = str16;
                                    str8 = str17;
                                }
                            }
                            str15 = str14;
                            if (TextUtils.isEmpty(str15)) {
                            }
                            sb6 = null;
                            if (address2 != null) {
                            }
                            if (TextUtils.isEmpty(str24)) {
                            }
                            subThoroughfare = address.getSubThoroughfare();
                            if (TextUtils.isEmpty(subThoroughfare)) {
                            }
                            thoroughfare = address.getThoroughfare();
                            boolean z62 = z2;
                            if (!TextUtils.isEmpty(thoroughfare)) {
                            }
                            if (!z3) {
                            }
                            locality = address.getLocality();
                            if (!TextUtils.isEmpty(locality)) {
                            }
                            String countryCode2 = address.getCountryCode();
                            countryName = address.getCountryName();
                            if (TextUtils.isEmpty(countryName)) {
                            }
                            countryName2 = address.getCountryName();
                            if (!TextUtils.isEmpty(countryName2)) {
                            }
                            locality2 = address.getLocality();
                            if (!TextUtils.isEmpty(locality2)) {
                            }
                            if (!z3) {
                            }
                            format = sb3.toString();
                            str3 = sb4.toString();
                            str4 = sb5.toString();
                            if (sb6 == null) {
                            }
                            z4 = z62;
                            sb2 = sb;
                            str7 = str16;
                            str8 = str17;
                        }
                    }
                    str13 = str12;
                    if (TextUtils.isEmpty(str13)) {
                    }
                    str14 = str13;
                    str15 = str14;
                    if (TextUtils.isEmpty(str15)) {
                    }
                    sb6 = null;
                    if (address2 != null) {
                    }
                    if (TextUtils.isEmpty(str24)) {
                    }
                    subThoroughfare = address.getSubThoroughfare();
                    if (TextUtils.isEmpty(subThoroughfare)) {
                    }
                    thoroughfare = address.getThoroughfare();
                    boolean z622 = z2;
                    if (!TextUtils.isEmpty(thoroughfare)) {
                    }
                    if (!z3) {
                    }
                    locality = address.getLocality();
                    if (!TextUtils.isEmpty(locality)) {
                    }
                    String countryCode22 = address.getCountryCode();
                    countryName = address.getCountryName();
                    if (TextUtils.isEmpty(countryName)) {
                    }
                    countryName2 = address.getCountryName();
                    if (!TextUtils.isEmpty(countryName2)) {
                    }
                    locality2 = address.getLocality();
                    if (!TextUtils.isEmpty(locality2)) {
                    }
                    if (!z3) {
                    }
                    format = sb3.toString();
                    str3 = sb4.toString();
                    str4 = sb5.toString();
                    if (sb6 == null) {
                    }
                    z4 = z622;
                    sb2 = sb;
                    str7 = str16;
                    str8 = str17;
                }
                z = z4;
                str6 = str11;
            } else {
                tL_stories$TL_geoPointAddress = tL_stories$TL_geoPointAddress3;
                format = i == 1 ? null : String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                str3 = format;
                str4 = null;
                str5 = null;
                str6 = null;
                z = true;
                str7 = null;
                str8 = null;
            }
            if (TextUtils.isEmpty(str4)) {
                tLRPC$TL_messageMediaVenue5 = null;
            } else {
                tLRPC$TL_messageMediaVenue5 = new TLRPC$TL_messageMediaVenue();
                try {
                    TLRPC$TL_geoPoint tLRPC$TL_geoPoint = new TLRPC$TL_geoPoint();
                    tLRPC$TL_messageMediaVenue5.geo = tLRPC$TL_geoPoint;
                    tLRPC$TL_geoPoint.lat = location.getLatitude();
                    tLRPC$TL_messageMediaVenue5.geo._long = location.getLongitude();
                    tLRPC$TL_messageMediaVenue5.query_id = -1L;
                    tLRPC$TL_messageMediaVenue5.title = str4;
                    tLRPC$TL_messageMediaVenue5.icon = z ? "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png" : "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                    tLRPC$TL_messageMediaVenue5.emoji = countryCodeToEmoji(str8);
                    if (z) {
                        str9 = "Country";
                        i2 = R.string.Country;
                    } else {
                        str9 = "PassportCity";
                        i2 = R.string.PassportCity;
                    }
                    tLRPC$TL_messageMediaVenue5.address = LocaleController.getString(str9, i2);
                    tLRPC$TL_messageMediaVenue5.geoAddress = tL_stories$TL_geoPointAddress2;
                    tL_stories$TL_geoPointAddress2.country_iso2 = str8;
                    if (!z) {
                        if (!TextUtils.isEmpty(str7)) {
                            tL_stories$TL_geoPointAddress2.flags |= 1;
                            tL_stories$TL_geoPointAddress2.state = str7;
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            tL_stories$TL_geoPointAddress2.flags |= 2;
                            tL_stories$TL_geoPointAddress2.city = str6;
                        }
                    }
                } catch (Exception unused7) {
                    tLRPC$TL_messageMediaVenue = null;
                    str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                    str = str2;
                    tLRPC$TL_messageMediaVenue3 = tLRPC$TL_messageMediaVenue5;
                    tLRPC$TL_messageMediaVenue2 = tLRPC$TL_messageMediaVenue;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationController.lambda$fetchLocationAddress$30(LocationController.LocationFetchCallback.this, str2, str, tLRPC$TL_messageMediaVenue3, tLRPC$TL_messageMediaVenue2, location);
                        }
                    });
                }
            }
            if (TextUtils.isEmpty(str5)) {
                tLRPC$TL_messageMediaVenue4 = null;
            } else {
                tLRPC$TL_messageMediaVenue4 = new TLRPC$TL_messageMediaVenue();
                try {
                    TLRPC$TL_geoPoint tLRPC$TL_geoPoint2 = new TLRPC$TL_geoPoint();
                    tLRPC$TL_messageMediaVenue4.geo = tLRPC$TL_geoPoint2;
                    tLRPC$TL_geoPoint2.lat = location.getLatitude();
                    tLRPC$TL_messageMediaVenue4.geo._long = location.getLongitude();
                    tLRPC$TL_messageMediaVenue4.query_id = -1L;
                    tLRPC$TL_messageMediaVenue4.title = str5;
                    tLRPC$TL_messageMediaVenue4.icon = "pin";
                    tLRPC$TL_messageMediaVenue4.address = LocaleController.getString("PassportStreet1", R.string.PassportStreet1);
                    TL_stories$TL_geoPointAddress tL_stories$TL_geoPointAddress4 = tL_stories$TL_geoPointAddress;
                    tLRPC$TL_messageMediaVenue4.geoAddress = tL_stories$TL_geoPointAddress4;
                    tL_stories$TL_geoPointAddress4.country_iso2 = str8;
                    if (!TextUtils.isEmpty(str7)) {
                        tL_stories$TL_geoPointAddress4.flags |= 1;
                        tL_stories$TL_geoPointAddress4.state = str7;
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        tL_stories$TL_geoPointAddress4.flags |= 2;
                        tL_stories$TL_geoPointAddress4.city = str6;
                    }
                    if (!TextUtils.isEmpty(sb2)) {
                        tL_stories$TL_geoPointAddress4.flags |= 4;
                        tL_stories$TL_geoPointAddress4.street = sb2.toString();
                    }
                } catch (Exception unused8) {
                    tLRPC$TL_messageMediaVenue = tLRPC$TL_messageMediaVenue4;
                    str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                    str = str2;
                    tLRPC$TL_messageMediaVenue3 = tLRPC$TL_messageMediaVenue5;
                    tLRPC$TL_messageMediaVenue2 = tLRPC$TL_messageMediaVenue;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationController.lambda$fetchLocationAddress$30(LocationController.LocationFetchCallback.this, str2, str, tLRPC$TL_messageMediaVenue3, tLRPC$TL_messageMediaVenue2, location);
                        }
                    });
                }
            }
            if (tLRPC$TL_messageMediaVenue5 == null && tLRPC$TL_messageMediaVenue4 == null && (detectOcean = detectOcean(location.getLongitude(), location.getLatitude())) != null) {
                TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue6 = new TLRPC$TL_messageMediaVenue();
                try {
                    TLRPC$TL_geoPoint tLRPC$TL_geoPoint3 = new TLRPC$TL_geoPoint();
                    tLRPC$TL_messageMediaVenue6.geo = tLRPC$TL_geoPoint3;
                    tLRPC$TL_geoPoint3.lat = location.getLatitude();
                    tLRPC$TL_messageMediaVenue6.geo._long = location.getLongitude();
                    tLRPC$TL_messageMediaVenue6.query_id = -1L;
                    tLRPC$TL_messageMediaVenue6.title = detectOcean;
                    tLRPC$TL_messageMediaVenue6.icon = "pin";
                    tLRPC$TL_messageMediaVenue6.emoji = "🌊";
                    tLRPC$TL_messageMediaVenue6.address = "Ocean";
                    tLRPC$TL_messageMediaVenue5 = tLRPC$TL_messageMediaVenue6;
                } catch (Exception unused9) {
                    tLRPC$TL_messageMediaVenue = tLRPC$TL_messageMediaVenue4;
                    tLRPC$TL_messageMediaVenue5 = tLRPC$TL_messageMediaVenue6;
                    str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                    str = str2;
                    tLRPC$TL_messageMediaVenue3 = tLRPC$TL_messageMediaVenue5;
                    tLRPC$TL_messageMediaVenue2 = tLRPC$TL_messageMediaVenue;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationController.lambda$fetchLocationAddress$30(LocationController.LocationFetchCallback.this, str2, str, tLRPC$TL_messageMediaVenue3, tLRPC$TL_messageMediaVenue2, location);
                        }
                    });
                }
            }
            str2 = format;
            str = str3;
            tLRPC$TL_messageMediaVenue2 = tLRPC$TL_messageMediaVenue4;
            tLRPC$TL_messageMediaVenue3 = tLRPC$TL_messageMediaVenue5;
        } catch (Exception unused10) {
            tLRPC$TL_messageMediaVenue5 = null;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.LocationController$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                LocationController.lambda$fetchLocationAddress$30(LocationController.LocationFetchCallback.this, str2, str, tLRPC$TL_messageMediaVenue3, tLRPC$TL_messageMediaVenue2, location);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fetchLocationAddress$30(LocationFetchCallback locationFetchCallback, String str, String str2, TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue, TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue2, Location location) {
        callbacks.remove(locationFetchCallback);
        locationFetchCallback.onLocationAddressAvailable(str, str2, tLRPC$TL_messageMediaVenue, tLRPC$TL_messageMediaVenue2, location);
    }

    public static String countryCodeToEmoji(String str) {
        if (str == null) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int codePointCount = upperCase.codePointCount(0, upperCase.length());
        if (codePointCount > 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < codePointCount; i++) {
            sb.append(Character.toChars((Character.codePointAt(upperCase, i) - 65) + 127462));
        }
        return sb.toString();
    }
}
