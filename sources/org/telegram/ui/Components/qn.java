package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ qn(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                AtomicReference atomicReference = xnVar.n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    xnVar.removeView(h5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                xn xnVar2 = this.b;
                AtomicReference atomicReference2 = xnVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    xnVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!xnVar2.b) {
                        xnVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                xn xnVar3 = this.b;
                xnVar3.f0 = false;
                xnVar3.d0.c(false);
                if (xnVar3.a()) {
                    xnVar3.f();
                    break;
                }
                break;
        }
    }
}
