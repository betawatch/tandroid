package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ay {
    public final /* synthetic */ py a;

    public ay(py pyVar) {
        this.a = pyVar;
    }

    public final long a() {
        py pyVar = this.a;
        kx kxVar = pyVar.C3;
        if (kxVar == null || !(kxVar.getFragment() instanceof mf1)) {
            return 0L;
        }
        return -((mf1) pyVar.C3.getFragment()).a;
    }

    public final void b() {
        py pyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pyVar.getParentActivity());
        org.telegram.ui.Components.xn0 xn0Var = pyVar.z0.V;
        if (xn0Var.K && xn0Var.P()) {
            alertDialog$Builder.a.O = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.xn0 xn0Var2 = pyVar.z0.V;
            ArrayList arrayList = xn0Var2.K ? xn0Var2.s0 : xn0Var2.r0;
            alertDialog$Builder.a.Q = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.zx
                public final /* synthetic */ ay b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.a.z0.V.E();
                            break;
                        default:
                            py pyVar2 = this.b.a;
                            if (!pyVar2.z0.V.P()) {
                                org.telegram.ui.Components.xn0 xn0Var3 = pyVar2.z0.V;
                                xn0Var3.g0.c();
                                xn0Var3.G.clear();
                                xn0Var3.l();
                                break;
                            } else {
                                pyVar2.z0.V.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.O = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.zx
                public final /* synthetic */ ay b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.a.z0.V.E();
                            break;
                        default:
                            py pyVar2 = this.b.a;
                            if (!pyVar2.z0.V.P()) {
                                org.telegram.ui.Components.xn0 xn0Var3 = pyVar2.z0.V;
                                xn0Var3.g0.c();
                                xn0Var3.G.clear();
                                xn0Var3.l();
                                break;
                            } else {
                                pyVar2.z0.V.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        pyVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.q7));
        }
    }

    public final void c() {
        yx yxVar = this.a.z0;
        if (yxVar != null) {
            org.telegram.ui.Components.al0 al0Var = yxVar.a0;
            int i10 = yxVar.P0;
            al0Var.b(i10 > 0 ? i10 + 1 : 0);
            yxVar.P0 = yxVar.V.h();
        }
    }

    public final void d(boolean z4, boolean z10) {
        py pyVar = this.a;
        if (pyVar.z0.T.getVisibility() == 0) {
            z10 = true;
        }
        if (pyVar.g2 && pyVar.h2) {
            yx yxVar = pyVar.z0;
            if (yxVar.T != null) {
                if (z4 || yxVar.V.h() != 0) {
                    pyVar.z0.T.e(true, z10);
                } else {
                    pyVar.z0.T.e(false, z10);
                }
            }
        }
        if (z4 && pyVar.z0.V.h() == 0) {
            yx yxVar2 = pyVar.z0;
            yxVar2.a0.a();
            yxVar2.S.invalidate();
            yxVar2.P0 = 0;
        }
    }
}
