package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class nx {
    public final /* synthetic */ cy a;

    public nx(cy cyVar) {
        this.a = cyVar;
    }

    public final long a() {
        cy cyVar = this.a;
        ww wwVar = cyVar.G3;
        if (wwVar == null || !(wwVar.getFragment() instanceof re1)) {
            return 0L;
        }
        return -((re1) cyVar.G3.getFragment()).a;
    }

    public final void b() {
        cy cyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cyVar.getParentActivity());
        org.telegram.ui.Components.oo0 oo0Var = cyVar.C0.b0;
        if (oo0Var.N && oo0Var.P()) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.oo0 oo0Var2 = cyVar.C0.b0;
            ArrayList arrayList = oo0Var2.N ? oo0Var2.v0 : oo0Var2.u0;
            alertDialog$Builder.a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.mx
                public final /* synthetic */ nx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.a.C0.b0.E();
                            break;
                        default:
                            cy cyVar2 = this.b.a;
                            if (!cyVar2.C0.b0.P()) {
                                org.telegram.ui.Components.oo0 oo0Var3 = cyVar2.C0.b0;
                                oo0Var3.j0.c();
                                oo0Var3.J.clear();
                                oo0Var3.l();
                                break;
                            } else {
                                cyVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.mx
                public final /* synthetic */ nx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.a.C0.b0.E();
                            break;
                        default:
                            cy cyVar2 = this.b.a;
                            if (!cyVar2.C0.b0.P()) {
                                org.telegram.ui.Components.oo0 oo0Var3 = cyVar2.C0.b0;
                                oo0Var3.j0.c();
                                oo0Var3.J.clear();
                                oo0Var3.l();
                                break;
                            } else {
                                cyVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        cyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(cyVar.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
        }
    }

    public final void c() {
        lx lxVar = this.a.C0;
        if (lxVar != null) {
            org.telegram.ui.Components.nl0 nl0Var = lxVar.d0;
            int i10 = lxVar.S0;
            nl0Var.b(i10 > 0 ? i10 + 1 : 0);
            lxVar.S0 = lxVar.b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        cy cyVar = this.a;
        if (cyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (cyVar.j2 && cyVar.k2) {
            lx lxVar = cyVar.C0;
            if (lxVar.W != null) {
                if (z10 || lxVar.b0.h() != 0) {
                    cyVar.C0.W.e(true, z11);
                } else {
                    cyVar.C0.W.e(false, z11);
                }
            }
        }
        if (z10 && cyVar.C0.b0.h() == 0) {
            lx lxVar2 = cyVar.C0;
            lxVar2.d0.a();
            lxVar2.V.invalidate();
            lxVar2.S0 = 0;
        }
    }
}
