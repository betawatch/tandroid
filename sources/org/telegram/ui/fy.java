package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fy {
    public final /* synthetic */ ty a;

    public fy(ty tyVar) {
        this.a = tyVar;
    }

    public final long a() {
        ty tyVar = this.a;
        nx nxVar = tyVar.F3;
        if (nxVar == null || !(nxVar.getFragment() instanceof fg1)) {
            return 0L;
        }
        return -((fg1) tyVar.F3.getFragment()).a;
    }

    public final void b() {
        ty tyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar.getParentActivity());
        org.telegram.ui.Components.wo0 wo0Var = tyVar.C0.b0;
        if (wo0Var.N && wo0Var.P()) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.wo0 wo0Var2 = tyVar.C0.b0;
            ArrayList arrayList = wo0Var2.N ? wo0Var2.v0 : wo0Var2.u0;
            alertDialog$Builder.a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.ey
                public final /* synthetic */ fy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.a.C0.b0.E();
                            break;
                        default:
                            ty tyVar2 = this.b.a;
                            if (!tyVar2.C0.b0.P()) {
                                org.telegram.ui.Components.wo0 wo0Var3 = tyVar2.C0.b0;
                                wo0Var3.j0.c();
                                wo0Var3.J.clear();
                                wo0Var3.l();
                                break;
                            } else {
                                tyVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.ey
                public final /* synthetic */ fy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.a.C0.b0.E();
                            break;
                        default:
                            ty tyVar2 = this.b.a;
                            if (!tyVar2.C0.b0.P()) {
                                org.telegram.ui.Components.wo0 wo0Var3 = tyVar2.C0.b0;
                                wo0Var3.j0.c();
                                wo0Var3.J.clear();
                                wo0Var3.l();
                                break;
                            } else {
                                tyVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        tyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.q7));
        }
    }

    public final void c() {
        dy dyVar = this.a.C0;
        if (dyVar != null) {
            org.telegram.ui.Components.vl0 vl0Var = dyVar.d0;
            int i10 = dyVar.S0;
            vl0Var.b(i10 > 0 ? i10 + 1 : 0);
            dyVar.S0 = dyVar.b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        ty tyVar = this.a;
        if (tyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (tyVar.j2 && tyVar.k2) {
            dy dyVar = tyVar.C0;
            if (dyVar.W != null) {
                if (z10 || dyVar.b0.h() != 0) {
                    tyVar.C0.W.e(true, z11);
                } else {
                    tyVar.C0.W.e(false, z11);
                }
            }
        }
        if (z10 && tyVar.C0.b0.h() == 0) {
            dy dyVar2 = tyVar.C0;
            dyVar2.d0.a();
            dyVar2.V.invalidate();
            dyVar2.S0 = 0;
        }
    }
}
