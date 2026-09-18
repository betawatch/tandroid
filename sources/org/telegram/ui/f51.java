package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f51 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i51 b;

    public /* synthetic */ f51(i51 i51Var, int i10) {
        this.a = i10;
        this.b = i51Var;
    }

    @Override // r0.n
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        i51 i51Var = this.b;
        i51Var.e = defaultWindowInsets;
        i51Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        i51Var.b.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.b.c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    break;
                }
                break;
            default:
                i51 i51Var = this.b;
                org.telegram.ui.ActionBar.b2 b2Var3 = i51Var.c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    i51Var.c0 = null;
                }
                i51Var.dismiss();
                break;
        }
    }
}
