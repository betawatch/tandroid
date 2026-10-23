package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv0 b;

    public /* synthetic */ rr0(xv0 xv0Var, int i10) {
        this.a = i10;
        this.b = xv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xv0 xv0Var = this.b;
                us usVar = xv0Var.P0;
                xv0Var.c2 = (int) usVar.c(AndroidUtilities.dp(14.0f));
                ns0 ns0Var = xv0Var.V;
                if (ns0Var != null) {
                    ns0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) usVar.c(AndroidUtilities.dp(7.0f))));
                }
                qu0[] qu0VarArr = xv0Var.k0;
                if (qu0VarArr != null) {
                    for (qu0 qu0Var : qu0VarArr) {
                        if (qu0Var != null) {
                            int paddingTop = qu0Var.h.getPaddingTop();
                            ws0 ws0Var = qu0Var.h;
                            int paddingLeft = ws0Var.getPaddingLeft();
                            int a02 = xv0Var.a0(qu0Var.F);
                            int paddingRight = qu0Var.h.getPaddingRight();
                            ws0 ws0Var2 = qu0Var.h;
                            int Z = xv0Var.Z(xv0Var.y0());
                            ws0Var2.f3 = Z;
                            ws0Var.setPadding(paddingLeft, a02, paddingRight, Z);
                            AndroidUtilities.doOnLayout(qu0Var.h, new zr0(qu0Var, paddingTop - qu0Var.h.getPaddingTop(), 0));
                        }
                    }
                    break;
                }
                break;
            case 1:
                xv0 xv0Var2 = this.b;
                xv0Var2.e1(false);
                xv0Var2.G.g(true);
                xv0Var2.a1 = 0;
                break;
            default:
                this.b.m0();
                break;
        }
    }
}
