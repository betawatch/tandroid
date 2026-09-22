package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yu0 b;

    public /* synthetic */ qq0(yu0 yu0Var, int i10) {
        this.a = i10;
        this.b = yu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yu0 yu0Var = this.b;
                ks ksVar = yu0Var.P0;
                yu0Var.b2 = (int) ksVar.c(AndroidUtilities.dp(14.0f));
                nr0 nr0Var = yu0Var.V;
                if (nr0Var != null) {
                    nr0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) ksVar.c(AndroidUtilities.dp(7.0f))));
                }
                rt0[] rt0VarArr = yu0Var.k0;
                if (rt0VarArr != null) {
                    for (rt0 rt0Var : rt0VarArr) {
                        if (rt0Var != null) {
                            int paddingTop = rt0Var.h.getPaddingTop();
                            xr0 xr0Var = rt0Var.h;
                            int paddingLeft = xr0Var.getPaddingLeft();
                            int Z = yu0Var.Z(rt0Var.F);
                            int paddingRight = rt0Var.h.getPaddingRight();
                            xr0 xr0Var2 = rt0Var.h;
                            int Y = yu0Var.Y(yu0Var.v0());
                            xr0Var2.e3 = Y;
                            xr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(rt0Var.h, new id(rt0Var, paddingTop - rt0Var.h.getPaddingTop(), 8));
                        }
                    }
                    break;
                }
                break;
            case 1:
                yu0 yu0Var2 = this.b;
                yu0Var2.b1(false);
                yu0Var2.G.h(true);
                yu0Var2.a1 = 0;
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
