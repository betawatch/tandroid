package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;

    public /* synthetic */ vr0(bw0 bw0Var, int i10) {
        this.a = i10;
        this.b = bw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bw0 bw0Var = this.b;
                at atVar = bw0Var.P0;
                bw0Var.b2 = (int) atVar.c(AndroidUtilities.dp(14.0f));
                rs0 rs0Var = bw0Var.V;
                if (rs0Var != null) {
                    rs0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) atVar.c(AndroidUtilities.dp(7.0f))));
                }
                uu0[] uu0VarArr = bw0Var.k0;
                if (uu0VarArr != null) {
                    for (uu0 uu0Var : uu0VarArr) {
                        if (uu0Var != null) {
                            int paddingTop = uu0Var.h.getPaddingTop();
                            at0 at0Var = uu0Var.h;
                            int paddingLeft = at0Var.getPaddingLeft();
                            int Z = bw0Var.Z(uu0Var.F);
                            int paddingRight = uu0Var.h.getPaddingRight();
                            at0 at0Var2 = uu0Var.h;
                            int Y = bw0Var.Y(bw0Var.v0());
                            at0Var2.c3 = Y;
                            at0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(uu0Var.h, new nd(uu0Var, paddingTop - uu0Var.h.getPaddingTop(), 8));
                        }
                    }
                    break;
                }
                break;
            case 1:
                bw0 bw0Var2 = this.b;
                bw0Var2.b1(false);
                bw0Var2.G.h(true);
                bw0Var2.a1 = 0;
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
