package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ut0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e1 c;
    public final /* synthetic */ wt0 d;

    public /* synthetic */ ut0(wt0 wt0Var, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, int i10) {
        this.a = i10;
        this.d = wt0Var;
        this.b = e1Var;
        this.c = e1Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                sv0 sv0Var = this.d.d;
                if (!sv0Var.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var = this.b;
                    boolean z10 = e1Var.getCheckView().a.q;
                    org.telegram.ui.ActionBar.e1 e1Var2 = this.c;
                    if (!z10 && e1Var2.getCheckView().a.q) {
                        float f7 = -sv0Var.s1;
                        sv0Var.s1 = f7;
                        AndroidUtilities.shakeViewSpring(e1Var2, f7);
                        break;
                    } else {
                        e1Var2.setChecked(!e1Var2.getCheckView().a.q);
                        if (e1Var2.getCheckView().a.q && e1Var.getCheckView().a.q) {
                            sv0Var.t1[0].q = 0;
                        } else {
                            sv0Var.t1[0].q = 2;
                        }
                        sv0.t(sv0Var);
                        break;
                    }
                }
                break;
            default:
                sv0 sv0Var2 = this.d.d;
                if (!sv0Var2.H1) {
                    org.telegram.ui.ActionBar.e1 e1Var3 = this.b;
                    boolean z11 = e1Var3.getCheckView().a.q;
                    org.telegram.ui.ActionBar.e1 e1Var4 = this.c;
                    if (!z11 && e1Var4.getCheckView().a.q) {
                        float f10 = -sv0Var2.s1;
                        sv0Var2.s1 = f10;
                        AndroidUtilities.shakeViewSpring(e1Var4, f10);
                        break;
                    } else {
                        e1Var4.setChecked(!e1Var4.getCheckView().a.q);
                        if (e1Var3.getCheckView().a.q && e1Var4.getCheckView().a.q) {
                            sv0Var2.t1[0].q = 0;
                        } else {
                            sv0Var2.t1[0].q = 1;
                        }
                        sv0.t(sv0Var2);
                        break;
                    }
                }
                break;
        }
    }
}
