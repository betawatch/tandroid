package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ vn(co coVar, int i7) {
        this.a = i7;
        this.b = coVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                co coVar = this.b;
                AtomicReference atomicReference = coVar.n;
                org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) atomicReference.get();
                if (m5Var != null) {
                    coVar.removeView(m5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                co coVar2 = this.b;
                AtomicReference atomicReference2 = coVar2.w;
                org.telegram.ui.ActionBar.m5 m5Var2 = (org.telegram.ui.ActionBar.m5) atomicReference2.get();
                if (m5Var2 != null) {
                    coVar2.removeView(m5Var2);
                    atomicReference2.set(null);
                    if (!coVar2.b) {
                        coVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                co coVar3 = this.b;
                coVar3.k0 = false;
                coVar3.i0.c(false);
                if (coVar3.a()) {
                    coVar3.f();
                    break;
                }
                break;
        }
    }
}
