package androidx.mediarouter.media;

import android.app.ActivityManager;
import android.content.Context;
import android.media.RemoteControlClient;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.ActivityManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import androidx.media.VolumeProviderCompat;
import androidx.mediarouter.media.GlobalMediaRouter;
import androidx.mediarouter.media.MediaRoute2Provider;
import androidx.mediarouter.media.MediaRouteProvider;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.PlatformMediaRouter1RouteProvider;
import androidx.mediarouter.media.RegisteredMediaRouteProviderWatcher;
import androidx.mediarouter.media.RemoteControlClientCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
final class GlobalMediaRouter implements PlatformMediaRouter1RouteProvider.SyncCallback, RegisteredMediaRouteProviderWatcher.Callback {
    static final boolean DEBUG = false;
    private MediaRouterActiveScanThrottlingHelper mActiveScanThrottlingHelper;
    private final Context mApplicationContext;
    private MediaRouter.RouteInfo mBluetoothRoute;
    private int mCallbackCount;
    private MediaSessionCompat mCompatSession;
    private MediaRouter.RouteInfo mDefaultRoute;
    private MediaRouteDiscoveryRequest mDiscoveryRequest;
    private MediaRouteDiscoveryRequest mDiscoveryRequestForMr2Provider;
    private final boolean mLowRam;
    private MediaSessionRecord mMediaSession;
    private MediaRoute2Provider mMr2Provider;
    MediaRouter.OnPrepareTransferListener mOnPrepareTransferListener;
    private PlatformMediaRouter1RouteProvider mPlatformMediaRouter1RouteProvider;
    private MediaSessionCompat mRccMediaSession;
    RegisteredMediaRouteProviderWatcher mRegisteredProviderWatcher;
    private MediaRouter.RouteInfo mRequestedRoute;
    private MediaRouteProvider.RouteController mRequestedRouteController;
    private MediaRouterParams mRouterParams;
    MediaRouter.RouteInfo mSelectedRoute;
    MediaRouteProvider.RouteController mSelectedRouteController;
    MediaRouter.PrepareTransferNotifier mTransferNotifier;
    private boolean mTransferReceiverDeclared;
    private boolean mUseMediaRouter2ForSystemRouting;
    final CallbackHandler mCallbackHandler = new CallbackHandler();
    final Map mRouteControllerMap = new HashMap();
    private final ArrayList mRouters = new ArrayList();
    private final ArrayList mRoutes = new ArrayList();
    private final Map mUniqueIdMap = new HashMap();
    private final ArrayList mProviders = new ArrayList();
    private final ArrayList mRemoteControlClients = new ArrayList();
    private final RemoteControlClientCompat.PlaybackInfo mPlaybackInfo = new RemoteControlClientCompat.PlaybackInfo();
    private final ProviderCallback mProviderCallback = new ProviderCallback();
    private final MediaSessionCompat.OnActiveChangeListener mSessionActiveListener = new MediaSessionCompat.OnActiveChangeListener() { // from class: androidx.mediarouter.media.GlobalMediaRouter.1
        @Override // android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener
        public void onActiveChanged() {
            if (GlobalMediaRouter.this.mRccMediaSession != null) {
                RemoteControlClient remoteControlClient = (RemoteControlClient) GlobalMediaRouter.this.mRccMediaSession.getRemoteControlClient();
                if (GlobalMediaRouter.this.mRccMediaSession.isActive()) {
                    GlobalMediaRouter.this.addRemoteControlClient(remoteControlClient);
                } else {
                    GlobalMediaRouter.this.removeRemoteControlClient(remoteControlClient);
                }
            }
        }
    };
    MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener mDynamicRoutesListener = new MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener() { // from class: androidx.mediarouter.media.GlobalMediaRouter.2
        @Override // androidx.mediarouter.media.MediaRouteProvider.DynamicGroupRouteController.OnDynamicRoutesChangedListener
        public void onRoutesChanged(MediaRouteProvider.DynamicGroupRouteController dynamicGroupRouteController, MediaRouteDescriptor mediaRouteDescriptor, Collection collection) {
            if (dynamicGroupRouteController != GlobalMediaRouter.this.mRequestedRouteController || mediaRouteDescriptor == null) {
                GlobalMediaRouter globalMediaRouter = GlobalMediaRouter.this;
                if (dynamicGroupRouteController == globalMediaRouter.mSelectedRouteController) {
                    if (mediaRouteDescriptor != null) {
                        globalMediaRouter.updateRouteDescriptorAndNotify(globalMediaRouter.mSelectedRoute, mediaRouteDescriptor);
                    }
                    GlobalMediaRouter.this.mSelectedRoute.updateDynamicDescriptors(collection);
                    return;
                }
                return;
            }
            MediaRouter.ProviderInfo provider = GlobalMediaRouter.this.mRequestedRoute.getProvider();
            String id = mediaRouteDescriptor.getId();
            MediaRouter.RouteInfo routeInfo = new MediaRouter.RouteInfo(provider, id, GlobalMediaRouter.this.assignRouteUniqueId(provider, id));
            routeInfo.maybeUpdateDescriptor(mediaRouteDescriptor);
            GlobalMediaRouter globalMediaRouter2 = GlobalMediaRouter.this;
            if (globalMediaRouter2.mSelectedRoute == routeInfo) {
                return;
            }
            globalMediaRouter2.notifyTransfer(globalMediaRouter2, routeInfo, globalMediaRouter2.mRequestedRouteController, 3, GlobalMediaRouter.this.mRequestedRoute, collection);
            GlobalMediaRouter.this.mRequestedRoute = null;
            GlobalMediaRouter.this.mRequestedRouteController = null;
        }
    };

    final class CallbackHandler extends Handler {
        private final ArrayList mTempCallbackRecords = new ArrayList();
        private final List mDynamicGroupRoutes = new ArrayList();

        CallbackHandler() {
        }

