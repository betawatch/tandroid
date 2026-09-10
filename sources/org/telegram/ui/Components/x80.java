package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class x80 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f90 b;

    public /* synthetic */ x80(f90 f90Var, int i10) {
        this.a = i10;
        this.b = f90Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                e90 e90Var = this.b.r;
                if (e90Var != null) {
                    e90Var.j();
                    break;
                }
                break;
            default:
                e90 e90Var2 = this.b.r;
                if (e90Var2 != null) {
                    e90Var2.e();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void o(KeyEvent keyEvent) {
        f90 f90Var = this.b;
        f90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && f90Var.s.isShowing()) {
            f90Var.s.d(true);
        }
    }
}
