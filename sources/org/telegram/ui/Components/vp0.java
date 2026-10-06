package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class vp0 implements li.l, r0.n, org.telegram.ui.ActionBar.l1, li.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ br0 b;

    public /* synthetic */ vp0(br0 br0Var, int i10) {
        this.a = i10;
        this.b = br0Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        br0 br0Var = this.b;
        br0Var.processLegacyContainerInsets(g10);
        i0.b f7 = l1Var.a.f(519);
        if (!br0Var.G0.equals(f7)) {
            br0Var.G0 = f7;
            br0Var.container.requestLayout();
        }
        return r0.l1.b;
    }

    @Override // li.m
    public int f() {
        br0 br0Var = this.b;
        br0Var.getClass();
        return br0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6);
    }

    @Override // li.l
    public void k(int i10) {
        br0.m(this.b, i10);
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        org.telegram.ui.ActionBar.n1 n1Var2;
        switch (this.a) {
            case 2:
                br0 br0Var = this.b;
                br0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = br0Var.J0) != null && n1Var.isShowing()) {
                    br0Var.J0.d(true);
                    break;
                }
                break;
            default:
                br0 br0Var2 = this.b;
                br0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var2 = br0Var2.J0) != null && n1Var2.isShowing()) {
                    br0Var2.J0.d(true);
                    break;
                }
                break;
        }
    }
}
