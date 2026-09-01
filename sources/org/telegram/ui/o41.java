package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o41 implements r0.o, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r41 b;

    public /* synthetic */ o41(r41 r41Var, int i10) {
        this.a = i10;
        this.b = r41Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        r41 r41Var = this.b;
        r41Var.e = defaultWindowInsets;
        r41Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        r41Var.b.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.b.Z;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                    break;
                }
                break;
            default:
                r41 r41Var = this.b;
                org.telegram.ui.ActionBar.d2 d2Var3 = r41Var.Z;
                if (d2Var3 != null) {
                    d2Var3.dismiss();
                    r41Var.Z = null;
                }
                r41Var.dismiss();
                break;
        }
    }
}
