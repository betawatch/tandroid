package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e70 implements org.telegram.ui.ActionBar.p1, org.telegram.ui.ActionBar.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m70 b;

    public /* synthetic */ e70(m70 m70Var, int i3) {
        this.a = i3;
        this.b = m70Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                l70 l70Var = this.b.r;
                if (l70Var != null) {
                    l70Var.i();
                    break;
                }
                break;
            default:
                l70 l70Var2 = this.b.r;
                if (l70Var2 != null) {
                    l70Var2.d();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d1
    public void k(KeyEvent keyEvent) {
        m70 m70Var = this.b;
        m70Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && m70Var.s.isShowing()) {
            m70Var.s.d(true);
        }
    }
}