        private void invokeCallback(MediaRouter.CallbackRecord callbackRecord, int i, Object obj, int i2) {
            MediaRouter mediaRouter = callbackRecord.mRouter;
            MediaRouter.Callback callback = callbackRecord.mCallback;
            int i3 = 65280 & i;
            if (i3 != 256) {
                if (i3 != 512) {
                    if (i3 == 768 && i == 769) {
                        callback.onRouterParamsChanged(mediaRouter, (MediaRouterParams) obj);
                        return;
                    }
                    return;
                }
                MediaRouter.ProviderInfo providerInfo = (MediaRouter.ProviderInfo) obj;
                switch (i) {
                    case 513:
                        callback.onProviderAdded(mediaRouter, providerInfo);
                        break;
                    case 514:
                        callback.onProviderRemoved(mediaRouter, providerInfo);
                        break;
                    case 515:
                        callback.onProviderChanged(mediaRouter, providerInfo);
                        break;
                }
            }
            MediaRouter.RouteInfo routeInfo = (i == 264 || i == 262) ? (MediaRouter.RouteInfo) ((Pair) obj).second : (MediaRouter.RouteInfo) obj;
            MediaRouter.RouteInfo routeInfo2 = (i == 264 || i == 262) ? (MediaRouter.RouteInfo) ((Pair) obj).first : null;
            if (routeInfo == null || !callbackRecord.filterRouteEvent(routeInfo, i, routeInfo2, i2)) {
                return;
            }
            switch (i) {
                case NotificationCenter.didSetNewWallpapper /* 257 */:
                    callback.onRouteAdded(mediaRouter, routeInfo);
                    break;
                case NotificationCenter.proxySettingsChanged /* 258 */:
                    callback.onRouteRemoved(mediaRouter, routeInfo);
                    break;
                case NotificationCenter.proxyCheckDone /* 259 */:
                    callback.onRouteChanged(mediaRouter, routeInfo);
                    break;
                case NotificationCenter.proxyChangedByRotation /* 260 */:
                    callback.onRouteVolumeChanged(mediaRouter, routeInfo);
                    break;
                case NotificationCenter.liveLocationsChanged /* 261 */:
                    callback.onRoutePresentationDisplayChanged(mediaRouter, routeInfo);
                    break;
                case NotificationCenter.newLocationAvailable /* 262 */:
                    callback.onRouteSelected(mediaRouter, routeInfo, i2, routeInfo);
                    break;
                case NotificationCenter.liveLocationsCacheChanged /* 263 */:
                    callback.onRouteUnselected(mediaRouter, routeInfo, i2);
                    break;
                case NotificationCenter.notificationsCountUpdated /* 264 */:
                    callback.onRouteSelected(mediaRouter, routeInfo, i2, routeInfo2);
                    break;
            }
        }

        private void syncWithPlatformMediaRouter1RouteProvider(int i, Object obj) {
            if (i == 262) {
                MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) ((Pair) obj).second;
                GlobalMediaRouter.this.mPlatformMediaRouter1RouteProvider.onSyncRouteSelected(routeInfo);
                if (GlobalMediaRouter.this.mDefaultRoute == null || !routeInfo.isDefaultOrBluetooth()) {
                    return;
                }
                Iterator it = this.mDynamicGroupRoutes.iterator();
                while (it.hasNext()) {
                    GlobalMediaRouter.this.mPlatformMediaRouter1RouteProvider.onSyncRouteRemoved((MediaRouter.RouteInfo) it.next());
                }
                this.mDynamicGroupRoutes.clear();
            }
            if (i == 264) {
                MediaRouter.RouteInfo routeInfo2 = (MediaRouter.RouteInfo) ((Pair) obj).second;
                this.mDynamicGroupRoutes.add(routeInfo2);
                GlobalMediaRouter.this.mPlatformMediaRouter1RouteProvider.onSyncRouteAdded(routeInfo2);
                GlobalMediaRouter.this.mPlatformMediaRouter1RouteProvider.onSyncRouteSelected(routeInfo2);
                return;
            }
            switch (i) {
                case NotificationCenter.didSetNewWallpapper /* 257 */:
                    GlobalMediaRouter.this.mPlatformMediaRouter1RouteProvider.onSyncRouteAdded((MediaRouter.RouteInfo) obj);
                    break;
                case NotificationCenter.proxySettingsChanged /* 258 */:
                    GlobalMediaRouter.this.mPlatformMediaRouter1RouteProvider.onSyncRouteRemoved((MediaRouter.RouteInfo) obj);
                    break;
                case NotificationCenter.proxyCheckDone /* 259 */:
                    GlobalMediaRouter.this.mPlatformMediaRouter1RouteProvider.onSyncRouteChanged((MediaRouter.RouteInfo) obj);
                    break;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            int i2 = message.arg1;
            if (i == 259 && GlobalMediaRouter.this.getSelectedRoute().getId().equals(((MediaRouter.RouteInfo) obj).getId())) {
                GlobalMediaRouter.this.updateSelectedRouteIfNeeded(true);
            }
            syncWithPlatformMediaRouter1RouteProvider(i, obj);
            try {
                int size = GlobalMediaRouter.this.mRouters.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    MediaRouter mediaRouter = (MediaRouter) ((WeakReference) GlobalMediaRouter.this.mRouters.get(size)).get();
                    if (mediaRouter == null) {
                        GlobalMediaRouter.this.mRouters.remove(size);
                    } else {
                        this.mTempCallbackRecords.addAll(mediaRouter.mCallbackRecords);
                    }
                }
                Iterator it = this.mTempCallbackRecords.iterator();
                while (it.hasNext()) {
                    invokeCallback((MediaRouter.CallbackRecord) it.next(), i, obj, i2);
                }
                this.mTempCallbackRecords.clear();
            } catch (Throwable th) {
                this.mTempCallbackRecords.clear();
                throw th;
            }
        }

        void post(int i, Object obj) {
            obtainMessage(i, obj).sendToTarget();
        }

