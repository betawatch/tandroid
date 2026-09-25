package androidx.activity;

import androidx.fragment.app.b0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements androidx.lifecycle.r, c {
    public final androidx.lifecycle.o a;
    public final b0 b;
    public t c;
    public final /* synthetic */ v d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(v vVar, androidx.lifecycle.o oVar, b0 onBackPressedCallback) {
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        this.d = vVar;
        this.a = oVar;
        this.b = onBackPressedCallback;
        oVar.a(this);
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.a.b(this);
        this.b.b.remove(this);
        t tVar = this.c;
        if (tVar != null) {
            tVar.cancel();
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
                t tVar2 = this.c;
                if (tVar2 != null) {
                    tVar2.cancel();
                    return;
                }
                return;
            }
        }
        v vVar = this.d;
        vVar.getClass();
        b0 onBackPressedCallback = this.b;
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        vVar.b.addLast(onBackPressedCallback);
        t tVar3 = new t(vVar, onBackPressedCallback);
        onBackPressedCallback.b.add(tVar3);
        vVar.d();
        onBackPressedCallback.c = new u(0, vVar, v.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.c = tVar3;
    }
}
