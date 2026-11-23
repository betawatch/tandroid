package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ag0 implements c5.h {
    public final /* synthetic */ org.telegram.ui.zu0 a;

    public ag0(org.telegram.ui.zu0 zu0Var) {
        this.a = zu0Var;
    }

    @Override // c5.h
    public final void a(int i7) {
        org.telegram.ui.zu0 zu0Var = this.a;
        int i10 = zu0Var.p1;
        boolean z10 = i7 >= i10;
        if (i7 != i10) {
            zu0Var.p1 = i7;
        }
        org.telegram.messenger.uo uoVar = zu0Var.T0;
        if (uoVar != null) {
            fg0 fg0Var = zu0Var.E0;
            uoVar.b(i7 - (fg0Var != null ? fg0Var.j() : 0), z10);
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        org.telegram.messenger.fc fcVar;
        org.telegram.ui.zu0 zu0Var = this.a;
        zu0Var.B(f10, i7);
        if (i10 == 0) {
            int k10 = zu0Var.E0.k(i7);
            zu0Var.getCurrentItemView();
            int childCount = zu0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = zu0Var.getChildAt(i11);
                if (childAt instanceof p9) {
                    fg0 fg0Var = zu0Var.E0;
                    int k11 = fg0Var.k(fg0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((p9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.u0;
                    if (k11 >= 0 && k11 < zu0Var.X0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.u0 = true;
                                imageReceiver.Q0(false);
                            }
                            org.telegram.messenger.fc fcVar2 = (org.telegram.messenger.fc) zu0Var.X0.get(k11);
                            if (fcVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(zu0Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = fcVar2.f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.K.c(new org.telegram.messenger.z4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            b6 m10 = imageReceiver.m();
                            if (m10 != null && (fcVar = (org.telegram.messenger.fc) zu0Var.X0.get(k11)) != null) {
                                m10.y(fcVar.j, false, true);
                            }
                            imageReceiver.u0 = false;
                            imageReceiver.R0();
                        }
                    }
                }
            }
        }
    }

    @Override // c5.h
    public final void c(int i7) {
    }
}
