package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ sn(zn znVar, int i7) {
        this.a = i7;
        this.b = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                AtomicReference atomicReference = znVar.n;
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) atomicReference.get();
                if (n5Var != null) {
                    znVar.removeView(n5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                zn znVar2 = this.b;
                AtomicReference atomicReference2 = znVar2.w;
                org.telegram.ui.ActionBar.n5 n5Var2 = (org.telegram.ui.ActionBar.n5) atomicReference2.get();
                if (n5Var2 != null) {
                    znVar2.removeView(n5Var2);
                    atomicReference2.set(null);
                    if (!znVar2.b) {
                        znVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                zn znVar3 = this.b;
                znVar3.k0 = false;
                znVar3.i0.c(false);
                if (znVar3.a()) {
                    znVar3.f();
                    break;
                }
                break;
        }
    }
}
