package androidx.car.app.utils;

import a3.l0;
import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.n;
import androidx.lifecycle.o;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    private final o mLifecycle;
    private final n mSurfaceCallback;

    public RemoteUtils$SurfaceCallbackStub(o oVar, n nVar) {
        this.mLifecycle = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onClick$7(float f7, float f10) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onFling$5(float f7, float f10) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onScale$6(float f7, float f10, float f11) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onScroll$4(float f7, float f10) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onStableAreaChanged$2(Rect rect) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onSurfaceAvailable$0(w.b bVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onSurfaceDestroyed$3(w.b bVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onVisibleAreaChanged$1(Rect rect) {
        throw null;
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onClick(float f7, float f10) {
        i.a(new l0(this.mLifecycle, new e(this, f7, f10, 0), "onClick", 9));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onFling(float f7, float f10) {
        i.a(new l0(this.mLifecycle, new e(this, f7, f10, 2), "onFling", 9));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScale(final float f7, final float f10, final float f11) {
        i.a(new l0(this.mLifecycle, new b() { // from class: androidx.car.app.utils.g
            @Override // androidx.car.app.utils.b
            public final Object a() {
                Object lambda$onScale$6;
                lambda$onScale$6 = RemoteUtils$SurfaceCallbackStub.this.lambda$onScale$6(f7, f10, f11);
                return lambda$onScale$6;
            }
        }, "onScale", 9));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScroll(float f7, float f10) {
        i.a(new l0(this.mLifecycle, new e(this, f7, f10, 1), "onScroll", 9));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        h.c(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new f(this, rect, 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceAvailable(w.b bVar, IOnDoneCallback iOnDoneCallback) {
        h.c(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new d(this, bVar, 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceDestroyed(w.b bVar, IOnDoneCallback iOnDoneCallback) {
        h.c(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new d(this, bVar, 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        h.c(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new f(this, rect, 0));
    }
}
