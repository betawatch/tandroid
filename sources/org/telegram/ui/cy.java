package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class cy {
    public final /* synthetic */ qy a;

    public cy(qy qyVar) {
        this.a = qyVar;
    }

    public final long a() {
        qy qyVar = this.a;
        kx kxVar = qyVar.F3;
        if (kxVar == null || !(kxVar.getFragment() instanceof wf1)) {
            return 0L;
        }
        return -((wf1) qyVar.F3.getFragment()).a;
    }

    public final void b() {
        qy qyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar.getParentActivity());
        org.telegram.ui.Components.eo0 eo0Var = qyVar.C0.b0;
        if (eo0Var.N && eo0Var.P()) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.eo0 eo0Var2 = qyVar.C0.b0;
            ArrayList arrayList = eo0Var2.N ? eo0Var2.v0 : eo0Var2.u0;
            alertDialog$Builder.a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.ay
                public final /* synthetic */ cy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.z1
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.a.C0.b0.E();
                            break;
                        default:
                            qy qyVar2 = this.b.a;
                            if (!qyVar2.C0.b0.P()) {
                                org.telegram.ui.Components.eo0 eo0Var3 = qyVar2.C0.b0;
                                eo0Var3.j0.c();
                                eo0Var3.J.clear();
                                eo0Var3.l();
                                break;
                            } else {
                                qyVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.ay
                public final /* synthetic */ cy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.z1
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.a.C0.b0.E();
                            break;
                        default:
                            qy qyVar2 = this.b.a;
                            if (!qyVar2.C0.b0.P()) {
                                org.telegram.ui.Components.eo0 eo0Var3 = qyVar2.C0.b0;
                                eo0Var3.j0.c();
                                eo0Var3.J.clear();
                                eo0Var3.l();
                                break;
                            } else {
                                qyVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
        qyVar.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
        }
    }

    public final void c() {
        zx zxVar = this.a.C0;
        if (zxVar != null) {
            org.telegram.ui.Components.bl0 bl0Var = zxVar.d0;
            int i10 = zxVar.S0;
            bl0Var.b(i10 > 0 ? i10 + 1 : 0);
            zxVar.S0 = zxVar.b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        qy qyVar = this.a;
        if (qyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (qyVar.j2 && qyVar.k2) {
            zx zxVar = qyVar.C0;
            if (zxVar.W != null) {
                if (z10 || zxVar.b0.h() != 0) {
                    qyVar.C0.W.e(true, z11);
                } else {
                    qyVar.C0.W.e(false, z11);
                }
            }
        }
        if (z10 && qyVar.C0.b0.h() == 0) {
            zx zxVar2 = qyVar.C0;
            zxVar2.d0.a();
            zxVar2.V.invalidate();
            zxVar2.S0 = 0;
        }
    }
}
