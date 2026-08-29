package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qu0 b;

    public /* synthetic */ mq0(qu0 qu0Var, int i10) {
        this.a = i10;
        this.b = qu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qu0 qu0Var = this.b;
                fs fsVar = qu0Var.L0;
                qu0Var.X1 = (int) fsVar.c(AndroidUtilities.dp(14.0f));
                gr0 gr0Var = qu0Var.R;
                if (gr0Var != null) {
                    gr0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) fsVar.c(AndroidUtilities.dp(7.0f))));
                }
                it0[] it0VarArr = qu0Var.g0;
                if (it0VarArr != null) {
                    for (it0 it0Var : it0VarArr) {
                        if (it0Var != null) {
                            int paddingTop = it0Var.h.getPaddingTop();
                            or0 or0Var = it0Var.h;
                            int paddingLeft = or0Var.getPaddingLeft();
                            int Z = qu0Var.Z(it0Var.B);
                            int paddingRight = it0Var.h.getPaddingRight();
                            or0 or0Var2 = it0Var.h;
                            int Y = qu0Var.Y(qu0Var.v0());
                            or0Var2.a3 = Y;
                            or0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(it0Var.h, new i8(it0Var, paddingTop - it0Var.h.getPaddingTop(), 9));
                        }
                    }
                    break;
                }
                break;
            case 1:
                qu0 qu0Var2 = this.b;
                qu0Var2.b1(false);
                qu0Var2.C.h(true);
                qu0Var2.W0 = 0;
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
