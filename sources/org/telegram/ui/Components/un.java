package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class un implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ un(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bo boVar = this.b;
                AtomicReference atomicReference = boVar.n;
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) atomicReference.get();
                if (l5Var != null) {
                    boVar.removeView(l5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                bo boVar2 = this.b;
                AtomicReference atomicReference2 = boVar2.v;
                org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) atomicReference2.get();
                if (l5Var2 != null) {
                    boVar2.removeView(l5Var2);
                    atomicReference2.set(null);
                    if (!boVar2.b) {
                        boVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                bo boVar3 = this.b;
                boVar3.g0 = false;
                boVar3.e0.c(false);
                if (boVar3.a()) {
                    boVar3.f();
                    break;
                }
                break;
        }
    }
}
