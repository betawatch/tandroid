package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g4 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4 b;

    public /* synthetic */ g4(m4 m4Var, int i7) {
        this.a = i7;
        this.b = m4Var;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                m4 m4Var = this.b;
                m4Var.C = f10;
                m4Var.a.invalidate();
                break;
            case 1:
                m4 m4Var2 = this.b;
                m4Var2.c0 = f10;
                org.telegram.ui.Cells.v0 v0Var = m4Var2.a;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                m4 m4Var3 = this.b;
                m4Var3.a0 = f10;
                org.telegram.ui.Cells.v0 v0Var2 = m4Var3.a;
                v0Var2.invalidate();
                if (v0Var2.getParent() instanceof View) {
                    ((View) v0Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
