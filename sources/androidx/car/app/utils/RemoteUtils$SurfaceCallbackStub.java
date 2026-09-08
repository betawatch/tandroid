package androidx.car.app.utils;

import a3.k0;
import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import androidx.lifecycle.o;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    private final o mLifecycle;
    private final androidx.car.app.o mSurfaceCallback;

    public RemoteUtils$SurfaceCallbackStub(o oVar, androidx.car.app.o oVar2) {
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
        j.a(new k0(this.mLifecycle, new f(this, f7, f10, 0), "onClick", 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onFling(float f7, float f10) {
        j.a(new k0(this.mLifecycle, new f(this, f7, f10, 2), "onFling", 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScale(final float f7, final float f10, final float f11) {
        j.a(new k0(this.mLifecycle, new c() { // from class: androidx.car.app.utils.h
            @Override // androidx.car.app.utils.c
            public final Object a() {
                Object lambda$onScale$6;
                lambda$onScale$6 = RemoteUtils$SurfaceCallbackStub.this.lambda$onScale$6(f7, f10, f11);
                return lambda$onScale$6;
            }
        }, "onScale", 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScroll(float f7, float f10) {
        j.a(new k0(this.mLifecycle, new f(this, f7, f10, 1), "onScroll", 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        i.c(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new g(this, rect, 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceAvailable(w.b bVar, IOnDoneCallback iOnDoneCallback) {
        i.c(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new e(this, bVar, 1));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceDestroyed(w.b bVar, IOnDoneCallback iOnDoneCallback) {
        i.c(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new e(this, bVar, 0));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        i.c(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new g(this, rect, 0));
    }
}
