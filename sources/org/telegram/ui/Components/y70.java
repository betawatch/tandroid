package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y70 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g80 b;

    public /* synthetic */ y70(g80 g80Var, int i7) {
        this.a = i7;
        this.b = g80Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                f80 f80Var = this.b.r;
                if (f80Var != null) {
                    f80Var.i();
                    break;
                }
                break;
            default:
                f80 f80Var2 = this.b.r;
                if (f80Var2 != null) {
                    f80Var2.e();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        g80 g80Var = this.b;
        g80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && g80Var.s.isShowing()) {
            g80Var.s.d(true);
        }
    }
}
