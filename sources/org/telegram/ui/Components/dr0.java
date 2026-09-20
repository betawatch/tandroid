package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class dr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv0 b;

    public /* synthetic */ dr0(jv0 jv0Var, int i10) {
        this.a = i10;
        this.b = jv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jv0 jv0Var = this.b;
                ks ksVar = jv0Var.P0;
                jv0Var.b2 = (int) ksVar.c(AndroidUtilities.dp(14.0f));
                yr0 yr0Var = jv0Var.V;
                if (yr0Var != null) {
                    yr0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) ksVar.c(AndroidUtilities.dp(7.0f))));
                }
                cu0[] cu0VarArr = jv0Var.k0;
                if (cu0VarArr != null) {
                    for (cu0 cu0Var : cu0VarArr) {
                        if (cu0Var != null) {
                            int paddingTop = cu0Var.h.getPaddingTop();
                            is0 is0Var = cu0Var.h;
                            int paddingLeft = is0Var.getPaddingLeft();
                            int Z = jv0Var.Z(cu0Var.F);
                            int paddingRight = cu0Var.h.getPaddingRight();
                            is0 is0Var2 = cu0Var.h;
                            int Y = jv0Var.Y(jv0Var.v0());
                            is0Var2.e3 = Y;
                            is0Var.setPadding(paddingLeft, Z, paddingRight, Y);
                            AndroidUtilities.doOnLayout(cu0Var.h, new kd(cu0Var, paddingTop - cu0Var.h.getPaddingTop(), 8));
                        }
                    }
                    break;
                }
                break;
            case 1:
                jv0 jv0Var2 = this.b;
                jv0Var2.b1(false);
                jv0Var2.G.h(true);
                jv0Var2.a1 = 0;
                break;
            default:
                this.b.k0();
                break;
        }
    }
}
