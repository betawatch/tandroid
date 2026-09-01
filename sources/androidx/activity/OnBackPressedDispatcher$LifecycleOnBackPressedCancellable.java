package androidx.activity;

import androidx.fragment.app.a0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements androidx.lifecycle.r, c {
    public final androidx.lifecycle.o a;
    public final a0 b;
    public v c;
    public final /* synthetic */ x d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(x xVar, androidx.lifecycle.o oVar, a0 onBackPressedCallback) {
        kotlin.jvm.internal.j.e(onBackPressedCallback, "onBackPressedCallback");
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
        a0 onBackPressedCallback = this.b;
        kotlin.jvm.internal.j.e(onBackPressedCallback, "onBackPressedCallback");
        xVar.b.addLast(onBackPressedCallback);
        v vVar2 = new v(xVar, onBackPressedCallback);
        onBackPressedCallback.b.add(vVar2);
        xVar.d();
        onBackPressedCallback.c = new w(0, xVar, x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.c = vVar2;
    }
}
