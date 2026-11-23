package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ag0 implements c5.h {
    public final /* synthetic */ hg0 a;

    public ag0(hg0 hg0Var) {
        this.a = hg0Var;
    }

    @Override // c5.h
    public final void a(int i7) {
        hg0 hg0Var = this.a;
        int i10 = hg0Var.p1;
        boolean z10 = i7 >= i10;
        if (i7 != i10) {
            hg0Var.getClass();
            hg0Var.p1 = i7;
        }
        org.telegram.messenger.vo voVar = hg0Var.T0;
        if (voVar != null) {
            gg0 gg0Var = hg0Var.E0;
            voVar.b(i7 - (gg0Var != null ? gg0Var.j() : 0), z10);
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        org.telegram.messenger.gc gcVar;
        hg0 hg0Var = this.a;
        hg0Var.B(f10, i7);
        if (i10 == 0) {
            int k10 = hg0Var.E0.k(i7);
            if (hg0Var.j1) {
                k10--;
            }
            hg0Var.getCurrentItemView();
            int childCount = hg0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = hg0Var.getChildAt(i11);
                if (childAt instanceof q9) {
                    gg0 gg0Var = hg0Var.E0;
                    int k11 = gg0Var.k(gg0Var.d.indexOf(childAt));
                    if (hg0Var.j1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((q9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.u0;
                    if (k11 >= 0 && k11 < hg0Var.X0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.u0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.gc gcVar2 = (org.telegram.messenger.gc) hg0Var.X0.get(k11);
                            if (gcVar2 != null) {
                                org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(hg0Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gcVar2.f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.w7.K.c(new org.telegram.messenger.z4(9, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            c6 m10 = imageReceiver.m();
                            if (m10 != null && (gcVar = (org.telegram.messenger.gc) hg0Var.X0.get(k11)) != null) {
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
