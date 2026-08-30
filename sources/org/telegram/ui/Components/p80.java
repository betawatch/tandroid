package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p80 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x80 b;

    public /* synthetic */ p80(x80 x80Var, int i10) {
        this.a = i10;
        this.b = x80Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                w80 w80Var = this.b.r;
                if (w80Var != null) {
                    w80Var.j();
                    break;
                }
                break;
            default:
                w80 w80Var2 = this.b.r;
                if (w80Var2 != null) {
                    w80Var2.c();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        x80 x80Var = this.b;
        x80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && x80Var.s.isShowing()) {
            x80Var.s.d(true);
        }
    }
}
