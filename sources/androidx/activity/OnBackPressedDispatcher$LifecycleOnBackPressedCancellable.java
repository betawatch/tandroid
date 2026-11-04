package androidx.activity;

import androidx.fragment.app.a0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements androidx.lifecycle.r, c {
    public final androidx.lifecycle.o a;
    public final a0 b;
    public u c;
    public final /* synthetic */ v d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(v vVar, androidx.lifecycle.o oVar, a0 onBackPressedCallback) {
        kotlin.jvm.internal.j.e(onBackPressedCallback, "onBackPressedCallback");
        this.d = vVar;
        this.a = oVar;
        this.b = onBackPressedCallback;
        oVar.a(this);
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.a.b(this);
        this.b.b.remove(this);
        u uVar = this.c;
        if (uVar != null) {
            uVar.cancel();
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
                u uVar = this.c;
                if (uVar != null) {
                    uVar.cancel();
                    return;
                }
                return;
            }
        }
        v vVar = this.d;
        vVar.getClass();
        a0 onBackPressedCallback = this.b;
        kotlin.jvm.internal.j.e(onBackPressedCallback, "onBackPressedCallback");
        vVar.b.addLast(onBackPressedCallback);
        u uVar2 = new u(vVar, onBackPressedCallback);
        onBackPressedCallback.b.add(uVar2);
        vVar.d();
        onBackPressedCallback.c = new aa.e(0, vVar, v.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 4);
        this.c = uVar2;
    }
}
