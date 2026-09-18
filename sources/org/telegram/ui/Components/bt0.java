package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class bt0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g1 c;
    public final /* synthetic */ dt0 d;

    public /* synthetic */ bt0(dt0 dt0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i10) {
        this.a = i10;
        this.d = dt0Var;
        this.b = g1Var;
        this.c = g1Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zu0 zu0Var = this.d.d;
                if (!zu0Var.H1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.b;
                    boolean z10 = g1Var.getCheckView().a.q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.c;
                    if (!z10 && g1Var2.getCheckView().a.q) {
                        float f7 = -zu0Var.s1;
                        zu0Var.s1 = f7;
                        AndroidUtilities.shakeViewSpring(g1Var2, f7);
                        break;
                    } else {
                        g1Var2.setChecked(!g1Var2.getCheckView().a.q);
                        if (g1Var2.getCheckView().a.q && g1Var.getCheckView().a.q) {
                            zu0Var.t1[0].q = 0;
                        } else {
                            zu0Var.t1[0].q = 2;
                        }
                        zu0.s(zu0Var);
                        break;
                    }
                }
                break;
            default:
                zu0 zu0Var2 = this.d.d;
                if (!zu0Var2.H1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.b;
                    boolean z11 = g1Var3.getCheckView().a.q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.c;
                    if (!z11 && g1Var4.getCheckView().a.q) {
                        float f10 = -zu0Var2.s1;
                        zu0Var2.s1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var4, f10);
                        break;
                    } else {
                        g1Var4.setChecked(!g1Var4.getCheckView().a.q);
                        if (g1Var3.getCheckView().a.q && g1Var4.getCheckView().a.q) {
                            zu0Var2.t1[0].q = 0;
                        } else {
                            zu0Var2.t1[0].q = 1;
                        }
                        zu0.s(zu0Var2);
                        break;
                    }
                }
                break;
        }
    }
}
