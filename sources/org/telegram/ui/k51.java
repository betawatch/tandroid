package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class k51 implements r0.n, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n51 b;

    public /* synthetic */ k51(n51 n51Var, int i10) {
        this.a = i10;
        this.b = n51Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        n51 n51Var = this.b;
        n51Var.e = defaultWindowInsets;
        n51Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        n51Var.b.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.b.c0;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                    break;
                }
                break;
            default:
                n51 n51Var = this.b;
                org.telegram.ui.ActionBar.d2 d2Var3 = n51Var.c0;
                if (d2Var3 != null) {
                    d2Var3.dismiss();
                    n51Var.c0 = null;
                }
                n51Var.dismiss();
                break;
        }
    }
}
