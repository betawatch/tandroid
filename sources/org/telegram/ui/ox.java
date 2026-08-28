package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ox {
    public final /* synthetic */ dy a;

    public ox(dy dyVar) {
        this.a = dyVar;
    }

    public final long a() {
        dy dyVar = this.a;
        yw ywVar = dyVar.B3;
        if (ywVar == null || !(ywVar.getFragment() instanceof we1)) {
            return 0L;
        }
        return -((we1) dyVar.B3.getFragment()).a;
    }

    public final void b() {
        dy dyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dyVar.getParentActivity());
        org.telegram.ui.Components.an0 an0Var = dyVar.y0.U;
        if (an0Var.J && an0Var.P()) {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.an0 an0Var2 = dyVar.y0.U;
            ArrayList arrayList = an0Var2.J ? an0Var2.r0 : an0Var2.q0;
            alertDialog$Builder.a.P = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i9 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.nx
                public final /* synthetic */ ox b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                    switch (i9) {
                        case 0:
                            this.b.a.y0.U.E();
                            break;
                        default:
                            dy dyVar2 = this.b.a;
                            if (!dyVar2.y0.U.P()) {
                                org.telegram.ui.Components.an0 an0Var3 = dyVar2.y0.U;
                                an0Var3.f0.c();
                                an0Var3.F.clear();
                                an0Var3.l();
                                break;
                            } else {
                                dyVar2.y0.U.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.ClearSearchAlert);
            final int i10 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.nx
                public final /* synthetic */ ox b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i102) {
                    switch (i10) {
                        case 0:
                            this.b.a.y0.U.E();
                            break;
                        default:
                            dy dyVar2 = this.b.a;
                            if (!dyVar2.y0.U.P()) {
                                org.telegram.ui.Components.an0 an0Var3 = dyVar2.y0.U;
                                an0Var3.f0.c();
                                an0Var3.F.clear();
                                an0Var3.l();
                                break;
                            } else {
                                dyVar2.y0.U.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        dyVar.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(dyVar.getThemedColor(org.telegram.ui.ActionBar.f6.q7));
        }
    }

    public final void c() {
        mx mxVar = this.a.y0;
        if (mxVar != null) {
            org.telegram.ui.Components.dk0 dk0Var = mxVar.W;
            int i9 = mxVar.O0;
            dk0Var.b(i9 > 0 ? i9 + 1 : 0);
            mxVar.O0 = mxVar.U.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        dy dyVar = this.a;
        if (dyVar.y0.S.getVisibility() == 0) {
            z11 = true;
        }
        if (dyVar.f2 && dyVar.g2) {
            mx mxVar = dyVar.y0;
            if (mxVar.S != null) {
                if (z10 || mxVar.U.h() != 0) {
                    dyVar.y0.S.e(true, z11);
                } else {
                    dyVar.y0.S.e(false, z11);
                }
            }
        }
        if (z10 && dyVar.y0.U.h() == 0) {
            mx mxVar2 = dyVar.y0;
            mxVar2.W.a();
            mxVar2.R.invalidate();
            mxVar2.O0 = 0;
        }
    }
}
