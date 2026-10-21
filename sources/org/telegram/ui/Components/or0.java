package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class or0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uv0 b;

    public /* synthetic */ or0(uv0 uv0Var, int i10) {
        this.a = i10;
        this.b = uv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uv0 uv0Var = this.b;
                us usVar = uv0Var.P0;
                uv0Var.b2 = (int) usVar.c(AndroidUtilities.dp(14.0f));
                ks0 ks0Var = uv0Var.V;
                if (ks0Var != null) {
                    ks0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) usVar.c(AndroidUtilities.dp(7.0f))));
                }
                nu0[] nu0VarArr = uv0Var.k0;
                if (nu0VarArr != null) {
                    for (nu0 nu0Var : nu0VarArr) {
                        if (nu0Var != null) {
                            int paddingTop = nu0Var.h.getPaddingTop();
                            ts0 ts0Var = nu0Var.h;
                            int paddingLeft = ts0Var.getPaddingLeft();
                            int Z = uv0Var.Z(nu0Var.F);
                            int paddingRight = nu0Var.h.getPaddingRight();
                            ts0 ts0Var2 = nu0Var.h;
                            int Y = uv0Var.Y(uv0Var.x0());
                            ts0Var2.c3 = Y;
                            ts0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(nu0Var.h, new wr0(nu0Var, paddingTop - nu0Var.h.getPaddingTop(), 0));
                        }
                    }
                    break;
                }
                break;
            case 1:
                uv0 uv0Var2 = this.b;
                uv0Var2.d1(false);
                uv0Var2.G.h(true);
                uv0Var2.a1 = 0;
                break;
            default:
                this.b.l0();
                break;
        }
    }
}
