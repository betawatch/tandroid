package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w70 implements org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.f1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e80 b;

    public /* synthetic */ w70(e80 e80Var, int i7) {
        this.a = i7;
        this.b = e80Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                d80 d80Var = this.b.r;
                if (d80Var != null) {
                    d80Var.i();
                    break;
                }
                break;
            default:
                d80 d80Var2 = this.b.r;
                if (d80Var2 != null) {
                    d80Var2.e();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f1
    public void j(KeyEvent keyEvent) {
        e80 e80Var = this.b;
        e80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && e80Var.s.isShowing()) {
            e80Var.s.d(true);
        }
    }
}
