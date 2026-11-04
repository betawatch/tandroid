package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dm0 implements org.telegram.ui.Components.r4, org.telegram.ui.ActionBar.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hm0 b;

    public /* synthetic */ dm0(hm0 hm0Var, int i3) {
        this.a = i3;
        this.b = hm0Var;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                hm0 hm0Var = this.b;
                hm0Var.a0(hm0Var.b, hm0Var.c, z10, i3);
                hm0Var.finishFragment();
                break;
            default:
                hm0 hm0Var2 = this.b;
                hm0Var2.a0(hm0Var2.b, hm0Var2.c, z10, i3);
                hm0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        hm0 hm0Var = this.b;
        hm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var = hm0Var.J) != null && f1Var.isShowing()) {
            hm0Var.J.d(true);
        }
    }
}
