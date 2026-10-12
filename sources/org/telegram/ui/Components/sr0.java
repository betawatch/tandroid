package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv0 b;

    public /* synthetic */ sr0(xv0 xv0Var, int i10) {
        this.a = i10;
        this.b = xv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xv0 xv0Var = this.b;
                xs xsVar = xv0Var.P0;
                xv0Var.b2 = (int) xsVar.c(AndroidUtilities.dp(14.0f));
                ns0 ns0Var = xv0Var.V;
                if (ns0Var != null) {
                    ns0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) xsVar.c(AndroidUtilities.dp(7.0f))));
                }
                qu0[] qu0VarArr = xv0Var.k0;
                if (qu0VarArr != null) {
                    for (qu0 qu0Var : qu0VarArr) {
                        if (qu0Var != null) {
                            int paddingTop = qu0Var.h.getPaddingTop();
                            ws0 ws0Var = qu0Var.h;
                            int paddingLeft = ws0Var.getPaddingLeft();
                            int Z = xv0Var.Z(qu0Var.F);
                            int paddingRight = qu0Var.h.getPaddingRight();
                            ws0 ws0Var2 = qu0Var.h;
                            int Y = xv0Var.Y(xv0Var.v0());
                            ws0Var2.c3 = Y;
                            ws0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(qu0Var.h, new o8(qu0Var, paddingTop - qu0Var.h.getPaddingTop(), 10));
                        }
                    }
                    break;
                }
                break;
            case 1:
                xv0 xv0Var2 = this.b;
                xv0Var2.b1(false);
                xv0Var2.G.h(true);
                xv0Var2.a1 = 0;
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
