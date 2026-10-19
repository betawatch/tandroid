package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class vt0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e1 c;
    public final /* synthetic */ xt0 d;

    public /* synthetic */ vt0(xt0 xt0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.a = i10;
        this.d = xt0Var;
        this.b = e1Var;
        this.c = e1Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                tv0 tv0Var = this.d.d;
                if (!tv0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.b;
                    boolean z10 = e1Var.getCheckView().a.q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.c;
                    if (!z10 && e1Var2.getCheckView().a.q) {
                        float f7 = -tv0Var.s1;
                        tv0Var.s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        break;
                    } else {
                        e1Var2.setChecked(!e1Var2.getCheckView().a.q);
                        if (e1Var2.getCheckView().a.q && e1Var.getCheckView().a.q) {
                            tv0Var.t1[0].q = 0;
                        } else {
                            tv0Var.t1[0].q = 2;
                        }
                        tv0.t(tv0Var);
                        break;
                    }
                }
                break;
            default:
                tv0 tv0Var2 = this.d.d;
                if (!tv0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.b;
                    boolean z11 = e1Var3.getCheckView().a.q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.c;
                    if (!z11 && e1Var4.getCheckView().a.q) {
                        float f10 = -tv0Var2.s1;
                        tv0Var2.s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        break;
                    } else {
                        e1Var4.setChecked(!e1Var4.getCheckView().a.q);
                        if (e1Var3.getCheckView().a.q && e1Var4.getCheckView().a.q) {
                            tv0Var2.t1[0].q = 0;
                        } else {
                            tv0Var2.t1[0].q = 1;
                        }
                        tv0.t(tv0Var2);
                        break;
                    }
                }
                break;
        }
    }
}
