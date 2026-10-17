package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e3 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ e3(k3 k3Var, int i10) {
        this.a = i10;
        this.b = k3Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                k3 k3Var = this.b;
                k3Var.C = f7;
                k3Var.a.invalidate();
                break;
            case 1:
                k3 k3Var2 = this.b;
                k3Var2.c0 = f7;
                org.telegram.ui.Cells.x0 x0Var = k3Var2.a;
                x0Var.invalidate();
                if (x0Var.getParent() instanceof View) {
                    ((View) x0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                k3 k3Var3 = this.b;
                k3Var3.a0 = f7;
                org.telegram.ui.Cells.x0 x0Var2 = k3Var3.a;
                x0Var2.invalidate();
                if (x0Var2.getParent() instanceof View) {
                    ((View) x0Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
