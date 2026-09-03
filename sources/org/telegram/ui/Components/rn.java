package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ rn(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yn ynVar = this.b;
                AtomicReference atomicReference = ynVar.n;
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get();
                if (k5Var != null) {
                    ynVar.removeView(k5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                yn ynVar2 = this.b;
                AtomicReference atomicReference2 = ynVar2.v;
                org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) atomicReference2.get();
                if (k5Var2 != null) {
                    ynVar2.removeView(k5Var2);
                    atomicReference2.set(null);
                    if (!ynVar2.b) {
                        ynVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                yn ynVar3 = this.b;
                ynVar3.g0 = false;
                ynVar3.e0.c(false);
                if (ynVar3.a()) {
                    ynVar3.f();
                    break;
                }
                break;
        }
    }
}
