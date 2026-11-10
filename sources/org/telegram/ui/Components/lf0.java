package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class lf0 implements c5.g {
    public final /* synthetic */ sf0 a;

    public lf0(sf0 sf0Var) {
        this.a = sf0Var;
    }

    @Override // c5.g
    public final void a(int i7) {
        sf0 sf0Var = this.a;
        int i10 = sf0Var.o1;
        boolean z9 = i7 >= i10;
        if (i7 != i10) {
            sf0Var.getClass();
            sf0Var.o1 = i7;
        }
        org.telegram.messenger.yo yoVar = sf0Var.S0;
        if (yoVar != null) {
            rf0 rf0Var = sf0Var.D0;
            yoVar.b(i7 - (rf0Var != null ? rf0Var.j() : 0), z9);
        }
    }

    @Override // c5.g
    public final void b(float f10, int i7, int i10) {
        org.telegram.messenger.hc hcVar;
        sf0 sf0Var = this.a;
        sf0Var.B(f10, i7);
        if (i10 == 0) {
            int k10 = sf0Var.D0.k(i7);
            if (sf0Var.i1) {
                k10--;
            }
            sf0Var.getCurrentItemView();
            int childCount = sf0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = sf0Var.getChildAt(i11);
                if (childAt instanceof k9) {
                    rf0 rf0Var = sf0Var.D0;
                    int k11 = rf0Var.k(rf0Var.d.indexOf(childAt));
                    if (sf0Var.i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((k9) childAt).getImageReceiver();
                    boolean z9 = imageReceiver.t0;
                    if (k11 >= 0 && k11 < sf0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!z9) {
                                imageReceiver.t0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.hc hcVar2 = (org.telegram.messenger.hc) sf0Var.W0.get(k11);
                            if (hcVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(sf0Var.L0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = hcVar2.f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.J.c(new org.telegram.messenger.x4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z9) {
                            u5 m10 = imageReceiver.m();
                            if (m10 != null && (hcVar = (org.telegram.messenger.hc) sf0Var.W0.get(k11)) != null) {
                                m10.y(hcVar.j, false, true);
                            }
                            imageReceiver.t0 = false;
                            imageReceiver.Q0();
                        }
                    }
                }
            }
        }
    }

    @Override // c5.g
    public final void c(int i7) {
    }
}
