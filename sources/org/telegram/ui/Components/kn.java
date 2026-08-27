package org.telegram.ui.Components;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ kn(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rn rnVar = this.b;
                AtomicReference atomicReference = rnVar.n;
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) atomicReference.get();
                if (h5Var != null) {
                    rnVar.removeView(h5Var);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                rn rnVar2 = this.b;
                AtomicReference atomicReference2 = rnVar2.v;
                org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
                if (h5Var2 != null) {
                    rnVar2.removeView(h5Var2);
                    atomicReference2.set(null);
                    if (!rnVar2.b) {
                        rnVar2.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                rn rnVar3 = this.b;
                rnVar3.f0 = false;
                rnVar3.d0.c(false);
                if (rnVar3.a()) {
                    rnVar3.f();
                    break;
                }
                break;
        }
    }
}
