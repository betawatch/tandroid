package androidx.activity;

import androidx.fragment.app.a0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements androidx.lifecycle.r, c {
    public final androidx.lifecycle.o a;
    public final a0 b;
    public u c;
    public final /* synthetic */ w d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(w wVar, androidx.lifecycle.o oVar, a0 onBackPressedCallback) {
        kotlin.jvm.internal.j.e(onBackPressedCallback, "onBackPressedCallback");
        this.d = wVar;
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
        w wVar = this.d;
        wVar.getClass();
        a0 onBackPressedCallback = this.b;
        kotlin.jvm.internal.j.e(onBackPressedCallback, "onBackPressedCallback");
        wVar.b.addLast(onBackPressedCallback);
        u uVar2 = new u(wVar, onBackPressedCallback);
        onBackPressedCallback.b.add(uVar2);
        wVar.d();
        onBackPressedCallback.c = new v(0, wVar, w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.c = uVar2;
    }
}
