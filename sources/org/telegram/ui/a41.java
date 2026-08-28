package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a41 implements r0.o, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d41 b;

    public /* synthetic */ a41(d41 d41Var, int i9) {
        this.a = i9;
        this.b = d41Var;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        d41 d41Var = this.b;
        d41Var.e = defaultWindowInsets;
        d41Var.c.setPadding(defaultWindowInsets.a, defaultWindowInsets.b, defaultWindowInsets.c, defaultWindowInsets.d);
        d41Var.b.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.b.Y;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    break;
                }
                break;
            default:
                d41 d41Var = this.b;
                org.telegram.ui.ActionBar.c2 c2Var3 = d41Var.Y;
                if (c2Var3 != null) {
                    c2Var3.dismiss();
                    d41Var.Y = null;
                }
                d41Var.dismiss();
                break;
        }
    }
}
