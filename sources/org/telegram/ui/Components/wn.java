package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ wn(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eo eoVar = this.b;
                AtomicReference atomicReference = eoVar.n;
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get();
                if (k5Var != null) {
                    eoVar.removeView(k5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                eo eoVar2 = this.b;
                AtomicReference atomicReference2 = eoVar2.v;
                org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) atomicReference2.get();
                if (k5Var2 != null) {
                    eoVar2.removeView(k5Var2);
                    atomicReference2.set(null);
                    if (!eoVar2.b) {
                        eoVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                eo eoVar3 = this.b;
                eoVar3.j0 = false;
                eoVar3.h0.c(false);
                if (eoVar3.a()) {
                    eoVar3.f();
                    break;
                }
                break;
        }
    }
}
