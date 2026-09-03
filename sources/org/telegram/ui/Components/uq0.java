package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yu0 b;

    public /* synthetic */ uq0(yu0 yu0Var, int i10) {
        this.a = i10;
        this.b = yu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yu0 yu0Var = this.b;
                ls lsVar = yu0Var.M0;
                yu0Var.Y1 = (int) lsVar.c(AndroidUtilities.dp(14.0f));
                or0 or0Var = yu0Var.S;
                if (or0Var != null) {
                    or0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) lsVar.c(AndroidUtilities.dp(7.0f))));
                }
                qt0[] qt0VarArr = yu0Var.h0;
                if (qt0VarArr != null) {
                    for (qt0 qt0Var : qt0VarArr) {
                        if (qt0Var != null) {
                            int paddingTop = qt0Var.h.getPaddingTop();
                            wr0 wr0Var = qt0Var.h;
                            int paddingLeft = wr0Var.getPaddingLeft();
                            int Z = yu0Var.Z(qt0Var.C);
                            int paddingRight = qt0Var.h.getPaddingRight();
                            wr0 wr0Var2 = qt0Var.h;
                            int Y = yu0Var.Y(yu0Var.v0());
                            wr0Var2.b3 = Y;
                            wr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(qt0Var.h, new im(qt0Var, paddingTop - qt0Var.h.getPaddingTop(), 6));
                        }
                    }
                    break;
                }
                break;
            case 1:
                yu0 yu0Var2 = this.b;
                yu0Var2.b1(false);
                yu0Var2.D.h(true);
                yu0Var2.X0 = 0;
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
