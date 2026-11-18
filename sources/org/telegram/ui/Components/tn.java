package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ao b;

    public /* synthetic */ tn(ao aoVar, int i7) {
        this.a = i7;
        this.b = aoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ao aoVar = this.b;
                AtomicReference atomicReference = aoVar.n;
                org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) atomicReference.get();
                if (n5Var != null) {
                    aoVar.removeView(n5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                ao aoVar2 = this.b;
                AtomicReference atomicReference2 = aoVar2.w;
                org.telegram.ui.ActionBar.n5 n5Var2 = (org.telegram.ui.ActionBar.n5) atomicReference2.get();
                if (n5Var2 != null) {
                    aoVar2.removeView(n5Var2);
                    atomicReference2.set(null);
                    if (!aoVar2.b) {
                        aoVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                ao aoVar3 = this.b;
                aoVar3.k0 = false;
                aoVar3.i0.c(false);
                if (aoVar3.a()) {
                    aoVar3.f();
                    break;
                }
                break;
        }
    }
}
