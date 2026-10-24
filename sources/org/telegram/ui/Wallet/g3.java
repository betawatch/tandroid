package org.telegram.ui.Wallet;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                org.telegram.ui.Cells.v0 v0Var = m3Var2.a;
                v0Var.invalidate();
                if (v0Var.getParent() instanceof View) {
                    ((View) v0Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                m3 m3Var3 = this.b;
                m3Var3.a0 = f7;
                org.telegram.ui.Cells.v0 v0Var2 = m3Var3.a;
                v0Var2.invalidate();
                if (v0Var2.getParent() instanceof View) {
                    ((View) v0Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
