package androidx.car.app.utils;

import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    private final a36 mLifecycle;
    private final vfb mSurfaceCallback;

    public RemoteUtils$SurfaceCallbackStub(a36 a36Var, vfb vfbVar) {
        this.mLifecycle = a36Var;
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
    public /* synthetic */ Object lambda$onSurfaceAvailable$0(h31 h31Var) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onSurfaceDestroyed$3(h31 h31Var) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onVisibleAreaChanged$1(Rect rect) {
        throw null;
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onClick(float f, float f2) {
        hrb.a(new sa8(this.mLifecycle, new b(this, f, f2, (byte) 0), "onClick", (byte) 16));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onFling(float f, float f2) {
        hrb.a(new sa8(this.mLifecycle, new b(this, f, f2, (byte) 2), "onFling", (byte) 16));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScale(final float f, final float f2, final float f3) {
        hrb.a(new sa8(this.mLifecycle, new da9() { // from class: androidx.car.app.utils.d
            @Override // da9
            public final Object a() {
                Object lambda$onScale$6;
                lambda$onScale$6 = RemoteUtils$SurfaceCallbackStub.this.lambda$onScale$6(f, f2, f3);
                return lambda$onScale$6;
            }
        }, "onScale", (byte) 16));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScroll(float f, float f2) {
        hrb.a(new sa8(this.mLifecycle, new b(this, f, f2, (byte) 1), "onScroll", (byte) 16));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        e.b(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new c(this, rect, (byte) 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceAvailable(h31 h31Var, IOnDoneCallback iOnDoneCallback) {
        e.b(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new a(this, h31Var, (byte) 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceDestroyed(h31 h31Var, IOnDoneCallback iOnDoneCallback) {
        e.b(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new a(this, h31Var, (byte) 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        e.b(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new c(this, rect, (byte) 0));
    }
}
