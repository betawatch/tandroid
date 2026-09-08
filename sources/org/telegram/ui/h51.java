package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class h51 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k51 b;

    public /* synthetic */ h51(k51 k51Var, int i10) {
        this.a = i10;
        this.b = k51Var;
    }

    @Override // r0.n
    public r0.l1 T0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        k51 k51Var = this.b;
        k51Var.e = defaultWindowInsets;
        k51Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        k51Var.b.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.b.c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    break;
                }
                break;
            default:
                k51 k51Var = this.b;
                org.telegram.ui.ActionBar.b2 b2Var3 = k51Var.c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    k51Var.c0 = null;
                }
                k51Var.dismiss();
                break;
        }
    }
}
