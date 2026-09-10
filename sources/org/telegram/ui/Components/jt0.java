package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class jt0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g1 c;
    public final /* synthetic */ lt0 d;

    public /* synthetic */ jt0(lt0 lt0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i10) {
        this.a = i10;
        this.d = lt0Var;
        this.b = g1Var;
        this.c = g1Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                iv0 iv0Var = this.d.d;
                if (!iv0Var.H1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.b;
                    boolean z10 = g1Var.getCheckView().a.q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.c;
                    if (!z10 && g1Var2.getCheckView().a.q) {
                        float f7 = -iv0Var.s1;
                        iv0Var.s1 = f7;
                        AndroidUtilities.shakeViewSpring(g1Var2, f7);
                        break;
                    } else {
                        g1Var2.setChecked(!g1Var2.getCheckView().a.q);
                        if (g1Var2.getCheckView().a.q && g1Var.getCheckView().a.q) {
                            iv0Var.t1[0].q = 0;
                        } else {
                            iv0Var.t1[0].q = 2;
                        }
                        iv0.s(iv0Var);
                        break;
                    }
                }
                break;
            default:
                iv0 iv0Var2 = this.d.d;
                if (!iv0Var2.H1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.b;
                    boolean z11 = g1Var3.getCheckView().a.q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.c;
                    if (!z11 && g1Var4.getCheckView().a.q) {
                        float f10 = -iv0Var2.s1;
                        iv0Var2.s1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var4, f10);
                        break;
                    } else {
                        g1Var4.setChecked(!g1Var4.getCheckView().a.q);
                        if (g1Var3.getCheckView().a.q && g1Var4.getCheckView().a.q) {
                            iv0Var2.t1[0].q = 0;
                        } else {
                            iv0Var2.t1[0].q = 1;
                        }
                        iv0.s(iv0Var2);
                        break;
                    }
                }
                break;
        }
    }
}
