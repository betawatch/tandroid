package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m41 implements r0.o, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p41 b;

    public /* synthetic */ m41(p41 p41Var, int i10) {
        this.a = i10;
        this.b = p41Var;
    }

    @Override // r0.o
    public r0.m1 N0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        p41 p41Var = this.b;
        p41Var.e = defaultWindowInsets;
        p41Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        p41Var.b.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.b.Z;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                    break;
                }
                break;
            default:
                p41 p41Var = this.b;
                org.telegram.ui.ActionBar.d2 d2Var3 = p41Var.Z;
                if (d2Var3 != null) {
                    d2Var3.dismiss();
                    p41Var.Z = null;
                }
                p41Var.dismiss();
                break;
        }
    }
}
