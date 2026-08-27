package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hu0 b;

    public /* synthetic */ bq0(hu0 hu0Var, int i10) {
        this.a = i10;
        this.b = hu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hu0 hu0Var = this.b;
                zr zrVar = hu0Var.L0;
                hu0Var.X1 = (int) zrVar.c(AndroidUtilities.dp(14.0f));
                wq0 wq0Var = hu0Var.R;
                if (wq0Var != null) {
                    wq0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) zrVar.c(AndroidUtilities.dp(7.0f))));
                }
                zs0[] zs0VarArr = hu0Var.g0;
                if (zs0VarArr != null) {
                    for (zs0 zs0Var : zs0VarArr) {
                        if (zs0Var != null) {
                            int paddingTop = zs0Var.h.getPaddingTop();
                            er0 er0Var = zs0Var.h;
                            int paddingLeft = er0Var.getPaddingLeft();
                            int Z = hu0Var.Z(zs0Var.B);
                            int paddingRight = zs0Var.h.getPaddingRight();
                            er0 er0Var2 = zs0Var.h;
                            int Y = hu0Var.Y(hu0Var.v0());
                            er0Var2.a3 = Y;
                            er0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(zs0Var.h, new xl(zs0Var, paddingTop - zs0Var.h.getPaddingTop(), 6));
                        }
                    }
                    break;
                }
                break;
            case 1:
                hu0 hu0Var2 = this.b;
                hu0Var2.b1(false);
                hu0Var2.C.h(true);
                hu0Var2.W0 = 0;
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
