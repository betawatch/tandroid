package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class du0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f1 c;
    public final /* synthetic */ fu0 d;

    public /* synthetic */ du0(fu0 fu0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.a = i10;
        this.d = fu0Var;
        this.b = f1Var;
        this.c = f1Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                bw0 bw0Var = this.d.d;
                if (!bw0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.b;
                    boolean z10 = f1Var.getCheckView().a.q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.c;
                    if (!z10 && f1Var2.getCheckView().a.q) {
                        float f7 = -bw0Var.s1;
                        bw0Var.s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        break;
                    } else {
                        f1Var2.setChecked(!f1Var2.getCheckView().a.q);
                        if (f1Var2.getCheckView().a.q && f1Var.getCheckView().a.q) {
                            bw0Var.t1[0].q = 0;
                        } else {
                            bw0Var.t1[0].q = 2;
                        }
                        bw0.s(bw0Var);
                        break;
                    }
                }
                break;
            default:
                bw0 bw0Var2 = this.d.d;
                if (!bw0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.b;
                    boolean z11 = f1Var3.getCheckView().a.q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.c;
                    if (!z11 && f1Var4.getCheckView().a.q) {
                        float f10 = -bw0Var2.s1;
                        bw0Var2.s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        break;
                    } else {
                        f1Var4.setChecked(!f1Var4.getCheckView().a.q);
                        if (f1Var3.getCheckView().a.q && f1Var4.getCheckView().a.q) {
                            bw0Var2.t1[0].q = 0;
                        } else {
                            bw0Var2.t1[0].q = 1;
                        }
                        bw0.s(bw0Var2);
                        break;
                    }
                }
                break;
        }
    }
}
