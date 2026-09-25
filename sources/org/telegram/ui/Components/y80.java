package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y80 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g90 b;

    public /* synthetic */ y80(g90 g90Var, int i10) {
        this.a = i10;
        this.b = g90Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                f90 f90Var = this.b.r;
                if (f90Var != null) {
                    f90Var.k();
                    break;
                }
                break;
            default:
                f90 f90Var2 = this.b.r;
                if (f90Var2 != null) {
                    f90Var2.e();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void p(KeyEvent keyEvent) {
        g90 g90Var = this.b;
        g90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && g90Var.s.isShowing()) {
            g90Var.s.d(true);
        }
    }
}
