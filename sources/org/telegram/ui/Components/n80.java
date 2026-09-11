package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class n80 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w80 b;

    public /* synthetic */ n80(w80 w80Var, int i10) {
        this.a = i10;
        this.b = w80Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
    public void n(KeyEvent keyEvent) {
        w80 w80Var = this.b;
        w80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && w80Var.s.isShowing()) {
            w80Var.s.d(true);
        }
    }
}
