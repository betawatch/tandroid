package androidx.car.app.utils;

import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    private final w06 mLifecycle;
    private final zbb mSurfaceCallback;

    public RemoteUtils$SurfaceCallbackStub(w06 w06Var, zbb zbbVar) {
        this.mLifecycle = w06Var;
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
    public /* synthetic */ Object lambda$onSurfaceAvailable$0(y21 y21Var) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onSurfaceDestroyed$3(y21 y21Var) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onVisibleAreaChanged$1(Rect rect) {
        throw null;
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onClick(float f, float f2) {
        hnb.a(new gm8(this.mLifecycle, new b(this, f, f2, (byte) 0), "onClick", (byte) 8));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onFling(float f, float f2) {
        hnb.a(new gm8(this.mLifecycle, new b(this, f, f2, (byte) 2), "onFling", (byte) 8));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScale(final float f, final float f2, final float f3) {
        hnb.a(new gm8(this.mLifecycle, new q69() { // from class: androidx.car.app.utils.d
            @Override // q69
            public final Object a() {
                Object lambda$onScale$6;
                lambda$onScale$6 = RemoteUtils$SurfaceCallbackStub.this.lambda$onScale$6(f, f2, f3);
                return lambda$onScale$6;
            }
        }, "onScale", (byte) 8));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScroll(float f, float f2) {
        hnb.a(new gm8(this.mLifecycle, new b(this, f, f2, (byte) 1), "onScroll", (byte) 8));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        e.b(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new c(this, rect, (byte) 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceAvailable(y21 y21Var, IOnDoneCallback iOnDoneCallback) {
        e.b(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new a(this, y21Var, (byte) 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceDestroyed(y21 y21Var, IOnDoneCallback iOnDoneCallback) {
        e.b(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new a(this, y21Var, (byte) 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        e.b(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new c(this, rect, (byte) 0));
    }
}
