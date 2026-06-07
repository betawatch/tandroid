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
                Object lambda$onAppCreate$0;
                lambda$onAppCreate$0 = CarAppBinder.this.lambda$onAppCreate$0(iCarHost, configuration, intent);
                return lambda$onAppCreate$0;
            }
        });
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate completed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppCreate$0(ICarHost iCarHost, Configuration configuration, Intent intent) {
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda2
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                Object lambda$onAppStart$1;
                lambda$onAppStart$1 = CarAppBinder.this.lambda$onAppStart$1();
                return lambda$onAppStart$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStart$1() {
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda7
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                Object lambda$onAppResume$2;
                lambda$onAppResume$2 = CarAppBinder.this.lambda$onAppResume$2();
                return lambda$onAppResume$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppResume$2() {
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda1
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                Object lambda$onAppPause$3;
                lambda$onAppPause$3 = CarAppBinder.this.lambda$onAppPause$3();
                return lambda$onAppPause$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppPause$3() {
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda3
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                Object lambda$onAppStop$4;
                lambda$onAppStop$4 = CarAppBinder.this.lambda$onAppStop$4();
                return lambda$onAppStop$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStop$4() {
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(final Intent intent, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda6
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                Object lambda$onNewIntent$5;
                lambda$onNewIntent$5 = CarAppBinder.this.lambda$onNewIntent$5(intent);
                return lambda$onNewIntent$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onNewIntent$5(Intent intent) {
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda0
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                Object lambda$onConfigurationChanged$6;
                lambda$onConfigurationChanged$6 = CarAppBinder.this.lambda$onConfigurationChanged$6(configuration);
                return lambda$onConfigurationChanged$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onConfigurationChanged$6(Configuration configuration) {
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void getManager(final String str, final IOnDoneCallback iOnDoneCallback) {
        ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                CarAppBinder.this.lambda$getManager$7(str, iOnDoneCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getManager$7(String str, IOnDoneCallback iOnDoneCallback) {
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
