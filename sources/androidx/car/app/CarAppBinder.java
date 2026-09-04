package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.car.app.ICarApp;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
final class CarAppBinder extends ICarApp.Stub {
    private n mCurrentSession;
    private final SessionInfo mCurrentSessionInfo;
    private HandshakeInfo mHandshakeInfo;
    private y.a mHostValidator;
    private f mService;

    public CarAppBinder(f fVar, SessionInfo sessionInfo) {
        this.mCurrentSessionInfo = sessionInfo;
    }

    private androidx.lifecycle.o getCurrentLifecycle() {
        return null;
    }

    private y.a getHostValidator() {
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

    private void onConfigurationChangedInternal(n nVar, Configuration configuration) {
        Handler handler = androidx.car.app.utils.j.a;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Not running on main thread when it is required to");
        }
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onCarConfigurationChanged configuration: " + configuration);
        }
        throw null;
    }

    private void onNewIntentInternal(n nVar, Intent intent) {
        Handler handler = androidx.car.app.utils.j.a;
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

    public n getCurrentSession() {
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
        androidx.car.app.utils.j.a(new Runnable() { // from class: androidx.car.app.e
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
        androidx.car.app.utils.i.b(iOnDoneCallback, "onAppCreate", new androidx.car.app.utils.c() { // from class: androidx.car.app.d
            @Override // androidx.car.app.utils.c
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
        androidx.car.app.utils.i.c(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new c(this, 0));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.i.c(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new c(this, 3));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.i.c(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new c(this, 1));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.i.c(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new c(this, 2));
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.i.c(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new b(0, this, configuration));
    }

    @Override // androidx.car.app.ICarApp
    public void onHandshakeCompleted(w.b bVar, IOnDoneCallback iOnDoneCallback) {
        throw null;
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.i.c(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new b(1, this, intent));
    }

    public void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (hostCarAppApiLevel < 1 || hostCarAppApiLevel > z.a.a()) {
            throw new IllegalArgumentException(i2.g.i(hostCarAppApiLevel, "Invalid Car App API level received: "));
        }
        this.mHandshakeInfo = handshakeInfo;
    }

    public void onAutoDriveEnabled() {
    }

    public void onDestroyLifecycle() {
    }
}
