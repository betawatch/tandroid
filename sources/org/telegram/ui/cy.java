package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cy {
    public final /* synthetic */ qy a;

    public cy(qy qyVar) {
        this.a = qyVar;
    }

    public final long a() {
        qy qyVar = this.a;
        lx lxVar = qyVar.C3;
        if (lxVar == null || !(lxVar.getFragment() instanceof sf1)) {
            return 0L;
        }
        return -((sf1) qyVar.C3.getFragment()).a;
    }

    public final void b() {
        qy qyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qyVar.getParentActivity());
        org.telegram.ui.Components.vn0 vn0Var = qyVar.z0.V;
        if (vn0Var.K && vn0Var.P()) {
            alertDialog$Builder.a.O = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.vn0 vn0Var2 = qyVar.z0.V;
            ArrayList arrayList = vn0Var2.K ? vn0Var2.s0 : vn0Var2.r0;
            alertDialog$Builder.a.Q = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.ay
                public final /* synthetic */ cy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.a.z0.V.E();
                            break;
                        default:
                            qy qyVar2 = this.b.a;
                            if (!qyVar2.z0.V.P()) {
                                org.telegram.ui.Components.vn0 vn0Var3 = qyVar2.z0.V;
                                vn0Var3.g0.c();
                                vn0Var3.G.clear();
                                vn0Var3.l();
                                break;
                            } else {
                                qyVar2.z0.V.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.O = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.c2(this) { // from class: org.telegram.ui.ay
                public final /* synthetic */ cy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.a.z0.V.E();
                            break;
                        default:
                            qy qyVar2 = this.b.a;
                            if (!qyVar2.z0.V.P()) {
                                org.telegram.ui.Components.vn0 vn0Var3 = qyVar2.z0.V;
                                vn0Var3.g0.c();
                                vn0Var3.G.clear();
                                vn0Var3.l();
                                break;
                            } else {
                                qyVar2.z0.V.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        qyVar.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        }
    }

    public final void c() {
        zx zxVar = this.a.z0;
        if (zxVar != null) {
            org.telegram.ui.Components.yk0 yk0Var = zxVar.a0;
            int i10 = zxVar.P0;
            yk0Var.b(i10 > 0 ? i10 + 1 : 0);
            zxVar.P0 = zxVar.V.h();
        }
    }

    public final void d(boolean z4, boolean z10) {
        qy qyVar = this.a;
        if (qyVar.z0.T.getVisibility() == 0) {
            z10 = true;
        }
        if (qyVar.g2 && qyVar.h2) {
            zx zxVar = qyVar.z0;
            if (zxVar.T != null) {
                if (z4 || zxVar.V.h() != 0) {
                    qyVar.z0.T.e(true, z10);
                } else {
                    qyVar.z0.T.e(false, z10);
                }
            }
        }
        if (z4 && qyVar.z0.V.h() == 0) {
            zx zxVar2 = qyVar.z0;
            zxVar2.a0.a();
            zxVar2.S.invalidate();
            zxVar2.P0 = 0;
        }
    }
}
