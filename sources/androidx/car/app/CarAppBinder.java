package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.car.app.ICarApp;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
final class CarAppBinder extends ICarApp.Stub {
    private e5a mCurrentSession;
    private final SessionInfo mCurrentSessionInfo;
    private HandshakeInfo mHandshakeInfo;
    private zf5 mHostValidator;
    private ec1 mService;

    public CarAppBinder(ec1 ec1Var, SessionInfo sessionInfo) {
        this.mCurrentSessionInfo = sessionInfo;
    }

    private w06 getCurrentLifecycle() {
        return null;
    }

    private zf5 getHostValidator() {
        Object obj = null;
        obj.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getManager$7(String str, IOnDoneCallback iOnDoneCallback) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$onAppCreate$0(ICarHost iCarHost, Configuration configuration, Intent intent) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppPause$3() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppResume$2() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStart$1() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStop$4() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onConfigurationChanged$6(Configuration configuration) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onNewIntent$5(Intent intent) {
        throw null;
    }

    private void onConfigurationChangedInternal(e5a e5aVar, Configuration configuration) {
        Handler handler = hnb.a;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Not running on main thread when it is required to");
        }
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onCarConfigurationChanged configuration: " + configuration);
        }
        throw null;
    }

    private void onNewIntentInternal(e5a e5aVar, Intent intent) {
        Handler handler = hnb.a;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Not running on main thread when it is required to");
        }
        throw null;
    }

    public void destroy() {
        onDestroyLifecycle();
        this.mHandshakeInfo = null;
    }

    @Override // androidx.car.app.ICarApp
    public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        throw null;
    }

    public e5a getCurrentSession() {
        return null;
    }

    public SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }

    public HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    @Override // androidx.car.app.ICarApp
    public void getManager(final String str, final IOnDoneCallback iOnDoneCallback) {
        hnb.a(new Runnable() { // from class: androidx.car.app.e
            @Override // java.lang.Runnable
            public final void run() {
                CarAppBinder.this.lambda$getManager$7(str, iOnDoneCallback);
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppCreate(final ICarHost iCarHost, final Intent intent, final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate intent: " + intent);
        }
        androidx.car.app.utils.e.c(iOnDoneCallback, "onAppCreate", new q69() { // from class: androidx.car.app.d
            @Override // q69
            public final Object a() {
                Object lambda$onAppCreate$0;
                lambda$onAppCreate$0 = CarAppBinder.this.lambda$onAppCreate$0(iCarHost, configuration, intent);
                return lambda$onAppCreate$0;
            }
        });
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate completed");
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.e.b(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new c(this, (byte) 0));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.e.b(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new c(this, (byte) 3));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.e.b(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new c(this, (byte) 1));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.e.b(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new c(this, (byte) 2));
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.e.b(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new b(this, configuration, (byte) 0));
    }

    @Override // androidx.car.app.ICarApp
    public void onHandshakeCompleted(y21 y21Var, IOnDoneCallback iOnDoneCallback) {
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.e.b(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new b(this, intent, (byte) 1));
    }

    public void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (hostCarAppApiLevel < 1 || hostCarAppApiLevel > dc1.b()) {
            w26.j(de9.k(hostCarAppApiLevel, "Invalid Car App API level received: "));
        } else {
            this.mHandshakeInfo = handshakeInfo;
        }
    }

    public void onAutoDriveEnabled() {
    }

    public void onDestroyLifecycle() {
    }
}
