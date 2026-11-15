package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class jm0 implements org.telegram.ui.Components.r4, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nm0 b;

    public /* synthetic */ jm0(nm0 nm0Var, int i7) {
        this.a = i7;
        this.b = nm0Var;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                nm0 nm0Var = this.b;
                nm0Var.a0(nm0Var.b, nm0Var.c, z10, i7);
                nm0Var.finishFragment();
                break;
            default:
                nm0 nm0Var2 = this.b;
                nm0Var2.a0(nm0Var2.b, nm0Var2.c, z10, i7);
                nm0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        nm0 nm0Var = this.b;
        nm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = nm0Var.J) != null && g1Var.isShowing()) {
            nm0Var.J.d(true);
        }
    }
}
