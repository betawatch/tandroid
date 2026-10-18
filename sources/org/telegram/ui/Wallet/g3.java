package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    public /* synthetic */ g3(m3 m3Var, int i10) {
        this.a = i10;
        this.b = m3Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                m3 m3Var = this.b;
                m3Var.C = f7;
                m3Var.a.invalidate();
                break;
            case 1:
                m3 m3Var2 = this.b;
                m3Var2.c0 = f7;
                org.telegram.ui.Cells.w0 w0Var = m3Var2.a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                m3 m3Var3 = this.b;
                m3Var3.a0 = f7;
                org.telegram.ui.Cells.w0 w0Var2 = m3Var3.a;
                w0Var2.invalidate();
                if (w0Var2.getParent() instanceof View) {
                    ((View) w0Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