        void post(int i, Object obj, int i2) {
            Message obtainMessage = obtainMessage(i, obj);
            obtainMessage.arg1 = i2;
            obtainMessage.sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class MediaSessionRecord {
        private int mControlType;
        private int mMaxVolume;
        private final MediaSessionCompat mMsCompat;
        private VolumeProviderCompat mVpCompat;

        class 1 extends VolumeProviderCompat {
            1(int i, int i2, int i3, String str) {
                super(i, i2, i3, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onAdjustVolume$1(int i) {
                MediaRouter.RouteInfo routeInfo = GlobalMediaRouter.this.mSelectedRoute;
                if (routeInfo != null) {
                    routeInfo.requestUpdateVolume(i);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onSetVolumeTo$0(int i) {
                MediaRouter.RouteInfo routeInfo = GlobalMediaRouter.this.mSelectedRoute;
                if (routeInfo != null) {
                    routeInfo.requestSetVolume(i);
                }
            }

            @Override // androidx.media.VolumeProviderCompat
            public void onAdjustVolume(final int i) {
                GlobalMediaRouter.this.mCallbackHandler.post(new Runnable() { // from class: androidx.mediarouter.media.GlobalMediaRouter$MediaSessionRecord$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        GlobalMediaRouter.MediaSessionRecord.1.this.lambda$onAdjustVolume$1(i);
                    }
                });
            }

            @Override // androidx.media.VolumeProviderCompat
            public void onSetVolumeTo(final int i) {
                GlobalMediaRouter.this.mCallbackHandler.post(new Runnable() { // from class: androidx.mediarouter.media.GlobalMediaRouter$MediaSessionRecord$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        GlobalMediaRouter.MediaSessionRecord.1.this.lambda$onSetVolumeTo$0(i);
                    }
                });
            }
        }

        MediaSessionRecord(MediaSessionCompat mediaSessionCompat) {
            this.mMsCompat = mediaSessionCompat;
        }

        void clearVolumeHandling() {
            MediaSessionCompat mediaSessionCompat = this.mMsCompat;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setPlaybackToLocal(GlobalMediaRouter.this.mPlaybackInfo.playbackStream);
                this.mVpCompat = null;
            }
        }

        void configureVolume(int i, int i2, int i3, String str) {
            if (this.mMsCompat != null) {
                VolumeProviderCompat volumeProviderCompat = this.mVpCompat;
                if (volumeProviderCompat != null && i == this.mControlType && i2 == this.mMaxVolume) {
                    volumeProviderCompat.setCurrentVolume(i3);
                    return;
                }
                1 r0 = new 1(i, i2, i3, str);
                this.mVpCompat = r0;
                this.mMsCompat.setPlaybackToRemote(r0);
            }
        }

        MediaSessionCompat.Token getToken() {
            MediaSessionCompat mediaSessionCompat = this.mMsCompat;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.getSessionToken();
            }
            return null;
        }
    }

    final class Mr2ProviderCallback extends MediaRoute2Provider.Callback {
        Mr2ProviderCallback() {
        }

        @Override // androidx.mediarouter.media.MediaRoute2Provider.Callback
        public void onReleaseController(MediaRouteProvider.RouteController routeController) {
            if (routeController == GlobalMediaRouter.this.mSelectedRouteController) {
                selectRouteToFallbackRoute(2);
            } else if (GlobalMediaRouter.DEBUG) {
                Log.d("GlobalMediaRouter", "A RouteController unrelated to the selected route is released. controller=" + routeController);
            }
        }

        @Override // androidx.mediarouter.media.MediaRoute2Provider.Callback
        public void onSelectFallbackRoute(int i) {
            selectRouteToFallbackRoute(i);
        }

        @Override // androidx.mediarouter.media.MediaRoute2Provider.Callback
        public void onSelectRoute(String str, int i) {
            MediaRouter.RouteInfo routeInfo;
            Iterator it = GlobalMediaRouter.this.getRoutes().iterator();
            while (true) {
                if (!it.hasNext()) {
                    routeInfo = null;
                    break;
                }
                routeInfo = (MediaRouter.RouteInfo) it.next();
                if (routeInfo.getProviderInstance() == GlobalMediaRouter.this.mMr2Provider && TextUtils.equals(str, routeInfo.getDescriptorId())) {
                    break;
                }
            }
            if (routeInfo != null) {
                GlobalMediaRouter.this.selectRouteInternal(routeInfo, i);
                return;
            }
            Log.w("GlobalMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + str);
        }

        void selectRouteToFallbackRoute(int i) {
            MediaRouter.RouteInfo chooseFallbackRoute = GlobalMediaRouter.this.chooseFallbackRoute();
            if (GlobalMediaRouter.this.getSelectedRoute() != chooseFallbackRoute) {
                GlobalMediaRouter.this.selectRouteInternal(chooseFallbackRoute, i);
            }
        }
    }

    private final class ProviderCallback extends MediaRouteProvider.Callback {
        ProviderCallback() {
        }

        @Override // androidx.mediarouter.media.MediaRouteProvider.Callback
        public void onDescriptorChanged(MediaRouteProvider mediaRouteProvider, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
            GlobalMediaRouter.this.updateProviderDescriptor(mediaRouteProvider, mediaRouteProviderDescriptor);
        }
    }

    private final class RemoteControlClientRecord implements RemoteControlClientCompat.VolumeCallback {
        private boolean mDisconnected;
        private final RemoteControlClientCompat mRccCompat;

        RemoteControlClientRecord(RemoteControlClient remoteControlClient) {
            RemoteControlClientCompat obtain = RemoteControlClientCompat.obtain(GlobalMediaRouter.this.mApplicationContext, remoteControlClient);
            this.mRccCompat = obtain;
            obtain.setVolumeCallback(this);
            updatePlaybackInfo();
        }

        void disconnect() {
            this.mDisconnected = true;
            this.mRccCompat.setVolumeCallback(null);
        }

        RemoteControlClient getRemoteControlClient() {
            return this.mRccCompat.getRemoteControlClient();
        }

        @Override // androidx.mediarouter.media.RemoteControlClientCompat.VolumeCallback
        public void onVolumeSetRequest(int i) {
            MediaRouter.RouteInfo routeInfo;
            if (this.mDisconnected || (routeInfo = GlobalMediaRouter.this.mSelectedRoute) == null) {
                return;
            }
            routeInfo.requestSetVolume(i);
        }

        @Override // androidx.mediarouter.media.RemoteControlClientCompat.VolumeCallback
        public void onVolumeUpdateRequest(int i) {
            MediaRouter.RouteInfo routeInfo;
            if (this.mDisconnected || (routeInfo = GlobalMediaRouter.this.mSelectedRoute) == null) {
                return;
            }
            routeInfo.requestUpdateVolume(i);
        }

        void updatePlaybackInfo() {
            this.mRccCompat.setPlaybackInfo(GlobalMediaRouter.this.mPlaybackInfo);
        }
    }

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    GlobalMediaRouter(Context context) {
        this.mApplicationContext = context;
        this.mLowRam = ActivityManagerCompat.isLowRamDevice((ActivityManager) context.getSystemService("activity"));
        int i = Build.VERSION.SDK_INT;
        this.mTransferReceiverDeclared = i >= 30 && MediaTransferReceiver.isDeclared(context);
        this.mUseMediaRouter2ForSystemRouting = SystemRoutingUsingMediaRouter2Receiver.isDeclared(context);
        this.mMr2Provider = (i < 30 || !this.mTransferReceiverDeclared) ? null : new MediaRoute2Provider(context, new Mr2ProviderCallback());
        this.mPlatformMediaRouter1RouteProvider = PlatformMediaRouter1RouteProvider.obtain(context, this);
        start();
    }

    private void addProvider(MediaRouteProvider mediaRouteProvider, boolean z) {
        if (findProviderInfo(mediaRouteProvider) == null) {
            MediaRouter.ProviderInfo providerInfo = new MediaRouter.ProviderInfo(mediaRouteProvider, z);
            this.mProviders.add(providerInfo);
            this.mCallbackHandler.post(513, providerInfo);
            updateProviderContents(providerInfo, mediaRouteProvider.getDescriptor());
            mediaRouteProvider.setCallback(this.mProviderCallback);
            mediaRouteProvider.setDiscoveryRequest(this.mDiscoveryRequest);
        }
    }

    private MediaRouter.ProviderInfo findProviderInfo(MediaRouteProvider mediaRouteProvider) {
        Iterator it = this.mProviders.iterator();
        while (it.hasNext()) {
            MediaRouter.ProviderInfo providerInfo = (MediaRouter.ProviderInfo) it.next();
            if (providerInfo.mProviderInstance == mediaRouteProvider) {
                return providerInfo;
            }
        }
        return null;
    }

    private int findRemoteControlClientRecord(RemoteControlClient remoteControlClient) {
        int size = this.mRemoteControlClients.size();
        for (int i = 0; i < size; i++) {
            if (((RemoteControlClientRecord) this.mRemoteControlClients.get(i)).getRemoteControlClient() == remoteControlClient) {
                return i;
            }
        }
        return -1;
    }

    private int findRouteByUniqueId(String str) {
        int size = this.mRoutes.size();
        for (int i = 0; i < size; i++) {
            if (((MediaRouter.RouteInfo) this.mRoutes.get(i)).mUniqueId.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private boolean isSystemDefaultRoute(MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getProviderInstance() == this.mPlatformMediaRouter1RouteProvider && routeInfo.mDescriptorId.equals("DEFAULT_ROUTE");
    }

    private boolean isSystemLiveAudioOnlyRoute(MediaRouter.RouteInfo routeInfo) {
        return routeInfo.getProviderInstance() == this.mPlatformMediaRouter1RouteProvider && routeInfo.supportsControlCategory("android.media.intent.category.LIVE_AUDIO") && !routeInfo.supportsControlCategory("android.media.intent.category.LIVE_VIDEO");
    }

    private void setMediaSessionRecord(MediaSessionRecord mediaSessionRecord) {
        MediaSessionRecord mediaSessionRecord2 = this.mMediaSession;
        if (mediaSessionRecord2 != null) {
            mediaSessionRecord2.clearVolumeHandling();
        }
        this.mMediaSession = mediaSessionRecord;
        if (mediaSessionRecord != null) {
            updatePlaybackInfoFromSelectedRoute();
        }
    }

    private void start() {
        this.mActiveScanThrottlingHelper = new MediaRouterActiveScanThrottlingHelper(new Runnable() { // from class: androidx.mediarouter.media.GlobalMediaRouter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GlobalMediaRouter.this.updateDiscoveryRequest();
            }
        });
        addProvider(this.mPlatformMediaRouter1RouteProvider, true);
        MediaRoute2Provider mediaRoute2Provider = this.mMr2Provider;
        if (mediaRoute2Provider != null) {
            addProvider(mediaRoute2Provider, true);
        }
        RegisteredMediaRouteProviderWatcher registeredMediaRouteProviderWatcher = new RegisteredMediaRouteProviderWatcher(this.mApplicationContext, this);
        this.mRegisteredProviderWatcher = registeredMediaRouteProviderWatcher;
        registeredMediaRouteProviderWatcher.start();
    }

    private void updateMr2ProviderDiscoveryRequest(MediaRouteSelector mediaRouteSelector, boolean z) {
        if (isMediaTransferEnabled()) {
            MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest = this.mDiscoveryRequestForMr2Provider;
            if (mediaRouteDiscoveryRequest != null && mediaRouteDiscoveryRequest.getSelector().equals(mediaRouteSelector) && this.mDiscoveryRequestForMr2Provider.isActiveScan() == z) {
                return;
            }
            if (!mediaRouteSelector.isEmpty() || z) {
                this.mDiscoveryRequestForMr2Provider = new MediaRouteDiscoveryRequest(mediaRouteSelector, z);
            } else if (this.mDiscoveryRequestForMr2Provider == null) {
                return;
            } else {
                this.mDiscoveryRequestForMr2Provider = null;
            }
            this.mMr2Provider.setDiscoveryRequest(this.mDiscoveryRequestForMr2Provider);
        }
    }

    private void updateProviderContents(MediaRouter.ProviderInfo providerInfo, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        boolean z;
        StringBuilder sb;
        String str;
        if (providerInfo.updateDescriptor(mediaRouteProviderDescriptor)) {
            int i = 0;
            if (mediaRouteProviderDescriptor == null || !(mediaRouteProviderDescriptor.isValid() || mediaRouteProviderDescriptor == this.mPlatformMediaRouter1RouteProvider.getDescriptor())) {
                Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + mediaRouteProviderDescriptor);
                z = false;
            } else {
                List<MediaRouteDescriptor> routes = mediaRouteProviderDescriptor.getRoutes();
                ArrayList<Pair> arrayList = new ArrayList();
                ArrayList<Pair> arrayList2 = new ArrayList();
                z = false;
                for (MediaRouteDescriptor mediaRouteDescriptor : routes) {
                    if (mediaRouteDescriptor == null || !mediaRouteDescriptor.isValid()) {
                        sb = new StringBuilder();
                        str = "Ignoring invalid route descriptor: ";
                    } else {
                        String id = mediaRouteDescriptor.getId();
                        int findRouteIndexByDescriptorId = providerInfo.findRouteIndexByDescriptorId(id);
                        if (findRouteIndexByDescriptorId < 0) {
                            MediaRouter.RouteInfo routeInfo = new MediaRouter.RouteInfo(providerInfo, id, assignRouteUniqueId(providerInfo, id), mediaRouteDescriptor.isSystemRoute());
                            int i2 = i + 1;
                            providerInfo.mRoutes.add(i, routeInfo);
                            this.mRoutes.add(routeInfo);
                            if (mediaRouteDescriptor.getGroupMemberIds().isEmpty()) {
                                routeInfo.maybeUpdateDescriptor(mediaRouteDescriptor);
                                this.mCallbackHandler.post(NotificationCenter.didSetNewWallpapper, routeInfo);
                            } else {
                                arrayList.add(new Pair(routeInfo, mediaRouteDescriptor));
                            }
                            i = i2;
                        } else if (findRouteIndexByDescriptorId < i) {
                            sb = new StringBuilder();
                            str = "Ignoring route descriptor with duplicate id: ";
                        } else {
                            MediaRouter.RouteInfo routeInfo2 = (MediaRouter.RouteInfo) providerInfo.mRoutes.get(findRouteIndexByDescriptorId);
                            int i3 = i + 1;
                            Collections.swap(providerInfo.mRoutes, findRouteIndexByDescriptorId, i);
                            if (!mediaRouteDescriptor.getGroupMemberIds().isEmpty()) {
                                arrayList2.add(new Pair(routeInfo2, mediaRouteDescriptor));
                            } else if (updateRouteDescriptorAndNotify(routeInfo2, mediaRouteDescriptor) != 0 && routeInfo2 == this.mSelectedRoute) {
                                i = i3;
                                z = true;
                            }
                            i = i3;
                        }
                    }
                    sb.append(str);
                    sb.append(mediaRouteDescriptor);
                    Log.w("GlobalMediaRouter", sb.toString());
                }
                for (Pair pair : arrayList) {
                    MediaRouter.RouteInfo routeInfo3 = (MediaRouter.RouteInfo) pair.first;
                    routeInfo3.maybeUpdateDescriptor((MediaRouteDescriptor) pair.second);
                    this.mCallbackHandler.post(NotificationCenter.didSetNewWallpapper, routeInfo3);
                }
                for (Pair pair2 : arrayList2) {
                    MediaRouter.RouteInfo routeInfo4 = (MediaRouter.RouteInfo) pair2.first;
                    if (updateRouteDescriptorAndNotify(routeInfo4, (MediaRouteDescriptor) pair2.second) != 0 && routeInfo4 == this.mSelectedRoute) {
                        z = true;
                    }
                }
            }
            for (int size = providerInfo.mRoutes.size() - 1; size >= i; size--) {
                MediaRouter.RouteInfo routeInfo5 = (MediaRouter.RouteInfo) providerInfo.mRoutes.get(size);
                routeInfo5.maybeUpdateDescriptor(null);
                this.mRoutes.remove(routeInfo5);
            }
            updateSelectedRouteIfNeeded(z);
            for (int size2 = providerInfo.mRoutes.size() - 1; size2 >= i; size2--) {
                this.mCallbackHandler.post(NotificationCenter.proxySettingsChanged, (MediaRouter.RouteInfo) providerInfo.mRoutes.remove(size2));
            }
            this.mCallbackHandler.post(515, providerInfo);
        }
    }

    void addMemberToDynamicGroup(MediaRouter.RouteInfo routeInfo) {
        if (!(this.mSelectedRouteController instanceof MediaRouteProvider.DynamicGroupRouteController)) {
            throw new IllegalStateException("There is no currently selected dynamic group route.");
        }
        MediaRouter.RouteInfo.DynamicGroupState dynamicGroupState = getDynamicGroupState(routeInfo);
        if (!this.mSelectedRoute.getMemberRoutes().contains(routeInfo) && dynamicGroupState != null && dynamicGroupState.isGroupable()) {
            ((MediaRouteProvider.DynamicGroupRouteController) this.mSelectedRouteController).onAddMemberRoute(routeInfo.getDescriptorId());
            return;
        }
        Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + routeInfo);
    }

    @Override // androidx.mediarouter.media.RegisteredMediaRouteProviderWatcher.Callback
    public void addProvider(MediaRouteProvider mediaRouteProvider) {
        addProvider(mediaRouteProvider, false);
    }

    void addRemoteControlClient(RemoteControlClient remoteControlClient) {
        if (findRemoteControlClientRecord(remoteControlClient) < 0) {
            this.mRemoteControlClients.add(new RemoteControlClientRecord(remoteControlClient));
        }
    }

    String assignRouteUniqueId(MediaRouter.ProviderInfo providerInfo, String str) {
        String str2;
        String flattenToShortString = providerInfo.getComponentName().flattenToShortString();
        if (providerInfo.mTreatRouteDescriptorIdsAsUnique) {
            str2 = str;
        } else {
            str2 = flattenToShortString + ":" + str;
        }
        if (providerInfo.mTreatRouteDescriptorIdsAsUnique || findRouteByUniqueId(str2) < 0) {
            this.mUniqueIdMap.put(new Pair(flattenToShortString, str), str2);
            return str2;
        }
        Log.w("GlobalMediaRouter", "Either " + str + " isn't unique in " + flattenToShortString + " or we're trying to assign a unique ID for an already added route");
        int i = 2;
        while (true) {
            String format = String.format(Locale.US, "%s_%d", str2, Integer.valueOf(i));
            if (findRouteByUniqueId(format) < 0) {
                this.mUniqueIdMap.put(new Pair(flattenToShortString, str), format);
                return format;
            }
            i++;
        }
    }

    MediaRouter.RouteInfo chooseFallbackRoute() {
        Iterator it = this.mRoutes.iterator();
        while (it.hasNext()) {
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) it.next();
            if (routeInfo != this.mDefaultRoute && isSystemLiveAudioOnlyRoute(routeInfo) && routeInfo.isSelectable()) {
                return routeInfo;
            }
        }
        return this.mDefaultRoute;
    }

    MediaRouter.RouteInfo getBluetoothRoute() {
        return this.mBluetoothRoute;
    }

    int getCallbackCount() {
        return this.mCallbackCount;
    }

    MediaRouter.RouteInfo getDefaultRoute() {
        MediaRouter.RouteInfo routeInfo = this.mDefaultRoute;
        if (routeInfo != null) {
            return routeInfo;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    MediaRouter.RouteInfo.DynamicGroupState getDynamicGroupState(MediaRouter.RouteInfo routeInfo) {
        return this.mSelectedRoute.getDynamicGroupState(routeInfo);
    }

    MediaSessionCompat.Token getMediaSessionToken() {
        MediaSessionRecord mediaSessionRecord = this.mMediaSession;
        if (mediaSessionRecord != null) {
            return mediaSessionRecord.getToken();
        }
        MediaSessionCompat mediaSessionCompat = this.mCompatSession;
        if (mediaSessionCompat != null) {
            return mediaSessionCompat.getSessionToken();
        }
        return null;
    }

    MediaRouter.RouteInfo getRoute(String str) {
        Iterator it = this.mRoutes.iterator();
        while (it.hasNext()) {
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) it.next();
            if (routeInfo.mUniqueId.equals(str)) {
                return routeInfo;
            }
        }
        return null;
    }

    MediaRouter getRouter(Context context) {
        int size = this.mRouters.size();
        while (true) {
            size--;
            if (size < 0) {
                MediaRouter mediaRouter = new MediaRouter(context);
                this.mRouters.add(new WeakReference(mediaRouter));
                return mediaRouter;
            }
            MediaRouter mediaRouter2 = (MediaRouter) ((WeakReference) this.mRouters.get(size)).get();
            if (mediaRouter2 == null) {
                this.mRouters.remove(size);
            } else if (mediaRouter2.mContext == context) {
                return mediaRouter2;
            }
        }
    }

    MediaRouterParams getRouterParams() {
        return this.mRouterParams;
    }

    List getRoutes() {
        return this.mRoutes;
    }

    MediaRouter.RouteInfo getSelectedRoute() {
        MediaRouter.RouteInfo routeInfo = this.mSelectedRoute;
        if (routeInfo != null) {
            return routeInfo;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    String getUniqueId(MediaRouter.ProviderInfo providerInfo, String str) {
        return (String) this.mUniqueIdMap.get(new Pair(providerInfo.getComponentName().flattenToShortString(), str));
    }

    boolean isGroupVolumeUxEnabled() {
        Bundle bundle;
        MediaRouterParams mediaRouterParams = this.mRouterParams;
        return mediaRouterParams == null || (bundle = mediaRouterParams.mExtras) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
    }

    boolean isMediaTransferEnabled() {
        MediaRouterParams mediaRouterParams;
        return this.mTransferReceiverDeclared && ((mediaRouterParams = this.mRouterParams) == null || mediaRouterParams.isMediaTransferReceiverEnabled());
    }

    boolean isRouteAvailable(MediaRouteSelector mediaRouteSelector, int i) {
        if (mediaRouteSelector.isEmpty()) {
            return false;
        }
        if ((i & 2) == 0 && this.mLowRam) {
            return true;
        }
        MediaRouterParams mediaRouterParams = this.mRouterParams;
        boolean z = mediaRouterParams != null && mediaRouterParams.isOutputSwitcherEnabled() && isMediaTransferEnabled();
        int size = this.mRoutes.size();
        for (int i2 = 0; i2 < size; i2++) {
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) this.mRoutes.get(i2);
            if (((i & 1) == 0 || !routeInfo.isDefaultOrBluetooth()) && ((!z || routeInfo.isDefaultOrBluetooth() || routeInfo.getProviderInstance() == this.mMr2Provider) && routeInfo.matchesSelector(mediaRouteSelector))) {
                return true;
            }
        }
        return false;
    }

    boolean isTransferToLocalEnabled() {
        MediaRouterParams mediaRouterParams = this.mRouterParams;
        if (mediaRouterParams == null) {
            return false;
        }
        return mediaRouterParams.isTransferToLocalEnabled();
    }

    void maybeUpdateMemberRouteControllers() {
        if (this.mSelectedRoute.isGroup()) {
            List<MediaRouter.RouteInfo> memberRoutes = this.mSelectedRoute.getMemberRoutes();
            HashSet hashSet = new HashSet();
            Iterator it = memberRoutes.iterator();
            while (it.hasNext()) {
                hashSet.add(((MediaRouter.RouteInfo) it.next()).mUniqueId);
            }
            Iterator it2 = this.mRouteControllerMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    MediaRouteProvider.RouteController routeController = (MediaRouteProvider.RouteController) entry.getValue();
                    routeController.onUnselect(0);
                    routeController.onRelease();
                    it2.remove();
                }
            }
            for (MediaRouter.RouteInfo routeInfo : memberRoutes) {
                if (!this.mRouteControllerMap.containsKey(routeInfo.mUniqueId)) {
                    MediaRouteProvider.RouteController onCreateRouteController = routeInfo.getProviderInstance().onCreateRouteController(routeInfo.mDescriptorId, this.mSelectedRoute.mDescriptorId);
                    onCreateRouteController.onSelect();
                    this.mRouteControllerMap.put(routeInfo.mUniqueId, onCreateRouteController);
                }
            }
        }
    }

    void notifyTransfer(GlobalMediaRouter globalMediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouteProvider.RouteController routeController, int i, MediaRouter.RouteInfo routeInfo2, Collection collection) {
        MediaRouter.OnPrepareTransferListener onPrepareTransferListener;
        MediaRouter.PrepareTransferNotifier prepareTransferNotifier = this.mTransferNotifier;
        if (prepareTransferNotifier != null) {
            prepareTransferNotifier.cancel();
            this.mTransferNotifier = null;
        }
        MediaRouter.PrepareTransferNotifier prepareTransferNotifier2 = new MediaRouter.PrepareTransferNotifier(globalMediaRouter, routeInfo, routeController, i, routeInfo2, collection);
        this.mTransferNotifier = prepareTransferNotifier2;
        if (prepareTransferNotifier2.mReason != 3 || (onPrepareTransferListener = this.mOnPrepareTransferListener) == null) {
            prepareTransferNotifier2.finishTransfer();
            return;
        }
        ListenableFuture onPrepareTransfer = onPrepareTransferListener.onPrepareTransfer(this.mSelectedRoute, prepareTransferNotifier2.mToRoute);
        if (onPrepareTransfer == null) {
            this.mTransferNotifier.finishTransfer();
        } else {
            this.mTransferNotifier.setFuture(onPrepareTransfer);
        }
    }

    @Override // androidx.mediarouter.media.PlatformMediaRouter1RouteProvider.SyncCallback
    public void onPlatformRouteSelectedByDescriptorId(String str) {
        MediaRouter.RouteInfo findRouteByDescriptorId;
        this.mCallbackHandler.removeMessages(NotificationCenter.newLocationAvailable);
        MediaRouter.ProviderInfo findProviderInfo = findProviderInfo(this.mPlatformMediaRouter1RouteProvider);
        if (findProviderInfo == null || (findRouteByDescriptorId = findProviderInfo.findRouteByDescriptorId(str)) == null) {
            return;
        }
        findRouteByDescriptorId.select();
    }

    @Override // androidx.mediarouter.media.RegisteredMediaRouteProviderWatcher.Callback
    public void releaseProviderController(RegisteredMediaRouteProvider registeredMediaRouteProvider, MediaRouteProvider.RouteController routeController) {
        if (this.mSelectedRouteController == routeController) {
            selectRoute(chooseFallbackRoute(), 2);
        }
    }

    void removeMemberFromDynamicGroup(MediaRouter.RouteInfo routeInfo) {
        if (!(this.mSelectedRouteController instanceof MediaRouteProvider.DynamicGroupRouteController)) {
            throw new IllegalStateException("There is no currently selected dynamic group route.");
        }
        MediaRouter.RouteInfo.DynamicGroupState dynamicGroupState = getDynamicGroupState(routeInfo);
        if (this.mSelectedRoute.getMemberRoutes().contains(routeInfo) && dynamicGroupState != null && dynamicGroupState.isUnselectable()) {
            if (this.mSelectedRoute.getMemberRoutes().size() <= 1) {
                Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                return;
            } else {
                ((MediaRouteProvider.DynamicGroupRouteController) this.mSelectedRouteController).onRemoveMemberRoute(routeInfo.getDescriptorId());
                return;
            }
        }
        Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + routeInfo);
    }

