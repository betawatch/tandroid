package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class px {
    public final /* synthetic */ ey a;

    public px(ey eyVar) {
        this.a = eyVar;
    }

    public final long a() {
        ey eyVar = this.a;
        yw ywVar = eyVar.G3;
        if (ywVar == null || !(ywVar.getFragment() instanceof te1)) {
            return 0L;
        }
        return -((te1) eyVar.G3.getFragment()).a;
    }

    public final void b() {
        ey eyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity());
        org.telegram.ui.Components.oo0 oo0Var = eyVar.C0.b0;
        if (oo0Var.N && oo0Var.P()) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.oo0 oo0Var2 = eyVar.C0.b0;
            ArrayList arrayList = oo0Var2.N ? oo0Var2.v0 : oo0Var2.u0;
            alertDialog$Builder.a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.ox
                public final /* synthetic */ px b;

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
                            ey eyVar2 = this.b.a;
                            if (!eyVar2.C0.b0.P()) {
                                org.telegram.ui.Components.oo0 oo0Var3 = eyVar2.C0.b0;
                                oo0Var3.j0.c();
                                oo0Var3.J.clear();
                                oo0Var3.l();
                                break;
                            } else {
                                eyVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.ox
                public final /* synthetic */ px b;

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
                            ey eyVar2 = this.b.a;
                            if (!eyVar2.C0.b0.P()) {
                                org.telegram.ui.Components.oo0 oo0Var3 = eyVar2.C0.b0;
                                oo0Var3.j0.c();
                                oo0Var3.J.clear();
                                oo0Var3.l();
                                break;
                            } else {
                                eyVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        eyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(eyVar.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
        }
    }

    public final void c() {
        nx nxVar = this.a.C0;
        if (nxVar != null) {
            org.telegram.ui.Components.nl0 nl0Var = nxVar.d0;
            int i10 = nxVar.S0;
            nl0Var.b(i10 > 0 ? i10 + 1 : 0);
            nxVar.S0 = nxVar.b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        ey eyVar = this.a;
        if (eyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (eyVar.j2 && eyVar.k2) {
            nx nxVar = eyVar.C0;
            if (nxVar.W != null) {
                if (z10 || nxVar.b0.h() != 0) {
                    eyVar.C0.W.e(true, z11);
                } else {
                    eyVar.C0.W.e(false, z11);
                }
            }
        }
        if (z10 && eyVar.C0.b0.h() == 0) {
            nx nxVar2 = eyVar.C0;
            nxVar2.d0.a();
            nxVar2.V.invalidate();
            nxVar2.S0 = 0;
        }
    }
}
