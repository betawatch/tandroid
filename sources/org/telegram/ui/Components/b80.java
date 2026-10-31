package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b80 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j80 b;

    public /* synthetic */ b80(j80 j80Var, int i10) {
        this.a = i10;
        this.b = j80Var;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                i80 i80Var = this.b.r;
                if (i80Var != null) {
                    i80Var.n();
                    break;
                }
                break;
            default:
                i80 i80Var2 = this.b.r;
                if (i80Var2 != null) {
                    i80Var2.d();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public void r(KeyEvent keyEvent) {
        j80 j80Var = this.b;
        j80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && j80Var.s.isShowing()) {
            j80Var.s.d(true);
        }
    }
}
