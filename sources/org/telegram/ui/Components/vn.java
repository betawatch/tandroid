package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ vn(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                co coVar = this.b;
                AtomicReference atomicReference = coVar.n;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) atomicReference.get();
                if (j5Var != null) {
                    coVar.removeView(j5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                co coVar2 = this.b;
                AtomicReference atomicReference2 = coVar2.v;
                org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
                if (j5Var2 != null) {
                    coVar2.removeView(j5Var2);
                    atomicReference2.set(null);
                    if (!coVar2.b) {
                        coVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                co coVar3 = this.b;
                coVar3.j0 = false;
                coVar3.h0.c(false);
                if (coVar3.a()) {
                    coVar3.f();
                    break;
                }
                break;
        }
    }
}
