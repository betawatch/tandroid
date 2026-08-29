package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rs0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g1 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g1 c;
    public final /* synthetic */ ts0 d;

    public /* synthetic */ rs0(ts0 ts0Var, org.telegram.ui.ActionBar.g1 g1Var, org.telegram.ui.ActionBar.g1 g1Var2, int i10) {
        this.a = i10;
        this.d = ts0Var;
        this.b = g1Var;
        this.c = g1Var2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                qu0 qu0Var = this.d.d;
                if (!qu0Var.D1) {
                    org.telegram.ui.ActionBar.g1 g1Var = this.b;
                    boolean z10 = g1Var.getCheckView().a.q;
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.c;
                    if (!z10 && g1Var2.getCheckView().a.q) {
                        float f9 = -qu0Var.o1;
                        qu0Var.o1 = f9;
                        AndroidUtilities.shakeViewSpring(g1Var2, f9);
                        break;
                    } else {
                        g1Var2.setChecked(!g1Var2.getCheckView().a.q);
                        if (g1Var2.getCheckView().a.q && g1Var.getCheckView().a.q) {
                            qu0Var.p1[0].q = 0;
                        } else {
                            qu0Var.p1[0].q = 2;
                        }
                        qu0.s(qu0Var);
                        break;
                    }
                }
                break;
            default:
                qu0 qu0Var2 = this.d.d;
                if (!qu0Var2.D1) {
                    org.telegram.ui.ActionBar.g1 g1Var3 = this.b;
                    boolean z11 = g1Var3.getCheckView().a.q;
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.c;
                    if (!z11 && g1Var4.getCheckView().a.q) {
                        float f10 = -qu0Var2.o1;
                        qu0Var2.o1 = f10;
                        AndroidUtilities.shakeViewSpring(g1Var4, f10);
                        break;
                    } else {
                        g1Var4.setChecked(!g1Var4.getCheckView().a.q);
                        if (g1Var3.getCheckView().a.q && g1Var4.getCheckView().a.q) {
                            qu0Var2.p1[0].q = 0;
                        } else {
                            qu0Var2.p1[0].q = 1;
                        }
                        qu0.s(qu0Var2);
                        break;
                    }
                }
                break;
        }
    }
}
