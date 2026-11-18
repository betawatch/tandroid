package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class zf0 implements c5.h {
    public final /* synthetic */ org.telegram.ui.av0 a;

    public zf0(org.telegram.ui.av0 av0Var) {
        this.a = av0Var;
    }

    @Override // c5.h
    public final void a(int i7) {
        org.telegram.ui.av0 av0Var = this.a;
        int i10 = av0Var.p1;
        boolean z10 = i7 >= i10;
        if (i7 != i10) {
            av0Var.p1 = i7;
        }
        org.telegram.messenger.uo uoVar = av0Var.T0;
        if (uoVar != null) {
            eg0 eg0Var = av0Var.E0;
            uoVar.b(i7 - (eg0Var != null ? eg0Var.j() : 0), z10);
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        org.telegram.messenger.fc fcVar;
        org.telegram.ui.av0 av0Var = this.a;
        av0Var.B(f10, i7);
        if (i10 == 0) {
            int k10 = av0Var.E0.k(i7);
            av0Var.getCurrentItemView();
            int childCount = av0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = av0Var.getChildAt(i11);
                if (childAt instanceof q9) {
                    eg0 eg0Var = av0Var.E0;
                    int k11 = eg0Var.k(eg0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((q9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.u0;
                    if (k11 >= 0 && k11 < av0Var.X0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.u0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.fc fcVar2 = (org.telegram.messenger.fc) av0Var.X0.get(k11);
                            if (fcVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(av0Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = fcVar2.f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.K.c(new org.telegram.messenger.z4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            b6 m10 = imageReceiver.m();
                            if (m10 != null && (fcVar = (org.telegram.messenger.fc) av0Var.X0.get(k11)) != null) {
                                m10.y(fcVar.j, false, true);
                            }
                            imageReceiver.u0 = false;
                            imageReceiver.Q0();
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
