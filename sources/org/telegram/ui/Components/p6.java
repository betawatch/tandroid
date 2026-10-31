package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p6 implements org.telegram.ui.ActionBar.o0, ik0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;

    public /* synthetic */ p6(w7 w7Var, int i10) {
        this.a = i10;
        this.b = w7Var;
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        w7 w7Var = this.b;
        if (!z10) {
            w7Var.getClass();
            return false;
        }
        if (w7Var.O0()) {
            return false;
        }
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        w7Var.X0(wVar, wVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void k(int i10) {
        switch (this.a) {
            case 0:
                w7 w7Var = this.b;
                w7Var.getClass();
                if (i10 >= 0) {
                    float[] fArr = w7.Q2;
                    if (i10 < 6) {
                        MediaController.B().m0(true, fArr[i10]);
                        w7Var.a1(true);
                        break;
                    }
                }
                break;
            case 1:
                w7 w7Var2 = this.b;
                if (i10 == 1 || i10 == 2) {
                    boolean z10 = org.telegram.messenger.tz.O0;
                    if ((z10 && i10 == 1) || (org.telegram.messenger.tz.N0 && i10 == 2)) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(i10);
                    }
                    w7Var2.q1.f();
                    if (z10 != org.telegram.messenger.tz.O0) {
                        w7Var2.o1.C0();
                        w7Var2.S0(false);
                    }
                } else if (i10 == 4) {
                    if (org.telegram.messenger.tz.S0 == 1) {
                        org.telegram.messenger.tz.E(0);
                    } else {
                        org.telegram.messenger.tz.E(1);
                    }
                } else if (org.telegram.messenger.tz.S0 == 2) {
                    org.telegram.messenger.tz.E(0);
                } else {
                    org.telegram.messenger.tz.E(2);
                }
                w7Var2.c1();
                break;
            default:
                this.b.P0(i10);
                break;
        }
    }
}
