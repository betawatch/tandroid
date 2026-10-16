package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o90 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w90 b;

    public /* synthetic */ o90(w90 w90Var, int i10) {
        this.a = i10;
        this.b = w90Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                v90 v90Var = this.b.r;
                if (v90Var != null) {
                    v90Var.j();
                    break;
                }
                break;
            default:
                v90 v90Var2 = this.b.r;
                if (v90Var2 != null) {
                    v90Var2.d();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        w90 w90Var = this.b;
        w90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && w90Var.s.isShowing()) {
            w90Var.s.d(true);
        }
    }
}
