package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class cq0 implements org.telegram.ui.Components.c5, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq0 b;

    public /* synthetic */ cq0(kq0 kq0Var, int i10) {
        this.a = i10;
        this.b = kq0Var;
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
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

    @Override // org.telegram.ui.ActionBar.n1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        kq0 kq0Var = this.b;
        kq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = kq0Var.I) != null && p1Var.isShowing()) {
            kq0Var.I.d(true);
        }
    }
}
