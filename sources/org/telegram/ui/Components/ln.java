package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ ln(sn snVar, int i7) {
        this.a = i7;
        this.b = snVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sn snVar = this.b;
                AtomicReference atomicReference = snVar.n;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) atomicReference.get();
                if (j5Var != null) {
                    snVar.removeView(j5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                sn snVar2 = this.b;
                AtomicReference atomicReference2 = snVar2.w;
                org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
                if (j5Var2 != null) {
                    snVar2.removeView(j5Var2);
                    atomicReference2.set(null);
                    if (!snVar2.b) {
                        snVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                sn snVar3 = this.b;
                snVar3.k0 = false;
                snVar3.i0.c(false);
                if (snVar3.a()) {
                    snVar3.f();
                    break;
                }
                break;
        }
    }
}
