package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zu0 b;

    public /* synthetic */ rq0(zu0 zu0Var, int i10) {
        this.a = i10;
        this.b = zu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zu0 zu0Var = this.b;
                ks ksVar = zu0Var.P0;
                zu0Var.b2 = (int) ksVar.c(AndroidUtilities.dp(14.0f));
                or0 or0Var = zu0Var.V;
                if (or0Var != null) {
                    or0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) ksVar.c(AndroidUtilities.dp(7.0f))));
                }
                st0[] st0VarArr = zu0Var.k0;
                if (st0VarArr != null) {
                    for (st0 st0Var : st0VarArr) {
                        if (st0Var != null) {
                            int paddingTop = st0Var.h.getPaddingTop();
                            yr0 yr0Var = st0Var.h;
                            int paddingLeft = yr0Var.getPaddingLeft();
                            int Z = zu0Var.Z(st0Var.F);
                            int paddingRight = st0Var.h.getPaddingRight();
                            yr0 yr0Var2 = st0Var.h;
                            int Y = zu0Var.Y(zu0Var.v0());
                            yr0Var2.e3 = Y;
                            yr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(st0Var.h, new id(st0Var, paddingTop - st0Var.h.getPaddingTop(), 8));
                        }
                    }
                    break;
                }
                break;
            case 1:
                zu0 zu0Var2 = this.b;
                zu0Var2.b1(false);
                zu0Var2.G.h(true);
                zu0Var2.a1 = 0;
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
