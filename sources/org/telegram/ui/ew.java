package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ew {
    public final /* synthetic */ uw a;

    public ew(uw uwVar) {
        this.a = uwVar;
    }

    public final long a() {
        uw uwVar = this.a;
        pv pvVar = uwVar.G3;
        if (pvVar == null || !(pvVar.getFragment() instanceof m91)) {
            return 0L;
        }
        return -((m91) uwVar.G3.getFragment()).a;
    }

    public final void b() {
        uw uwVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uwVar.getParentActivity());
        org.telegram.ui.Components.bm0 bm0Var = uwVar.D0.e0;
        boolean z10 = bm0Var.O;
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        if (z10 && bm0Var.O()) {
            s1Var.S = org.telegram.messenger.bd.M0(2131752059, null);
            org.telegram.ui.Components.bm0 bm0Var2 = uwVar.D0.e0;
            ArrayList arrayList = bm0Var2.O ? bm0Var2.w0 : bm0Var2.v0;
            final int i3 = 0;
            s1Var.U = org.telegram.messenger.bd.G(arrayList != null ? arrayList.size() : 0, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752101, null), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.dw
                public final /* synthetic */ ew b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.p1
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i10) {
                    switch (i3) {
                        case 0:
                            this.b.a.D0.e0.E();
                            break;
                        default:
                            uw uwVar2 = this.b.a;
                            if (!uwVar2.D0.e0.O()) {
                                org.telegram.ui.Components.bm0 bm0Var3 = uwVar2.D0.e0;
                                bm0Var3.k0.c();
                                bm0Var3.K.clear();
                                bm0Var3.f();
                                break;
                            } else {
                                uwVar2.D0.e0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            s1Var.S = org.telegram.messenger.bd.M0(2131752056, null);
            s1Var.U = org.telegram.messenger.bd.M0(2131752061, null);
            final int i10 = 1;
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752099, null), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.dw
                public final /* synthetic */ ew b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.p1
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i102) {
                    switch (i10) {
                        case 0:
                            this.b.a.D0.e0.E();
                            break;
                        default:
                            uw uwVar2 = this.b.a;
                            if (!uwVar2.D0.e0.O()) {
                                org.telegram.ui.Components.bm0 bm0Var3 = uwVar2.D0.e0;
                                bm0Var3.k0.c();
                                bm0Var3.K.clear();
                                bm0Var3.f();
                                break;
                            } else {
                                uwVar2.D0.e0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        uwVar.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, uwVar.getResourceProvider());
        }
    }

    public final void c() {
        cw cwVar = this.a.D0;
        if (cwVar != null) {
            org.telegram.ui.Components.wi0 wi0Var = cwVar.g0;
            int i3 = cwVar.V0;
            wi0Var.b(i3 > 0 ? i3 + 1 : 0);
            cwVar.V0 = cwVar.e0.b();
        }
    }

    public final void d(boolean z10, boolean z11) {
        uw uwVar = this.a;
        if (uwVar.D0.c0.getVisibility() == 0) {
            z11 = true;
        }
        if (uwVar.k2 && uwVar.l2) {
            cw cwVar = uwVar.D0;
            if (cwVar.c0 != null) {
                if (z10 || cwVar.e0.b() != 0) {
                    uwVar.D0.c0.e(true, z11);
                } else {
                    uwVar.D0.c0.e(false, z11);
                }
            }
        }
        if (z10 && uwVar.D0.e0.b() == 0) {
            cw cwVar2 = uwVar.D0;
            cwVar2.g0.a();
            cwVar2.b0.invalidate();
            cwVar2.V0 = 0;
        }
    }
}
