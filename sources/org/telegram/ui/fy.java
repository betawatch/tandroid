package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class fy {
    public final /* synthetic */ uy a;

    public fy(uy uyVar) {
        this.a = uyVar;
    }

    public final long a() {
        uy uyVar = this.a;
        mx mxVar = uyVar.F3;
        if (mxVar == null || !(mxVar.getFragment() instanceof wf1)) {
            return 0L;
        }
        return -((wf1) uyVar.F3.getFragment()).a;
    }

    public final void b() {
        uy uyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
        org.telegram.ui.Components.jo0 jo0Var = uyVar.C0.d0;
        if (jo0Var.N && jo0Var.P()) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.jo0 jo0Var2 = uyVar.C0.d0;
            ArrayList arrayList = jo0Var2.N ? jo0Var2.v0 : jo0Var2.u0;
            alertDialog$Builder.a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.ey
                public final /* synthetic */ fy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.a.C0.d0.E();
                            break;
                        default:
                            uy uyVar2 = this.b.a;
                            if (!uyVar2.C0.d0.P()) {
                                org.telegram.ui.Components.jo0 jo0Var3 = uyVar2.C0.d0;
                                jo0Var3.j0.c();
                                jo0Var3.J.clear();
                                jo0Var3.l();
                                break;
                            } else {
                                uyVar2.C0.d0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.a2(this) { // from class: org.telegram.ui.ey
                public final /* synthetic */ fy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.a.C0.d0.E();
                            break;
                        default:
                            uy uyVar2 = this.b.a;
                            if (!uyVar2.C0.d0.P()) {
                                org.telegram.ui.Components.jo0 jo0Var3 = uyVar2.C0.d0;
                                jo0Var3.j0.c();
                                jo0Var3.J.clear();
                                jo0Var3.l();
                                break;
                            } else {
                                uyVar2.C0.d0.E();
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
            textView.setTextColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.q7));
        }
    }

    public final void c() {
        dy dyVar = this.a.C0;
        if (dyVar != null) {
            org.telegram.ui.Components.dl0 dl0Var = dyVar.f0;
            int i10 = dyVar.U0;
            dl0Var.b(i10 > 0 ? i10 + 1 : 0);
            dyVar.U0 = dyVar.d0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        uy uyVar = this.a;
        if (uyVar.C0.b0.getVisibility() == 0) {
            z11 = true;
        }
        if (uyVar.j2 && uyVar.k2) {
            dy dyVar = uyVar.C0;
            if (dyVar.b0 != null) {
                if (z10 || dyVar.d0.h() != 0) {
                    uyVar.C0.b0.e(true, z11);
                } else {
                    uyVar.C0.b0.e(false, z11);
                }
            }
        }
        if (z10 && uyVar.C0.d0.h() == 0) {
            dy dyVar2 = uyVar.C0;
            dyVar2.f0.a();
            dyVar2.a0.invalidate();
            dyVar2.U0 = 0;
        }
    }
}
