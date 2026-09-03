package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ao b;

    public /* synthetic */ tn(ao aoVar, int i10) {
        this.a = i10;
        this.b = aoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ao aoVar = this.b;
                AtomicReference atomicReference = aoVar.n;
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) atomicReference.get();
                if (l5Var != null) {
                    aoVar.removeView(l5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                ao aoVar2 = this.b;
                AtomicReference atomicReference2 = aoVar2.v;
                org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) atomicReference2.get();
                if (l5Var2 != null) {
                    aoVar2.removeView(l5Var2);
                    atomicReference2.set(null);
                    if (!aoVar2.b) {
                        aoVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                ao aoVar3 = this.b;
                aoVar3.g0 = false;
                aoVar3.e0.c(false);
                if (aoVar3.a()) {
                    aoVar3.f();
                    break;
                }
                break;
        }
    }
}
