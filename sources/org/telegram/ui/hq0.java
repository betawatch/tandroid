package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qq0 b;

    public /* synthetic */ hq0(qq0 qq0Var, int i10) {
        this.a = i10;
        this.b = qq0Var;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                qq0 qq0Var = this.b;
                qq0Var.V(qq0Var.b, qq0Var.c, z10, i10);
                qq0Var.finishFragment();
                break;
            default:
                qq0 qq0Var2 = this.b;
                qq0Var2.V(qq0Var2.b, qq0Var2.c, z10, i10);
                qq0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        qq0 qq0Var = this.b;
        qq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = qq0Var.I) != null && m1Var.isShowing()) {
            qq0Var.I.d(true);
        }
    }
}
