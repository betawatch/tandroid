package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i70 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q70 b;

    public /* synthetic */ i70(q70 q70Var, int i7) {
        this.a = i7;
        this.b = q70Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                p70 p70Var = this.b.r;
                if (p70Var != null) {
                    p70Var.k();
                    break;
                }
                break;
            default:
                p70 p70Var2 = this.b.r;
                if (p70Var2 != null) {
                    p70Var2.e();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        q70 q70Var = this.b;
        q70Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && q70Var.s.isShowing()) {
            q70Var.s.d(true);
        }
    }
}
