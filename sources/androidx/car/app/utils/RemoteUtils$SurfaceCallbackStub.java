package androidx.car.app.utils;

import aa.r;
import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;
import androidx.lifecycle.o;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    private final o mLifecycle;
    private final androidx.car.app.o mSurfaceCallback;

    public RemoteUtils$SurfaceCallbackStub(o oVar, androidx.car.app.o oVar2) {
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
        i.a(new r((Object) this.mLifecycle, (Object) new e(this, f10, f11, 0), "onClick", 3));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onFling(float f10, float f11) {
        i.a(new r((Object) this.mLifecycle, (Object) new e(this, f10, f11, 2), "onFling", 3));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScale(final float f10, final float f11, final float f12) {
        i.a(new r((Object) this.mLifecycle, (Object) new b() { // from class: androidx.car.app.utils.g
            @Override // androidx.car.app.utils.b
            public final Object a() {
                Object lambda$onScale$6;
                lambda$onScale$6 = RemoteUtils$SurfaceCallbackStub.this.lambda$onScale$6(f10, f11, f12);
                return lambda$onScale$6;
            }
        }, "onScale", 3));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScroll(float f10, float f11) {
        i.a(new r((Object) this.mLifecycle, (Object) new e(this, f10, f11, 1), "onScroll", 3));
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
