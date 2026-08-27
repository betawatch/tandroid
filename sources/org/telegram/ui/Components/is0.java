package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class is0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f1 c;
    public final /* synthetic */ ks0 d;

    public /* synthetic */ is0(ks0 ks0Var, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, int i10) {
        this.a = i10;
        this.d = ks0Var;
        this.b = f1Var;
        this.c = f1Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                hu0 hu0Var = this.d.d;
                if (!hu0Var.D1) {
                    org.telegram.ui.ActionBar.f1 f1Var = this.b;
                    boolean z10 = f1Var.getCheckView().a.q;
                    org.telegram.ui.ActionBar.f1 f1Var2 = this.c;
                    if (!z10 && f1Var2.getCheckView().a.q) {
                        float f10 = -hu0Var.o1;
                        hu0Var.o1 = f10;
                        AndroidUtilities.shakeViewSpring(f1Var2, f10);
                        break;
                    } else {
                        f1Var2.setChecked(!f1Var2.getCheckView().a.q);
                        if (f1Var2.getCheckView().a.q && f1Var.getCheckView().a.q) {
                            hu0Var.p1[0].q = 0;
                        } else {
                            hu0Var.p1[0].q = 2;
                        }
                        hu0.s(hu0Var);
                        break;
                    }
                }
                break;
            default:
                hu0 hu0Var2 = this.d.d;
                if (!hu0Var2.D1) {
                    org.telegram.ui.ActionBar.f1 f1Var3 = this.b;
                    boolean z11 = f1Var3.getCheckView().a.q;
                    org.telegram.ui.ActionBar.f1 f1Var4 = this.c;
                    if (!z11 && f1Var4.getCheckView().a.q) {
                        float f11 = -hu0Var2.o1;
                        hu0Var2.o1 = f11;
                        AndroidUtilities.shakeViewSpring(f1Var4, f11);
                        break;
                    } else {
                        f1Var4.setChecked(!f1Var4.getCheckView().a.q);
                        if (f1Var3.getCheckView().a.q && f1Var4.getCheckView().a.q) {
                            hu0Var2.p1[0].q = 0;
                        } else {
                            hu0Var2.p1[0].q = 1;
                        }
                        hu0.s(hu0Var2);
                        break;
                    }
                }
                break;
        }
    }
}
