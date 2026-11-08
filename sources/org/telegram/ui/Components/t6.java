package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t6 implements org.telegram.ui.ActionBar.m0, dj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;

    public /* synthetic */ t6(b8 b8Var, int i7) {
        this.a = i7;
        this.b = b8Var;
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        boolean z9 = view instanceof org.telegram.ui.Cells.w;
        b8 b8Var = this.b;
        if (!z9) {
            b8Var.getClass();
            return false;
        }
        if (b8Var.O0()) {
            return false;
        }
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        b8Var.X0(wVar, wVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void i(int i7) {
        switch (this.a) {
            case 0:
                b8 b8Var = this.b;
                b8Var.getClass();
                if (i7 >= 0) {
                    float[] fArr = b8.Q2;
                    if (i7 < 6) {
                        MediaController.B().m0(true, fArr[i7]);
                        b8Var.a1(true);
                        break;
                    }
                }
                break;
            case 1:
                b8 b8Var2 = this.b;
                if (i7 == 1 || i7 == 2) {
                    boolean z9 = org.telegram.messenger.iz.O0;
                    if ((z9 && i7 == 1) || (org.telegram.messenger.iz.N0 && i7 == 2)) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(i7);
                    }
                    b8Var2.q1.f();
                    if (z9 != org.telegram.messenger.iz.O0) {
                        b8Var2.o1.C0();
                        b8Var2.S0(false);
                    }
                } else if (i7 == 4) {
                    if (org.telegram.messenger.iz.S0 == 1) {
                        org.telegram.messenger.iz.E(0);
                    } else {
                        org.telegram.messenger.iz.E(1);
                    }
                } else if (org.telegram.messenger.iz.S0 == 2) {
                    org.telegram.messenger.iz.E(0);
                } else {
                    org.telegram.messenger.iz.E(2);
                }
                b8Var2.c1();
                break;
            default:
                this.b.P0(i7);
                break;
        }
    }
}
