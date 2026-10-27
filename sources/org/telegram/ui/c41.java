package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c41 implements r0.n, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f41 b;

    public /* synthetic */ c41(f41 f41Var, int i10) {
        this.a = i10;
        this.b = f41Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        f41 f41Var = this.b;
        f41Var.e = defaultWindowInsets;
        f41Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        f41Var.b.requestLayout();
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var2 = this.b.c0;
                if (e2Var2 != null) {
                    e2Var2.dismiss();
                    break;
                }
                break;
            default:
                f41 f41Var = this.b;
                org.telegram.ui.ActionBar.e2 e2Var3 = f41Var.c0;
                if (e2Var3 != null) {
                    e2Var3.dismiss();
                    f41Var.c0 = null;
                }
                f41Var.dismiss();
                break;
        }
    }
}
