package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ ln(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sn snVar = this.b;
                AtomicReference atomicReference = snVar.n;
                org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) atomicReference.get();
                if (u5Var != null) {
                    snVar.removeView(u5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                sn snVar2 = this.b;
                AtomicReference atomicReference2 = snVar2.w;
                org.telegram.ui.ActionBar.u5 u5Var2 = (org.telegram.ui.ActionBar.u5) atomicReference2.get();
                if (u5Var2 != null) {
                    snVar2.removeView(u5Var2);
                    atomicReference2.set(null);
                    if (!snVar2.b) {
                        snVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                sn snVar3 = this.b;
                snVar3.j0 = false;
                snVar3.h0.c(false);
                if (snVar3.a()) {
                    snVar3.f();
                    break;
                }
                break;
        }
    }
}
