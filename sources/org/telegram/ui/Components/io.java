package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class io implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ po b;

    public /* synthetic */ io(po poVar, int i10) {
        this.a = i10;
        this.b = poVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                po poVar = this.b;
                AtomicReference atomicReference = poVar.n;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) atomicReference.get();
                if (b6Var != null) {
                    poVar.removeView(b6Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                po poVar2 = this.b;
                AtomicReference atomicReference2 = poVar2.v;
                org.telegram.ui.ActionBar.b6 b6Var2 = (org.telegram.ui.ActionBar.b6) atomicReference2.get();
                if (b6Var2 != null) {
                    poVar2.removeView(b6Var2);
                    atomicReference2.set(null);
                    if (!poVar2.b) {
                        poVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                po poVar3 = this.b;
                poVar3.j0 = false;
                poVar3.h0.c(false);
                if (poVar3.a()) {
                    poVar3.f();
                    break;
                }
                break;
        }
    }
}