    @Override // androidx.mediarouter.media.RegisteredMediaRouteProviderWatcher.Callback
    public void removeProvider(MediaRouteProvider mediaRouteProvider) {
        MediaRouter.ProviderInfo findProviderInfo = findProviderInfo(mediaRouteProvider);
        if (findProviderInfo != null) {
            mediaRouteProvider.setCallback(null);
            mediaRouteProvider.setDiscoveryRequest(null);
            updateProviderContents(findProviderInfo, null);
            this.mCallbackHandler.post(514, findProviderInfo);
            this.mProviders.remove(findProviderInfo);
        }
    }

    void removeRemoteControlClient(RemoteControlClient remoteControlClient) {
        int findRemoteControlClientRecord = findRemoteControlClientRecord(remoteControlClient);
        if (findRemoteControlClientRecord >= 0) {
            ((RemoteControlClientRecord) this.mRemoteControlClients.remove(findRemoteControlClientRecord)).disconnect();
        }
    }

    void requestSetVolume(MediaRouter.RouteInfo routeInfo, int i) {
        MediaRouteProvider.RouteController routeController;
        MediaRouteProvider.RouteController routeController2;
        if (routeInfo == this.mSelectedRoute && (routeController2 = this.mSelectedRouteController) != null) {
            routeController2.onSetVolume(i);
        } else {
            if (this.mRouteControllerMap.isEmpty() || (routeController = (MediaRouteProvider.RouteController) this.mRouteControllerMap.get(routeInfo.mUniqueId)) == null) {
                return;
            }
            routeController.onSetVolume(i);
        }
    }

