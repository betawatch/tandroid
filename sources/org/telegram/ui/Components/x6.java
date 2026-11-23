package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements org.telegram.ui.ActionBar.l0, sj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;

    public /* synthetic */ x6(e8 e8Var, int i7) {
        this.a = i7;
        this.b = e8Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.w;
        e8 e8Var = this.b;
        if (!z10) {
            e8Var.getClass();
            return false;
        }
        if (e8Var.P0()) {
            return false;
        }
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        e8Var.Y0(wVar, wVar.getMessageObject());
        return true;
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void h(int i7) {
        switch (this.a) {
            case 0:
                e8 e8Var = this.b;
                e8Var.getClass();
                if (i7 >= 0) {
                    float[] fArr = e8.U2;
                    if (i7 < 6) {
                        MediaController.B().m0(true, fArr[i7]);
                        e8Var.b1(true);
                        break;
                    }
                }
                break;
            case 1:
                e8 e8Var2 = this.b;
                if (i7 == 1 || i7 == 2) {
                    boolean z10 = org.telegram.messenger.bz.O0;
                    if ((z10 && i7 == 1) || (org.telegram.messenger.bz.N0 && i7 == 2)) {
                        MediaController.B().l0(0);
                    } else {
                        MediaController.B().l0(i7);
                    }
                    e8Var2.u1.f();
                    if (z10 != org.telegram.messenger.bz.O0) {
                        e8Var2.s1.C0();
                        e8Var2.T0(false);
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
                e8Var2.d1();
                break;
            default:
                this.b.Q0(i7);
                break;
        }
    }
}
