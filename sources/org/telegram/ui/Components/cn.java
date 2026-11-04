package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;

    public /* synthetic */ cn(jn jnVar, int i3) {
        this.a = i3;
        this.b = jnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jn jnVar = this.b;
                AtomicReference atomicReference = jnVar.n;
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) atomicReference.get();
                if (k5Var != null) {
                    jnVar.removeView(k5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                jn jnVar2 = this.b;
                AtomicReference atomicReference2 = jnVar2.w;
                org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) atomicReference2.get();
                if (k5Var2 != null) {
                    jnVar2.removeView(k5Var2);
                    atomicReference2.set(null);
                    if (!jnVar2.b) {
                        jnVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                jn jnVar3 = this.b;
                jnVar3.k0 = false;
                jnVar3.i0.c(false);
                if (jnVar3.a()) {
                    jnVar3.f();
                    break;
                }
                break;
        }
    }
}
