package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o51 implements r0.n, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r51 b;

    public /* synthetic */ o51(r51 r51Var, int i10) {
        this.a = i10;
        this.b = r51Var;
    }

    @Override // r0.n
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
