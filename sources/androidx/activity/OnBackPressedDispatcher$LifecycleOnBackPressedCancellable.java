package androidx.activity;

import androidx.fragment.app.z;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements androidx.lifecycle.r, c {
    public final androidx.lifecycle.o a;
    public final z b;
    public v c;
    public final /* synthetic */ x d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(x xVar, androidx.lifecycle.o oVar, z onBackPressedCallback) {
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        this.d = xVar;
        this.a = oVar;
        this.b = onBackPressedCallback;
        oVar.a(this);
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.a.b(this);
        this.b.b.remove(this);
        v vVar = this.c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.c = null;
    }

    @Override // androidx.lifecycle.r
    public final void d(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
        if (mVar != androidx.lifecycle.m.ON_START) {
            if (mVar != androidx.lifecycle.m.ON_STOP) {
                if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                v vVar = this.c;
                if (vVar != null) {
                    vVar.cancel();
                    return;
                }
                return;
            }
        }
        x xVar = this.d;
        xVar.getClass();
        z onBackPressedCallback = this.b;
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        xVar.b.addLast(onBackPressedCallback);
        v vVar2 = new v(xVar, onBackPressedCallback);
        onBackPressedCallback.b.add(vVar2);
        xVar.d();
        onBackPressedCallback.c = new w(0, xVar, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.c = vVar2;
    }
}
