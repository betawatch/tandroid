package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.util.Log;
import androidx.car.app.ICarApp;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.utils.RemoteUtils;
import androidx.car.app.utils.ThreadUtils;
import androidx.car.app.validation.HostValidator;
import androidx.car.app.versioning.CarAppApiLevels;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
final class CarAppBinder extends ICarApp.Stub {
    private Session mCurrentSession;
    private final SessionInfo mCurrentSessionInfo;
    private HandshakeInfo mHandshakeInfo;
    private HostValidator mHostValidator;
    private CarAppService mService;

    private Lifecycle getCurrentLifecycle() {
        return null;
    }

    Session getCurrentSession() {
        return null;
    }

    void onAutoDriveEnabled() {
    }

    void onDestroyLifecycle() {
    }

    CarAppBinder(CarAppService carAppService, SessionInfo sessionInfo) {
        this.mCurrentSessionInfo = sessionInfo;
    }

    void destroy() {
        onDestroyLifecycle();
        this.mHandshakeInfo = null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppCreate(final ICarHost iCarHost, final Intent intent, final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate intent: " + intent);
        }
        RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onAppCreate", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda4
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                return CarAppBinder.$r8$lambda$qV15wLbZchZqw7AYDWUTdB04thg(CarAppBinder.this, iCarHost, configuration, intent);
            }
        });
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate completed");
        }
    }

    public static /* synthetic */ Object $r8$lambda$qV15wLbZchZqw7AYDWUTdB04thg(CarAppBinder carAppBinder, ICarHost iCarHost, Configuration configuration, Intent intent) {
        carAppBinder.getClass();
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda2
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                return CarAppBinder.$r8$lambda$PVFAimZMMIOaPhkV65sW3A2TlPU(CarAppBinder.this);
            }
        });
    }

    public static /* synthetic */ Object $r8$lambda$PVFAimZMMIOaPhkV65sW3A2TlPU(CarAppBinder carAppBinder) {
        carAppBinder.getClass();
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda7
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                return CarAppBinder.$r8$lambda$7Uack6mc_KLNEQNXfnJY9SPsiFU(CarAppBinder.this);
            }
        });
    }

    public static /* synthetic */ Object $r8$lambda$7Uack6mc_KLNEQNXfnJY9SPsiFU(CarAppBinder carAppBinder) {
        carAppBinder.getClass();
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda1
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                return CarAppBinder.$r8$lambda$9yq-tiei5dqpkoINH-KvUxBxuvs(CarAppBinder.this);
            }
        });
    }

    public static /* synthetic */ Object $r8$lambda$9yq-tiei5dqpkoINH-KvUxBxuvs(CarAppBinder carAppBinder) {
        carAppBinder.getClass();
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda3
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                return CarAppBinder.$r8$lambda$-NmrdC46ynLALOfGH0FYY9n6M6o(CarAppBinder.this);
            }
        });
    }

    public static /* synthetic */ Object $r8$lambda$-NmrdC46ynLALOfGH0FYY9n6M6o(CarAppBinder carAppBinder) {
        carAppBinder.getClass();
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(final Intent intent, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda6
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                return CarAppBinder.$r8$lambda$r2-GCoVHE6N83Ffmv4fYzhYrccc(CarAppBinder.this, intent);
            }
        });
    }

    public static /* synthetic */ Object $r8$lambda$r2-GCoVHE6N83Ffmv4fYzhYrccc(CarAppBinder carAppBinder, Intent intent) {
        carAppBinder.getClass();
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda0
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                return CarAppBinder.$r8$lambda$XEfwwvAnIshhGblecnxdG4sh6nQ(CarAppBinder.this, configuration);
            }
        });
    }

    public static /* synthetic */ Object $r8$lambda$XEfwwvAnIshhGblecnxdG4sh6nQ(CarAppBinder carAppBinder, Configuration configuration) {
        carAppBinder.getClass();
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void getManager(final String str, final IOnDoneCallback iOnDoneCallback) {
        ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                CarAppBinder.$r8$lambda$IlVDu2UN1ozorozvq1aLAqao2a8(CarAppBinder.this, str, iOnDoneCallback);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$IlVDu2UN1ozorozvq1aLAqao2a8(CarAppBinder carAppBinder, String str, IOnDoneCallback iOnDoneCallback) {
        carAppBinder.getClass();
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onHandshakeCompleted(Bundleable bundleable, IOnDoneCallback iOnDoneCallback) {
        throw null;
    }

    private HostValidator getHostValidator() {
        Object obj = null;
        obj.getClass();
        return null;
    }

    private void onNewIntentInternal(Session session, Intent intent) {
        ThreadUtils.checkMainThread();
        throw null;
    }

    private void onConfigurationChangedInternal(Session session, Configuration configuration) {
        ThreadUtils.checkMainThread();
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onCarConfigurationChanged configuration: " + configuration);
        }
        throw null;
    }

    void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (!CarAppApiLevels.isValid(hostCarAppApiLevel)) {
            throw new IllegalArgumentException("Invalid Car App API level received: " + hostCarAppApiLevel);
        }
        this.mHandshakeInfo = handshakeInfo;
    }

    HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }
}
