package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n80 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v80 b;

    public /* synthetic */ n80(v80 v80Var, int i10) {
        this.a = i10;
        this.b = v80Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        v80 v80Var = this.b;
        v80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && v80Var.s.isShowing()) {
            v80Var.s.d(true);
        }
    }
}
