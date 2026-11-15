package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class l70 implements org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t70 b;

    public /* synthetic */ l70(t70 t70Var, int i7) {
        this.a = i7;
        this.b = t70Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                s70 s70Var = this.b.r;
                if (s70Var != null) {
                    s70Var.j();
                    break;
                }
                break;
            default:
                s70 s70Var2 = this.b.r;
                if (s70Var2 != null) {
                    s70Var2.e();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        t70 t70Var = this.b;
        t70Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && t70Var.s.isShowing()) {
            t70Var.s.d(true);
        }
    }
}
