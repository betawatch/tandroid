package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn b;

    public /* synthetic */ dn(kn knVar, int i7) {
        this.a = i7;
        this.b = knVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kn knVar = this.b;
                AtomicReference atomicReference = knVar.n;
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get();
                if (k5Var != null) {
                    knVar.removeView(k5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                kn knVar2 = this.b;
                AtomicReference atomicReference2 = knVar2.w;
                org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) atomicReference2.get();
                if (k5Var2 != null) {
                    knVar2.removeView(k5Var2);
                    atomicReference2.set(null);
                    if (!knVar2.b) {
                        knVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                kn knVar3 = this.b;
                knVar3.j0 = false;
                knVar3.h0.c(false);
                if (knVar3.a()) {
                    knVar3.f();
                    break;
                }
                break;
        }
    }
}
