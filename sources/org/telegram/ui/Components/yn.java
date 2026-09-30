package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ go b;

    public /* synthetic */ yn(go goVar, int i10) {
        this.a = i10;
        this.b = goVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                go goVar = this.b;
                AtomicReference atomicReference = goVar.n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    goVar.removeView(h5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                go goVar2 = this.b;
                AtomicReference atomicReference2 = goVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    goVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!goVar2.b) {
                        goVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                go goVar3 = this.b;
                goVar3.j0 = false;
                goVar3.h0.c(false);
                if (goVar3.a()) {
                    goVar3.f();
                    break;
                }
                break;
        }
    }
}
