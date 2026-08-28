package org.telegram.messenger;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.kd0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
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
    private a0.h cacheRequests;
    private FusedLocationListener fusedLocationListener;
    private GpsLocationListener gpsLocationListener;
    private Location lastKnownLocation;
    private boolean lastLocationByMaps;
    private long lastLocationSendTime;
    private long lastLocationStartTime;
    private a0.h lastReadLocationTime;
    private long locationEndWatchTime;
    private LocationManager locationManager;
    private ILocationServiceProvider.ILocationRequest locationRequest;
    private boolean locationSentSinceLastMapUpdate;
    public a0.h locationsCache;
    private GpsLocationListener networkLocationListener;
    private GpsLocationListener passiveLocationListener;
    private SparseIntArray requests;
    private Boolean servicesAvailable;
    private ArrayList<SharingLocationInfo> sharingLocations;
    private a0.h sharingLocationsMap;
    private a0.h sharingLocationsMapUI;
    public ArrayList<SharingLocationInfo> sharingLocationsUI;
    private boolean started;
    private boolean wasConnectedToPlayServices;
    private static volatile LocationController[] Instance = new LocationController[4];
    public static String[] unnamedRoads = {"Unnamed Road", "Вulicya bez nazvi", "Нeizvestnaya doroga", "İsimsiz Yol", "Ceļš bez nosaukuma", "Kelias be pavadinimo", "Droga bez nazwy", "Cesta bez názvu", "Silnice bez názvu", "Drum fără nume", "Route sans nom", "Vía sin nombre", "Estrada sem nome", "Οdos xoris onomasia", "Rrugë pa emër", "Пat bez ime", "Нeimenovani put", "Strada senza nome", "Straße ohne Straßennamen"};
    private static HashMap<LocationFetchCallback, Runnable> callbacks = new HashMap<>();

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public interface LocationFetchCallback {
        void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location);
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public LocationController(int i9) {
        super(i9);
        this.sharingLocationsMap = new a0.h();
        this.sharingLocations = new ArrayList<>();
        this.locationsCache = new a0.h();
        this.lastReadLocationTime = new a0.h();
        this.gpsLocationListener = new GpsLocationListener();
        this.networkLocationListener = new GpsLocationListener();
        this.passiveLocationListener = new GpsLocationListener();
        this.fusedLocationListener = new FusedLocationListener();
        this.locationSentSinceLastMapUpdate = true;
        this.requests = new SparseIntArray();
        this.cacheRequests = new a0.h();
        this.sharingLocationsUI = new ArrayList<>();
        this.sharingLocationsMapUI = new a0.h();
        this.locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        this.apiClient = ApplicationLoader.getLocationServiceProvider().onCreateLocationServicesAPI(ApplicationLoader.applicationContext, this, this);
        ILocationServiceProvider.ILocationRequest onCreateLocationRequest = ApplicationLoader.getLocationServiceProvider().onCreateLocationRequest();
        this.locationRequest = onCreateLocationRequest;
        onCreateLocationRequest.setPriority(0);
        this.locationRequest.setInterval(1000L);
        this.locationRequest.setFastestInterval(1000L);
        AndroidUtilities.runOnUIThread(new p5(this, 2));
        loadSharingLocations();
    }

    private void broadcastLastKnownLocation(boolean z10) {
        int i9;
        TLRPC.GeoPoint geoPoint;
        if (this.lastKnownLocation == null) {
            return;
        }
        if (this.requests.size() != 0) {
            if (z10) {
                for (int i10 = 0; i10 < this.requests.size(); i10++) {
                    getConnectionsManager().cancelRequest(this.requests.keyAt(i10), false);
                }
            }
            this.requests.clear();
        }
        if (!this.sharingLocations.isEmpty()) {
            int currentTime = getConnectionsManager().getCurrentTime();
            float[] fArr = new float[1];
            while (i9 < this.sharingLocations.size()) {
                SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i9);
                TLRPC.Message message = sharingLocationInfo.messageObject.messageOwner;
                TLRPC.MessageMedia messageMedia = message.media;
                if (messageMedia != null && (geoPoint = messageMedia.geo) != null && sharingLocationInfo.lastSentProximityMeters == sharingLocationInfo.proximityMeters) {
                    int i11 = message.edit_date;
                    if (i11 == 0) {
                        i11 = message.date;
                    }
                    if (Math.abs(currentTime - i11) < 10) {
                        Location.distanceBetween(geoPoint.lat, geoPoint._long, this.lastKnownLocation.getLatitude(), this.lastKnownLocation.getLongitude(), fArr);
                        i9 = fArr[0] < 1.0f ? i9 + 1 : 0;
                    }
                }
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
                tL_messages_editMessage.id = sharingLocationInfo.mid;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                tL_messages_editMessage.media.geo_point.lat = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLatitude());
                tL_messages_editMessage.media.geo_point._long = AndroidUtilities.fixLocationCoord(this.lastKnownLocation.getLongitude());
                tL_messages_editMessage.media.geo_point.accuracy_radius = (int) this.lastKnownLocation.getAccuracy();
                TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                    inputGeoPoint.flags |= 1;
                }
                int i12 = sharingLocationInfo.lastSentProximityMeters;
                int i13 = sharingLocationInfo.proximityMeters;
                if (i12 != i13) {
                    inputMedia.proximity_notification_radius = i13;
                    inputMedia.flags |= 8;
                }
                inputMedia.heading = getHeading(this.lastKnownLocation);
                tL_messages_editMessage.media.flags |= 4;
                int sendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage, new h2(this, sharingLocationInfo, r6, tL_messages_editMessage, 1));
                int[] iArr = {sendRequest};
                this.requests.put(sendRequest, 0);
            }
        }
        getConnectionsManager().resumeNetworkMaybe();
        if (shouldStopGps()) {
            stop(false);
        }
    }

    private boolean checkServices() {
        if (this.servicesAvailable == null) {
            this.servicesAvailable = Boolean.valueOf(ApplicationLoader.getLocationServiceProvider().checkServices());
        }
        return this.servicesAvailable.booleanValue();
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
        StringBuilder sb2 = new StringBuilder();
        for (int i9 = 0; i9 < codePointCount; i9++) {
            sb2.append(Character.toChars(Character.codePointAt(upperCase, i9) - (-127397)));
        }
        return sb2.toString();
    }

    public static String detectOcean(double d, double d9) {
        if (d9 > 65.0d) {
            return "Arctic Ocean";
        }
        if (d > -88.0d && d < 40.0d && d9 > 0.0d) {
            return "Atlantic Ocean";
        }
        if (d > -60.0d && d < 20.0d && d9 <= 0.0d) {
            return "Atlantic Ocean";
        }
        if (d9 <= 30.0d && d >= 20.0d && d < 150.0d) {
            return "Indian Ocean";
        }
        if ((d > 106.0d || d < -60.0d) && d9 > 0.0d) {
            return "Pacific Ocean";
        }
        if ((d > 150.0d || d < -60.0d) && d9 <= 0.0d) {
            return "Pacific Ocean";
        }
        return null;
    }

    public static void fetchLocationAddress(Location location, LocationFetchCallback locationFetchCallback) {
        fetchLocationAddress(location, 0, locationFetchCallback);
    }

    public static int getHeading(Location location) {
        float bearing = location.getBearing();
        return (bearing <= 0.0f || bearing >= 1.0f) ? (int) bearing : bearing < 0.5f ? 360 : 1;
    }

    public static LocationController getInstance(int i9) {
        LocationController locationController;
        LocationController locationController2 = Instance[i9];
        if (locationController2 != null) {
            return locationController2;
        }
        synchronized (LocationController.class) {
            try {
                locationController = Instance[i9];
                if (locationController == null) {
                    LocationController[] locationControllerArr = Instance;
                    LocationController locationController3 = new LocationController(i9);
                    locationControllerArr[i9] = locationController3;
                    locationController = locationController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return locationController;
    }

    public static int getLocationsCount() {
        int i9 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            i9 += getInstance(i10).sharingLocationsUI.size();
        }
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addSharingLocation$11(SharingLocationInfo sharingLocationInfo, SharingLocationInfo sharingLocationInfo2) {
        if (sharingLocationInfo != null) {
            this.sharingLocationsUI.remove(sharingLocationInfo);
        }
        this.sharingLocationsUI.add(sharingLocationInfo2);
        this.sharingLocationsMapUI.k(sharingLocationInfo2, sharingLocationInfo2.did);
        startService();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$broadcastLastKnownLocation$6(SharingLocationInfo sharingLocationInfo) {
        this.sharingLocationsUI.remove(sharingLocationInfo);
        this.sharingLocationsMapUI.l(sharingLocationInfo.did);
        if (this.sharingLocationsUI.isEmpty()) {
            stopService();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$broadcastLastKnownLocation$7(SharingLocationInfo sharingLocationInfo, int[] iArr, TLRPC.TL_messages_editMessage tL_messages_editMessage, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (tL_error.text.equals("MESSAGE_ID_INVALID")) {
                this.sharingLocations.remove(sharingLocationInfo);
                this.sharingLocationsMap.l(sharingLocationInfo.did);
                saveSharingLocation(sharingLocationInfo, 1);
                this.requests.delete(iArr[0]);
                AndroidUtilities.runOnUIThread(new n5(0, sharingLocationInfo, this));
                return;
            }
            return;
        }
        if ((tL_messages_editMessage.flags & 8) != 0) {
            sharingLocationInfo.lastSentProximityMeters = tL_messages_editMessage.media.proximity_notification_radius;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        boolean z10 = false;
        for (int i9 = 0; i9 < updates.updates.size(); i9++) {
            TLRPC.Update update = updates.updates.get(i9);
            if (update instanceof TL_update.TL_updateEditMessage) {
                sharingLocationInfo.messageObject.messageOwner = ((TL_update.TL_updateEditMessage) update).message;
            } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                sharingLocationInfo.messageObject.messageOwner = ((TL_update.TL_updateEditChannelMessage) update).message;
            }
            z10 = true;
        }
        if (z10) {
            saveSharingLocation(sharingLocationInfo, 0);
        }
        getMessagesController().processUpdates(updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cleanup$9() {
        this.locationEndWatchTime = 0L;
        this.requests.clear();
        this.sharingLocationsMap.b();
        this.sharingLocations.clear();
        setLastKnownLocation(null);
        stop(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fetchLocationAddress$28(LocationFetchCallback locationFetchCallback, String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        callbacks.remove(locationFetchCallback);
        locationFetchCallback.onLocationAddressAvailable(str, str2, tL_messageMediaVenue, tL_messageMediaVenue2, location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x03cc, code lost:
    
        if ("ru".equals(r1) == false) goto L235;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0203 A[Catch: Exception -> 0x013c, TryCatch #3 {Exception -> 0x013c, blocks: (B:58:0x04db, B:60:0x04e1, B:143:0x012c, B:145:0x0137, B:146:0x0142, B:148:0x0148, B:149:0x014c, B:151:0x0152, B:154:0x015a, B:156:0x0160, B:157:0x0167, B:159:0x016d, B:160:0x0171, B:162:0x0177, B:163:0x017b, B:164:0x0186, B:166:0x018c, B:168:0x0196, B:170:0x01a4, B:171:0x01ab, B:173:0x01b1, B:175:0x01bb, B:177:0x01cb, B:178:0x01d4, B:180:0x01da, B:182:0x01e4, B:184:0x01f4, B:185:0x01fd, B:187:0x0203, B:189:0x0209, B:191:0x0213, B:193:0x0219, B:194:0x021c, B:196:0x0224, B:198:0x022a, B:200:0x0234, B:202:0x0242, B:203:0x0249, B:205:0x024f, B:207:0x0259, B:209:0x0269, B:210:0x0272, B:212:0x0278, B:214:0x0282, B:216:0x0292, B:217:0x029b, B:219:0x02a1, B:221:0x02a7, B:223:0x02b1, B:225:0x02b7, B:226:0x02ba, B:227:0x02c0, B:230:0x02c7, B:232:0x02cc, B:234:0x02dc, B:244:0x02df, B:246:0x02e5, B:248:0x02eb, B:249:0x02ee, B:251:0x02f3, B:253:0x02f9, B:254:0x02fc, B:256:0x0302, B:258:0x030c, B:259:0x0312, B:262:0x0320, B:264:0x0326, B:265:0x0329, B:267:0x032f, B:269:0x0339, B:271:0x033f, B:272:0x0342, B:273:0x0345, B:275:0x034f, B:277:0x0355, B:278:0x0358, B:279:0x035b, B:281:0x0365, B:283:0x036b, B:284:0x036e, B:285:0x0371, B:287:0x037f, B:289:0x0385, B:290:0x0388, B:294:0x03a3, B:297:0x03b6, B:299:0x03bc, B:301:0x03c5, B:303:0x03ee, B:305:0x03f9, B:307:0x0401, B:309:0x0415, B:312:0x0418, B:314:0x041e, B:315:0x0421, B:316:0x042d, B:318:0x0437, B:320:0x043d, B:321:0x0440, B:322:0x0443, B:324:0x044d, B:326:0x0453, B:327:0x0456, B:329:0x045b, B:331:0x0465, B:333:0x046b, B:334:0x046e, B:335:0x0471, B:337:0x047b, B:339:0x0481, B:340:0x0484, B:341:0x0487, B:345:0x0498, B:346:0x03ce, B:348:0x03da, B:351:0x03e1, B:373:0x04b2), top: B:8:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0224 A[Catch: Exception -> 0x013c, TryCatch #3 {Exception -> 0x013c, blocks: (B:58:0x04db, B:60:0x04e1, B:143:0x012c, B:145:0x0137, B:146:0x0142, B:148:0x0148, B:149:0x014c, B:151:0x0152, B:154:0x015a, B:156:0x0160, B:157:0x0167, B:159:0x016d, B:160:0x0171, B:162:0x0177, B:163:0x017b, B:164:0x0186, B:166:0x018c, B:168:0x0196, B:170:0x01a4, B:171:0x01ab, B:173:0x01b1, B:175:0x01bb, B:177:0x01cb, B:178:0x01d4, B:180:0x01da, B:182:0x01e4, B:184:0x01f4, B:185:0x01fd, B:187:0x0203, B:189:0x0209, B:191:0x0213, B:193:0x0219, B:194:0x021c, B:196:0x0224, B:198:0x022a, B:200:0x0234, B:202:0x0242, B:203:0x0249, B:205:0x024f, B:207:0x0259, B:209:0x0269, B:210:0x0272, B:212:0x0278, B:214:0x0282, B:216:0x0292, B:217:0x029b, B:219:0x02a1, B:221:0x02a7, B:223:0x02b1, B:225:0x02b7, B:226:0x02ba, B:227:0x02c0, B:230:0x02c7, B:232:0x02cc, B:234:0x02dc, B:244:0x02df, B:246:0x02e5, B:248:0x02eb, B:249:0x02ee, B:251:0x02f3, B:253:0x02f9, B:254:0x02fc, B:256:0x0302, B:258:0x030c, B:259:0x0312, B:262:0x0320, B:264:0x0326, B:265:0x0329, B:267:0x032f, B:269:0x0339, B:271:0x033f, B:272:0x0342, B:273:0x0345, B:275:0x034f, B:277:0x0355, B:278:0x0358, B:279:0x035b, B:281:0x0365, B:283:0x036b, B:284:0x036e, B:285:0x0371, B:287:0x037f, B:289:0x0385, B:290:0x0388, B:294:0x03a3, B:297:0x03b6, B:299:0x03bc, B:301:0x03c5, B:303:0x03ee, B:305:0x03f9, B:307:0x0401, B:309:0x0415, B:312:0x0418, B:314:0x041e, B:315:0x0421, B:316:0x042d, B:318:0x0437, B:320:0x043d, B:321:0x0440, B:322:0x0443, B:324:0x044d, B:326:0x0453, B:327:0x0456, B:329:0x045b, B:331:0x0465, B:333:0x046b, B:334:0x046e, B:335:0x0471, B:337:0x047b, B:339:0x0481, B:340:0x0484, B:341:0x0487, B:345:0x0498, B:346:0x03ce, B:348:0x03da, B:351:0x03e1, B:373:0x04b2), top: B:8:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02a1 A[Catch: Exception -> 0x013c, TryCatch #3 {Exception -> 0x013c, blocks: (B:58:0x04db, B:60:0x04e1, B:143:0x012c, B:145:0x0137, B:146:0x0142, B:148:0x0148, B:149:0x014c, B:151:0x0152, B:154:0x015a, B:156:0x0160, B:157:0x0167, B:159:0x016d, B:160:0x0171, B:162:0x0177, B:163:0x017b, B:164:0x0186, B:166:0x018c, B:168:0x0196, B:170:0x01a4, B:171:0x01ab, B:173:0x01b1, B:175:0x01bb, B:177:0x01cb, B:178:0x01d4, B:180:0x01da, B:182:0x01e4, B:184:0x01f4, B:185:0x01fd, B:187:0x0203, B:189:0x0209, B:191:0x0213, B:193:0x0219, B:194:0x021c, B:196:0x0224, B:198:0x022a, B:200:0x0234, B:202:0x0242, B:203:0x0249, B:205:0x024f, B:207:0x0259, B:209:0x0269, B:210:0x0272, B:212:0x0278, B:214:0x0282, B:216:0x0292, B:217:0x029b, B:219:0x02a1, B:221:0x02a7, B:223:0x02b1, B:225:0x02b7, B:226:0x02ba, B:227:0x02c0, B:230:0x02c7, B:232:0x02cc, B:234:0x02dc, B:244:0x02df, B:246:0x02e5, B:248:0x02eb, B:249:0x02ee, B:251:0x02f3, B:253:0x02f9, B:254:0x02fc, B:256:0x0302, B:258:0x030c, B:259:0x0312, B:262:0x0320, B:264:0x0326, B:265:0x0329, B:267:0x032f, B:269:0x0339, B:271:0x033f, B:272:0x0342, B:273:0x0345, B:275:0x034f, B:277:0x0355, B:278:0x0358, B:279:0x035b, B:281:0x0365, B:283:0x036b, B:284:0x036e, B:285:0x0371, B:287:0x037f, B:289:0x0385, B:290:0x0388, B:294:0x03a3, B:297:0x03b6, B:299:0x03bc, B:301:0x03c5, B:303:0x03ee, B:305:0x03f9, B:307:0x0401, B:309:0x0415, B:312:0x0418, B:314:0x041e, B:315:0x0421, B:316:0x042d, B:318:0x0437, B:320:0x043d, B:321:0x0440, B:322:0x0443, B:324:0x044d, B:326:0x0453, B:327:0x0456, B:329:0x045b, B:331:0x0465, B:333:0x046b, B:334:0x046e, B:335:0x0471, B:337:0x047b, B:339:0x0481, B:340:0x0484, B:341:0x0487, B:345:0x0498, B:346:0x03ce, B:348:0x03da, B:351:0x03e1, B:373:0x04b2), top: B:8:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02e5 A[Catch: Exception -> 0x013c, TryCatch #3 {Exception -> 0x013c, blocks: (B:58:0x04db, B:60:0x04e1, B:143:0x012c, B:145:0x0137, B:146:0x0142, B:148:0x0148, B:149:0x014c, B:151:0x0152, B:154:0x015a, B:156:0x0160, B:157:0x0167, B:159:0x016d, B:160:0x0171, B:162:0x0177, B:163:0x017b, B:164:0x0186, B:166:0x018c, B:168:0x0196, B:170:0x01a4, B:171:0x01ab, B:173:0x01b1, B:175:0x01bb, B:177:0x01cb, B:178:0x01d4, B:180:0x01da, B:182:0x01e4, B:184:0x01f4, B:185:0x01fd, B:187:0x0203, B:189:0x0209, B:191:0x0213, B:193:0x0219, B:194:0x021c, B:196:0x0224, B:198:0x022a, B:200:0x0234, B:202:0x0242, B:203:0x0249, B:205:0x024f, B:207:0x0259, B:209:0x0269, B:210:0x0272, B:212:0x0278, B:214:0x0282, B:216:0x0292, B:217:0x029b, B:219:0x02a1, B:221:0x02a7, B:223:0x02b1, B:225:0x02b7, B:226:0x02ba, B:227:0x02c0, B:230:0x02c7, B:232:0x02cc, B:234:0x02dc, B:244:0x02df, B:246:0x02e5, B:248:0x02eb, B:249:0x02ee, B:251:0x02f3, B:253:0x02f9, B:254:0x02fc, B:256:0x0302, B:258:0x030c, B:259:0x0312, B:262:0x0320, B:264:0x0326, B:265:0x0329, B:267:0x032f, B:269:0x0339, B:271:0x033f, B:272:0x0342, B:273:0x0345, B:275:0x034f, B:277:0x0355, B:278:0x0358, B:279:0x035b, B:281:0x0365, B:283:0x036b, B:284:0x036e, B:285:0x0371, B:287:0x037f, B:289:0x0385, B:290:0x0388, B:294:0x03a3, B:297:0x03b6, B:299:0x03bc, B:301:0x03c5, B:303:0x03ee, B:305:0x03f9, B:307:0x0401, B:309:0x0415, B:312:0x0418, B:314:0x041e, B:315:0x0421, B:316:0x042d, B:318:0x0437, B:320:0x043d, B:321:0x0440, B:322:0x0443, B:324:0x044d, B:326:0x0453, B:327:0x0456, B:329:0x045b, B:331:0x0465, B:333:0x046b, B:334:0x046e, B:335:0x0471, B:337:0x047b, B:339:0x0481, B:340:0x0484, B:341:0x0487, B:345:0x0498, B:346:0x03ce, B:348:0x03da, B:351:0x03e1, B:373:0x04b2), top: B:8:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x030c A[Catch: Exception -> 0x013c, TryCatch #3 {Exception -> 0x013c, blocks: (B:58:0x04db, B:60:0x04e1, B:143:0x012c, B:145:0x0137, B:146:0x0142, B:148:0x0148, B:149:0x014c, B:151:0x0152, B:154:0x015a, B:156:0x0160, B:157:0x0167, B:159:0x016d, B:160:0x0171, B:162:0x0177, B:163:0x017b, B:164:0x0186, B:166:0x018c, B:168:0x0196, B:170:0x01a4, B:171:0x01ab, B:173:0x01b1, B:175:0x01bb, B:177:0x01cb, B:178:0x01d4, B:180:0x01da, B:182:0x01e4, B:184:0x01f4, B:185:0x01fd, B:187:0x0203, B:189:0x0209, B:191:0x0213, B:193:0x0219, B:194:0x021c, B:196:0x0224, B:198:0x022a, B:200:0x0234, B:202:0x0242, B:203:0x0249, B:205:0x024f, B:207:0x0259, B:209:0x0269, B:210:0x0272, B:212:0x0278, B:214:0x0282, B:216:0x0292, B:217:0x029b, B:219:0x02a1, B:221:0x02a7, B:223:0x02b1, B:225:0x02b7, B:226:0x02ba, B:227:0x02c0, B:230:0x02c7, B:232:0x02cc, B:234:0x02dc, B:244:0x02df, B:246:0x02e5, B:248:0x02eb, B:249:0x02ee, B:251:0x02f3, B:253:0x02f9, B:254:0x02fc, B:256:0x0302, B:258:0x030c, B:259:0x0312, B:262:0x0320, B:264:0x0326, B:265:0x0329, B:267:0x032f, B:269:0x0339, B:271:0x033f, B:272:0x0342, B:273:0x0345, B:275:0x034f, B:277:0x0355, B:278:0x0358, B:279:0x035b, B:281:0x0365, B:283:0x036b, B:284:0x036e, B:285:0x0371, B:287:0x037f, B:289:0x0385, B:290:0x0388, B:294:0x03a3, B:297:0x03b6, B:299:0x03bc, B:301:0x03c5, B:303:0x03ee, B:305:0x03f9, B:307:0x0401, B:309:0x0415, B:312:0x0418, B:314:0x041e, B:315:0x0421, B:316:0x042d, B:318:0x0437, B:320:0x043d, B:321:0x0440, B:322:0x0443, B:324:0x044d, B:326:0x0453, B:327:0x0456, B:329:0x045b, B:331:0x0465, B:333:0x046b, B:334:0x046e, B:335:0x0471, B:337:0x047b, B:339:0x0481, B:340:0x0484, B:341:0x0487, B:345:0x0498, B:346:0x03ce, B:348:0x03da, B:351:0x03e1, B:373:0x04b2), top: B:8:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0320 A[Catch: Exception -> 0x013c, TRY_ENTER, TryCatch #3 {Exception -> 0x013c, blocks: (B:58:0x04db, B:60:0x04e1, B:143:0x012c, B:145:0x0137, B:146:0x0142, B:148:0x0148, B:149:0x014c, B:151:0x0152, B:154:0x015a, B:156:0x0160, B:157:0x0167, B:159:0x016d, B:160:0x0171, B:162:0x0177, B:163:0x017b, B:164:0x0186, B:166:0x018c, B:168:0x0196, B:170:0x01a4, B:171:0x01ab, B:173:0x01b1, B:175:0x01bb, B:177:0x01cb, B:178:0x01d4, B:180:0x01da, B:182:0x01e4, B:184:0x01f4, B:185:0x01fd, B:187:0x0203, B:189:0x0209, B:191:0x0213, B:193:0x0219, B:194:0x021c, B:196:0x0224, B:198:0x022a, B:200:0x0234, B:202:0x0242, B:203:0x0249, B:205:0x024f, B:207:0x0259, B:209:0x0269, B:210:0x0272, B:212:0x0278, B:214:0x0282, B:216:0x0292, B:217:0x029b, B:219:0x02a1, B:221:0x02a7, B:223:0x02b1, B:225:0x02b7, B:226:0x02ba, B:227:0x02c0, B:230:0x02c7, B:232:0x02cc, B:234:0x02dc, B:244:0x02df, B:246:0x02e5, B:248:0x02eb, B:249:0x02ee, B:251:0x02f3, B:253:0x02f9, B:254:0x02fc, B:256:0x0302, B:258:0x030c, B:259:0x0312, B:262:0x0320, B:264:0x0326, B:265:0x0329, B:267:0x032f, B:269:0x0339, B:271:0x033f, B:272:0x0342, B:273:0x0345, B:275:0x034f, B:277:0x0355, B:278:0x0358, B:279:0x035b, B:281:0x0365, B:283:0x036b, B:284:0x036e, B:285:0x0371, B:287:0x037f, B:289:0x0385, B:290:0x0388, B:294:0x03a3, B:297:0x03b6, B:299:0x03bc, B:301:0x03c5, B:303:0x03ee, B:305:0x03f9, B:307:0x0401, B:309:0x0415, B:312:0x0418, B:314:0x041e, B:315:0x0421, B:316:0x042d, B:318:0x0437, B:320:0x043d, B:321:0x0440, B:322:0x0443, B:324:0x044d, B:326:0x0453, B:327:0x0456, B:329:0x045b, B:331:0x0465, B:333:0x046b, B:334:0x046e, B:335:0x0471, B:337:0x047b, B:339:0x0481, B:340:0x0484, B:341:0x0487, B:345:0x0498, B:346:0x03ce, B:348:0x03da, B:351:0x03e1, B:373:0x04b2), top: B:8:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x032f A[Catch: Exception -> 0x013c, TryCatch #3 {Exception -> 0x013c, blocks: (B:58:0x04db, B:60:0x04e1, B:143:0x012c, B:145:0x0137, B:146:0x0142, B:148:0x0148, B:149:0x014c, B:151:0x0152, B:154:0x015a, B:156:0x0160, B:157:0x0167, B:159:0x016d, B:160:0x0171, B:162:0x0177, B:163:0x017b, B:164:0x0186, B:166:0x018c, B:168:0x0196, B:170:0x01a4, B:171:0x01ab, B:173:0x01b1, B:175:0x01bb, B:177:0x01cb, B:178:0x01d4, B:180:0x01da, B:182:0x01e4, B:184:0x01f4, B:185:0x01fd, B:187:0x0203, B:189:0x0209, B:191:0x0213, B:193:0x0219, B:194:0x021c, B:196:0x0224, B:198:0x022a, B:200:0x0234, B:202:0x0242, B:203:0x0249, B:205:0x024f, B:207:0x0259, B:209:0x0269, B:210:0x0272, B:212:0x0278, B:214:0x0282, B:216:0x0292, B:217:0x029b, B:219:0x02a1, B:221:0x02a7, B:223:0x02b1, B:225:0x02b7, B:226:0x02ba, B:227:0x02c0, B:230:0x02c7, B:232:0x02cc, B:234:0x02dc, B:244:0x02df, B:246:0x02e5, B:248:0x02eb, B:249:0x02ee, B:251:0x02f3, B:253:0x02f9, B:254:0x02fc, B:256:0x0302, B:258:0x030c, B:259:0x0312, B:262:0x0320, B:264:0x0326, B:265:0x0329, B:267:0x032f, B:269:0x0339, B:271:0x033f, B:272:0x0342, B:273:0x0345, B:275:0x034f, B:277:0x0355, B:278:0x0358, B:279:0x035b, B:281:0x0365, B:283:0x036b, B:284:0x036e, B:285:0x0371, B:287:0x037f, B:289:0x0385, B:290:0x0388, B:294:0x03a3, B:297:0x03b6, B:299:0x03bc, B:301:0x03c5, B:303:0x03ee, B:305:0x03f9, B:307:0x0401, B:309:0x0415, B:312:0x0418, B:314:0x041e, B:315:0x0421, B:316:0x042d, B:318:0x0437, B:320:0x043d, B:321:0x0440, B:322:0x0443, B:324:0x044d, B:326:0x0453, B:327:0x0456, B:329:0x045b, B:331:0x0465, B:333:0x046b, B:334:0x046e, B:335:0x0471, B:337:0x047b, B:339:0x0481, B:340:0x0484, B:341:0x0487, B:345:0x0498, B:346:0x03ce, B:348:0x03da, B:351:0x03e1, B:373:0x04b2), top: B:8:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0365 A[Catch: Exception -> 0x013c, TryCatch #3 {Exception -> 0x013c, blocks: (B:58:0x04db, B:60:0x04e1, B:143:0x012c, B:145:0x0137, B:146:0x0142, B:148:0x0148, B:149:0x014c, B:151:0x0152, B:154:0x015a, B:156:0x0160, B:157:0x0167, B:159:0x016d, B:160:0x0171, B:162:0x0177, B:163:0x017b, B:164:0x0186, B:166:0x018c, B:168:0x0196, B:170:0x01a4, B:171:0x01ab, B:173:0x01b1, B:175:0x01bb, B:177:0x01cb, B:178:0x01d4, B:180:0x01da, B:182:0x01e4, B:184:0x01f4, B:185:0x01fd, B:187:0x0203, B:189:0x0209, B:191:0x0213, B:193:0x0219, B:194:0x021c, B:196:0x0224, B:198:0x022a, B:200:0x0234, B:202:0x0242, B:203:0x0249, B:205:0x024f, B:207:0x0259, B:209:0x0269, B:210:0x0272, B:212:0x0278, B:214:0x0282, B:216:0x0292, B:217:0x029b, B:219:0x02a1, B:221:0x02a7, B:223:0x02b1, B:225:0x02b7, B:226:0x02ba, B:227:0x02c0, B:230:0x02c7, B:232:0x02cc, B:234:0x02dc, B:244:0x02df, B:246:0x02e5, B:248:0x02eb, B:249:0x02ee, B:251:0x02f3, B:253:0x02f9, B:254:0x02fc, B:256:0x0302, B:258:0x030c, B:259:0x0312, B:262:0x0320, B:264:0x0326, B:265:0x0329, B:267:0x032f, B:269:0x0339, B:271:0x033f, B:272:0x0342, B:273:0x0345, B:275:0x034f, B:277:0x0355, B:278:0x0358, B:279:0x035b, B:281:0x0365, B:283:0x036b, B:284:0x036e, B:285:0x0371, B:287:0x037f, B:289:0x0385, B:290:0x0388, B:294:0x03a3, B:297:0x03b6, B:299:0x03bc, B:301:0x03c5, B:303:0x03ee, B:305:0x03f9, B:307:0x0401, B:309:0x0415, B:312:0x0418, B:314:0x041e, B:315:0x0421, B:316:0x042d, B:318:0x0437, B:320:0x043d, B:321:0x0440, B:322:0x0443, B:324:0x044d, B:326:0x0453, B:327:0x0456, B:329:0x045b, B:331:0x0465, B:333:0x046b, B:334:0x046e, B:335:0x0471, B:337:0x047b, B:339:0x0481, B:340:0x0484, B:341:0x0487, B:345:0x0498, B:346:0x03ce, B:348:0x03da, B:351:0x03e1, B:373:0x04b2), top: B:8:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x037f A[Catch: Exception -> 0x013c, TryCatch #3 {Exception -> 0x013c, blocks: (B:58:0x04db, B:60:0x04e1, B:143:0x012c, B:145:0x0137, B:146:0x0142, B:148:0x0148, B:149:0x014c, B:151:0x0152, B:154:0x015a, B:156:0x0160, B:157:0x0167, B:159:0x016d, B:160:0x0171, B:162:0x0177, B:163:0x017b, B:164:0x0186, B:166:0x018c, B:168:0x0196, B:170:0x01a4, B:171:0x01ab, B:173:0x01b1, B:175:0x01bb, B:177:0x01cb, B:178:0x01d4, B:180:0x01da, B:182:0x01e4, B:184:0x01f4, B:185:0x01fd, B:187:0x0203, B:189:0x0209, B:191:0x0213, B:193:0x0219, B:194:0x021c, B:196:0x0224, B:198:0x022a, B:200:0x0234, B:202:0x0242, B:203:0x0249, B:205:0x024f, B:207:0x0259, B:209:0x0269, B:210:0x0272, B:212:0x0278, B:214:0x0282, B:216:0x0292, B:217:0x029b, B:219:0x02a1, B:221:0x02a7, B:223:0x02b1, B:225:0x02b7, B:226:0x02ba, B:227:0x02c0, B:230:0x02c7, B:232:0x02cc, B:234:0x02dc, B:244:0x02df, B:246:0x02e5, B:248:0x02eb, B:249:0x02ee, B:251:0x02f3, B:253:0x02f9, B:254:0x02fc, B:256:0x0302, B:258:0x030c, B:259:0x0312, B:262:0x0320, B:264:0x0326, B:265:0x0329, B:267:0x032f, B:269:0x0339, B:271:0x033f, B:272:0x0342, B:273:0x0345, B:275:0x034f, B:277:0x0355, B:278:0x0358, B:279:0x035b, B:281:0x0365, B:283:0x036b, B:284:0x036e, B:285:0x0371, B:287:0x037f, B:289:0x0385, B:290:0x0388, B:294:0x03a3, B:297:0x03b6, B:299:0x03bc, B:301:0x03c5, B:303:0x03ee, B:305:0x03f9, B:307:0x0401, B:309:0x0415, B:312:0x0418, B:314:0x041e, B:315:0x0421, B:316:0x042d, B:318:0x0437, B:320:0x043d, B:321:0x0440, B:322:0x0443, B:324:0x044d, B:326:0x0453, B:327:0x0456, B:329:0x045b, B:331:0x0465, B:333:0x046b, B:334:0x046e, B:335:0x0471, B:337:0x047b, B:339:0x0481, B:340:0x0484, B:341:0x0487, B:345:0x0498, B:346:0x03ce, B:348:0x03da, B:351:0x03e1, B:373:0x04b2), top: B:8:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03f9 A[Catch: Exception -> 0x013c, TryCatch #3 {Exception -> 0x013c, blocks: (B:58:0x04db, B:60:0x04e1, B:143:0x012c, B:145:0x0137, B:146:0x0142, B:148:0x0148, B:149:0x014c, B:151:0x0152, B:154:0x015a, B:156:0x0160, B:157:0x0167, B:159:0x016d, B:160:0x0171, B:162:0x0177, B:163:0x017b, B:164:0x0186, B:166:0x018c, B:168:0x0196, B:170:0x01a4, B:171:0x01ab, B:173:0x01b1, B:175:0x01bb, B:177:0x01cb, B:178:0x01d4, B:180:0x01da, B:182:0x01e4, B:184:0x01f4, B:185:0x01fd, B:187:0x0203, B:189:0x0209, B:191:0x0213, B:193:0x0219, B:194:0x021c, B:196:0x0224, B:198:0x022a, B:200:0x0234, B:202:0x0242, B:203:0x0249, B:205:0x024f, B:207:0x0259, B:209:0x0269, B:210:0x0272, B:212:0x0278, B:214:0x0282, B:216:0x0292, B:217:0x029b, B:219:0x02a1, B:221:0x02a7, B:223:0x02b1, B:225:0x02b7, B:226:0x02ba, B:227:0x02c0, B:230:0x02c7, B:232:0x02cc, B:234:0x02dc, B:244:0x02df, B:246:0x02e5, B:248:0x02eb, B:249:0x02ee, B:251:0x02f3, B:253:0x02f9, B:254:0x02fc, B:256:0x0302, B:258:0x030c, B:259:0x0312, B:262:0x0320, B:264:0x0326, B:265:0x0329, B:267:0x032f, B:269:0x0339, B:271:0x033f, B:272:0x0342, B:273:0x0345, B:275:0x034f, B:277:0x0355, B:278:0x0358, B:279:0x035b, B:281:0x0365, B:283:0x036b, B:284:0x036e, B:285:0x0371, B:287:0x037f, B:289:0x0385, B:290:0x0388, B:294:0x03a3, B:297:0x03b6, B:299:0x03bc, B:301:0x03c5, B:303:0x03ee, B:305:0x03f9, B:307:0x0401, B:309:0x0415, B:312:0x0418, B:314:0x041e, B:315:0x0421, B:316:0x042d, B:318:0x0437, B:320:0x043d, B:321:0x0440, B:322:0x0443, B:324:0x044d, B:326:0x0453, B:327:0x0456, B:329:0x045b, B:331:0x0465, B:333:0x046b, B:334:0x046e, B:335:0x0471, B:337:0x047b, B:339:0x0481, B:340:0x0484, B:341:0x0487, B:345:0x0498, B:346:0x03ce, B:348:0x03da, B:351:0x03e1, B:373:0x04b2), top: B:8:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x041e A[Catch: Exception -> 0x013c, TryCatch #3 {Exception -> 0x013c, blocks: (B:58:0x04db, B:60:0x04e1, B:143:0x012c, B:145:0x0137, B:146:0x0142, B:148:0x0148, B:149:0x014c, B:151:0x0152, B:154:0x015a, B:156:0x0160, B:157:0x0167, B:159:0x016d, B:160:0x0171, B:162:0x0177, B:163:0x017b, B:164:0x0186, B:166:0x018c, B:168:0x0196, B:170:0x01a4, B:171:0x01ab, B:173:0x01b1, B:175:0x01bb, B:177:0x01cb, B:178:0x01d4, B:180:0x01da, B:182:0x01e4, B:184:0x01f4, B:185:0x01fd, B:187:0x0203, B:189:0x0209, B:191:0x0213, B:193:0x0219, B:194:0x021c, B:196:0x0224, B:198:0x022a, B:200:0x0234, B:202:0x0242, B:203:0x0249, B:205:0x024f, B:207:0x0259, B:209:0x0269, B:210:0x0272, B:212:0x0278, B:214:0x0282, B:216:0x0292, B:217:0x029b, B:219:0x02a1, B:221:0x02a7, B:223:0x02b1, B:225:0x02b7, B:226:0x02ba, B:227:0x02c0, B:230:0x02c7, B:232:0x02cc, B:234:0x02dc, B:244:0x02df, B:246:0x02e5, B:248:0x02eb, B:249:0x02ee, B:251:0x02f3, B:253:0x02f9, B:254:0x02fc, B:256:0x0302, B:258:0x030c, B:259:0x0312, B:262:0x0320, B:264:0x0326, B:265:0x0329, B:267:0x032f, B:269:0x0339, B:271:0x033f, B:272:0x0342, B:273:0x0345, B:275:0x034f, B:277:0x0355, B:278:0x0358, B:279:0x035b, B:281:0x0365, B:283:0x036b, B:284:0x036e, B:285:0x0371, B:287:0x037f, B:289:0x0385, B:290:0x0388, B:294:0x03a3, B:297:0x03b6, B:299:0x03bc, B:301:0x03c5, B:303:0x03ee, B:305:0x03f9, B:307:0x0401, B:309:0x0415, B:312:0x0418, B:314:0x041e, B:315:0x0421, B:316:0x042d, B:318:0x0437, B:320:0x043d, B:321:0x0440, B:322:0x0443, B:324:0x044d, B:326:0x0453, B:327:0x0456, B:329:0x045b, B:331:0x0465, B:333:0x046b, B:334:0x046e, B:335:0x0471, B:337:0x047b, B:339:0x0481, B:340:0x0484, B:341:0x0487, B:345:0x0498, B:346:0x03ce, B:348:0x03da, B:351:0x03e1, B:373:0x04b2), top: B:8:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0437 A[Catch: Exception -> 0x013c, TryCatch #3 {Exception -> 0x013c, blocks: (B:58:0x04db, B:60:0x04e1, B:143:0x012c, B:145:0x0137, B:146:0x0142, B:148:0x0148, B:149:0x014c, B:151:0x0152, B:154:0x015a, B:156:0x0160, B:157:0x0167, B:159:0x016d, B:160:0x0171, B:162:0x0177, B:163:0x017b, B:164:0x0186, B:166:0x018c, B:168:0x0196, B:170:0x01a4, B:171:0x01ab, B:173:0x01b1, B:175:0x01bb, B:177:0x01cb, B:178:0x01d4, B:180:0x01da, B:182:0x01e4, B:184:0x01f4, B:185:0x01fd, B:187:0x0203, B:189:0x0209, B:191:0x0213, B:193:0x0219, B:194:0x021c, B:196:0x0224, B:198:0x022a, B:200:0x0234, B:202:0x0242, B:203:0x0249, B:205:0x024f, B:207:0x0259, B:209:0x0269, B:210:0x0272, B:212:0x0278, B:214:0x0282, B:216:0x0292, B:217:0x029b, B:219:0x02a1, B:221:0x02a7, B:223:0x02b1, B:225:0x02b7, B:226:0x02ba, B:227:0x02c0, B:230:0x02c7, B:232:0x02cc, B:234:0x02dc, B:244:0x02df, B:246:0x02e5, B:248:0x02eb, B:249:0x02ee, B:251:0x02f3, B:253:0x02f9, B:254:0x02fc, B:256:0x0302, B:258:0x030c, B:259:0x0312, B:262:0x0320, B:264:0x0326, B:265:0x0329, B:267:0x032f, B:269:0x0339, B:271:0x033f, B:272:0x0342, B:273:0x0345, B:275:0x034f, B:277:0x0355, B:278:0x0358, B:279:0x035b, B:281:0x0365, B:283:0x036b, B:284:0x036e, B:285:0x0371, B:287:0x037f, B:289:0x0385, B:290:0x0388, B:294:0x03a3, B:297:0x03b6, B:299:0x03bc, B:301:0x03c5, B:303:0x03ee, B:305:0x03f9, B:307:0x0401, B:309:0x0415, B:312:0x0418, B:314:0x041e, B:315:0x0421, B:316:0x042d, B:318:0x0437, B:320:0x043d, B:321:0x0440, B:322:0x0443, B:324:0x044d, B:326:0x0453, B:327:0x0456, B:329:0x045b, B:331:0x0465, B:333:0x046b, B:334:0x046e, B:335:0x0471, B:337:0x047b, B:339:0x0481, B:340:0x0484, B:341:0x0487, B:345:0x0498, B:346:0x03ce, B:348:0x03da, B:351:0x03e1, B:373:0x04b2), top: B:8:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x044d A[Catch: Exception -> 0x013c, TryCatch #3 {Exception -> 0x013c, blocks: (B:58:0x04db, B:60:0x04e1, B:143:0x012c, B:145:0x0137, B:146:0x0142, B:148:0x0148, B:149:0x014c, B:151:0x0152, B:154:0x015a, B:156:0x0160, B:157:0x0167, B:159:0x016d, B:160:0x0171, B:162:0x0177, B:163:0x017b, B:164:0x0186, B:166:0x018c, B:168:0x0196, B:170:0x01a4, B:171:0x01ab, B:173:0x01b1, B:175:0x01bb, B:177:0x01cb, B:178:0x01d4, B:180:0x01da, B:182:0x01e4, B:184:0x01f4, B:185:0x01fd, B:187:0x0203, B:189:0x0209, B:191:0x0213, B:193:0x0219, B:194:0x021c, B:196:0x0224, B:198:0x022a, B:200:0x0234, B:202:0x0242, B:203:0x0249, B:205:0x024f, B:207:0x0259, B:209:0x0269, B:210:0x0272, B:212:0x0278, B:214:0x0282, B:216:0x0292, B:217:0x029b, B:219:0x02a1, B:221:0x02a7, B:223:0x02b1, B:225:0x02b7, B:226:0x02ba, B:227:0x02c0, B:230:0x02c7, B:232:0x02cc, B:234:0x02dc, B:244:0x02df, B:246:0x02e5, B:248:0x02eb, B:249:0x02ee, B:251:0x02f3, B:253:0x02f9, B:254:0x02fc, B:256:0x0302, B:258:0x030c, B:259:0x0312, B:262:0x0320, B:264:0x0326, B:265:0x0329, B:267:0x032f, B:269:0x0339, B:271:0x033f, B:272:0x0342, B:273:0x0345, B:275:0x034f, B:277:0x0355, B:278:0x0358, B:279:0x035b, B:281:0x0365, B:283:0x036b, B:284:0x036e, B:285:0x0371, B:287:0x037f, B:289:0x0385, B:290:0x0388, B:294:0x03a3, B:297:0x03b6, B:299:0x03bc, B:301:0x03c5, B:303:0x03ee, B:305:0x03f9, B:307:0x0401, B:309:0x0415, B:312:0x0418, B:314:0x041e, B:315:0x0421, B:316:0x042d, B:318:0x0437, B:320:0x043d, B:321:0x0440, B:322:0x0443, B:324:0x044d, B:326:0x0453, B:327:0x0456, B:329:0x045b, B:331:0x0465, B:333:0x046b, B:334:0x046e, B:335:0x0471, B:337:0x047b, B:339:0x0481, B:340:0x0484, B:341:0x0487, B:345:0x0498, B:346:0x03ce, B:348:0x03da, B:351:0x03e1, B:373:0x04b2), top: B:8:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x045b A[Catch: Exception -> 0x013c, TryCatch #3 {Exception -> 0x013c, blocks: (B:58:0x04db, B:60:0x04e1, B:143:0x012c, B:145:0x0137, B:146:0x0142, B:148:0x0148, B:149:0x014c, B:151:0x0152, B:154:0x015a, B:156:0x0160, B:157:0x0167, B:159:0x016d, B:160:0x0171, B:162:0x0177, B:163:0x017b, B:164:0x0186, B:166:0x018c, B:168:0x0196, B:170:0x01a4, B:171:0x01ab, B:173:0x01b1, B:175:0x01bb, B:177:0x01cb, B:178:0x01d4, B:180:0x01da, B:182:0x01e4, B:184:0x01f4, B:185:0x01fd, B:187:0x0203, B:189:0x0209, B:191:0x0213, B:193:0x0219, B:194:0x021c, B:196:0x0224, B:198:0x022a, B:200:0x0234, B:202:0x0242, B:203:0x0249, B:205:0x024f, B:207:0x0259, B:209:0x0269, B:210:0x0272, B:212:0x0278, B:214:0x0282, B:216:0x0292, B:217:0x029b, B:219:0x02a1, B:221:0x02a7, B:223:0x02b1, B:225:0x02b7, B:226:0x02ba, B:227:0x02c0, B:230:0x02c7, B:232:0x02cc, B:234:0x02dc, B:244:0x02df, B:246:0x02e5, B:248:0x02eb, B:249:0x02ee, B:251:0x02f3, B:253:0x02f9, B:254:0x02fc, B:256:0x0302, B:258:0x030c, B:259:0x0312, B:262:0x0320, B:264:0x0326, B:265:0x0329, B:267:0x032f, B:269:0x0339, B:271:0x033f, B:272:0x0342, B:273:0x0345, B:275:0x034f, B:277:0x0355, B:278:0x0358, B:279:0x035b, B:281:0x0365, B:283:0x036b, B:284:0x036e, B:285:0x0371, B:287:0x037f, B:289:0x0385, B:290:0x0388, B:294:0x03a3, B:297:0x03b6, B:299:0x03bc, B:301:0x03c5, B:303:0x03ee, B:305:0x03f9, B:307:0x0401, B:309:0x0415, B:312:0x0418, B:314:0x041e, B:315:0x0421, B:316:0x042d, B:318:0x0437, B:320:0x043d, B:321:0x0440, B:322:0x0443, B:324:0x044d, B:326:0x0453, B:327:0x0456, B:329:0x045b, B:331:0x0465, B:333:0x046b, B:334:0x046e, B:335:0x0471, B:337:0x047b, B:339:0x0481, B:340:0x0484, B:341:0x0487, B:345:0x0498, B:346:0x03ce, B:348:0x03da, B:351:0x03e1, B:373:0x04b2), top: B:8:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0498 A[Catch: Exception -> 0x013c, TryCatch #3 {Exception -> 0x013c, blocks: (B:58:0x04db, B:60:0x04e1, B:143:0x012c, B:145:0x0137, B:146:0x0142, B:148:0x0148, B:149:0x014c, B:151:0x0152, B:154:0x015a, B:156:0x0160, B:157:0x0167, B:159:0x016d, B:160:0x0171, B:162:0x0177, B:163:0x017b, B:164:0x0186, B:166:0x018c, B:168:0x0196, B:170:0x01a4, B:171:0x01ab, B:173:0x01b1, B:175:0x01bb, B:177:0x01cb, B:178:0x01d4, B:180:0x01da, B:182:0x01e4, B:184:0x01f4, B:185:0x01fd, B:187:0x0203, B:189:0x0209, B:191:0x0213, B:193:0x0219, B:194:0x021c, B:196:0x0224, B:198:0x022a, B:200:0x0234, B:202:0x0242, B:203:0x0249, B:205:0x024f, B:207:0x0259, B:209:0x0269, B:210:0x0272, B:212:0x0278, B:214:0x0282, B:216:0x0292, B:217:0x029b, B:219:0x02a1, B:221:0x02a7, B:223:0x02b1, B:225:0x02b7, B:226:0x02ba, B:227:0x02c0, B:230:0x02c7, B:232:0x02cc, B:234:0x02dc, B:244:0x02df, B:246:0x02e5, B:248:0x02eb, B:249:0x02ee, B:251:0x02f3, B:253:0x02f9, B:254:0x02fc, B:256:0x0302, B:258:0x030c, B:259:0x0312, B:262:0x0320, B:264:0x0326, B:265:0x0329, B:267:0x032f, B:269:0x0339, B:271:0x033f, B:272:0x0342, B:273:0x0345, B:275:0x034f, B:277:0x0355, B:278:0x0358, B:279:0x035b, B:281:0x0365, B:283:0x036b, B:284:0x036e, B:285:0x0371, B:287:0x037f, B:289:0x0385, B:290:0x0388, B:294:0x03a3, B:297:0x03b6, B:299:0x03bc, B:301:0x03c5, B:303:0x03ee, B:305:0x03f9, B:307:0x0401, B:309:0x0415, B:312:0x0418, B:314:0x041e, B:315:0x0421, B:316:0x042d, B:318:0x0437, B:320:0x043d, B:321:0x0440, B:322:0x0443, B:324:0x044d, B:326:0x0453, B:327:0x0456, B:329:0x045b, B:331:0x0465, B:333:0x046b, B:334:0x046e, B:335:0x0471, B:337:0x047b, B:339:0x0481, B:340:0x0484, B:341:0x0487, B:345:0x0498, B:346:0x03ce, B:348:0x03da, B:351:0x03e1, B:373:0x04b2), top: B:8:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0301  */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.location.Geocoder] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v15, types: [double] */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$fetchLocationAddress$29(Locale locale, Location location, int i9, Locale locale2, LocationFetchCallback locationFetchCallback) {
        ?? r16;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue3;
        String str;
        String str2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue4;
        List<Address> list;
        String format;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z10;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue5;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue6;
        boolean z11;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        boolean z12;
        String subThoroughfare;
        boolean z13;
        String thoroughfare;
        String locality;
        String countryName;
        StringBuilder sb2;
        boolean z14;
        StringBuilder sb3;
        String str14;
        String countryName2;
        String locality2;
        boolean z15;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        StringBuilder sb4 = new StringBuilder();
        TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
        TL_stories.TL_geoPointAddress tL_geoPointAddress2 = new TL_stories.TL_geoPointAddress();
        try {
            List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, locale).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (i9 != 2) {
                list = null;
            } else if (locale2 == locale) {
                list = fromLocation;
            } else {
                try {
                    ?? geocoder = new Geocoder(ApplicationLoader.applicationContext, locale2);
                    double latitude = location.getLatitude();
                    r16 = location.getLongitude();
                    list = geocoder.getFromLocation(latitude, r16, 1);
                } catch (Exception unused) {
                    tL_messageMediaVenue = null;
                    tL_messageMediaVenue4 = null;
                    str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                    str = str2;
                    tL_messageMediaVenue3 = tL_messageMediaVenue;
                    tL_messageMediaVenue2 = tL_messageMediaVenue4;
                    AndroidUtilities.runOnUIThread(new b0(locationFetchCallback, str2, str, tL_messageMediaVenue3, tL_messageMediaVenue2, location, 1));
                }
            }
            try {
                if (fromLocation.size() > 0) {
                    Address address = fromLocation.get(0);
                    Address address2 = (list == null || list.size() < 1) ? null : list.get(0);
                    if (i9 == 1) {
                        ArrayList arrayList = new ArrayList();
                        try {
                            str19 = address.getAddressLine(0);
                        } catch (Exception unused2) {
                            str19 = null;
                        }
                        if (TextUtils.isEmpty(str19)) {
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
                            arrayList.add(str19);
                        }
                        int i10 = 0;
                        while (i10 < arrayList.size()) {
                            if (arrayList.get(i10) != null) {
                                String[] split = ((String) arrayList.get(i10)).split(", ");
                                if (split.length > 1) {
                                    arrayList.remove(i10);
                                    for (String str20 : split) {
                                        arrayList.add(i10, str20);
                                        i10++;
                                    }
                                }
                            }
                            i10++;
                        }
                        int i11 = 0;
                        while (i11 < arrayList.size()) {
                            if (TextUtils.isEmpty((CharSequence) arrayList.get(i11)) || arrayList.indexOf(arrayList.get(i11)) != i11 || ((String) arrayList.get(i11)).matches("^\\s*\\d{4,}\\s*$")) {
                                arrayList.remove(i11);
                                i11--;
                            }
                            i11++;
                        }
                        format = arrayList.isEmpty() ? null : TextUtils.join(", ", arrayList);
                        str3 = format;
                        str4 = null;
                        str5 = null;
                        str6 = null;
                        z15 = true;
                        str8 = null;
                        z11 = false;
                        str9 = null;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        StringBuilder sb6 = new StringBuilder();
                        StringBuilder sb7 = new StringBuilder();
                        z11 = false;
                        StringBuilder sb8 = new StringBuilder();
                        String locality3 = TextUtils.isEmpty(null) ? address.getLocality() : null;
                        if (TextUtils.isEmpty(locality3)) {
                            locality3 = address.getAdminArea();
                        }
                        if (TextUtils.isEmpty(locality3)) {
                            locality3 = address.getSubAdminArea();
                        }
                        String str21 = locality3;
                        if (address2 != null) {
                            str9 = TextUtils.isEmpty(null) ? address2.getLocality() : null;
                            if (TextUtils.isEmpty(str9)) {
                                str9 = address2.getAdminArea();
                            }
                            if (TextUtils.isEmpty(str9)) {
                                str9 = address2.getSubAdminArea();
                            }
                            str8 = address2.getAdminArea();
                        } else {
                            str8 = null;
                            str9 = null;
                        }
                        String thoroughfare2 = (!TextUtils.isEmpty(null) || TextUtils.equals(address.getThoroughfare(), str21) || TextUtils.equals(address.getThoroughfare(), address.getCountryName())) ? null : address.getThoroughfare();
                        if (!TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(address.getSubLocality(), str21)) {
                            str10 = thoroughfare2;
                        } else {
                            str10 = thoroughfare2;
                            if (!TextUtils.equals(address.getSubLocality(), address.getCountryName())) {
                                str11 = address.getSubLocality();
                                if (TextUtils.isEmpty(str11) || TextUtils.equals(address.getLocality(), str21)) {
                                    str12 = str11;
                                } else {
                                    str12 = str11;
                                    if (!TextUtils.equals(address.getLocality(), address.getCountryName())) {
                                        str13 = address.getLocality();
                                        if (!TextUtils.isEmpty(str13) || TextUtils.equals(str13, str21) || TextUtils.equals(str13, address.getCountryName())) {
                                            sb8 = null;
                                        } else {
                                            if (sb8.length() > 0) {
                                                sb8.append(", ");
                                            }
                                            sb8.append(str13);
                                        }
                                        if (address2 != null) {
                                            String thoroughfare3 = (!TextUtils.isEmpty(null) || TextUtils.equals(address2.getThoroughfare(), str21) || TextUtils.equals(address2.getThoroughfare(), address2.getCountryName())) ? null : address2.getThoroughfare();
                                            if (!TextUtils.isEmpty(thoroughfare3) || TextUtils.equals(address2.getSubLocality(), str21)) {
                                                str15 = thoroughfare3;
                                            } else {
                                                str15 = thoroughfare3;
                                                if (!TextUtils.equals(address2.getSubLocality(), address2.getCountryName())) {
                                                    str16 = address2.getSubLocality();
                                                    if (TextUtils.isEmpty(str16) || TextUtils.equals(address2.getLocality(), str21)) {
                                                        str17 = str16;
                                                    } else {
                                                        str17 = str16;
                                                        if (!TextUtils.equals(address2.getLocality(), address2.getCountryName())) {
                                                            str18 = address2.getLocality();
                                                            if (!TextUtils.isEmpty(str18) || TextUtils.equals(str18, str8) || TextUtils.equals(str18, address2.getCountryName())) {
                                                                sb4 = null;
                                                            } else {
                                                                if (sb4.length() > 0) {
                                                                    sb4.append(", ");
                                                                }
                                                                sb4.append(str18);
                                                            }
                                                            if (!TextUtils.isEmpty(sb4)) {
                                                                int i12 = 0;
                                                                while (true) {
                                                                    String[] strArr = unnamedRoads;
                                                                    if (i12 >= strArr.length) {
                                                                        break;
                                                                    }
                                                                    if (strArr[i12].equalsIgnoreCase(sb4.toString())) {
                                                                        sb4 = null;
                                                                        sb8 = null;
                                                                        break;
                                                                    }
                                                                    i12++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    str18 = str17;
                                                    if (TextUtils.isEmpty(str18)) {
                                                    }
                                                    sb4 = null;
                                                    if (!TextUtils.isEmpty(sb4)) {
                                                    }
                                                }
                                            }
                                            str16 = str15;
                                            if (TextUtils.isEmpty(str16)) {
                                            }
                                            str17 = str16;
                                            str18 = str17;
                                            if (TextUtils.isEmpty(str18)) {
                                            }
                                            sb4 = null;
                                            if (!TextUtils.isEmpty(sb4)) {
                                            }
                                        }
                                        if (TextUtils.isEmpty(str21)) {
                                            z12 = true;
                                        } else {
                                            if (sb7.length() > 0) {
                                                sb7.append(", ");
                                            }
                                            sb7.append(str21);
                                            if (sb8 != null) {
                                                if (sb8.length() > 0) {
                                                    sb8.append(", ");
                                                }
                                                sb8.append(str21);
                                            }
                                            z12 = false;
                                        }
                                        subThoroughfare = address.getSubThoroughfare();
                                        if (TextUtils.isEmpty(subThoroughfare)) {
                                            z13 = false;
                                        } else {
                                            sb5.append(subThoroughfare);
                                            z13 = true;
                                        }
                                        thoroughfare = address.getThoroughfare();
                                        boolean z16 = z12;
                                        if (!TextUtils.isEmpty(thoroughfare)) {
                                            if (sb5.length() > 0) {
                                                sb5.append(" ");
                                            }
                                            sb5.append(thoroughfare);
                                            z13 = true;
                                        }
                                        if (!z13) {
                                            String adminArea = address.getAdminArea();
                                            if (!TextUtils.isEmpty(adminArea)) {
                                                if (sb5.length() > 0) {
                                                    sb5.append(", ");
                                                }
                                                sb5.append(adminArea);
                                            }
                                            String subAdminArea = address.getSubAdminArea();
                                            if (!TextUtils.isEmpty(subAdminArea)) {
                                                if (sb5.length() > 0) {
                                                    sb5.append(", ");
                                                }
                                                sb5.append(subAdminArea);
                                            }
                                        }
                                        locality = address.getLocality();
                                        if (!TextUtils.isEmpty(locality)) {
                                            if (sb5.length() > 0) {
                                                sb5.append(", ");
                                            }
                                            sb5.append(locality);
                                        }
                                        String countryCode = address.getCountryCode();
                                        countryName = address.getCountryName();
                                        if (TextUtils.isEmpty(countryName)) {
                                            sb2 = sb5;
                                            z14 = z13;
                                            sb3 = sb4;
                                            str14 = countryCode;
                                        } else {
                                            if (sb5.length() > 0) {
                                                sb5.append(", ");
                                            }
                                            sb5.append(countryName);
                                            sb2 = sb5;
                                            String language = locale.getLanguage();
                                            z14 = z13;
                                            if ("US".equals(address.getCountryCode())) {
                                                sb3 = sb4;
                                                str14 = countryCode;
                                            } else {
                                                sb3 = sb4;
                                                str14 = countryCode;
                                                if ("AE".equals(address.getCountryCode())) {
                                                }
                                                if ("GB".equals(address.getCountryCode()) && "en".equals(language)) {
                                                    String[] split2 = countryName.split(" ");
                                                    countryName = "";
                                                    for (String str22 : split2) {
                                                        if (str22.length() > 0) {
                                                            countryName = countryName + str22.charAt(0);
                                                        }
                                                    }
                                                    if (sb7.length() > 0) {
                                                    }
                                                    sb7.append(countryName);
                                                } else {
                                                    if ("US".equals(address.getCountryCode())) {
                                                        countryName = "USA";
                                                    }
                                                    if (sb7.length() > 0) {
                                                        sb7.append(", ");
                                                    }
                                                    sb7.append(countryName);
                                                }
                                            }
                                            if (!"en".equals(language)) {
                                                if (!"uk".equals(language)) {
                                                }
                                            }
                                            String[] split22 = countryName.split(" ");
                                            countryName = "";
                                            while (r1 < r2) {
                                            }
                                            if (sb7.length() > 0) {
                                            }
                                            sb7.append(countryName);
                                        }
                                        countryName2 = address.getCountryName();
                                        if (!TextUtils.isEmpty(countryName2)) {
                                            if (sb6.length() > 0) {
                                                sb6.append(", ");
                                            }
                                            sb6.append(countryName2);
                                        }
                                        locality2 = address.getLocality();
                                        if (!TextUtils.isEmpty(locality2)) {
                                            if (sb6.length() > 0) {
                                                sb6.append(", ");
                                            }
                                            sb6.append(locality2);
                                        }
                                        if (!z14) {
                                            String adminArea2 = address.getAdminArea();
                                            if (!TextUtils.isEmpty(adminArea2)) {
                                                if (sb6.length() > 0) {
                                                    sb6.append(", ");
                                                }
                                                sb6.append(adminArea2);
                                            }
                                            String subAdminArea2 = address.getSubAdminArea();
                                            if (!TextUtils.isEmpty(subAdminArea2)) {
                                                if (sb6.length() > 0) {
                                                    sb6.append(", ");
                                                }
                                                sb6.append(subAdminArea2);
                                            }
                                        }
                                        format = sb2.toString();
                                        str3 = sb6.toString();
                                        str4 = sb7.toString();
                                        str5 = sb8 == null ? null : sb8.toString();
                                        z15 = z16;
                                        sb4 = sb3;
                                        str6 = str14;
                                    }
                                }
                                str13 = str12;
                                if (TextUtils.isEmpty(str13)) {
                                }
                                sb8 = null;
                                if (address2 != null) {
                                }
                                if (TextUtils.isEmpty(str21)) {
                                }
                                subThoroughfare = address.getSubThoroughfare();
                                if (TextUtils.isEmpty(subThoroughfare)) {
                                }
                                thoroughfare = address.getThoroughfare();
                                boolean z162 = z12;
                                if (!TextUtils.isEmpty(thoroughfare)) {
                                }
                                if (!z13) {
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
                                if (!z14) {
                                }
                                format = sb2.toString();
                                str3 = sb6.toString();
                                str4 = sb7.toString();
                                if (sb8 == null) {
                                }
                                z15 = z162;
                                sb4 = sb3;
                                str6 = str14;
                            }
                        }
                        str11 = str10;
                        if (TextUtils.isEmpty(str11)) {
                        }
                        str12 = str11;
                        str13 = str12;
                        if (TextUtils.isEmpty(str13)) {
                        }
                        sb8 = null;
                        if (address2 != null) {
                        }
                        if (TextUtils.isEmpty(str21)) {
                        }
                        subThoroughfare = address.getSubThoroughfare();
                        if (TextUtils.isEmpty(subThoroughfare)) {
                        }
                        thoroughfare = address.getThoroughfare();
                        boolean z1622 = z12;
                        if (!TextUtils.isEmpty(thoroughfare)) {
                        }
                        if (!z13) {
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
                        if (!z14) {
                        }
                        format = sb2.toString();
                        str3 = sb6.toString();
                        str4 = sb7.toString();
                        if (sb8 == null) {
                        }
                        z15 = z1622;
                        sb4 = sb3;
                        str6 = str14;
                    }
                    z10 = z15;
                    str7 = str9;
                    r16 = z11;
                } else {
                    r16 = 0;
                    format = i9 == 1 ? null : String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                    str3 = format;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    str8 = null;
                    z10 = true;
                }
                if (TextUtils.isEmpty(str4)) {
                    tL_messageMediaVenue5 = r16;
                } else {
                    tL_messageMediaVenue5 = new TLRPC.TL_messageMediaVenue();
                    try {
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_messageMediaVenue5.geo = tL_geoPoint;
                        tL_geoPoint.lat = location.getLatitude();
                        tL_messageMediaVenue5.geo._long = location.getLongitude();
                        tL_messageMediaVenue5.query_id = -1L;
                        tL_messageMediaVenue5.title = str4;
                        tL_messageMediaVenue5.icon = z10 ? "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png" : "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                        tL_messageMediaVenue5.emoji = countryCodeToEmoji(str6);
                        tL_messageMediaVenue5.address = LocaleController.getString(z10 ? R.string.Country : R.string.PassportCity);
                        tL_messageMediaVenue5.geoAddress = tL_geoPointAddress;
                        tL_geoPointAddress.country_iso2 = str6;
                        if (!z10) {
                            if (!TextUtils.isEmpty(str8)) {
                                tL_geoPointAddress.flags |= 1;
                                tL_geoPointAddress.state = str8;
                            }
                            if (!TextUtils.isEmpty(str7)) {
                                tL_geoPointAddress.flags |= 2;
                                tL_geoPointAddress.city = str7;
                            }
                        }
                    } catch (Exception unused7) {
                        tL_messageMediaVenue = tL_messageMediaVenue5;
                        tL_messageMediaVenue4 = r16;
                        str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                        str = str2;
                        tL_messageMediaVenue3 = tL_messageMediaVenue;
                        tL_messageMediaVenue2 = tL_messageMediaVenue4;
                        AndroidUtilities.runOnUIThread(new b0(locationFetchCallback, str2, str, tL_messageMediaVenue3, tL_messageMediaVenue2, location, 1));
                    }
                }
                if (TextUtils.isEmpty(str5)) {
                    tL_messageMediaVenue6 = r16;
                } else {
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue7 = new TLRPC.TL_messageMediaVenue();
                    try {
                        TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                        tL_messageMediaVenue7.geo = tL_geoPoint2;
                        tL_geoPoint2.lat = location.getLatitude();
                        tL_messageMediaVenue7.geo._long = location.getLongitude();
                        tL_messageMediaVenue7.query_id = -1L;
                        tL_messageMediaVenue7.title = str5;
                        tL_messageMediaVenue7.icon = "pin";
                        tL_messageMediaVenue7.address = LocaleController.getString(R.string.PassportStreet1);
                        tL_messageMediaVenue7.geoAddress = tL_geoPointAddress2;
                        tL_geoPointAddress2.country_iso2 = str6;
                        if (!TextUtils.isEmpty(str8)) {
                            tL_geoPointAddress2.flags |= 1;
                            tL_geoPointAddress2.state = str8;
                        }
                        if (!TextUtils.isEmpty(str7)) {
                            tL_geoPointAddress2.flags |= 2;
                            tL_geoPointAddress2.city = str7;
                        }
                        if (!TextUtils.isEmpty(sb4)) {
                            tL_geoPointAddress2.flags |= 4;
                            tL_geoPointAddress2.street = sb4.toString();
                        }
                        tL_messageMediaVenue6 = tL_messageMediaVenue7;
                    } catch (Exception unused8) {
                        r16 = tL_messageMediaVenue7;
                        tL_messageMediaVenue = tL_messageMediaVenue5;
                        tL_messageMediaVenue4 = r16;
                        str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                        str = str2;
                        tL_messageMediaVenue3 = tL_messageMediaVenue;
                        tL_messageMediaVenue2 = tL_messageMediaVenue4;
                        AndroidUtilities.runOnUIThread(new b0(locationFetchCallback, str2, str, tL_messageMediaVenue3, tL_messageMediaVenue2, location, 1));
                    }
                }
                if (tL_messageMediaVenue5 == null && tL_messageMediaVenue6 == null) {
                    try {
                        String detectOcean = detectOcean(location.getLongitude(), location.getLatitude());
                        if (detectOcean != null) {
                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue8 = new TLRPC.TL_messageMediaVenue();
                            try {
                                TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                tL_messageMediaVenue8.geo = tL_geoPoint3;
                                tL_geoPoint3.lat = location.getLatitude();
                                tL_messageMediaVenue8.geo._long = location.getLongitude();
                                tL_messageMediaVenue8.query_id = -1L;
                                tL_messageMediaVenue8.title = detectOcean;
                                tL_messageMediaVenue8.icon = "pin";
                                tL_messageMediaVenue8.emoji = "🌊";
                                tL_messageMediaVenue8.address = "Ocean";
                                tL_messageMediaVenue5 = tL_messageMediaVenue8;
                            } catch (Exception unused9) {
                                tL_messageMediaVenue4 = tL_messageMediaVenue6;
                                tL_messageMediaVenue = tL_messageMediaVenue8;
                                str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                                str = str2;
                                tL_messageMediaVenue3 = tL_messageMediaVenue;
                                tL_messageMediaVenue2 = tL_messageMediaVenue4;
                                AndroidUtilities.runOnUIThread(new b0(locationFetchCallback, str2, str, tL_messageMediaVenue3, tL_messageMediaVenue2, location, 1));
                            }
                        }
                    } catch (Exception unused10) {
                        r16 = tL_messageMediaVenue6;
                        tL_messageMediaVenue = tL_messageMediaVenue5;
                        tL_messageMediaVenue4 = r16;
                        str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                        str = str2;
                        tL_messageMediaVenue3 = tL_messageMediaVenue;
                        tL_messageMediaVenue2 = tL_messageMediaVenue4;
                        AndroidUtilities.runOnUIThread(new b0(locationFetchCallback, str2, str, tL_messageMediaVenue3, tL_messageMediaVenue2, location, 1));
                    }
                }
                str2 = format;
                str = str3;
                tL_messageMediaVenue2 = tL_messageMediaVenue6;
                tL_messageMediaVenue3 = tL_messageMediaVenue5;
            } catch (Exception unused11) {
                tL_messageMediaVenue = r16;
                tL_messageMediaVenue4 = r16;
                str2 = String.format(Locale.US, "Unknown address (%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude()));
                str = str2;
                tL_messageMediaVenue3 = tL_messageMediaVenue;
                tL_messageMediaVenue2 = tL_messageMediaVenue4;
                AndroidUtilities.runOnUIThread(new b0(locationFetchCallback, str2, str, tL_messageMediaVenue3, tL_messageMediaVenue2, location, 1));
            }
        } catch (Exception unused12) {
            r16 = 0;
        }
        AndroidUtilities.runOnUIThread(new b0(locationFetchCallback, str2, str, tL_messageMediaVenue3, tL_messageMediaVenue2, location, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadLiveLocations$25(long j10, TLObject tLObject) {
        this.cacheRequests.e(j10);
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        int i9 = 0;
        while (i9 < messages_messages.messages.size()) {
            if (!(messages_messages.messages.get(i9).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                messages_messages.messages.remove(i9);
                i9--;
            }
            i9++;
        }
        getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
        getMessagesController().putUsers(messages_messages.users, false);
        getMessagesController().putChats(messages_messages.chats, false);
        this.locationsCache.k(messages_messages.messages, j10);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j10), Integer.valueOf(this.currentAccount));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadLiveLocations$26(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new a4(this, j10, tLObject, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadSharingLocations$14(ArrayList arrayList) {
        this.sharingLocationsUI.addAll(arrayList);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            SharingLocationInfo sharingLocationInfo = (SharingLocationInfo) arrayList.get(i9);
            this.sharingLocationsMapUI.k(sharingLocationInfo, sharingLocationInfo.did);
        }
        startService();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadSharingLocations$15(ArrayList arrayList) {
        this.sharingLocations.addAll(arrayList);
        for (int i9 = 0; i9 < this.sharingLocations.size(); i9++) {
            SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i9);
            this.sharingLocationsMap.k(sharingLocationInfo, sharingLocationInfo.did);
        }
        AndroidUtilities.runOnUIThread(new r5(this, arrayList, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadSharingLocations$16(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        Utilities.stageQueue.postRunnable(new r5(this, arrayList3, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadSharingLocations$17() {
        ArrayList arrayList = new ArrayList();
        ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList3 = new ArrayList<>();
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
                    MessageObject messageObject = new MessageObject(this.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new gk(this, arrayList2, arrayList3, arrayList, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$markLiveLoactionsAsRead$27(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_affectedMessages) {
            TLRPC.TL_messages_affectedMessages tL_messages_affectedMessages = (TLRPC.TL_messages_affectedMessages) tLObject;
            getMessagesController().processNewDifferenceParams(-1, tL_messages_affectedMessages.pts, -1, tL_messages_affectedMessages.pts_count);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        LocationController locationController = getAccountInstance().getLocationController();
        getNotificationCenter().addObserver(locationController, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(locationController, NotificationCenter.messagesDeleted);
        getNotificationCenter().addObserver(locationController, NotificationCenter.replaceMessagesObjects);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnected$1(Integer num) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowPlayServicesAlert, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnected$2(Integer num) {
        if (this.sharingLocations.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new o5(this, num, 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnected$4(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            startFusedLocationRequest(true);
        } else if (intValue == 1) {
            Utilities.stageQueue.postRunnable(new o5(this, num, 0));
        } else {
            if (intValue != 2) {
                return;
            }
            Utilities.stageQueue.postRunnable(new p5(this, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAllLocationSharings$22(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            return;
        }
        getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAllLocationSharings$23() {
        this.sharingLocationsUI.clear();
        this.sharingLocationsMapUI.b();
        stopService();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeAllLocationSharings$24() {
        for (int i9 = 0; i9 < this.sharingLocations.size(); i9++) {
            SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i9);
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
            tL_messages_editMessage.id = sharingLocationInfo.mid;
            tL_messages_editMessage.flags |= 16384;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = true;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
            getConnectionsManager().sendRequest(tL_messages_editMessage, new q5(this, 1));
        }
        this.sharingLocations.clear();
        this.sharingLocationsMap.b();
        saveSharingLocation(null, 2);
        stop(true);
        AndroidUtilities.runOnUIThread(new p5(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSharingLocation$19(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            return;
        }
        getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSharingLocation$20(SharingLocationInfo sharingLocationInfo) {
        this.sharingLocationsUI.remove(sharingLocationInfo);
        this.sharingLocationsMapUI.l(sharingLocationInfo.did);
        if (this.sharingLocationsUI.isEmpty()) {
            stopService();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSharingLocation$21(long j10) {
        SharingLocationInfo sharingLocationInfo = (SharingLocationInfo) this.sharingLocationsMap.f(j10);
        this.sharingLocationsMap.l(j10);
        if (sharingLocationInfo != null) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
            tL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
            tL_messages_editMessage.id = sharingLocationInfo.mid;
            tL_messages_editMessage.flags |= 16384;
            TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
            tL_messages_editMessage.media = tL_inputMediaGeoLive;
            tL_inputMediaGeoLive.stopped = true;
            tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
            getConnectionsManager().sendRequest(tL_messages_editMessage, new q5(this, 0));
            this.sharingLocations.remove(sharingLocationInfo);
            saveSharingLocation(sharingLocationInfo, 1);
            AndroidUtilities.runOnUIThread(new n5(1, sharingLocationInfo, this));
            if (this.sharingLocations.isEmpty()) {
                stop(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveSharingLocation$18(int i9, SharingLocationInfo sharingLocationInfo) {
        try {
            if (i9 == 2) {
                getMessagesStorage().getDatabase().executeFast("DELETE FROM sharing_locations WHERE 1").stepThis().dispose();
                return;
            }
            if (i9 == 1) {
                if (sharingLocationInfo == null) {
                    return;
                }
                getMessagesStorage().getDatabase().executeFast("DELETE FROM sharing_locations WHERE uid = " + sharingLocationInfo.did).stepThis().dispose();
                return;
            }
            if (sharingLocationInfo == null) {
                return;
            }
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
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setLastKnownLocation$10() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newLocationAvailable, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setProximityLocation$12(int i9, long j10) {
        try {
            SQLitePreparedStatement executeFast = getMessagesStorage().getDatabase().executeFast("UPDATE sharing_locations SET proximity = ? WHERE uid = ?");
            executeFast.requery();
            executeFast.bindInteger(1, i9);
            executeFast.bindLong(2, j10);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setProximityLocation$13() {
        broadcastLastKnownLocation(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startFusedLocationRequest$5(boolean z10) {
        if (!z10) {
            this.servicesAvailable = Boolean.FALSE;
        }
        if (this.sharingLocations.isEmpty()) {
            return;
        }
        if (!z10) {
            start();
            return;
        }
        try {
            ApplicationLoader.getLocationServiceProvider().getLastLocation(new s5(this, 1));
            ApplicationLoader.getLocationServiceProvider().requestLocationUpdates(this.locationRequest, this.fusedLocationListener);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$update$8(SharingLocationInfo sharingLocationInfo) {
        this.sharingLocationsUI.remove(sharingLocationInfo);
        this.sharingLocationsMapUI.l(sharingLocationInfo.did);
        if (this.sharingLocationsUI.isEmpty()) {
            stopService();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
    }

    private void loadSharingLocations() {
        getMessagesStorage().getStorageQueue().postRunnable(new p5(this, 6));
    }

    private void saveSharingLocation(SharingLocationInfo sharingLocationInfo, int i9) {
        getMessagesStorage().getStorageQueue().postRunnable(new p4(this, i9, sharingLocationInfo, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastKnownLocation(Location location) {
        if (location == null || (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000000 <= 300) {
            this.lastKnownLocation = location;
            if (location != null) {
                AndroidUtilities.runOnUIThread(new w1(12));
            }
        }
    }

    private boolean shouldSendLocationNow() {
        return shouldStopGps() && Math.abs(this.lastLocationSendTime - SystemClock.elapsedRealtime()) >= 2000;
    }

    private boolean shouldStopGps() {
        return SystemClock.elapsedRealtime() > this.locationEndWatchTime;
    }

    private void start() {
        if (this.started) {
            return;
        }
        this.lastLocationStartTime = SystemClock.elapsedRealtime();
        this.started = true;
        if (checkServices()) {
            try {
                this.apiClient.connect();
                return;
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        try {
            this.locationManager.requestLocationUpdates("gps", 1L, 0.0f, this.gpsLocationListener);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            this.locationManager.requestLocationUpdates("network", 1L, 0.0f, this.networkLocationListener);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        try {
            this.locationManager.requestLocationUpdates("passive", 1L, 0.0f, this.passiveLocationListener);
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        if (this.lastKnownLocation == null) {
            try {
                setLastKnownLocation(this.locationManager.getLastKnownLocation("gps"));
                if (this.lastKnownLocation == null) {
                    setLastKnownLocation(this.locationManager.getLastKnownLocation("network"));
                }
            } catch (Exception e13) {
                FileLog.e(e13);
            }
        }
    }

    private void startService() {
        try {
            if (!kd0.f("android.permission.ACCESS_COARSE_LOCATION") && !kd0.f("android.permission.ACCESS_FINE_LOCATION")) {
                return;
            }
            ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) LocationSharingService.class));
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    private void stop(boolean z10) {
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
        if (z10) {
            this.locationManager.removeUpdates(this.networkLocationListener);
            this.locationManager.removeUpdates(this.passiveLocationListener);
        }
    }

    private void stopService() {
        ApplicationLoader.applicationContext.stopService(new Intent(ApplicationLoader.applicationContext, (Class<?>) LocationSharingService.class));
    }

    public void addSharingLocation(TLRPC.Message message) {
        SharingLocationInfo sharingLocationInfo = new SharingLocationInfo();
        sharingLocationInfo.did = message.dialog_id;
        sharingLocationInfo.mid = message.id;
        TLRPC.MessageMedia messageMedia = message.media;
        sharingLocationInfo.period = messageMedia.period;
        int i9 = messageMedia.proximity_notification_radius;
        sharingLocationInfo.proximityMeters = i9;
        sharingLocationInfo.lastSentProximityMeters = i9;
        int i10 = this.currentAccount;
        sharingLocationInfo.account = i10;
        sharingLocationInfo.messageObject = new MessageObject(i10, message, false, false);
        if (sharingLocationInfo.period == Integer.MAX_VALUE) {
            sharingLocationInfo.stopTime = ConnectionsManager.DEFAULT_DATACENTER_ID;
        } else {
            sharingLocationInfo.stopTime = getConnectionsManager().getCurrentTime() + sharingLocationInfo.period;
        }
        SharingLocationInfo sharingLocationInfo2 = (SharingLocationInfo) this.sharingLocationsMap.f(sharingLocationInfo.did);
        this.sharingLocationsMap.k(sharingLocationInfo, sharingLocationInfo.did);
        if (sharingLocationInfo2 != null) {
            this.sharingLocations.remove(sharingLocationInfo2);
        }
        this.sharingLocations.add(sharingLocationInfo);
        saveSharingLocation(sharingLocationInfo, 0);
        this.lastLocationSendTime = SystemClock.elapsedRealtime() - 25000;
        AndroidUtilities.runOnUIThread(new f0(this, sharingLocationInfo2, sharingLocationInfo, 25));
    }

    public void cleanup() {
        this.sharingLocationsUI.clear();
        this.sharingLocationsMapUI.b();
        this.locationsCache.b();
        this.cacheRequests.b();
        this.lastReadLocationTime.b();
        stopService();
        Utilities.stageQueue.postRunnable(new p5(this, 5));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i9, int i10, Object... objArr) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (i9 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            Long l10 = (Long) objArr[0];
            long longValue = l10.longValue();
            if (isSharingLocation(longValue) && (arrayList2 = (ArrayList) this.locationsCache.f(longValue)) != null) {
                ArrayList arrayList3 = (ArrayList) objArr[1];
                boolean z10 = false;
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                    if (messageObject.isLiveLocation()) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList2.size()) {
                                arrayList2.add(messageObject.messageOwner);
                                break;
                            } else {
                                if (MessageObject.getFromChatId((TLRPC.Message) arrayList2.get(i12)) == messageObject.getFromChatId()) {
                                    arrayList2.set(i12, messageObject.messageOwner);
                                    break;
                                }
                                i12++;
                            }
                        }
                        z10 = true;
                    } else if (messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) {
                        long dialogId = messageObject.getDialogId();
                        if (DialogObject.isUserDialog(dialogId)) {
                            setProximityLocation(dialogId, 0, false);
                        }
                    }
                }
                if (z10) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, l10, Integer.valueOf(this.currentAccount));
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue() || this.sharingLocationsUI.isEmpty()) {
                return;
            }
            ArrayList arrayList4 = (ArrayList) objArr[0];
            long longValue2 = ((Long) objArr[1]).longValue();
            ArrayList arrayList5 = null;
            for (int i13 = 0; i13 < this.sharingLocationsUI.size(); i13++) {
                SharingLocationInfo sharingLocationInfo = this.sharingLocationsUI.get(i13);
                MessageObject messageObject2 = sharingLocationInfo.messageObject;
                if (longValue2 == (messageObject2 != null ? messageObject2.getChannelId() : 0L) && arrayList4.contains(Integer.valueOf(sharingLocationInfo.mid))) {
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                    }
                    arrayList5.add(Long.valueOf(sharingLocationInfo.did));
                }
            }
            if (arrayList5 != null) {
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    removeSharingLocation(((Long) arrayList5.get(i14)).longValue());
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.replaceMessagesObjects) {
            Long l11 = (Long) objArr[0];
            long longValue3 = l11.longValue();
            if (isSharingLocation(longValue3) && (arrayList = (ArrayList) this.locationsCache.f(longValue3)) != null) {
                ArrayList arrayList6 = (ArrayList) objArr[1];
                boolean z11 = false;
                for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                    MessageObject messageObject3 = (MessageObject) arrayList6.get(i15);
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList.size()) {
                            break;
                        }
                        if (MessageObject.getFromChatId((TLRPC.Message) arrayList.get(i16)) == messageObject3.getFromChatId()) {
                            if (messageObject3.isLiveLocation()) {
                                arrayList.set(i16, messageObject3.messageOwner);
                            } else {
                                arrayList.remove(i16);
                            }
                            z11 = true;
                        } else {
                            i16++;
                        }
                    }
                }
                if (z11) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, l11, Integer.valueOf(this.currentAccount));
                }
            }
        }
    }

    public Location getLastKnownLocation() {
        return this.lastKnownLocation;
    }

    public SharingLocationInfo getSharingLocationInfo(long j10) {
        return (SharingLocationInfo) this.sharingLocationsMapUI.f(j10);
    }

    public boolean isSharingLocation(long j10) {
        return this.sharingLocationsMapUI.h(j10) >= 0;
    }

    public void loadLiveLocations(long j10) {
        if (this.cacheRequests.h(j10) >= 0) {
            return;
        }
        this.cacheRequests.k(Boolean.TRUE, j10);
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(j10);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new ih.v5(this, j10, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.tgnet.TLRPC$TL_channels_readMessageContents] */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.telegram.tgnet.TLRPC$TL_messages_readMessageContents] */
    /* JADX WARN: Type inference failed for: r1v7, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r8v2, types: [org.telegram.tgnet.ConnectionsManager] */
    public void markLiveLoactionsAsRead(long j10) {
        ArrayList arrayList;
        ?? tL_messages_readMessageContents;
        if (DialogObject.isEncryptedDialog(j10) || (arrayList = (ArrayList) this.locationsCache.f(j10)) == null || arrayList.isEmpty()) {
            return;
        }
        Integer num = (Integer) this.lastReadLocationTime.f(j10);
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        if (num == null || num.intValue() + 60 <= elapsedRealtime) {
            this.lastReadLocationTime.k(Integer.valueOf(elapsedRealtime), j10);
            int i9 = 0;
            if (DialogObject.isChatDialog(j10)) {
                long j11 = -j10;
                if (ChatObject.isChannel(j11, this.currentAccount)) {
                    tL_messages_readMessageContents = new TLRPC.TL_channels_readMessageContents();
                    int size = arrayList.size();
                    while (i9 < size) {
                        i9 = j3.r0.e(((TLRPC.Message) arrayList.get(i9)).id, i9, 1, tL_messages_readMessageContents.id);
                    }
                    tL_messages_readMessageContents.channel = getMessagesController().getInputChannel(j11);
                    getConnectionsManager().sendRequest(tL_messages_readMessageContents, new q5(this, 2));
                }
            }
            tL_messages_readMessageContents = new TLRPC.TL_messages_readMessageContents();
            int size2 = arrayList.size();
            while (i9 < size2) {
                i9 = j3.r0.e(((TLRPC.Message) arrayList.get(i9)).id, i9, 1, tL_messages_readMessageContents.id);
            }
            getConnectionsManager().sendRequest(tL_messages_readMessageContents, new q5(this, 2));
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider.IAPIConnectionCallbacks
    public void onConnected(Bundle bundle) {
        this.wasConnectedToPlayServices = true;
        try {
            ApplicationLoader.getLocationServiceProvider().checkLocationSettings(this.locationRequest, new s5(this, 0));
        } catch (Throwable th) {
            FileLog.e(th);
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

    public void removeAllLocationSharings() {
        Utilities.stageQueue.postRunnable(new p5(this, 4));
    }

    public void removeSharingLocation(long j10) {
        Utilities.stageQueue.postRunnable(new bg.i2(this, j10, 15));
    }

    public void setMapLocation(Location location, boolean z10) {
        Location location2;
        if (location == null) {
            return;
        }
        this.lastLocationByMaps = true;
        if (z10 || ((location2 = this.lastKnownLocation) != null && location2.distanceTo(location) >= 20.0f)) {
            this.lastLocationSendTime = SystemClock.elapsedRealtime() - 30000;
            this.locationSentSinceLastMapUpdate = false;
        } else if (this.locationSentSinceLastMapUpdate) {
            this.lastLocationSendTime = SystemClock.elapsedRealtime() - 10000;
            this.locationSentSinceLastMapUpdate = false;
        }
        setLastKnownLocation(location);
    }

    public void setNewLocationEndWatchTime() {
        if (this.sharingLocations.isEmpty()) {
            return;
        }
        this.locationEndWatchTime = SystemClock.elapsedRealtime() + 65000;
        start();
    }

    public boolean setProximityLocation(long j10, int i9, boolean z10) {
        SharingLocationInfo sharingLocationInfo = (SharingLocationInfo) this.sharingLocationsMapUI.f(j10);
        if (sharingLocationInfo != null) {
            sharingLocationInfo.proximityMeters = i9;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new gh.e9(this, i9, j10, 2));
        if (z10) {
            Utilities.stageQueue.postRunnable(new p5(this, 1));
        }
        return sharingLocationInfo != null;
    }

    public void startFusedLocationRequest(boolean z10) {
        Utilities.stageQueue.postRunnable(new eh.f(15, this, z10));
    }

    public void update() {
        getUserConfig();
        if (!this.sharingLocations.isEmpty()) {
            int i9 = 0;
            while (i9 < this.sharingLocations.size()) {
                SharingLocationInfo sharingLocationInfo = this.sharingLocations.get(i9);
                if (sharingLocationInfo.stopTime <= getConnectionsManager().getCurrentTime()) {
                    this.sharingLocations.remove(i9);
                    this.sharingLocationsMap.l(sharingLocationInfo.did);
                    saveSharingLocation(sharingLocationInfo, 1);
                    AndroidUtilities.runOnUIThread(new n5(2, sharingLocationInfo, this));
                    i9--;
                }
                i9++;
            }
        }
        if (!this.started) {
            if (this.sharingLocations.isEmpty() || Math.abs(this.lastLocationSendTime - SystemClock.elapsedRealtime()) <= 30000) {
                return;
            }
            this.lastLocationStartTime = SystemClock.elapsedRealtime();
            start();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.lastLocationByMaps || Math.abs(this.lastLocationStartTime - elapsedRealtime) > 10000 || shouldSendLocationNow()) {
            this.lastLocationByMaps = false;
            this.locationSentSinceLastMapUpdate = true;
            boolean z10 = SystemClock.elapsedRealtime() - this.lastLocationSendTime > 2000;
            this.lastLocationStartTime = elapsedRealtime;
            this.lastLocationSendTime = SystemClock.elapsedRealtime();
            broadcastLastKnownLocation(z10);
        }
    }

    public static void fetchLocationAddress(Location location, int i9, LocationFetchCallback locationFetchCallback) {
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
        Locale locale = systemDefaultLocale;
        Locale locale2 = locale.getLanguage().contains("en") ? locale : Locale.US;
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        fh.g1 g1Var = new fh.g1(locale, location, i9, locale2, locationFetchCallback, 6);
        dispatchQueue.postRunnable(g1Var, 300L);
        callbacks.put(locationFetchCallback, g1Var);
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public class GpsLocationListener implements LocationListener {
        private GpsLocationListener() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            if (LocationController.this.lastKnownLocation == null || !(this == LocationController.this.networkLocationListener || this == LocationController.this.passiveLocationListener)) {
                LocationController.this.setLastKnownLocation(location);
            } else {
                if (LocationController.this.started || location.distanceTo(LocationController.this.lastKnownLocation) <= 20.0f) {
                    return;
                }
                LocationController.this.setLastKnownLocation(location);
                LocationController.this.lastLocationSendTime = SystemClock.elapsedRealtime() - 25000;
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i9, Bundle bundle) {
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider.IAPIConnectionCallbacks
    public void onConnectionSuspended(int i9) {
    }
}
