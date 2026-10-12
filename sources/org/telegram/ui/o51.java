package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class o51 implements r0.o, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r51 b;

    public /* synthetic */ o51(r51 r51Var, int i10) {
        this.a = i10;
        this.b = r51Var;
    }

    @Override // r0.o
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        r51 r51Var = this.b;
        r51Var.e = defaultWindowInsets;
        r51Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        r51Var.b.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.b.c0;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                    break;
                }
                break;
            default:
                r51 r51Var = this.b;
                org.telegram.ui.ActionBar.a2 a2Var3 = r51Var.c0;
                if (a2Var3 != null) {
                    a2Var3.dismiss();
                    r51Var.c0 = null;
                }
                r51Var.dismiss();
                break;
        }
    }
}
