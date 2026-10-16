package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro b;

    public /* synthetic */ ko(ro roVar, int i10) {
        this.a = i10;
        this.b = roVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ro roVar = this.b;
                AtomicReference atomicReference = roVar.n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    roVar.removeView(h5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                ro roVar2 = this.b;
                AtomicReference atomicReference2 = roVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    roVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!roVar2.b) {
                        roVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                ro roVar3 = this.b;
                roVar3.j0 = false;
                roVar3.h0.c(false);
                if (roVar3.a()) {
                    roVar3.f();
                    break;
                }
                break;
        }
    }
}
