package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c41 implements r0.o, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f41 b;

    public /* synthetic */ c41(f41 f41Var, int i10) {
        this.a = i10;
        this.b = f41Var;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        f41 f41Var = this.b;
        f41Var.e = defaultWindowInsets;
        f41Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        f41Var.b.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.b.Y;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    break;
                }
                break;
            default:
                f41 f41Var = this.b;
                org.telegram.ui.ActionBar.c2 c2Var3 = f41Var.Y;
                if (c2Var3 != null) {
                    c2Var3.dismiss();
                    f41Var.Y = null;
                }
                f41Var.dismiss();
                break;
        }
    }
}
