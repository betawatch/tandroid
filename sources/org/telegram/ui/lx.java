package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lx {
    public final /* synthetic */ cy a;

    public lx(cy cyVar) {
        this.a = cyVar;
    }

    public final long a() {
        cy cyVar = this.a;
        tw twVar = cyVar.G3;
        if (twVar == null || !(twVar.getFragment() instanceof af1)) {
            return 0L;
        }
        return -((af1) cyVar.G3.getFragment()).a;
    }

    public final void b() {
        cy cyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cyVar.getParentActivity());
        org.telegram.ui.Components.wo0 wo0Var = cyVar.C0.d0;
        if (wo0Var.N && wo0Var.O()) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.wo0 wo0Var2 = cyVar.C0.d0;
            ArrayList arrayList = wo0Var2.N ? wo0Var2.v0 : wo0Var2.u0;
            alertDialog$Builder.a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.kx
                public final /* synthetic */ lx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.a.C0.d0.E();
                            break;
                        default:
                            cy cyVar2 = this.b.a;
                            if (!cyVar2.C0.d0.O()) {
                                org.telegram.ui.Components.wo0 wo0Var3 = cyVar2.C0.d0;
                                wo0Var3.j0.c();
                                wo0Var3.J.clear();
                                wo0Var3.l();
                                break;
                            } else {
                                cyVar2.C0.d0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.kx
                public final /* synthetic */ lx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.a.C0.d0.E();
                            break;
                        default:
                            cy cyVar2 = this.b.a;
                            if (!cyVar2.C0.d0.O()) {
                                org.telegram.ui.Components.wo0 wo0Var3 = cyVar2.C0.d0;
                                wo0Var3.j0.c();
                                wo0Var3.J.clear();
                                wo0Var3.l();
                                break;
                            } else {
                                cyVar2.C0.d0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        cyVar.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, cyVar.getResourceProvider());
        }
    }

    public final void c() {
        jx jxVar = this.a.C0;
        if (jxVar != null) {
            org.telegram.ui.Components.ql0 ql0Var = jxVar.f0;
            int i10 = jxVar.U0;
            ql0Var.b(i10 > 0 ? i10 + 1 : 0);
            jxVar.U0 = jxVar.d0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        cy cyVar = this.a;
        if (cyVar.C0.b0.getVisibility() == 0) {
            z11 = true;
        }
        if (cyVar.j2 && cyVar.k2) {
            jx jxVar = cyVar.C0;
            if (jxVar.b0 != null) {
                if (z10 || jxVar.d0.h() != 0) {
                    cyVar.C0.b0.e(true, z11);
                } else {
                    cyVar.C0.b0.e(false, z11);
                }
            }
        }
        if (z10 && cyVar.C0.d0.h() == 0) {
            jx jxVar2 = cyVar.C0;
            jxVar2.f0.a();
            jxVar2.a0.invalidate();
            jxVar2.U0 = 0;
        }
    }
}
