package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j70 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r70 b;

    public /* synthetic */ j70(r70 r70Var, int i7) {
        this.a = i7;
        this.b = r70Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                q70 q70Var = this.b.r;
                if (q70Var != null) {
                    q70Var.k();
                    break;
                }
                break;
            default:
                q70 q70Var2 = this.b.r;
                if (q70Var2 != null) {
                    q70Var2.e();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        r70 r70Var = this.b;
        r70Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && r70Var.s.isShowing()) {
            r70Var.s.d(true);
        }
    }
}
