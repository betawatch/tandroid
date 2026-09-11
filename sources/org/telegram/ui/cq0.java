package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class cq0 implements org.telegram.ui.Components.d5, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq0 b;

    public /* synthetic */ cq0(kq0 kq0Var, int i10) {
        this.a = i10;
        this.b = kq0Var;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                kq0 kq0Var = this.b;
                kq0Var.V(kq0Var.b, kq0Var.c, z10, i10);
                kq0Var.finishFragment();
                break;
            default:
                kq0 kq0Var2 = this.b;
                kq0Var2.V(kq0Var2.b, kq0Var2.c, z10, i10);
                kq0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        kq0 kq0Var = this.b;
        kq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = kq0Var.I) != null && n1Var.isShowing()) {
            kq0Var.I.d(true);
        }
    }
}
