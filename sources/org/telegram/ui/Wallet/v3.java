package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class v3 implements q1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ v3(b4 b4Var, int i3) {
        this.a = i3;
        this.b = b4Var;
    }

    @Override // q1.d
    public final void a(q1.g gVar, float f10, float f11) {
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
