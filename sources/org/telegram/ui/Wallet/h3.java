package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    public /* synthetic */ h3(n3 n3Var, int i10) {
        this.a = i10;
        this.b = n3Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                n3 n3Var = this.b;
                n3Var.C = f7;
                n3Var.a.invalidate();
                break;
            case 1:
                n3 n3Var2 = this.b;
                n3Var2.c0 = f7;
                org.telegram.ui.Cells.w0 w0Var = n3Var2.a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                n3 n3Var3 = this.b;
                n3Var3.a0 = f7;
                org.telegram.ui.Cells.w0 w0Var2 = n3Var3.a;
                w0Var2.invalidate();
                if (w0Var2.getParent() instanceof View) {
                    ((View) w0Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
