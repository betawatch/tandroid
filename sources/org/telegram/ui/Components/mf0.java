package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class mf0 implements c5.g {
    public final /* synthetic */ tf0 a;

    public mf0(tf0 tf0Var) {
        this.a = tf0Var;
    }

    @Override // c5.g
    public final void a(int i7) {
        tf0 tf0Var = this.a;
        int i10 = tf0Var.o1;
        boolean z9 = i7 >= i10;
        if (i7 != i10) {
            tf0Var.getClass();
            tf0Var.o1 = i7;
        }
        org.telegram.messenger.yo yoVar = tf0Var.S0;
        if (yoVar != null) {
            sf0 sf0Var = tf0Var.D0;
            yoVar.b(i7 - (sf0Var != null ? sf0Var.j() : 0), z9);
        }
    }

    @Override // c5.g
    public final void b(float f10, int i7, int i10) {
        org.telegram.messenger.hc hcVar;
        tf0 tf0Var = this.a;
        tf0Var.B(f10, i7);
        if (i10 == 0) {
            int k10 = tf0Var.D0.k(i7);
            if (tf0Var.i1) {
                k10--;
            }
            tf0Var.getCurrentItemView();
            int childCount = tf0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = tf0Var.getChildAt(i11);
                if (childAt instanceof l9) {
                    sf0 sf0Var = tf0Var.D0;
                    int k11 = sf0Var.k(sf0Var.d.indexOf(childAt));
                    if (tf0Var.i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((l9) childAt).getImageReceiver();
                    boolean z9 = imageReceiver.t0;
                    if (k11 >= 0 && k11 < tf0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!z9) {
                                imageReceiver.t0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.hc hcVar2 = (org.telegram.messenger.hc) tf0Var.W0.get(k11);
                            if (hcVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(tf0Var.L0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = hcVar2.f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.J.c(new org.telegram.messenger.x4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z9) {
                            v5 m10 = imageReceiver.m();
                            if (m10 != null && (hcVar = (org.telegram.messenger.hc) tf0Var.W0.get(k11)) != null) {
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
