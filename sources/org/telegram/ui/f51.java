package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f51 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i51 b;

    public /* synthetic */ f51(i51 i51Var, int i10) {
        this.a = i10;
        this.b = i51Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        i51 i51Var = this.b;
        i51Var.e = defaultWindowInsets;
        i51Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        i51Var.b.requestLayout();
        return r0.l1.b;
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
