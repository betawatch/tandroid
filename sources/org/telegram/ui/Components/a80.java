package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a80 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i80 b;

    public /* synthetic */ a80(i80 i80Var, int i10) {
        this.a = i10;
        this.b = i80Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                h80 h80Var = this.b.r;
                if (h80Var != null) {
                    h80Var.k();
                    break;
                }
                break;
            default:
                h80 h80Var2 = this.b.r;
                if (h80Var2 != null) {
                    h80Var2.c();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void k(KeyEvent keyEvent) {
        i80 i80Var = this.b;
        i80Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && i80Var.s.isShowing()) {
            i80Var.s.d(true);
        }
    }
}
