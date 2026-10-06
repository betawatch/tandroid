package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class st0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f1 c;
    public final /* synthetic */ ut0 d;

    public /* synthetic */ st0(ut0 ut0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.a = i10;
        this.d = ut0Var;
        this.b = f1Var;
        this.c = f1Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                qv0 qv0Var = this.d.d;
                if (!qv0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.b;
                    boolean z10 = f1Var.getCheckView().a.q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.c;
                    if (!z10 && f1Var2.getCheckView().a.q) {
                        float f7 = -qv0Var.s1;
                        qv0Var.s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        break;
                    } else {
                        f1Var2.setChecked(!f1Var2.getCheckView().a.q);
                        if (f1Var2.getCheckView().a.q && f1Var.getCheckView().a.q) {
                            qv0Var.t1[0].q = 0;
                        } else {
                            qv0Var.t1[0].q = 2;
                        }
                        qv0.s(qv0Var);
                        break;
                    }
                }
                break;
            default:
                qv0 qv0Var2 = this.d.d;
                if (!qv0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.b;
                    boolean z11 = f1Var3.getCheckView().a.q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.c;
                    if (!z11 && f1Var4.getCheckView().a.q) {
                        float f10 = -qv0Var2.s1;
                        qv0Var2.s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        break;
                    } else {
                        f1Var4.setChecked(!f1Var4.getCheckView().a.q);
                        if (f1Var3.getCheckView().a.q && f1Var4.getCheckView().a.q) {
                            qv0Var2.t1[0].q = 0;
                        } else {
                            qv0Var2.t1[0].q = 1;
                        }
                        qv0.s(qv0Var2);
                        break;
                    }
                }
                break;
        }
    }
}
