package androidx.car.app.utils;

import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.n;
import androidx.lifecycle.o;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    private final o mLifecycle;
    private final n mSurfaceCallback;

    public RemoteUtils$SurfaceCallbackStub(o oVar, n nVar) {
        this.mLifecycle = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onClick$7(float f10, float f11) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onFling$5(float f10, float f11) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onScale$6(float f10, float f11, float f12) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onScroll$4(float f10, float f11) {
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
    public void onClick(float f10, float f11) {
        k.a(new b(this.mLifecycle, new g(this, f10, f11, 0), "onClick", 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onFling(float f10, float f11) {
        k.a(new b(this.mLifecycle, new g(this, f10, f11, 2), "onFling", 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScale(final float f10, final float f11, final float f12) {
        k.a(new b(this.mLifecycle, new d() { // from class: androidx.car.app.utils.i
            @Override // androidx.car.app.utils.d
            public final Object a() {
                Object lambda$onScale$6;
                lambda$onScale$6 = RemoteUtils$SurfaceCallbackStub.this.lambda$onScale$6(f10, f11, f12);
                return lambda$onScale$6;
            }
        }, "onScale", 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScroll(float f10, float f11) {
        k.a(new b(this.mLifecycle, new g(this, f10, f11, 1), "onScroll", 0));
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
