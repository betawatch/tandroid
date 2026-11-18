package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements org.telegram.ui.ActionBar.m0, qj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;

    public /* synthetic */ x6(g8 g8Var, int i7) {
        this.a = i7;
        this.b = g8Var;
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        g8 g8Var = this.b;
        if (!z10) {
            g8Var.getClass();
            return false;
        }
        if (g8Var.P0()) {
            return false;
        }
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        g8Var.Y0(wVar, wVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void g(int i7) {
        switch (this.a) {
            case 0:
                g8 g8Var = this.b;
                g8Var.getClass();
                if (i7 >= 0) {
                    float[] fArr = g8.U2;
                    if (i7 < 6) {
                        MediaController.B().m0(true, fArr[i7]);
                        g8Var.b1(true);
                        break;
                    }
                }
                break;
            case 1:
                g8 g8Var2 = this.b;
                if (i7 == 1 || i7 == 2) {
                    boolean z10 = org.telegram.messenger.bz.O0;
                    if ((z10 && i7 == 1) || (org.telegram.messenger.bz.N0 && i7 == 2)) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(i7);
                    }
                    g8Var2.u1.f();
                    if (z10 != org.telegram.messenger.bz.O0) {
                        g8Var2.s1.C0();
                        g8Var2.T0(false);
                    }
                } else if (i7 == 4) {
                    if (org.telegram.messenger.bz.S0 == 1) {
                        org.telegram.messenger.bz.E(0);
                    } else {
                        org.telegram.messenger.bz.E(1);
                    }
                } else if (org.telegram.messenger.bz.S0 == 2) {
                    org.telegram.messenger.bz.E(0);
                } else {
                    org.telegram.messenger.bz.E(2);
                }
                g8Var2.d1();
                break;
            default:
                this.b.Q0(i7);
                break;
        }
    }
}
