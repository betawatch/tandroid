package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z2 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;

    public /* synthetic */ z2(e3 e3Var, int i10) {
        this.a = i10;
        this.b = e3Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                e3 e3Var = this.b;
                e3Var.C = f7;
                e3Var.a.invalidate();
                break;
            case 1:
                e3 e3Var2 = this.b;
                e3Var2.c0 = f7;
                org.telegram.ui.Cells.w0 w0Var = e3Var2.a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                e3 e3Var3 = this.b;
                e3Var3.a0 = f7;
                org.telegram.ui.Cells.w0 w0Var2 = e3Var3.a;
                w0Var2.invalidate();
                if (w0Var2.getParent() instanceof View) {
                    ((View) w0Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
