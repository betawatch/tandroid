package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class mw {
    public final /* synthetic */ cx a;

    public mw(cx cxVar) {
        this.a = cxVar;
    }

    public final long a() {
        cx cxVar = this.a;
        xv xvVar = cxVar.H3;
        if (xvVar == null || !(xvVar.getFragment() instanceof y91)) {
            return 0L;
        }
        return -((y91) cxVar.H3.getFragment()).a;
    }

    public final void b() {
        cx cxVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cxVar.getParentActivity());
        org.telegram.ui.Components.nm0 nm0Var = cxVar.D0.e0;
        boolean z10 = nm0Var.O;
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        if (z10 && nm0Var.O()) {
            t1Var.S = org.telegram.messenger.hd.N0(2131752047, null);
            org.telegram.ui.Components.nm0 nm0Var2 = cxVar.D0.e0;
            ArrayList arrayList = nm0Var2.O ? nm0Var2.w0 : nm0Var2.v0;
            final int i7 = 0;
            t1Var.U = org.telegram.messenger.hd.G(arrayList != null ? arrayList.size() : 0, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752089, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.lw
                public final /* synthetic */ mw b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                    switch (i7) {
                        case 0:
                            this.b.a.D0.e0.E();
                            break;
                        default:
                            cx cxVar2 = this.b.a;
                            if (!cxVar2.D0.e0.O()) {
                                org.telegram.ui.Components.nm0 nm0Var3 = cxVar2.D0.e0;
                                nm0Var3.k0.c();
                                nm0Var3.K.clear();
                                nm0Var3.f();
                                break;
                            } else {
                                cxVar2.D0.e0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            t1Var.S = org.telegram.messenger.hd.N0(2131752044, null);
            t1Var.U = org.telegram.messenger.hd.N0(2131752049, null);
            final int i10 = 1;
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752087, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.lw
                public final /* synthetic */ mw b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i102) {
                    switch (i10) {
                        case 0:
                            this.b.a.D0.e0.E();
                            break;
                        default:
                            cx cxVar2 = this.b.a;
                            if (!cxVar2.D0.e0.O()) {
                                org.telegram.ui.Components.nm0 nm0Var3 = cxVar2.D0.e0;
                                nm0Var3.k0.c();
                                nm0Var3.K.clear();
                                nm0Var3.f();
                                break;
                            } else {
                                cxVar2.D0.e0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        cxVar.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, cxVar.getResourceProvider());
        }
    }

    public final void c() {
        kw kwVar = this.a.D0;
        if (kwVar != null) {
            org.telegram.ui.Components.hj0 hj0Var = kwVar.g0;
            int i7 = kwVar.V0;
            hj0Var.b(i7 > 0 ? i7 + 1 : 0);
            kwVar.V0 = kwVar.e0.b();
        }
    }

    public final void d(boolean z10, boolean z11) {
        cx cxVar = this.a;
        if (cxVar.D0.c0.getVisibility() == 0) {
            z11 = true;
        }
        if (cxVar.l2 && cxVar.m2) {
            kw kwVar = cxVar.D0;
            if (kwVar.c0 != null) {
                if (z10 || kwVar.e0.b() != 0) {
                    cxVar.D0.c0.e(true, z11);
                } else {
                    cxVar.D0.c0.e(false, z11);
                }
            }
        }
        if (z10 && cxVar.D0.e0.b() == 0) {
            kw kwVar2 = cxVar.D0;
            kwVar2.g0.a();
            kwVar2.b0.invalidate();
            kwVar2.V0 = 0;
        }
    }
}
