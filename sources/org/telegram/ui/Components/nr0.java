package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tv0 b;

    public /* synthetic */ nr0(tv0 tv0Var, int i10) {
        this.a = i10;
        this.b = tv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tv0 tv0Var = this.b;
                us usVar = tv0Var.P0;
                tv0Var.b2 = (int) usVar.c(AndroidUtilities.dp(14.0f));
                js0 js0Var = tv0Var.V;
                if (js0Var != null) {
                    js0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) usVar.c(AndroidUtilities.dp(7.0f))));
                }
                mu0[] mu0VarArr = tv0Var.k0;
                if (mu0VarArr != null) {
                    for (mu0 mu0Var : mu0VarArr) {
                        if (mu0Var != null) {
                            int paddingTop = mu0Var.h.getPaddingTop();
                            ss0 ss0Var = mu0Var.h;
                            int paddingLeft = ss0Var.getPaddingLeft();
                            int Z = tv0Var.Z(mu0Var.F);
                            int paddingRight = mu0Var.h.getPaddingRight();
                            ss0 ss0Var2 = mu0Var.h;
                            int Y = tv0Var.Y(tv0Var.x0());
                            ss0Var2.c3 = Y;
                            ss0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(mu0Var.h, new vr0(mu0Var, paddingTop - mu0Var.h.getPaddingTop(), 0));
                        }
                    }
                    break;
                }
                break;
            case 1:
                tv0 tv0Var2 = this.b;
                tv0Var2.d1(false);
                tv0Var2.G.h(true);
                tv0Var2.a1 = 0;
                break;
            default:
                this.b.l0();
                break;
        }
    }
}
