package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class o80 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w80 b;

    public /* synthetic */ o80(w80 w80Var, int i10) {
        this.a = i10;
        this.b = w80Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                v80 v80Var = this.b.r;
                if (v80Var != null) {
                    v80Var.j();
                    break;
                }
                break;
            default:
                v80 v80Var2 = this.b.r;
                if (v80Var2 != null) {
                    v80Var2.c();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        w80 w80Var = this.b;
        w80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && w80Var.s.isShowing()) {
            w80Var.s.d(true);
        }
    }
}
