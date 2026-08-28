package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gs0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g1 c;
    public final /* synthetic */ is0 d;

    public /* synthetic */ gs0(is0 is0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i9) {
        this.a = i9;
        this.d = is0Var;
        this.b = g1Var;
        this.c = g1Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                eu0 eu0Var = this.d.d;
                if (!eu0Var.D1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.b;
                    boolean z10 = g1Var.getCheckView().a.q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.c;
                    if (!z10 && g1Var2.getCheckView().a.q) {
                        float f10 = -eu0Var.o1;
                        eu0Var.o1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var2, f10);
                        break;
                    } else {
                        g1Var2.setChecked(!g1Var2.getCheckView().a.q);
                        if (g1Var2.getCheckView().a.q && g1Var.getCheckView().a.q) {
                            eu0Var.p1[0].q = 0;
                        } else {
                            eu0Var.p1[0].q = 2;
                        }
                        eu0.s(eu0Var);
                        break;
                    }
                }
                break;
            default:
                eu0 eu0Var2 = this.d.d;
                if (!eu0Var2.D1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.b;
                    boolean z11 = g1Var3.getCheckView().a.q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.c;
                    if (!z11 && g1Var4.getCheckView().a.q) {
                        float f11 = -eu0Var2.o1;
                        eu0Var2.o1 = f11;
                        AndroidUtilities.shakeViewSpring(g1Var4, f11);
                        break;
                    } else {
                        g1Var4.setChecked(!g1Var4.getCheckView().a.q);
                        if (g1Var3.getCheckView().a.q && g1Var4.getCheckView().a.q) {
                            eu0Var2.p1[0].q = 0;
                        } else {
                            eu0Var2.p1[0].q = 1;
                        }
                        eu0.s(eu0Var2);
                        break;
                    }
                }
                break;
        }
    }
}
