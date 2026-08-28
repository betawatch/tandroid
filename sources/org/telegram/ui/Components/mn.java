package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ mn(tn tnVar, int i9) {
        this.a = i9;
        this.b = tnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tn tnVar = this.b;
                AtomicReference atomicReference = tnVar.n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    tnVar.removeView(h5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                tn tnVar2 = this.b;
                AtomicReference atomicReference2 = tnVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    tnVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!tnVar2.b) {
                        tnVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                tn tnVar3 = this.b;
                tnVar3.f0 = false;
                tnVar3.d0.c(false);
                if (tnVar3.a()) {
                    tnVar3.f();
                    break;
                }
                break;
        }
    }
}
