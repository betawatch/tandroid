package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v70 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d80 b;

    public /* synthetic */ v70(d80 d80Var, int i7) {
        this.a = i7;
        this.b = d80Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                c80 c80Var = this.b.r;
                if (c80Var != null) {
                    c80Var.j();
                    break;
                }
                break;
            default:
                c80 c80Var2 = this.b.r;
                if (c80Var2 != null) {
                    c80Var2.e();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void m(KeyEvent keyEvent) {
        d80 d80Var = this.b;
        d80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && d80Var.s.isShowing()) {
            d80Var.s.d(true);
        }
    }
}
