package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class zt0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e1 c;
    public final /* synthetic */ bu0 d;

    public /* synthetic */ zt0(bu0 bu0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.a = i10;
        this.d = bu0Var;
        this.b = e1Var;
        this.c = e1Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xv0 xv0Var = this.d.d;
                if (!xv0Var.I1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.b;
                    boolean z10 = e1Var.getCheckView().a.q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.c;
                    if (!z10 && e1Var2.getCheckView().a.q) {
                        float f7 = -xv0Var.s1;
                        xv0Var.s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        break;
                    } else {
                        e1Var2.setChecked(!e1Var2.getCheckView().a.q);
                        if (e1Var2.getCheckView().a.q && e1Var.getCheckView().a.q) {
                            xv0Var.t1[0].q = 0;
                        } else {
                            xv0Var.t1[0].q = 2;
                        }
                        xv0.t(xv0Var);
                        break;
                    }
                }
                break;
            default:
                xv0 xv0Var2 = this.d.d;
                if (!xv0Var2.I1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.b;
                    boolean z11 = e1Var3.getCheckView().a.q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.c;
                    if (!z11 && e1Var4.getCheckView().a.q) {
                        float f10 = -xv0Var2.s1;
                        xv0Var2.s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        break;
                    } else {
                        e1Var4.setChecked(!e1Var4.getCheckView().a.q);
                        if (e1Var3.getCheckView().a.q && e1Var4.getCheckView().a.q) {
                            xv0Var2.t1[0].q = 0;
                        } else {
                            xv0Var2.t1[0].q = 1;
                        }
                        xv0.t(xv0Var2);
                        break;
                    }
                }
                break;
        }
    }
}
