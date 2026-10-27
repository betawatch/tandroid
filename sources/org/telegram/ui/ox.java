package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ox {
    public final /* synthetic */ ey a;

    public ox(ey eyVar) {
        this.a = eyVar;
    }

    public final long a() {
        ey eyVar = this.a;
        vw vwVar = eyVar.G3;
        if (vwVar == null || !(vwVar.getFragment() instanceof cf1)) {
            return 0L;
        }
        return -((cf1) eyVar.G3.getFragment()).a;
    }

    public final void b() {
        ey eyVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eyVar.getParentActivity());
        org.telegram.ui.Components.xo0 xo0Var = eyVar.C0.d0;
        if (xo0Var.N && xo0Var.O()) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertPartialTitle);
            org.telegram.ui.Components.xo0 xo0Var2 = eyVar.C0.d0;
            ArrayList arrayList = xo0Var2.N ? xo0Var2.v0 : xo0Var2.u0;
            alertDialog$Builder.a.T = LocaleController.formatPluralString("ClearSearchAlertPartial", arrayList != null ? arrayList.size() : 0, new Object[0]);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.nx
                public final /* synthetic */ ox b;

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
                            ey eyVar2 = this.b.a;
                            if (!eyVar2.C0.d0.O()) {
                                org.telegram.ui.Components.xo0 xo0Var3 = eyVar2.C0.d0;
                                xo0Var3.j0.c();
                                xo0Var3.J.clear();
                                xo0Var3.l();
                                break;
                            } else {
                                eyVar2.C0.d0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearSearchAlert);
            final int i11 = 1;
            alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.nx
                public final /* synthetic */ ox b;

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
                            ey eyVar2 = this.b.a;
                            if (!eyVar2.C0.d0.O()) {
                                org.telegram.ui.Components.xo0 xo0Var3 = eyVar2.C0.d0;
                                xo0Var3.j0.c();
                                xo0Var3.J.clear();
                                xo0Var3.l();
                                break;
                            } else {
                                eyVar2.C0.d0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        eyVar.showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, eyVar.getResourceProvider());
        }
    }

    public final void c() {
        mx mxVar = this.a.C0;
        if (mxVar != null) {
            org.telegram.ui.Components.rl0 rl0Var = mxVar.f0;
            int i10 = mxVar.U0;
            rl0Var.b(i10 > 0 ? i10 + 1 : 0);
            mxVar.U0 = mxVar.d0.h();
        }
    }

    public final void d(boolean z10, boolean z11) {
        ey eyVar = this.a;
        if (eyVar.C0.b0.getVisibility() == 0) {
            z11 = true;
        }
        if (eyVar.j2 && eyVar.k2) {
            mx mxVar = eyVar.C0;
            if (mxVar.b0 != null) {
                if (z10 || mxVar.d0.h() != 0) {
                    eyVar.C0.b0.e(true, z11);
                } else {
                    eyVar.C0.b0.e(false, z11);
                }
            }
        }
        if (z10 && eyVar.C0.d0.h() == 0) {
            mx mxVar2 = eyVar.C0;
            mxVar2.f0.a();
            mxVar2.a0.invalidate();
            mxVar2.U0 = 0;
        }
    }
}
