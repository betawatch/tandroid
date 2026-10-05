package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qv0 b;

    public /* synthetic */ jr0(qv0 qv0Var, int i10) {
        this.a = i10;
        this.b = qv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qv0 qv0Var = this.b;
                ns nsVar = qv0Var.P0;
                qv0Var.b2 = (int) nsVar.c(AndroidUtilities.dp(14.0f));
                gs0 gs0Var = qv0Var.V;
                if (gs0Var != null) {
                    gs0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) nsVar.c(AndroidUtilities.dp(7.0f))));
                }
                ju0[] ju0VarArr = qv0Var.k0;
                if (ju0VarArr != null) {
                    for (ju0 ju0Var : ju0VarArr) {
                        if (ju0Var != null) {
                            int paddingTop = ju0Var.h.getPaddingTop();
                            ps0 ps0Var = ju0Var.h;
                            int paddingLeft = ps0Var.getPaddingLeft();
                            int Z = qv0Var.Z(ju0Var.F);
                            int paddingRight = ju0Var.h.getPaddingRight();
                            ps0 ps0Var2 = ju0Var.h;
                            int Y = qv0Var.Y(qv0Var.v0());
                            ps0Var2.l3 = Y;
                            ps0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(ju0Var.h, new ld(ju0Var, paddingTop - ju0Var.h.getPaddingTop(), 8));
                        }
                    }
                    break;
                }
                break;
            case 1:
                qv0 qv0Var2 = this.b;
                qv0Var2.b1(false);
                qv0Var2.G.h(true);
                qv0Var2.a1 = 0;
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
