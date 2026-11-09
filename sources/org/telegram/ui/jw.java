package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jw {
    public final /* synthetic */ yw a;

    public jw(yw ywVar) {
        this.a = ywVar;
    }

    public final long a() {
        yw ywVar = this.a;
        uv uvVar = ywVar.G3;
        if (uvVar == null || !(uvVar.getFragment() instanceof y91)) {
            return 0L;
        }
        return -((y91) ywVar.G3.getFragment()).a;
    }

    public final void b() {
        yw ywVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ywVar.getParentActivity());
        org.telegram.ui.Components.zl0 zl0Var = ywVar.C0.d0;
        boolean z9 = zl0Var.N;
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        if (z9 && zl0Var.O()) {
            u1Var.R = org.telegram.messenger.id.M0(2131752059, null);
            org.telegram.ui.Components.zl0 zl0Var2 = ywVar.C0.d0;
            ArrayList arrayList = zl0Var2.N ? zl0Var2.v0 : zl0Var2.u0;
            final int i7 = 0;
            u1Var.T = org.telegram.messenger.id.G(arrayList != null ? arrayList.size() : 0, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752101, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.iw
                public final /* synthetic */ jw b;

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
                            yw ywVar2 = this.b.a;
                            if (!ywVar2.C0.d0.O()) {
                                org.telegram.ui.Components.zl0 zl0Var3 = ywVar2.C0.d0;
                                zl0Var3.j0.c();
                                zl0Var3.J.clear();
                                zl0Var3.f();
                                break;
                            } else {
                                ywVar2.C0.d0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            u1Var.R = org.telegram.messenger.id.M0(2131752056, null);
            u1Var.T = org.telegram.messenger.id.M0(2131752061, null);
            final int i10 = 1;
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, null), new org.telegram.ui.ActionBar.r1(this) { // from class: org.telegram.ui.iw
                public final /* synthetic */ jw b;

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
                            yw ywVar2 = this.b.a;
                            if (!ywVar2.C0.d0.O()) {
                                org.telegram.ui.Components.zl0 zl0Var3 = ywVar2.C0.d0;
                                zl0Var3.j0.c();
                                zl0Var3.J.clear();
                                zl0Var3.f();
                                break;
                            } else {
                                ywVar2.C0.d0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        ywVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, ywVar.getResourceProvider());
        }
    }

    public final void c() {
        hw hwVar = this.a.C0;
        if (hwVar != null) {
            org.telegram.ui.Components.ti0 ti0Var = hwVar.f0;
            int i7 = hwVar.U0;
            ti0Var.b(i7 > 0 ? i7 + 1 : 0);
            hwVar.U0 = hwVar.d0.b();
        }
    }

    public final void d(boolean z9, boolean z10) {
        yw ywVar = this.a;
        if (ywVar.C0.b0.getVisibility() == 0) {
            z10 = true;
        }
        if (ywVar.k2 && ywVar.l2) {
            hw hwVar = ywVar.C0;
            if (hwVar.b0 != null) {
                if (z9 || hwVar.d0.b() != 0) {
                    ywVar.C0.b0.e(true, z10);
                } else {
                    ywVar.C0.b0.e(false, z10);
                }
            }
        }
        if (z9 && ywVar.C0.d0.b() == 0) {
            hw hwVar2 = ywVar.C0;
            hwVar2.f0.a();
            hwVar2.a0.invalidate();
            hwVar2.U0 = 0;
        }
    }
}
