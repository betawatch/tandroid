package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class of0 implements c5.h {
    public final /* synthetic */ vf0 a;

    public of0(vf0 vf0Var) {
        this.a = vf0Var;
    }

    @Override // c5.h
    public final void a(int i7) {
        vf0 vf0Var = this.a;
        int i10 = vf0Var.p1;
        boolean z10 = i7 >= i10;
        if (i7 != i10) {
            vf0Var.getClass();
            vf0Var.p1 = i7;
        }
        org.telegram.messenger.vo voVar = vf0Var.T0;
        if (voVar != null) {
            uf0 uf0Var = vf0Var.E0;
            voVar.b(i7 - (uf0Var != null ? uf0Var.j() : 0), z10);
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        org.telegram.messenger.gc gcVar;
        vf0 vf0Var = this.a;
        vf0Var.B(f10, i7);
        if (i10 == 0) {
            int k10 = vf0Var.E0.k(i7);
            if (vf0Var.j1) {
                k10--;
            }
            vf0Var.getCurrentItemView();
            int childCount = vf0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = vf0Var.getChildAt(i11);
                if (childAt instanceof i9) {
                    uf0 uf0Var = vf0Var.E0;
                    int k11 = uf0Var.k(uf0Var.d.indexOf(childAt));
                    if (vf0Var.j1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((i9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.u0;
                    if (k11 >= 0 && k11 < vf0Var.X0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.u0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.gc gcVar2 = (org.telegram.messenger.gc) vf0Var.X0.get(k11);
                            if (gcVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(vf0Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gcVar2.f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.K.c(new org.telegram.messenger.x4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            t5 m10 = imageReceiver.m();
                            if (m10 != null && (gcVar = (org.telegram.messenger.gc) vf0Var.X0.get(k11)) != null) {
                                m10.y(gcVar.j, false, true);
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
