package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class gy {
    public final /* synthetic */ uy a;

    public gy(uy uyVar) {
        this.a = uyVar;
    }

    public final long a() {
        uy uyVar = this.a;
        ox oxVar = uyVar.F3;
        if (oxVar == null || !(oxVar.getFragment() instanceof eg1)) {
            return 0L;
        }
        return -((eg1) uyVar.F3.getFragment()).a;
    }

    public final void b() {
        uy uyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
        org.telegram.ui.Components.rn0 rn0Var = uyVar.C0.b0;
        if (rn0Var.N && rn0Var.P()) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.rn0 rn0Var2 = uyVar.C0.b0;
            ArrayList arrayList = rn0Var2.N ? rn0Var2.v0 : rn0Var2.u0;
            alertDialog$Builder.a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.fy
                public final /* synthetic */ gy b;

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
                            uy uyVar2 = this.b.a;
                            if (!uyVar2.C0.b0.P()) {
                                org.telegram.ui.Components.rn0 rn0Var3 = uyVar2.C0.b0;
                                rn0Var3.j0.c();
                                rn0Var3.J.clear();
                                rn0Var3.l();
                                break;
                            } else {
                                uyVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.fy
                public final /* synthetic */ gy b;

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
                            uy uyVar2 = this.b.a;
                            if (!uyVar2.C0.b0.P()) {
                                org.telegram.ui.Components.rn0 rn0Var3 = uyVar2.C0.b0;
                                rn0Var3.j0.c();
                                rn0Var3.J.clear();
                                rn0Var3.l();
                                break;
                            } else {
                                uyVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        uyVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        }
    }

    public final void c() {
        ey eyVar = this.a.C0;
        if (eyVar != null) {
            org.telegram.ui.Components.qk0 qk0Var = eyVar.d0;
            int i10 = eyVar.S0;
            qk0Var.b(i10 > 0 ? i10 + 1 : 0);
            eyVar.S0 = eyVar.b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        uy uyVar = this.a;
        if (uyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (uyVar.j2 && uyVar.k2) {
            ey eyVar = uyVar.C0;
            if (eyVar.W != null) {
                if (z10 || eyVar.b0.h() != 0) {
                    uyVar.C0.W.e(true, z11);
                } else {
                    uyVar.C0.W.e(false, z11);
                }
            }
        }
        if (z10 && uyVar.C0.b0.h() == 0) {
            ey eyVar2 = uyVar.C0;
            eyVar2.d0.a();
            eyVar2.V.invalidate();
            eyVar2.S0 = 0;
        }
    }
}
