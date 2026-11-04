package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r6 implements org.telegram.ui.ActionBar.l0, hj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7 b;

    public /* synthetic */ r6(z7 z7Var, int i3) {
        this.a = i3;
        this.b = z7Var;
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        z7 z7Var = this.b;
        if (!z10) {
            z7Var.getClass();
            return false;
        }
        if (z7Var.O0()) {
            return false;
        }
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        z7Var.X0(wVar, wVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void i(int i3) {
        switch (this.a) {
            case 0:
                z7 z7Var = this.b;
                z7Var.getClass();
                if (i3 >= 0) {
                    float[] fArr = z7.R2;
                    if (i3 < 6) {
                        MediaController.B().m0(true, fArr[i3]);
                        z7Var.a1(true);
                        break;
                    }
                }
                break;
            case 1:
                z7 z7Var2 = this.b;
                if (i3 == 1 || i3 == 2) {
                    boolean z10 = org.telegram.messenger.az.O0;
                    if ((z10 && i3 == 1) || (org.telegram.messenger.az.N0 && i3 == 2)) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(i3);
                    }
                    z7Var2.r1.f();
                    if (z10 != org.telegram.messenger.az.O0) {
                        z7Var2.p1.C0();
                        z7Var2.S0(false);
                    }
                } else if (i3 == 4) {
                    if (org.telegram.messenger.az.S0 == 1) {
                        org.telegram.messenger.az.E(0);
                    } else {
                        org.telegram.messenger.az.E(1);
                    }
                } else if (org.telegram.messenger.az.S0 == 2) {
                    org.telegram.messenger.az.E(0);
                } else {
                    org.telegram.messenger.az.E(2);
                }
                z7Var2.c1();
                break;
            default:
                this.b.P0(i3);
                break;
        }
    }
}
