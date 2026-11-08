package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w3 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ c4 b;

    public /* synthetic */ w3(c4 c4Var, int i7) {
        this.a = i7;
        this.b = c4Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                c4 c4Var = this.b;
                c4Var.C = f10;
                c4Var.a.invalidate();
                break;
            case 1:
                c4 c4Var2 = this.b;
                c4Var2.c0 = f10;
                org.telegram.ui.Cells.t0 t0Var = c4Var2.a;
                t0Var.invalidate();
                if (t0Var.getParent() instanceof View) {
                    ((View) t0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                c4 c4Var3 = this.b;
                c4Var3.a0 = f10;
                org.telegram.ui.Cells.t0 t0Var2 = c4Var3.a;
                t0Var2.invalidate();
                if (t0Var2.getParent() instanceof View) {
                    ((View) t0Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
