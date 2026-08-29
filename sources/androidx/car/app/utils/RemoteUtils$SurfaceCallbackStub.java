package androidx.car.app.utils;

import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.n;
import androidx.lifecycle.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    private final o mLifecycle;
    private final n mSurfaceCallback;

    public RemoteUtils$SurfaceCallbackStub(o oVar, n nVar) {
        this.mLifecycle = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onClick$7(float f9, float f10) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onFling$5(float f9, float f10) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onScale$6(float f9, float f10, float f11) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onScroll$4(float f9, float f10) {
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
    public void onClick(float f9, float f10) {
        k.a(new b(this.mLifecycle, new g(this, f9, f10, 0), "onClick", 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onFling(float f9, float f10) {
        k.a(new b(this.mLifecycle, new g(this, f9, f10, 2), "onFling", 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScale(final float f9, final float f10, final float f11) {
        k.a(new b(this.mLifecycle, new d() { // from class: androidx.car.app.utils.i
            @Override // androidx.car.app.utils.d
            public final Object a() {
                Object lambda$onScale$6;
                lambda$onScale$6 = RemoteUtils$SurfaceCallbackStub.this.lambda$onScale$6(f9, f10, f11);
                return lambda$onScale$6;
            }
        }, "onScale", 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScroll(float f9, float f10) {
        k.a(new b(this.mLifecycle, new g(this, f9, f10, 1), "onScroll", 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        j.c(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new h(this, rect, 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceAvailable(w.b bVar, IOnDoneCallback iOnDoneCallback) {
        j.c(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new f(this, bVar, 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceDestroyed(w.b bVar, IOnDoneCallback iOnDoneCallback) {
        j.c(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new f(this, bVar, 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        j.c(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new h(this, rect, 0));
    }
}