    void requestUpdateVolume(MediaRouter.RouteInfo routeInfo, int i) {
        MediaRouteProvider.RouteController routeController;
        MediaRouteProvider.RouteController routeController2;
        if (routeInfo == this.mSelectedRoute && (routeController2 = this.mSelectedRouteController) != null) {
            routeController2.onUpdateVolume(i);
        } else {
            if (this.mRouteControllerMap.isEmpty() || (routeController = (MediaRouteProvider.RouteController) this.mRouteControllerMap.get(routeInfo.mUniqueId)) == null) {
                return;
            }
            routeController.onUpdateVolume(i);
        }
    }

    void selectRoute(MediaRouter.RouteInfo routeInfo, int i) {
        StringBuilder sb;
        String str;
        if (!this.mRoutes.contains(routeInfo)) {
            sb = new StringBuilder();
            str = "Ignoring attempt to select removed route: ";
        } else {
            if (routeInfo.mEnabled) {
                if (Build.VERSION.SDK_INT >= 30) {
                    MediaRouteProvider providerInstance = routeInfo.getProviderInstance();
                    MediaRoute2Provider mediaRoute2Provider = this.mMr2Provider;
                    if (providerInstance == mediaRoute2Provider && this.mSelectedRoute != routeInfo) {
                        mediaRoute2Provider.transferTo(routeInfo.getDescriptorId());
                        return;
                    }
                }
                selectRouteInternal(routeInfo, i);
                return;
            }
            sb = new StringBuilder();
            str = "Ignoring attempt to select disabled route: ";
        }
        sb.append(str);
        sb.append(routeInfo);
        Log.w("GlobalMediaRouter", sb.toString());
    }

