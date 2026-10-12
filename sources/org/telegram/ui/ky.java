package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ky {
    public final /* synthetic */ yy a;

    public ky(yy yyVar) {
        this.a = yyVar;
    }

    public final long a() {
        yy yyVar = this.a;
        sx sxVar = yyVar.F3;
        if (sxVar == null || !(sxVar.getFragment() instanceof lg1)) {
            return 0L;
        }
        return -((lg1) yyVar.F3.getFragment()).a;
    }

    public final void b() {
        yy yyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yyVar.getParentActivity());
        org.telegram.ui.Components.so0 so0Var = yyVar.C0.b0;
        if (so0Var.N && so0Var.P()) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.so0 so0Var2 = yyVar.C0.b0;
            ArrayList arrayList = so0Var2.N ? so0Var2.v0 : so0Var2.u0;
            alertDialog$Builder.a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.jy
                public final /* synthetic */ ky b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.z1
                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.a.C0.b0.E();
                            break;
                        default:
                            yy yyVar2 = this.b.a;
                            if (!yyVar2.C0.b0.P()) {
                                org.telegram.ui.Components.so0 so0Var3 = yyVar2.C0.b0;
                                so0Var3.j0.c();
                                so0Var3.J.clear();
                                so0Var3.l();
                                break;
                            } else {
                                yyVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.jy
                public final /* synthetic */ ky b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.z1
                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.a.C0.b0.E();
                            break;
                        default:
                            yy yyVar2 = this.b.a;
                            if (!yyVar2.C0.b0.P()) {
                                org.telegram.ui.Components.so0 so0Var3 = yyVar2.C0.b0;
                                so0Var3.j0.c();
                                so0Var3.J.clear();
                                so0Var3.l();
                                break;
                            } else {
                                yyVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        yyVar.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(yyVar.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
        }
    }

    public final void c() {
        iy iyVar = this.a.C0;
        if (iyVar != null) {
            org.telegram.ui.Components.rl0 rl0Var = iyVar.d0;
            int i10 = iyVar.S0;
            rl0Var.b(i10 > 0 ? i10 + 1 : 0);
            iyVar.S0 = iyVar.b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        yy yyVar = this.a;
        if (yyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (yyVar.j2 && yyVar.k2) {
            iy iyVar = yyVar.C0;
            if (iyVar.W != null) {
                if (z10 || iyVar.b0.h() != 0) {
                    yyVar.C0.W.e(true, z11);
                } else {
                    yyVar.C0.W.e(false, z11);
                }
            }
        }
        if (z10 && yyVar.C0.b0.h() == 0) {
            iy iyVar2 = yyVar.C0;
            iyVar2.d0.a();
            iyVar2.V.invalidate();
            iyVar2.S0 = 0;
        }
    }
}
