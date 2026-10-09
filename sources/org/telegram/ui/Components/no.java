package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class no implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uo b;

    public /* synthetic */ no(uo uoVar, int i10) {
        this.a = i10;
        this.b = uoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uo uoVar = this.b;
                AtomicReference atomicReference = uoVar.n;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) atomicReference.get();
                if (j5Var != null) {
                    uoVar.removeView(j5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                uo uoVar2 = this.b;
                AtomicReference atomicReference2 = uoVar2.v;
                org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
                if (j5Var2 != null) {
                    uoVar2.removeView(j5Var2);
                    atomicReference2.set(null);
                    if (!uoVar2.b) {
                        uoVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                uo uoVar3 = this.b;
                uoVar3.j0 = false;
                uoVar3.h0.c(false);
                if (uoVar3.a()) {
                    uoVar3.f();
                    break;
                }
                break;
        }
    }
}
