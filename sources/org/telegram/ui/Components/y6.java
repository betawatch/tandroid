package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements org.telegram.ui.ActionBar.l0, sj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ y6(f8 f8Var, int i7) {
        this.a = i7;
        this.b = f8Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        f8 f8Var = this.b;
        if (!z10) {
            f8Var.getClass();
            return false;
        }
        if (f8Var.P0()) {
            return false;
        }
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        f8Var.Y0(wVar, wVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void g(int i7) {
        switch (this.a) {
            case 0:
                f8 f8Var = this.b;
                f8Var.getClass();
                if (i7 >= 0) {
                    float[] fArr = f8.U2;
                    if (i7 < 6) {
                        MediaController.B().m0(true, fArr[i7]);
                        f8Var.b1(true);
                        break;
                    }
                }
                break;
            case 1:
                f8 f8Var2 = this.b;
                if (i7 == 1 || i7 == 2) {
                    boolean z10 = org.telegram.messenger.cz.O0;
                    if ((z10 && i7 == 1) || (org.telegram.messenger.cz.N0 && i7 == 2)) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(i7);
                    }
                    f8Var2.u1.f();
                    if (z10 != org.telegram.messenger.cz.O0) {
                        f8Var2.s1.C0();
                        f8Var2.T0(false);
                    }
                } else if (i7 == 4) {
                    if (org.telegram.messenger.cz.S0 == 1) {
                        org.telegram.messenger.cz.E(0);
                    } else {
                        org.telegram.messenger.cz.E(1);
                    }
                } else if (org.telegram.messenger.cz.S0 == 2) {
                    org.telegram.messenger.cz.E(0);
                } else {
                    org.telegram.messenger.cz.E(2);
                }
                f8Var2.d1();
                break;
            default:
                this.b.Q0(i7);
                break;
        }
    }
}
