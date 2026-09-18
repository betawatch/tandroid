package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class iy {
    public final /* synthetic */ wy a;

    public iy(wy wyVar) {
        this.a = wyVar;
    }

    public final long a() {
        wy wyVar = this.a;
        qx qxVar = wyVar.F3;
        if (qxVar == null || !(qxVar.getFragment() instanceof fg1)) {
            return 0L;
        }
        return -((fg1) wyVar.F3.getFragment()).a;
    }

    public final void b() {
        wy wyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.getParentActivity());
        org.telegram.ui.Components.sn0 sn0Var = wyVar.C0.c0;
        if (sn0Var.N && sn0Var.P()) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.sn0 sn0Var2 = wyVar.C0.c0;
            ArrayList arrayList = sn0Var2.N ? sn0Var2.v0 : sn0Var2.u0;
            alertDialog$Builder.a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.hy
                public final /* synthetic */ iy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.a.C0.c0.E();
                            break;
                        default:
                            wy wyVar2 = this.b.a;
                            if (!wyVar2.C0.c0.P()) {
                                org.telegram.ui.Components.sn0 sn0Var3 = wyVar2.C0.c0;
                                sn0Var3.j0.c();
                                sn0Var3.J.clear();
                                sn0Var3.l();
                                break;
                            } else {
                                wyVar2.C0.c0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.hy
                public final /* synthetic */ iy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.a.C0.c0.E();
                            break;
                        default:
                            wy wyVar2 = this.b.a;
                            if (!wyVar2.C0.c0.P()) {
                                org.telegram.ui.Components.sn0 sn0Var3 = wyVar2.C0.c0;
                                sn0Var3.j0.c();
                                sn0Var3.J.clear();
                                sn0Var3.l();
                                break;
                            } else {
                                wyVar2.C0.c0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        wyVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(wyVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        }
    }

    public final void c() {
        gy gyVar = this.a.C0;
        if (gyVar != null) {
            org.telegram.ui.Components.rk0 rk0Var = gyVar.e0;
            int i10 = gyVar.T0;
            rk0Var.b(i10 > 0 ? i10 + 1 : 0);
            gyVar.T0 = gyVar.c0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        wy wyVar = this.a;
        if (wyVar.C0.a0.getVisibility() == 0) {
            z11 = true;
        }
        if (wyVar.j2 && wyVar.k2) {
            gy gyVar = wyVar.C0;
            if (gyVar.a0 != null) {
                if (z10 || gyVar.c0.h() != 0) {
                    wyVar.C0.a0.e(true, z11);
                } else {
                    wyVar.C0.a0.e(false, z11);
                }
            }
        }
        if (z10 && wyVar.C0.c0.h() == 0) {
            gy gyVar2 = wyVar.C0;
            gyVar2.e0.a();
            gyVar2.W.invalidate();
            gyVar2.T0 = 0;
        }
    }
}
