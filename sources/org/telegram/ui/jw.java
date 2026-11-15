package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class jw {
    public final /* synthetic */ yw a;

    public jw(yw ywVar) {
        this.a = ywVar;
    }

    public final long a() {
        yw ywVar = this.a;
        uv uvVar = ywVar.H3;
        if (uvVar == null || !(uvVar.getFragment() instanceof u91)) {
            return 0L;
        }
        return -((u91) ywVar.H3.getFragment()).a;
    }

    public final void b() {
        yw ywVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ywVar.getParentActivity());
        org.telegram.ui.Components.cm0 cm0Var = ywVar.D0.e0;
        boolean z10 = cm0Var.O;
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        if (z10 && cm0Var.O()) {
            t1Var.S = org.telegram.messenger.hd.M0(2131752059, null);
            org.telegram.ui.Components.cm0 cm0Var2 = ywVar.D0.e0;
            ArrayList arrayList = cm0Var2.O ? cm0Var2.w0 : cm0Var2.v0;
            final int i7 = 0;
            t1Var.U = org.telegram.messenger.hd.G(arrayList != null ? arrayList.size() : 0, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752101, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.iw
                public final /* synthetic */ jw b;

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
                            yw ywVar2 = this.b.a;
                            if (!ywVar2.D0.e0.O()) {
                                org.telegram.ui.Components.cm0 cm0Var3 = ywVar2.D0.e0;
                                cm0Var3.k0.c();
                                cm0Var3.K.clear();
                                cm0Var3.f();
                                break;
                            } else {
                                ywVar2.D0.e0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            t1Var.S = org.telegram.messenger.hd.M0(2131752056, null);
            t1Var.U = org.telegram.messenger.hd.M0(2131752061, null);
            final int i10 = 1;
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.iw
                public final /* synthetic */ jw b;

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
                            yw ywVar2 = this.b.a;
                            if (!ywVar2.D0.e0.O()) {
                                org.telegram.ui.Components.cm0 cm0Var3 = ywVar2.D0.e0;
                                cm0Var3.k0.c();
                                cm0Var3.K.clear();
                                cm0Var3.f();
                                break;
                            } else {
                                ywVar2.D0.e0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        ywVar.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, ywVar.getResourceProvider());
        }
    }

    public final void c() {
        hw hwVar = this.a.D0;
        if (hwVar != null) {
            org.telegram.ui.Components.xi0 xi0Var = hwVar.g0;
            int i7 = hwVar.V0;
            xi0Var.b(i7 > 0 ? i7 + 1 : 0);
            hwVar.V0 = hwVar.e0.b();
        }
    }

    public final void d(boolean z10, boolean z11) {
        yw ywVar = this.a;
        if (ywVar.D0.c0.getVisibility() == 0) {
            z11 = true;
        }
        if (ywVar.l2 && ywVar.m2) {
            hw hwVar = ywVar.D0;
            if (hwVar.c0 != null) {
                if (z10 || hwVar.e0.b() != 0) {
                    ywVar.D0.c0.e(true, z11);
                } else {
                    ywVar.D0.c0.e(false, z11);
                }
            }
        }
        if (z10 && ywVar.D0.e0.b() == 0) {
            hw hwVar2 = ywVar.D0;
            hwVar2.g0.a();
            hwVar2.b0.invalidate();
            hwVar2.V0 = 0;
        }
    }
}
