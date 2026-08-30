package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ sn(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                AtomicReference atomicReference = znVar.n;
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get();
                if (k5Var != null) {
                    znVar.removeView(k5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                zn znVar2 = this.b;
                AtomicReference atomicReference2 = znVar2.v;
                org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) atomicReference2.get();
                if (k5Var2 != null) {
                    znVar2.removeView(k5Var2);
                    atomicReference2.set(null);
                    if (!znVar2.b) {
                        znVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                zn znVar3 = this.b;
                znVar3.g0 = false;
                znVar3.e0.c(false);
                if (znVar3.a()) {
                    znVar3.f();
                    break;
                }
                break;
        }
    }
}
