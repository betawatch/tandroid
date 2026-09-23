package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class dy {
    public final /* synthetic */ ry a;

    public dy(ry ryVar) {
        this.a = ryVar;
    }

    public final long a() {
        ry ryVar = this.a;
        lx lxVar = ryVar.F3;
        if (lxVar == null || !(lxVar.getFragment() instanceof wf1)) {
            return 0L;
        }
        return -((wf1) ryVar.F3.getFragment()).a;
    }

    public final void b() {
        ry ryVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ryVar.getParentActivity());
        org.telegram.ui.Components.rn0 rn0Var = ryVar.C0.b0;
        if (rn0Var.N && rn0Var.P()) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.rn0 rn0Var2 = ryVar.C0.b0;
            ArrayList arrayList = rn0Var2.N ? rn0Var2.v0 : rn0Var2.u0;
            alertDialog$Builder.a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.cy
                public final /* synthetic */ dy b;

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
                            ry ryVar2 = this.b.a;
                            if (!ryVar2.C0.b0.P()) {
                                org.telegram.ui.Components.rn0 rn0Var3 = ryVar2.C0.b0;
                                rn0Var3.j0.c();
                                rn0Var3.J.clear();
                                rn0Var3.l();
                                break;
                            } else {
                                ryVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.cy
                public final /* synthetic */ dy b;

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
                            ry ryVar2 = this.b.a;
                            if (!ryVar2.C0.b0.P()) {
                                org.telegram.ui.Components.rn0 rn0Var3 = ryVar2.C0.b0;
                                rn0Var3.j0.c();
                                rn0Var3.J.clear();
                                rn0Var3.l();
                                break;
                            } else {
                                ryVar2.C0.b0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        ryVar.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
        }
    }

    public final void c() {
        ay ayVar = this.a.C0;
        if (ayVar != null) {
            org.telegram.ui.Components.rk0 rk0Var = ayVar.d0;
            int i10 = ayVar.S0;
            rk0Var.b(i10 > 0 ? i10 + 1 : 0);
            ayVar.S0 = ayVar.b0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        ry ryVar = this.a;
        if (ryVar.C0.W.getVisibility() == 0) {
            z11 = true;
        }
        if (ryVar.j2 && ryVar.k2) {
            ay ayVar = ryVar.C0;
            if (ayVar.W != null) {
                if (z10 || ayVar.b0.h() != 0) {
                    ryVar.C0.W.e(true, z11);
                } else {
                    ryVar.C0.W.e(false, z11);
                }
            }
        }
        if (z10 && ryVar.C0.b0.h() == 0) {
            ay ayVar2 = ryVar.C0;
            ayVar2.d0.a();
            ayVar2.V.invalidate();
            ayVar2.S0 = 0;
        }
    }
}
