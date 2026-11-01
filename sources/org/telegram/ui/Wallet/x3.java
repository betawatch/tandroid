package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x3 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ x3(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
    }

    @Override // o1.g
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                d4 d4Var = this.b;
                d4Var.C = f7;
                d4Var.a.invalidate();
                break;
            case 1:
                d4 d4Var2 = this.b;
                d4Var2.c0 = f7;
                org.telegram.ui.Cells.s0 s0Var = d4Var2.a;
                s0Var.invalidate();
                if (s0Var.getParent() instanceof View) {
                    ((View) s0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                d4 d4Var3 = this.b;
                d4Var3.a0 = f7;
                org.telegram.ui.Cells.s0 s0Var2 = d4Var3.a;
                s0Var2.invalidate();
                if (s0Var2.getParent() instanceof View) {
                    ((View) s0Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
