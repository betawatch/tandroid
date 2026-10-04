package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class zn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ho b;

    public /* synthetic */ zn(ho hoVar, int i10) {
        this.a = i10;
        this.b = hoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ho hoVar = this.b;
                AtomicReference atomicReference = hoVar.n;
                org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) atomicReference.get();
                if (i5Var != null) {
                    hoVar.removeView(i5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                ho hoVar2 = this.b;
                AtomicReference atomicReference2 = hoVar2.v;
                org.telegram.ui.ActionBar.i5 i5Var2 = (org.telegram.ui.ActionBar.i5) atomicReference2.get();
                if (i5Var2 != null) {
                    hoVar2.removeView(i5Var2);
                    atomicReference2.set(null);
                    if (!hoVar2.b) {
                        hoVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                ho hoVar3 = this.b;
                hoVar3.j0 = false;
                hoVar3.h0.c(false);
                if (hoVar3.a()) {
                    hoVar3.f();
                    break;
                }
                break;
        }
    }
}
