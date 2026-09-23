package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class at0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f1 c;
    public final /* synthetic */ ct0 d;

    public /* synthetic */ at0(ct0 ct0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.a = i10;
        this.d = ct0Var;
        this.b = f1Var;
        this.c = f1Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                yu0 yu0Var = this.d.d;
                if (!yu0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.b;
                    boolean z10 = f1Var.getCheckView().a.q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.c;
                    if (!z10 && f1Var2.getCheckView().a.q) {
                        float f7 = -yu0Var.s1;
                        yu0Var.s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        break;
                    } else {
                        f1Var2.setChecked(!f1Var2.getCheckView().a.q);
                        if (f1Var2.getCheckView().a.q && f1Var.getCheckView().a.q) {
                            yu0Var.t1[0].q = 0;
                        } else {
                            yu0Var.t1[0].q = 2;
                        }
                        yu0.s(yu0Var);
                        break;
                    }
                }
                break;
            default:
                yu0 yu0Var2 = this.d.d;
                if (!yu0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.b;
                    boolean z11 = f1Var3.getCheckView().a.q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.c;
                    if (!z11 && f1Var4.getCheckView().a.q) {
                        float f10 = -yu0Var2.s1;
                        yu0Var2.s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        break;
                    } else {
                        f1Var4.setChecked(!f1Var4.getCheckView().a.q);
                        if (f1Var3.getCheckView().a.q && f1Var4.getCheckView().a.q) {
                            yu0Var2.t1[0].q = 0;
                        } else {
                            yu0Var2.t1[0].q = 1;
                        }
                        yu0.s(yu0Var2);
                        break;
                    }
                }
                break;
        }
    }
}
