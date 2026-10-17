package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sv0 b;

    public /* synthetic */ mr0(sv0 sv0Var, int i10) {
        this.a = i10;
        this.b = sv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sv0 sv0Var = this.b;
                us usVar = sv0Var.P0;
                sv0Var.b2 = (int) usVar.c(AndroidUtilities.dp(14.0f));
                is0 is0Var = sv0Var.V;
                if (is0Var != null) {
                    is0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) usVar.c(AndroidUtilities.dp(7.0f))));
                }
                lu0[] lu0VarArr = sv0Var.k0;
                if (lu0VarArr != null) {
                    for (lu0 lu0Var : lu0VarArr) {
                        if (lu0Var != null) {
                            int paddingTop = lu0Var.h.getPaddingTop();
                            rs0 rs0Var = lu0Var.h;
                            int paddingLeft = rs0Var.getPaddingLeft();
                            int Z = sv0Var.Z(lu0Var.F);
                            int paddingRight = lu0Var.h.getPaddingRight();
                            rs0 rs0Var2 = lu0Var.h;
                            int Y = sv0Var.Y(sv0Var.x0());
                            rs0Var2.c3 = Y;
                            rs0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(lu0Var.h, new ur0(lu0Var, paddingTop - lu0Var.h.getPaddingTop(), 0));
                        }
                    }
                    break;
                }
                break;
            case 1:
                sv0 sv0Var2 = this.b;
                sv0Var2.d1(false);
                sv0Var2.G.h(true);
                sv0Var2.a1 = 0;
                break;
            default:
                this.b.l0();
                break;
        }
    }
}
