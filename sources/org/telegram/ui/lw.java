package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lw {
    public final /* synthetic */ bx a;

    public lw(bx bxVar) {
        this.a = bxVar;
    }

    public final long a() {
        bx bxVar = this.a;
        wv wvVar = bxVar.H3;
        if (wvVar == null || !(wvVar.getFragment() instanceof w91)) {
            return 0L;
        }
        return -((w91) bxVar.H3.getFragment()).a;
    }

    public final void b() {
        bx bxVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bxVar.getParentActivity());
        org.telegram.ui.Components.mm0 mm0Var = bxVar.D0.e0;
        boolean z10 = mm0Var.O;
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        if (z10 && mm0Var.O()) {
            t1Var.S = org.telegram.messenger.gd.N0(2131752047, null);
            org.telegram.ui.Components.mm0 mm0Var2 = bxVar.D0.e0;
            ArrayList arrayList = mm0Var2.O ? mm0Var2.w0 : mm0Var2.v0;
            final int i7 = 0;
            t1Var.U = org.telegram.messenger.gd.G(arrayList != null ? arrayList.size() : 0, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752089, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.kw
                public final /* synthetic */ lw b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                    switch (i7) {
                        case 0:
                            this.b.a.D0.e0.E();
                            break;
                        default:
                            bx bxVar2 = this.b.a;
                            if (!bxVar2.D0.e0.O()) {
                                org.telegram.ui.Components.mm0 mm0Var3 = bxVar2.D0.e0;
                                mm0Var3.k0.c();
                                mm0Var3.K.clear();
                                mm0Var3.f();
                                break;
                            } else {
                                bxVar2.D0.e0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            t1Var.S = org.telegram.messenger.gd.N0(2131752044, null);
            t1Var.U = org.telegram.messenger.gd.N0(2131752049, null);
            final int i10 = 1;
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752087, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.kw
                public final /* synthetic */ lw b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i102) {
                    switch (i10) {
                        case 0:
                            this.b.a.D0.e0.E();
                            break;
                        default:
                            bx bxVar2 = this.b.a;
                            if (!bxVar2.D0.e0.O()) {
                                org.telegram.ui.Components.mm0 mm0Var3 = bxVar2.D0.e0;
                                mm0Var3.k0.c();
                                mm0Var3.K.clear();
                                mm0Var3.f();
                                break;
                            } else {
                                bxVar2.D0.e0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        bxVar.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, bxVar.getResourceProvider());
        }
    }

    public final void c() {
        jw jwVar = this.a.D0;
        if (jwVar != null) {
            org.telegram.ui.Components.hj0 hj0Var = jwVar.g0;
            int i7 = jwVar.V0;
            hj0Var.b(i7 > 0 ? i7 + 1 : 0);
            jwVar.V0 = jwVar.e0.b();
        }
    }

    public final void d(boolean z10, boolean z11) {
        bx bxVar = this.a;
        if (bxVar.D0.c0.getVisibility() == 0) {
            z11 = true;
        }
        if (bxVar.l2 && bxVar.m2) {
            jw jwVar = bxVar.D0;
            if (jwVar.c0 != null) {
                if (z10 || jwVar.e0.b() != 0) {
                    bxVar.D0.c0.e(true, z11);
                } else {
                    bxVar.D0.c0.e(false, z11);
                }
            }
        }
        if (z10 && bxVar.D0.e0.b() == 0) {
            jw jwVar2 = bxVar.D0;
            jwVar2.g0.a();
            jwVar2.b0.invalidate();
            jwVar2.V0 = 0;
        }
    }
}
