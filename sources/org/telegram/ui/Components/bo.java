package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class bo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo b;

    public /* synthetic */ bo(jo joVar, int i10) {
        this.a = i10;
        this.b = joVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jo joVar = this.b;
                AtomicReference atomicReference = joVar.n;
                org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) atomicReference.get();
                if (l5Var != null) {
                    joVar.removeView(l5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                jo joVar2 = this.b;
                AtomicReference atomicReference2 = joVar2.v;
                org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) atomicReference2.get();
                if (l5Var2 != null) {
                    joVar2.removeView(l5Var2);
                    atomicReference2.set(null);
                    if (!joVar2.b) {
                        joVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                jo joVar3 = this.b;
                joVar3.j0 = false;
                joVar3.h0.c(false);
                if (joVar3.a()) {
                    joVar3.f();
                    break;
                }
                break;
        }
    }
}
