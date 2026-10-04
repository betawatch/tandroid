package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ir0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv0 b;

    public /* synthetic */ ir0(pv0 pv0Var, int i10) {
        this.a = i10;
        this.b = pv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pv0 pv0Var = this.b;
                ns nsVar = pv0Var.P0;
                pv0Var.b2 = (int) nsVar.c(AndroidUtilities.dp(14.0f));
                fs0 fs0Var = pv0Var.V;
                if (fs0Var != null) {
                    fs0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) nsVar.c(AndroidUtilities.dp(7.0f))));
                }
                iu0[] iu0VarArr = pv0Var.k0;
                if (iu0VarArr != null) {
                    for (iu0 iu0Var : iu0VarArr) {
                        if (iu0Var != null) {
                            int paddingTop = iu0Var.h.getPaddingTop();
                            os0 os0Var = iu0Var.h;
                            int paddingLeft = os0Var.getPaddingLeft();
                            int Z = pv0Var.Z(iu0Var.F);
                            int paddingRight = iu0Var.h.getPaddingRight();
                            os0 os0Var2 = iu0Var.h;
                            int Y = pv0Var.Y(pv0Var.v0());
                            os0Var2.l3 = Y;
                            os0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(iu0Var.h, new ld(iu0Var, paddingTop - iu0Var.h.getPaddingTop(), 8));
                        }
                    }
                    break;
                }
                break;
            case 1:
                pv0 pv0Var2 = this.b;
                pv0Var2.b1(false);
                pv0Var2.G.h(true);
                pv0Var2.a1 = 0;
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
