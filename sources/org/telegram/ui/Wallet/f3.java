package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3 b;

    public /* synthetic */ f3(l3 l3Var, int i10) {
        this.a = i10;
        this.b = l3Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                l3 l3Var = this.b;
                l3Var.C = f7;
                l3Var.a.invalidate();
                break;
            case 1:
                l3 l3Var2 = this.b;
                l3Var2.c0 = f7;
                org.telegram.ui.Cells.w0 w0Var = l3Var2.a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                l3 l3Var3 = this.b;
                l3Var3.a0 = f7;
                org.telegram.ui.Cells.w0 w0Var2 = l3Var3.a;
                w0Var2.invalidate();
                if (w0Var2.getParent() instanceof View) {
                    ((View) w0Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
