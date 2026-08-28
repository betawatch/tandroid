package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eu0 b;

    public /* synthetic */ aq0(eu0 eu0Var, int i9) {
        this.a = i9;
        this.b = eu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eu0 eu0Var = this.b;
                bs bsVar = eu0Var.L0;
                eu0Var.X1 = (int) bsVar.c(AndroidUtilities.dp(14.0f));
                vq0 vq0Var = eu0Var.R;
                if (vq0Var != null) {
                    vq0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) bsVar.c(AndroidUtilities.dp(7.0f))));
                }
                xs0[] xs0VarArr = eu0Var.g0;
                if (xs0VarArr != null) {
                    for (xs0 xs0Var : xs0VarArr) {
                        if (xs0Var != null) {
                            int paddingTop = xs0Var.h.getPaddingTop();
                            dr0 dr0Var = xs0Var.h;
                            int paddingLeft = dr0Var.getPaddingLeft();
                            int Z = eu0Var.Z(xs0Var.B);
                            int paddingRight = xs0Var.h.getPaddingRight();
                            dr0 dr0Var2 = xs0Var.h;
                            int Y = eu0Var.Y(eu0Var.v0());
                            dr0Var2.a3 = Y;
                            dr0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(xs0Var.h, new qd(xs0Var, paddingTop - xs0Var.h.getPaddingTop(), 7));
                        }
                    }
                    break;
                }
                break;
            case 1:
                eu0 eu0Var2 = this.b;
                eu0Var2.b1(false);
                eu0Var2.C.h(true);
                eu0Var2.W0 = 0;
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
