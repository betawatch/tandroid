package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ x3(d4 d4Var, int i7) {
        this.a = i7;
        this.b = d4Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                d4 d4Var = this.b;
                d4Var.C = f10;
                d4Var.a.invalidate();
                break;
            case 1:
                d4 d4Var2 = this.b;
                d4Var2.c0 = f10;
                org.telegram.ui.Cells.t0 t0Var = d4Var2.a;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                d4 d4Var3 = this.b;
                d4Var3.a0 = f10;
                org.telegram.ui.Cells.t0 t0Var2 = d4Var3.a;
                t0Var2.invalidate();
                if (t0Var2.getParent() instanceof View) {
                    ((View) t0Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
