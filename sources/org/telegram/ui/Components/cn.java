package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;

    public /* synthetic */ cn(jn jnVar, int i7) {
        this.a = i7;
        this.b = jnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jn jnVar = this.b;
                AtomicReference atomicReference = jnVar.n;
                org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) atomicReference.get();
                if (m5Var != null) {
                    jnVar.removeView(m5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                jn jnVar2 = this.b;
                AtomicReference atomicReference2 = jnVar2.w;
                org.telegram.ui.ActionBar.m5 m5Var2 = (org.telegram.ui.ActionBar.m5) atomicReference2.get();
                if (m5Var2 != null) {
                    jnVar2.removeView(m5Var2);
                    atomicReference2.set(null);
                    if (!jnVar2.b) {
                        jnVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                jn jnVar3 = this.b;
                jnVar3.j0 = false;
                jnVar3.h0.c(false);
                if (jnVar3.a()) {
                    jnVar3.f();
                    break;
                }
                break;
        }
    }
}
