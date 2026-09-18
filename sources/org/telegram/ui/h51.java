package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h51 implements r0.n, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k51 b;

    public /* synthetic */ h51(k51 k51Var, int i10) {
        this.a = i10;
        this.b = k51Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        k51 k51Var = this.b;
        k51Var.e = defaultWindowInsets;
        k51Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        k51Var.b.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.b.c0;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    break;
                }
                break;
            default:
                k51 k51Var = this.b;
                org.telegram.ui.ActionBar.c2 c2Var3 = k51Var.c0;
                if (c2Var3 != null) {
                    c2Var3.dismiss();
                    k51Var.c0 = null;
                }
                k51Var.dismiss();
                break;
        }
    }
}
