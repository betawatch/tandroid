package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo b;

    public /* synthetic */ ho(oo ooVar, int i10) {
        this.a = i10;
        this.b = ooVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oo ooVar = this.b;
                AtomicReference atomicReference = ooVar.n;
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) atomicReference.get();
                if (j5Var != null) {
                    ooVar.removeView(j5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                oo ooVar2 = this.b;
                AtomicReference atomicReference2 = ooVar2.v;
                org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
                if (j5Var2 != null) {
                    ooVar2.removeView(j5Var2);
                    atomicReference2.set(null);
                    if (!ooVar2.b) {
                        ooVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                oo ooVar3 = this.b;
                ooVar3.j0 = false;
                ooVar3.h0.c(false);
                if (ooVar3.a()) {
                    ooVar3.f();
                    break;
                }
                break;
        }
    }
}
