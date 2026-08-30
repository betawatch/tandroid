package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zs0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g1 c;
    public final /* synthetic */ bt0 d;

    public /* synthetic */ zs0(bt0 bt0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i10) {
        this.a = i10;
        this.d = bt0Var;
        this.b = g1Var;
        this.c = g1Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                yu0 yu0Var = this.d.d;
                if (!yu0Var.E1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.b;
                    boolean z4 = g1Var.getCheckView().a.q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.c;
                    if (!z4 && g1Var2.getCheckView().a.q) {
                        float f10 = -yu0Var.p1;
                        yu0Var.p1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var2, f10);
                        break;
                    } else {
                        g1Var2.setChecked(!g1Var2.getCheckView().a.q);
                        if (g1Var2.getCheckView().a.q && g1Var.getCheckView().a.q) {
                            yu0Var.q1[0].q = 0;
                        } else {
                            yu0Var.q1[0].q = 2;
                        }
                        yu0.s(yu0Var);
                        break;
                    }
                }
                break;
            default:
                yu0 yu0Var2 = this.d.d;
                if (!yu0Var2.E1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.b;
                    boolean z10 = g1Var3.getCheckView().a.q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.c;
                    if (!z10 && g1Var4.getCheckView().a.q) {
                        float f11 = -yu0Var2.p1;
                        yu0Var2.p1 = f11;
                        AndroidUtilities.shakeViewSpring(g1Var4, f11);
                        break;
                    } else {
                        g1Var4.setChecked(!g1Var4.getCheckView().a.q);
                        if (g1Var3.getCheckView().a.q && g1Var4.getCheckView().a.q) {
                            yu0Var2.q1[0].q = 0;
                        } else {
                            yu0Var2.q1[0].q = 1;
                        }
                        yu0.s(yu0Var2);
                        break;
                    }
                }
                break;
        }
    }
}
