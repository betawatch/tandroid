package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class og0 implements z4.e {
    public final /* synthetic */ org.telegram.ui.kw0 a;

    public og0(org.telegram.ui.kw0 kw0Var) {
        this.a = kw0Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        org.telegram.ui.kw0 kw0Var = this.a;
        int i11 = kw0Var.o1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            kw0Var.o1 = i10;
        }
        org.telegram.messenger.dp dpVar = kw0Var.S0;
        if (dpVar != null) {
            tg0 tg0Var = kw0Var.D0;
            dpVar.b(i10 - (tg0Var != null ? tg0Var.j() : 0), z10);
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        org.telegram.messenger.ic icVar;
        org.telegram.ui.kw0 kw0Var = this.a;
        kw0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = kw0Var.D0.k(i10);
            kw0Var.getCurrentItemView();
            int childCount = kw0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = kw0Var.getChildAt(i12);
                if (childAt instanceof g9) {
                    tg0 tg0Var = kw0Var.D0;
                    int k11 = tg0Var.k(tg0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((g9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.t0;
                    if (k11 >= 0 && k11 < kw0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.t0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.ic icVar2 = (org.telegram.messenger.ic) kw0Var.W0.get(k11);
                            if (icVar2 != null) {
                                org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(kw0Var.L0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = icVar2.f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.b8.J.c(new org.telegram.messenger.t6(7, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            s5 m10 = imageReceiver.m();
                            if (m10 != null && (icVar = (org.telegram.messenger.ic) kw0Var.W0.get(k11)) != null) {
                                m10.y(icVar.j, false, true);
                            }
                            imageReceiver.t0 = false;
                            imageReceiver.Q0();
                        }
                    }
                }
            }
        }
    }

    @Override // z4.e
    public final void c(int i10) {
    }
}
