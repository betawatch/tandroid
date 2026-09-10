package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class br0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iv0 b;

    public /* synthetic */ br0(iv0 iv0Var, int i10) {
        this.a = i10;
        this.b = iv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                iv0 iv0Var = this.b;
                qs qsVar = iv0Var.P0;
                iv0Var.b2 = (int) qsVar.c(AndroidUtilities.dp(14.0f));
                wr0 wr0Var = iv0Var.V;
                if (wr0Var != null) {
                    wr0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) qsVar.c(AndroidUtilities.dp(7.0f))));
                }
                au0[] au0VarArr = iv0Var.k0;
                if (au0VarArr != null) {
                    for (au0 au0Var : au0VarArr) {
                        if (au0Var != null) {
                            int paddingTop = au0Var.h.getPaddingTop();
                            gs0 gs0Var = au0Var.h;
                            int paddingLeft = gs0Var.getPaddingLeft();
                            int Z = iv0Var.Z(au0Var.F);
                            int paddingRight = au0Var.h.getPaddingRight();
                            gs0 gs0Var2 = au0Var.h;
                            int Y = iv0Var.Y(iv0Var.v0());
                            gs0Var2.e3 = Y;
                            gs0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(au0Var.h, new zd(au0Var, paddingTop - au0Var.h.getPaddingTop(), 7));
                        }
                    }
                    break;
                }
                break;
            case 1:
                iv0 iv0Var2 = this.b;
                iv0Var2.b1(false);
                iv0Var2.G.h(true);
                iv0Var2.a1 = 0;
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