    void selectRouteInternal(MediaRouter.RouteInfo routeInfo, int i) {
        if (this.mSelectedRoute == routeInfo) {
            return;
        }
        if (this.mRequestedRoute != null) {
            this.mRequestedRoute = null;
            MediaRouteProvider.RouteController routeController = this.mRequestedRouteController;
            if (routeController != null) {
                routeController.onUnselect(3);
                this.mRequestedRouteController.onRelease();
                this.mRequestedRouteController = null;
            }
        }
        if (isMediaTransferEnabled() && routeInfo.getProvider().supportsDynamicGroup()) {
            MediaRouteProvider.DynamicGroupRouteController onCreateDynamicGroupRouteController = routeInfo.getProviderInstance().onCreateDynamicGroupRouteController(routeInfo.mDescriptorId);
            if (onCreateDynamicGroupRouteController != null) {
                onCreateDynamicGroupRouteController.setOnDynamicRoutesChangedListener(ContextCompat.getMainExecutor(this.mApplicationContext), this.mDynamicRoutesListener);
                this.mRequestedRoute = routeInfo;
                this.mRequestedRouteController = onCreateDynamicGroupRouteController;
                onCreateDynamicGroupRouteController.onSelect();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + routeInfo);
        }
        MediaRouteProvider.RouteController onCreateRouteController = routeInfo.getProviderInstance().onCreateRouteController(routeInfo.mDescriptorId);
        if (onCreateRouteController != null) {
            onCreateRouteController.onSelect();
        }
        if (this.mSelectedRoute != null) {
            notifyTransfer(this, routeInfo, onCreateRouteController, i, null, null);
            return;
        }
        this.mSelectedRoute = routeInfo;
        this.mSelectedRouteController = onCreateRouteController;
        this.mCallbackHandler.post(NotificationCenter.newLocationAvailable, new Pair(null, routeInfo), i);
    }

