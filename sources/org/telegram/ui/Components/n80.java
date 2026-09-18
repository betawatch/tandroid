package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n80 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v80 b;

    public /* synthetic */ n80(v80 v80Var, int i10) {
        this.a = i10;
        this.b = v80Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                u80 u80Var = this.b.r;
                if (u80Var != null) {
                    u80Var.j();
                    break;
                }
                break;
            default:
                u80 u80Var2 = this.b.r;
                if (u80Var2 != null) {
                    u80Var2.c();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        v80 v80Var = this.b;
        v80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && v80Var.s.isShowing()) {
            v80Var.s.d(true);
        }
    }
}
