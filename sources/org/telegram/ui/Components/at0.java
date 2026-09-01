package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class at0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g1 c;
    public final /* synthetic */ ct0 d;

    public /* synthetic */ at0(ct0 ct0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i10) {
        this.a = i10;
        this.d = ct0Var;
        this.b = g1Var;
        this.c = g1Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zu0 zu0Var = this.d.d;
                if (!zu0Var.E1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.b;
                    boolean z4 = g1Var.getCheckView().a.q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.c;
                    if (!z4 && g1Var2.getCheckView().a.q) {
                        float f10 = -zu0Var.p1;
                        zu0Var.p1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var2, f10);
                        break;
                    } else {
                        g1Var2.setChecked(!g1Var2.getCheckView().a.q);
                        if (g1Var2.getCheckView().a.q && g1Var.getCheckView().a.q) {
                            zu0Var.q1[0].q = 0;
                        } else {
                            zu0Var.q1[0].q = 2;
                        }
                        zu0.s(zu0Var);
                        break;
                    }
                }
                break;
            default:
                zu0 zu0Var2 = this.d.d;
                if (!zu0Var2.E1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.b;
                    boolean z10 = g1Var3.getCheckView().a.q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.c;
                    if (!z10 && g1Var4.getCheckView().a.q) {
                        float f11 = -zu0Var2.p1;
                        zu0Var2.p1 = f11;
                        AndroidUtilities.shakeViewSpring(g1Var4, f11);
                        break;
                    } else {
                        g1Var4.setChecked(!g1Var4.getCheckView().a.q);
                        if (g1Var3.getCheckView().a.q && g1Var4.getCheckView().a.q) {
                            zu0Var2.q1[0].q = 0;
                        } else {
                            zu0Var2.q1[0].q = 1;
                        }
                        zu0.s(zu0Var2);
                        break;
                    }
                }
                break;
        }
    }
}
