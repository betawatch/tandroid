package androidx.car.app.utils;

import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    private final w26 mLifecycle;
    private final beb mSurfaceCallback;

    public RemoteUtils$SurfaceCallbackStub(w26 w26Var, beb bebVar) {
        this.mLifecycle = w26Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onClick$7(float f, float f2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onFling$5(float f, float f2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onScale$6(float f, float f2, float f3) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onScroll$4(float f, float f2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onStableAreaChanged$2(Rect rect) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onSurfaceAvailable$0(g41 g41Var) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onSurfaceDestroyed$3(g41 g41Var) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onVisibleAreaChanged$1(Rect rect) {
        throw null;
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onClick(float f, float f2) {
        ipb.a(new ak8((Object) this.mLifecycle, (Object) new b(this, f, f2, (byte) 0), (Object) "onClick", (byte) 11));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onFling(float f, float f2) {
        ipb.a(new ak8((Object) this.mLifecycle, (Object) new b(this, f, f2, (byte) 2), (Object) "onFling", (byte) 11));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScale(final float f, final float f2, final float f3) {
        ipb.a(new ak8((Object) this.mLifecycle, (Object) new s89() { // from class: androidx.car.app.utils.d
            @Override // s89
            public final Object a() {
                Object lambda$onScale$6;
                lambda$onScale$6 = RemoteUtils$SurfaceCallbackStub.this.lambda$onScale$6(f, f2, f3);
                return lambda$onScale$6;
            }
        }, (Object) "onScale", (byte) 11));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScroll(float f, float f2) {
        ipb.a(new ak8((Object) this.mLifecycle, (Object) new b(this, f, f2, (byte) 1), (Object) "onScroll", (byte) 11));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        e.b(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new c(this, rect, (byte) 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceAvailable(g41 g41Var, IOnDoneCallback iOnDoneCallback) {
        e.b(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new a(this, g41Var, (byte) 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceDestroyed(g41 g41Var, IOnDoneCallback iOnDoneCallback) {
        e.b(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new a(this, g41Var, (byte) 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        e.b(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new c(this, rect, (byte) 0));
    }
}
