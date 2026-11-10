package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class kw {
    public final /* synthetic */ zw a;

    public kw(zw zwVar) {
        this.a = zwVar;
    }

    public final long a() {
        zw zwVar = this.a;
        vv vvVar = zwVar.G3;
        if (vvVar == null || !(vvVar.getFragment() instanceof z91)) {
            return 0L;
        }
        return -((z91) zwVar.G3.getFragment()).a;
    }

    public final void b() {
        zw zwVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zwVar.getParentActivity());
        org.telegram.ui.Components.yl0 yl0Var = zwVar.C0.d0;
        boolean z9 = yl0Var.N;
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        if (z9 && yl0Var.O()) {
            u1Var.R = org.telegram.messenger.id.M0(2131752059, null);
            org.telegram.ui.Components.yl0 yl0Var2 = zwVar.C0.d0;
            ArrayList arrayList = yl0Var2.N ? yl0Var2.v0 : yl0Var2.u0;
            final int i7 = 0;
            u1Var.T = org.telegram.messenger.id.G(arrayList != null ? arrayList.size() : 0, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752101, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.jw
                public final /* synthetic */ kw b;

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
                            zw zwVar2 = this.b.a;
                            if (!zwVar2.C0.d0.O()) {
                                org.telegram.ui.Components.yl0 yl0Var3 = zwVar2.C0.d0;
                                yl0Var3.j0.c();
                                yl0Var3.J.clear();
                                yl0Var3.f();
                                break;
                            } else {
                                zwVar2.C0.d0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            u1Var.R = org.telegram.messenger.id.M0(2131752056, null);
            u1Var.T = org.telegram.messenger.id.M0(2131752061, null);
            final int i10 = 1;
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.jw
                public final /* synthetic */ kw b;

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
                            zw zwVar2 = this.b.a;
                            if (!zwVar2.C0.d0.O()) {
                                org.telegram.ui.Components.yl0 yl0Var3 = zwVar2.C0.d0;
                                yl0Var3.j0.c();
                                yl0Var3.J.clear();
                                yl0Var3.f();
                                break;
                            } else {
                                zwVar2.C0.d0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        zwVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, zwVar.getResourceProvider());
        }
    }

    public final void c() {
        iw iwVar = this.a.C0;
        if (iwVar != null) {
            org.telegram.ui.Components.si0 si0Var = iwVar.f0;
            int i7 = iwVar.U0;
            si0Var.b(i7 > 0 ? i7 + 1 : 0);
            iwVar.U0 = iwVar.d0.b();
        }
    }

    public final void d(boolean z9, boolean z10) {
        zw zwVar = this.a;
        if (zwVar.C0.b0.getVisibility() == 0) {
            z10 = true;
        }
        if (zwVar.k2 && zwVar.l2) {
            iw iwVar = zwVar.C0;
            if (iwVar.b0 != null) {
                if (z9 || iwVar.d0.b() != 0) {
                    zwVar.C0.b0.e(true, z10);
                } else {
                    zwVar.C0.b0.e(false, z10);
                }
            }
        }
        if (z9 && zwVar.C0.d0.b() == 0) {
            iw iwVar2 = zwVar.C0;
            iwVar2.f0.a();
            iwVar2.a0.invalidate();
            iwVar2.U0 = 0;
        }
    }
}
