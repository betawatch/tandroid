package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class nt0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f1 c;
    public final /* synthetic */ pt0 d;

    public /* synthetic */ nt0(pt0 pt0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.a = i10;
        this.d = pt0Var;
        this.b = f1Var;
        this.c = f1Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                lv0 lv0Var = this.d.d;
                if (!lv0Var.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.b;
                    boolean z10 = f1Var.getCheckView().a.q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.c;
                    if (!z10 && f1Var2.getCheckView().a.q) {
                        float f7 = -lv0Var.s1;
                        lv0Var.s1 = f7;
                        AndroidUtilities.shakeViewSpring(f1Var2, f7);
                        break;
                    } else {
                        f1Var2.setChecked(!f1Var2.getCheckView().a.q);
                        if (f1Var2.getCheckView().a.q && f1Var.getCheckView().a.q) {
                            lv0Var.t1[0].q = 0;
                        } else {
                            lv0Var.t1[0].q = 2;
                        }
                        lv0.s(lv0Var);
                        break;
                    }
                }
                break;
            default:
                lv0 lv0Var2 = this.d.d;
                if (!lv0Var2.H1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.b;
                    boolean z11 = f1Var3.getCheckView().a.q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.c;
                    if (!z11 && f1Var4.getCheckView().a.q) {
                        float f10 = -lv0Var2.s1;
                        lv0Var2.s1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var4, f10);
                        break;
                    } else {
                        f1Var4.setChecked(!f1Var4.getCheckView().a.q);
                        if (f1Var3.getCheckView().a.q && f1Var4.getCheckView().a.q) {
                            lv0Var2.t1[0].q = 0;
                        } else {
                            lv0Var2.t1[0].q = 1;
                        }
                        lv0.s(lv0Var2);
                        break;
                    }
                }
                break;
        }
    }
}
