package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                ls lsVar = yu0Var.P0;
                yu0Var.b2 = (int) lsVar.c(AndroidUtilities.dp(14.0f));
                nr0 nr0Var = yu0Var.V;
                if (nr0Var != null) {
                    nr0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) lsVar.c(AndroidUtilities.dp(7.0f))));
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
                            AndroidUtilities.doOnLayout(rt0Var.h, new kd(rt0Var, paddingTop - rt0Var.h.getPaddingTop(), 8));
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
