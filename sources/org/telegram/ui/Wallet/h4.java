package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h4 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4 b;

    public /* synthetic */ h4(n4 n4Var, int i7) {
        this.a = i7;
        this.b = n4Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                n4 n4Var = this.b;
                n4Var.C = f10;
                n4Var.a.invalidate();
                break;
            case 1:
                n4 n4Var2 = this.b;
                n4Var2.c0 = f10;
                org.telegram.ui.Cells.v0 v0Var = n4Var2.a;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                n4 n4Var3 = this.b;
                n4Var3.a0 = f10;
                org.telegram.ui.Cells.v0 v0Var2 = n4Var3.a;
                v0Var2.invalidate();
                if (v0Var2.getParent() instanceof View) {
                    ((View) v0Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
