package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r6 implements org.telegram.ui.ActionBar.l0, ij0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;

    public /* synthetic */ r6(y7 y7Var, int i7) {
        this.a = i7;
        this.b = y7Var;
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        y7 y7Var = this.b;
        if (!z10) {
            y7Var.getClass();
            return false;
        }
        if (y7Var.O0()) {
            return false;
        }
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        y7Var.X0(wVar, wVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void g(int i7) {
        switch (this.a) {
            case 0:
                y7 y7Var = this.b;
                y7Var.getClass();
                if (i7 >= 0) {
                    float[] fArr = y7.U2;
                    if (i7 < 6) {
                        MediaController.B().m0(true, fArr[i7]);
                        y7Var.a1(true);
                        break;
                    }
                }
                break;
            case 1:
                y7 y7Var2 = this.b;
                if (i7 == 1 || i7 == 2) {
                    boolean z10 = org.telegram.messenger.gz.O0;
                    if ((z10 && i7 == 1) || (org.telegram.messenger.gz.N0 && i7 == 2)) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(i7);
                    }
                    y7Var2.u1.f();
                    if (z10 != org.telegram.messenger.gz.O0) {
                        y7Var2.s1.C0();
                        y7Var2.S0(false);
                    }
                } else if (i7 == 4) {
                    if (org.telegram.messenger.gz.S0 == 1) {
                        org.telegram.messenger.gz.E(0);
                    } else {
                        org.telegram.messenger.gz.E(1);
                    }
                } else if (org.telegram.messenger.gz.S0 == 2) {
                    org.telegram.messenger.gz.E(0);
                } else {
                    org.telegram.messenger.gz.E(2);
                }
                y7Var2.c1();
                break;
            default:
                this.b.P0(i7);
                break;
        }
    }
}
