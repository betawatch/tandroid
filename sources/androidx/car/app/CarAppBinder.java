package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.car.app.ICarApp;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
final class CarAppBinder extends ICarApp.Stub {
    private g7a mCurrentSession;
    private final SessionInfo mCurrentSessionInfo;
    private HandshakeInfo mHandshakeInfo;
    private yh5 mHostValidator;
    private md1 mService;

    public CarAppBinder(md1 md1Var, SessionInfo sessionInfo) {
        this.mCurrentSessionInfo = sessionInfo;
    }

    private w26 getCurrentLifecycle() {
        return null;
    }

    private yh5 getHostValidator() {
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

    private void onConfigurationChangedInternal(g7a g7aVar, Configuration configuration) {
        Handler handler = ipb.a;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Not running on main thread when it is required to");
        }
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onCarConfigurationChanged configuration: " + configuration);
        }
        throw null;
    }

    private void onNewIntentInternal(g7a g7aVar, Intent intent) {
        Handler handler = ipb.a;
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

    public g7a getCurrentSession() {
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
        ipb.a(new Runnable() { // from class: androidx.car.app.e
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
        androidx.car.app.utils.e.c(iOnDoneCallback, "onAppCreate", new s89() { // from class: androidx.car.app.d
            @Override // s89
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
    public void onHandshakeCompleted(g41 g41Var, IOnDoneCallback iOnDoneCallback) {
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.e.b(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new b(this, intent, (byte) 1));
    }

    public void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (hostCarAppApiLevel < 1 || hostCarAppApiLevel > ld1.b()) {
            u36.j(hg9.j(hostCarAppApiLevel, "Invalid Car App API level received: "));
        } else {
            this.mHandshakeInfo = handshakeInfo;
        }
    }

    public void onAutoDriveEnabled() {
    }

    public void onDestroyLifecycle() {
    }
}
