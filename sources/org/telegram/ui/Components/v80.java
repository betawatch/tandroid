package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class v80 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d90 b;

    public /* synthetic */ v80(d90 d90Var, int i10) {
        this.a = i10;
        this.b = d90Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                c90 c90Var = this.b.r;
                if (c90Var != null) {
                    c90Var.i();
                    break;
                }
                break;
            default:
                c90 c90Var2 = this.b.r;
                if (c90Var2 != null) {
                    c90Var2.e();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        d90 d90Var = this.b;
        d90Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && d90Var.s.isShowing()) {
            d90Var.s.d(true);
        }
    }
}
