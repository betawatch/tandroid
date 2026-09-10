package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class iy {
    public final /* synthetic */ wy a;

    public iy(wy wyVar) {
        this.a = wyVar;
    }

    public final long a() {
        wy wyVar = this.a;
        qx qxVar = wyVar.F3;
        if (qxVar == null || !(qxVar.getFragment() instanceof ig1)) {
            return 0L;
        }
        return -((ig1) wyVar.F3.getFragment()).a;
    }

    public final void b() {
        wy wyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.getParentActivity());
        org.telegram.ui.Components.ao0 ao0Var = wyVar.C0.b0;
        if (ao0Var.N && ao0Var.P()) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.ao0 ao0Var2 = wyVar.C0.b0;
            ArrayList arrayList = ao0Var2.N ? ao0Var2.v0 : ao0Var2.u0;
            alertDialog$Builder.a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.hy
                public final /* synthetic */ iy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.a.C0.b0.E();
                            break;
                        default:
                            wy wyVar2 = this.b.a;
                            if (!wyVar2.C0.b0.P()) {
                                org.telegram.ui.Components.ao0 ao0Var3 = wyVar2.C0.b0;
                                ao0Var3.j0.c();
                                ao0Var3.J.clear();
                                ao0Var3.l();
                                break;
                            } else {
                                wyVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.hy
                public final /* synthetic */ iy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.a.C0.b0.E();
                            break;
                        default:
                            wy wyVar2 = this.b.a;
                            if (!wyVar2.C0.b0.P()) {
                                org.telegram.ui.Components.ao0 ao0Var3 = wyVar2.C0.b0;
                                ao0Var3.j0.c();
                                ao0Var3.J.clear();
                                ao0Var3.l();
                                break;
                            } else {
                                wyVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        wyVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        }
    }

    public final void c() {
        gy gyVar = this.a.C0;
        if (gyVar != null) {
            org.telegram.ui.Components.zk0 zk0Var = gyVar.d0;
            int i10 = gyVar.S0;
            zk0Var.b(i10 > 0 ? i10 + 1 : 0);
            gyVar.S0 = gyVar.b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        wy wyVar = this.a;
        if (wyVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (wyVar.j2 && wyVar.k2) {
            gy gyVar = wyVar.C0;
            if (gyVar.W != null) {
                if (z10 || gyVar.b0.h() != 0) {
                    wyVar.C0.W.e(true, z11);
                } else {
                    wyVar.C0.W.e(false, z11);
                }
            }
        }
        if (z10 && wyVar.C0.b0.h() == 0) {
            gy gyVar2 = wyVar.C0;
            gyVar2.d0.a();
            gyVar2.V.invalidate();
            gyVar2.S0 = 0;
        }
    }
}