    void setMediaSessionCompat(MediaSessionCompat mediaSessionCompat) {
        this.mCompatSession = mediaSessionCompat;
        if (Build.VERSION.SDK_INT >= 21) {
            setMediaSessionRecord(mediaSessionCompat != null ? new MediaSessionRecord(mediaSessionCompat) : null);
            return;
        }
        MediaSessionCompat mediaSessionCompat2 = this.mRccMediaSession;
        if (mediaSessionCompat2 != null) {
            removeRemoteControlClient((RemoteControlClient) mediaSessionCompat2.getRemoteControlClient());
            this.mRccMediaSession.removeOnActiveChangeListener(this.mSessionActiveListener);
        }
        this.mRccMediaSession = mediaSessionCompat;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.addOnActiveChangeListener(this.mSessionActiveListener);
            if (mediaSessionCompat.isActive()) {
                addRemoteControlClient((RemoteControlClient) mediaSessionCompat.getRemoteControlClient());
            }
        }
    }

    void setRouterParams(MediaRouterParams mediaRouterParams) {
        MediaRouterParams mediaRouterParams2 = this.mRouterParams;
        this.mRouterParams = mediaRouterParams;
        if (isMediaTransferEnabled()) {
            if (this.mMr2Provider == null) {
                MediaRoute2Provider mediaRoute2Provider = new MediaRoute2Provider(this.mApplicationContext, new Mr2ProviderCallback());
                this.mMr2Provider = mediaRoute2Provider;
                addProvider(mediaRoute2Provider, true);
                updateDiscoveryRequest();
                this.mRegisteredProviderWatcher.rescan();
            }
            if ((mediaRouterParams2 != null && mediaRouterParams2.isTransferToLocalEnabled()) != (mediaRouterParams != null && mediaRouterParams.isTransferToLocalEnabled())) {
                this.mMr2Provider.setDiscoveryRequestInternal(this.mDiscoveryRequestForMr2Provider);
            }
        } else {
            MediaRouteProvider mediaRouteProvider = this.mMr2Provider;
            if (mediaRouteProvider != null) {
                removeProvider(mediaRouteProvider);
                this.mMr2Provider = null;
                this.mRegisteredProviderWatcher.rescan();
            }
        }
        this.mCallbackHandler.post(769, mediaRouterParams);
    }

    void transferToRoute(MediaRouter.RouteInfo routeInfo) {
        if (!(this.mSelectedRouteController instanceof MediaRouteProvider.DynamicGroupRouteController)) {
            throw new IllegalStateException("There is no currently selected dynamic group route.");
        }
        MediaRouter.RouteInfo.DynamicGroupState dynamicGroupState = getDynamicGroupState(routeInfo);
        if (dynamicGroupState == null || !dynamicGroupState.isTransferable()) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
        } else {
            ((MediaRouteProvider.DynamicGroupRouteController) this.mSelectedRouteController).onUpdateMemberRoutes(Collections.singletonList(routeInfo.getDescriptorId()));
        }
    }

    void updateDiscoveryRequest() {
        MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest;
        MediaRouteSelector.Builder builder = new MediaRouteSelector.Builder();
        this.mActiveScanThrottlingHelper.reset();
        int size = this.mRouters.size();
        int i = 0;
        boolean z = false;
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            MediaRouter mediaRouter = (MediaRouter) ((WeakReference) this.mRouters.get(size)).get();
            if (mediaRouter == null) {
                this.mRouters.remove(size);
            } else {
                int size2 = mediaRouter.mCallbackRecords.size();
                i += size2;
                for (int i2 = 0; i2 < size2; i2++) {
                    MediaRouter.CallbackRecord callbackRecord = (MediaRouter.CallbackRecord) mediaRouter.mCallbackRecords.get(i2);
                    builder.addSelector(callbackRecord.mSelector);
                    boolean z2 = (callbackRecord.mFlags & 1) != 0;
                    this.mActiveScanThrottlingHelper.requestActiveScan(z2, callbackRecord.mTimestamp);
                    if (z2) {
                        z = true;
                    }
                    int i3 = callbackRecord.mFlags;
                    if ((i3 & 4) != 0 && !this.mLowRam) {
                        z = true;
                    }
                    if ((i3 & 8) != 0) {
                        z = true;
                    }
                }
            }
        }
        boolean finalizeActiveScanAndScheduleSuppressActiveScanRunnable = this.mActiveScanThrottlingHelper.finalizeActiveScanAndScheduleSuppressActiveScanRunnable();
        this.mCallbackCount = i;
        MediaRouteSelector build = z ? builder.build() : MediaRouteSelector.EMPTY;
        updateMr2ProviderDiscoveryRequest(builder.build(), finalizeActiveScanAndScheduleSuppressActiveScanRunnable);
        MediaRouteDiscoveryRequest mediaRouteDiscoveryRequest2 = this.mDiscoveryRequest;
        if (mediaRouteDiscoveryRequest2 != null && mediaRouteDiscoveryRequest2.getSelector().equals(build) && this.mDiscoveryRequest.isActiveScan() == finalizeActiveScanAndScheduleSuppressActiveScanRunnable) {
            return;
        }
        if (!build.isEmpty() || finalizeActiveScanAndScheduleSuppressActiveScanRunnable) {
            mediaRouteDiscoveryRequest = new MediaRouteDiscoveryRequest(build, finalizeActiveScanAndScheduleSuppressActiveScanRunnable);
        } else if (this.mDiscoveryRequest == null) {
            return;
        } else {
            mediaRouteDiscoveryRequest = null;
        }
        this.mDiscoveryRequest = mediaRouteDiscoveryRequest;
        if (z && !finalizeActiveScanAndScheduleSuppressActiveScanRunnable && this.mLowRam) {
            Log.i("GlobalMediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
        }
        Iterator it = this.mProviders.iterator();
        while (it.hasNext()) {
            MediaRouteProvider mediaRouteProvider = ((MediaRouter.ProviderInfo) it.next()).mProviderInstance;
            if (mediaRouteProvider != this.mMr2Provider) {
                mediaRouteProvider.setDiscoveryRequest(this.mDiscoveryRequest);
            }
        }
    }

    void updatePlaybackInfoFromSelectedRoute() {
        MediaSessionRecord mediaSessionRecord;
        RemoteControlClientCompat.PlaybackInfo playbackInfo;
        String str;
        MediaRouter.RouteInfo routeInfo = this.mSelectedRoute;
        if (routeInfo != null) {
            this.mPlaybackInfo.volume = routeInfo.getVolume();
            this.mPlaybackInfo.volumeMax = this.mSelectedRoute.getVolumeMax();
            this.mPlaybackInfo.volumeHandling = this.mSelectedRoute.getVolumeHandling();
            this.mPlaybackInfo.playbackStream = this.mSelectedRoute.getPlaybackStream();
            this.mPlaybackInfo.playbackType = this.mSelectedRoute.getPlaybackType();
            if (isMediaTransferEnabled() && this.mSelectedRoute.getProviderInstance() == this.mMr2Provider) {
                playbackInfo = this.mPlaybackInfo;
                str = MediaRoute2Provider.getSessionIdForRouteController(this.mSelectedRouteController);
            } else {
                playbackInfo = this.mPlaybackInfo;
                str = null;
            }
            playbackInfo.volumeControlId = str;
            Iterator it = this.mRemoteControlClients.iterator();
            while (it.hasNext()) {
                ((RemoteControlClientRecord) it.next()).updatePlaybackInfo();
            }
            if (this.mMediaSession == null) {
                return;
            }
            if (this.mSelectedRoute != getDefaultRoute() && this.mSelectedRoute != getBluetoothRoute()) {
                RemoteControlClientCompat.PlaybackInfo playbackInfo2 = this.mPlaybackInfo;
                this.mMediaSession.configureVolume(playbackInfo2.volumeHandling == 1 ? 2 : 0, playbackInfo2.volumeMax, playbackInfo2.volume, playbackInfo2.volumeControlId);
                return;
            }
            mediaSessionRecord = this.mMediaSession;
        } else {
            mediaSessionRecord = this.mMediaSession;
            if (mediaSessionRecord == null) {
                return;
            }
        }
        mediaSessionRecord.clearVolumeHandling();
    }

    void updateProviderDescriptor(MediaRouteProvider mediaRouteProvider, MediaRouteProviderDescriptor mediaRouteProviderDescriptor) {
        MediaRouter.ProviderInfo findProviderInfo = findProviderInfo(mediaRouteProvider);
        if (findProviderInfo != null) {
            updateProviderContents(findProviderInfo, mediaRouteProviderDescriptor);
        }
    }

    int updateRouteDescriptorAndNotify(MediaRouter.RouteInfo routeInfo, MediaRouteDescriptor mediaRouteDescriptor) {
        int maybeUpdateDescriptor = routeInfo.maybeUpdateDescriptor(mediaRouteDescriptor);
        if (maybeUpdateDescriptor != 0) {
            if ((maybeUpdateDescriptor & 1) != 0) {
                this.mCallbackHandler.post(NotificationCenter.proxyCheckDone, routeInfo);
            }
            if ((maybeUpdateDescriptor & 2) != 0) {
                this.mCallbackHandler.post(NotificationCenter.proxyChangedByRotation, routeInfo);
            }
            if ((maybeUpdateDescriptor & 4) != 0) {
                this.mCallbackHandler.post(NotificationCenter.liveLocationsChanged, routeInfo);
            }
        }
        return maybeUpdateDescriptor;
    }

    void updateSelectedRouteIfNeeded(boolean z) {
        MediaRouter.RouteInfo routeInfo = this.mDefaultRoute;
        if (routeInfo != null && !routeInfo.isSelectable()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.mDefaultRoute);
            this.mDefaultRoute = null;
        }
        if (this.mDefaultRoute == null) {
            Iterator it = this.mRoutes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MediaRouter.RouteInfo routeInfo2 = (MediaRouter.RouteInfo) it.next();
                if (isSystemDefaultRoute(routeInfo2) && routeInfo2.isSelectable()) {
                    this.mDefaultRoute = routeInfo2;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.mDefaultRoute);
                    break;
                }
            }
        }
        MediaRouter.RouteInfo routeInfo3 = this.mBluetoothRoute;
        if (routeInfo3 != null && !routeInfo3.isSelectable()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.mBluetoothRoute);
            this.mBluetoothRoute = null;
        }
        if (this.mBluetoothRoute == null) {
            Iterator it2 = this.mRoutes.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                MediaRouter.RouteInfo routeInfo4 = (MediaRouter.RouteInfo) it2.next();
                if (isSystemLiveAudioOnlyRoute(routeInfo4) && routeInfo4.isSelectable()) {
                    this.mBluetoothRoute = routeInfo4;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.mBluetoothRoute);
                    break;
                }
            }
        }
        MediaRouter.RouteInfo routeInfo5 = this.mSelectedRoute;
        if (routeInfo5 != null && routeInfo5.isEnabled()) {
            if (z) {
                maybeUpdateMemberRouteControllers();
                updatePlaybackInfoFromSelectedRoute();
                return;
            }
            return;
        }
        Log.i("GlobalMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.mSelectedRoute);
        selectRouteInternal(chooseFallbackRoute(), 0);
    }
}
