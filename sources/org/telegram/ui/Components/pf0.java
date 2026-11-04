package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pf0 implements b5.h {
    public final /* synthetic */ org.telegram.ui.ru0 a;

    public pf0(org.telegram.ui.ru0 ru0Var) {
        this.a = ru0Var;
    }

    @Override // b5.h
    public final void a(int i3) {
        org.telegram.ui.ru0 ru0Var = this.a;
        int i10 = ru0Var.p1;
        boolean z10 = i3 >= i10;
        if (i3 != i10) {
            ru0Var.p1 = i3;
        }
        org.telegram.messenger.po poVar = ru0Var.T0;
        if (poVar != null) {
            uf0 uf0Var = ru0Var.E0;
            poVar.b(i3 - (uf0Var != null ? uf0Var.j() : 0), z10);
        }
    }

    @Override // b5.h
    public final void b(float f10, int i3, int i10) {
        org.telegram.messenger.ac acVar;
        org.telegram.ui.ru0 ru0Var = this.a;
        ru0Var.B(f10, i3);
        if (i10 == 0) {
            int k10 = ru0Var.E0.k(i3);
            ru0Var.getCurrentItemView();
            int childCount = ru0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ru0Var.getChildAt(i11);
                if (childAt instanceof k9) {
                    uf0 uf0Var = ru0Var.E0;
                    int k11 = uf0Var.k(uf0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((k9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.u0;
                    if (k11 >= 0 && k11 < ru0Var.X0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.u0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.ac acVar2 = (org.telegram.messenger.ac) ru0Var.X0.get(k11);
                            if (acVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(ru0Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = acVar2.f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.K.c(new org.telegram.messenger.y4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            t5 m10 = imageReceiver.m();
                            if (m10 != null && (acVar = (org.telegram.messenger.ac) ru0Var.X0.get(k11)) != null) {
                                m10.y(acVar.j, false, true);
                            }
                            imageReceiver.u0 = false;
                            imageReceiver.Q0();
                        }
                    }
                }
            }
        }
    }

    @Override // b5.h
    public final void c(int i3) {
    }
}
