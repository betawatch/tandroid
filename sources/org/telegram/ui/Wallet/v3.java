package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class v3 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ v3(b4 b4Var, int i7) {
        this.a = i7;
        this.b = b4Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                b4 b4Var = this.b;
                b4Var.C = f10;
                b4Var.a.invalidate();
                break;
            case 1:
                b4 b4Var2 = this.b;
                b4Var2.c0 = f10;
                org.telegram.ui.Cells.t0 t0Var = b4Var2.a;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                b4 b4Var3 = this.b;
                b4Var3.a0 = f10;
                org.telegram.ui.Cells.t0 t0Var2 = b4Var3.a;
                t0Var2.invalidate();
                if (t0Var2.getParent() instanceof View) {
                    ((View) t0Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
