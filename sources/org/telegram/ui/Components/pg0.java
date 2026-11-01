package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class pg0 implements z4.e {
    public final /* synthetic */ org.telegram.ui.jw0 a;

    public pg0(org.telegram.ui.jw0 jw0Var) {
        this.a = jw0Var;
    }

    @Override // z4.e
    public final void a(int i10) {
        org.telegram.ui.jw0 jw0Var = this.a;
        int i11 = jw0Var.o1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            jw0Var.o1 = i10;
        }
        org.telegram.messenger.ep epVar = jw0Var.S0;
        if (epVar != null) {
            ug0 ug0Var = jw0Var.D0;
            epVar.b(i10 - (ug0Var != null ? ug0Var.j() : 0), z10);
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        org.telegram.messenger.jc jcVar;
        org.telegram.ui.jw0 jw0Var = this.a;
        jw0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = jw0Var.D0.k(i10);
            jw0Var.getCurrentItemView();
            int childCount = jw0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = jw0Var.getChildAt(i12);
                if (childAt instanceof g9) {
                    ug0 ug0Var = jw0Var.D0;
                    int k11 = ug0Var.k(ug0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((g9) childAt).getImageReceiver();
                    boolean z10 = imageReceiver.t0;
                    if (k11 >= 0 && k11 < jw0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!z10) {
                                imageReceiver.t0 = true;
                                imageReceiver.P0(false);
                            }
                            org.telegram.messenger.jc jcVar2 = (org.telegram.messenger.jc) jw0Var.W0.get(k11);
                            if (jcVar2 != null) {
                                org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(jw0Var.L0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = jcVar2.f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    org.telegram.messenger.b8.J.c(new org.telegram.messenger.t6(7, G, tL_fileLocationToBeDeprecated));
                                }
                            }
                        } else if (z10) {
                            s5 m10 = imageReceiver.m();
                            if (m10 != null && (jcVar = (org.telegram.messenger.jc) jw0Var.W0.get(k11)) != null) {
                                m10.y(jcVar.j, false, true);
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
