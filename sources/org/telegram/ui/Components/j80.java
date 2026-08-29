package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j80 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r80 b;

    public /* synthetic */ j80(r80 r80Var, int i10) {
        this.a = i10;
        this.b = r80Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                q80 q80Var = this.b.r;
                if (q80Var != null) {
                    q80Var.k();
                    break;
                }
                break;
            default:
                q80 q80Var2 = this.b.r;
                if (q80Var2 != null) {
                    q80Var2.b();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void o(KeyEvent keyEvent) {
        r80 r80Var = this.b;
        r80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && r80Var.s.isShowing()) {
            r80Var.s.d(true);
        }
    }
}
