package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q80 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y80 b;

    public /* synthetic */ q80(y80 y80Var, int i10) {
        this.a = i10;
        this.b = y80Var;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                x80 x80Var = this.b.r;
                if (x80Var != null) {
                    x80Var.k();
                    break;
                }
                break;
            default:
                x80 x80Var2 = this.b.r;
                if (x80Var2 != null) {
                    x80Var2.c();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        y80 y80Var = this.b;
        y80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && y80Var.s.isShowing()) {
            y80Var.s.d(true);
        }
    }
}
