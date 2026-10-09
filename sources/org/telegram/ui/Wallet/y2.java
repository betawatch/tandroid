package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;

    public /* synthetic */ y2(d3 d3Var, int i10) {
        this.a = i10;
        this.b = d3Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                d3 d3Var = this.b;
                d3Var.C = f7;
                d3Var.a.invalidate();
                break;
            case 1:
                d3 d3Var2 = this.b;
                d3Var2.c0 = f7;
                org.telegram.ui.Cells.w0 w0Var = d3Var2.a;
                w0Var.invalidate();
                if (w0Var.getParent() instanceof View) {
                    ((View) w0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                d3 d3Var3 = this.b;
                d3Var3.a0 = f7;
                org.telegram.ui.Cells.w0 w0Var2 = d3Var3.a;
                w0Var2.invalidate();
                if (w0Var2.getParent() instanceof View) {
                    ((View) w0Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
