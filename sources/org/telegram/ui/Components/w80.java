package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w80 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e90 b;

    public /* synthetic */ w80(e90 e90Var, int i10) {
        this.a = i10;
        this.b = e90Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                d90 d90Var = this.b.r;
                if (d90Var != null) {
                    d90Var.k();
                    break;
                }
                break;
            default:
                d90 d90Var2 = this.b.r;
                if (d90Var2 != null) {
                    d90Var2.e();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void p(KeyEvent keyEvent) {
        e90 e90Var = this.b;
        e90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && e90Var.s.isShowing()) {
            e90Var.s.d(true);
        }
    }
}
