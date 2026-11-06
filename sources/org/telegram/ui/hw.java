package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class hw {
    public final /* synthetic */ ww a;

    public hw(ww wwVar) {
        this.a = wwVar;
    }

    public final long a() {
        ww wwVar = this.a;
        sv svVar = wwVar.F3;
        if (svVar == null || !(svVar.getFragment() instanceof v91)) {
            return 0L;
        }
        return -((v91) wwVar.F3.getFragment()).a;
    }

    public final void b() {
        ww wwVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wwVar.getParentActivity());
        org.telegram.ui.Components.yl0 yl0Var = wwVar.C0.d0;
        boolean z9 = yl0Var.N;
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        if (z9 && yl0Var.O()) {
            u1Var.R = org.telegram.messenger.hd.M0(2131752059, null);
            org.telegram.ui.Components.yl0 yl0Var2 = wwVar.C0.d0;
            ArrayList arrayList = yl0Var2.N ? yl0Var2.v0 : yl0Var2.u0;
            final int i7 = 0;
            u1Var.T = org.telegram.messenger.hd.G(arrayList != null ? arrayList.size() : 0, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752101, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.gw
                public final /* synthetic */ hw b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                    switch (i7) {
                        case 0:
                            this.b.a.C0.d0.E();
                            break;
                        default:
                            ww wwVar2 = this.b.a;
                            if (!wwVar2.C0.d0.O()) {
                                org.telegram.ui.Components.yl0 yl0Var3 = wwVar2.C0.d0;
                                yl0Var3.j0.c();
                                yl0Var3.J.clear();
                                yl0Var3.f();
                                break;
                            } else {
                                wwVar2.C0.d0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            u1Var.R = org.telegram.messenger.hd.M0(2131752056, null);
            u1Var.T = org.telegram.messenger.hd.M0(2131752061, null);
            final int i10 = 1;
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.gw
                public final /* synthetic */ hw b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i102) {
                    switch (i10) {
                        case 0:
                            this.b.a.C0.d0.E();
                            break;
                        default:
                            ww wwVar2 = this.b.a;
                            if (!wwVar2.C0.d0.O()) {
                                org.telegram.ui.Components.yl0 yl0Var3 = wwVar2.C0.d0;
                                yl0Var3.j0.c();
                                yl0Var3.J.clear();
                                yl0Var3.f();
                                break;
                            } else {
                                wwVar2.C0.d0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        wwVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, wwVar.getResourceProvider());
        }
    }

    public final void c() {
        fw fwVar = this.a.C0;
        if (fwVar != null) {
            org.telegram.ui.Components.si0 si0Var = fwVar.f0;
            int i7 = fwVar.U0;
            si0Var.b(i7 > 0 ? i7 + 1 : 0);
            fwVar.U0 = fwVar.d0.b();
        }
    }

    public final void d(boolean z9, boolean z10) {
        ww wwVar = this.a;
        if (wwVar.C0.b0.getVisibility() == 0) {
            z10 = true;
        }
        if (wwVar.j2 && wwVar.k2) {
            fw fwVar = wwVar.C0;
            if (fwVar.b0 != null) {
                if (z9 || fwVar.d0.b() != 0) {
                    wwVar.C0.b0.e(true, z10);
                } else {
                    wwVar.C0.b0.e(false, z10);
                }
            }
        }
        if (z9 && wwVar.C0.d0.b() == 0) {
            fw fwVar2 = wwVar.C0;
            fwVar2.f0.a();
            fwVar2.a0.invalidate();
            fwVar2.U0 = 0;
        }
    }
}
