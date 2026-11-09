package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class km0 implements org.telegram.ui.Components.t4, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ om0 b;

    public /* synthetic */ km0(om0 om0Var, int i7) {
        this.a = i7;
        this.b = om0Var;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 0:
                om0 om0Var = this.b;
                om0Var.a0(om0Var.b, om0Var.c, z9, i7);
                om0Var.finishFragment();
                break;
            default:
                om0 om0Var2 = this.b;
                om0Var2.a0(om0Var2.b, om0Var2.c, z9, i7);
                om0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        om0 om0Var = this.b;
        om0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = om0Var.I) != null && g1Var.isShowing()) {
            om0Var.I.d(true);
        }
    }
}
