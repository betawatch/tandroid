package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class lx {
    public final /* synthetic */ zx a;

    public lx(zx zxVar) {
        this.a = zxVar;
    }

    public final long a() {
        zx zxVar = this.a;
        ww wwVar = zxVar.F3;
        if (wwVar == null || !(wwVar.getFragment() instanceof nb1)) {
            return 0L;
        }
        return -((nb1) zxVar.F3.getFragment()).a;
    }

    public final void b() {
        zx zxVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zxVar.getParentActivity());
        org.telegram.ui.Components.an0 an0Var = zxVar.C0.d0;
        boolean z10 = an0Var.N;
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        if (z10 && an0Var.O()) {
            x1Var.R = org.telegram.messenger.dd.L0(2131752059, null);
            org.telegram.ui.Components.an0 an0Var2 = zxVar.C0.d0;
            ArrayList arrayList = an0Var2.N ? an0Var2.v0 : an0Var2.u0;
            final int i10 = 0;
            x1Var.T = org.telegram.messenger.dd.G(arrayList != null ? arrayList.size() : 0, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752101, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.kx
                public final /* synthetic */ lx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.a.C0.d0.E();
                            break;
                        default:
                            zx zxVar2 = this.b.a;
                            if (!zxVar2.C0.d0.O()) {
                                org.telegram.ui.Components.an0 an0Var3 = zxVar2.C0.d0;
                                an0Var3.j0.c();
                                an0Var3.J.clear();
                                an0Var3.f();
                                break;
                            } else {
                                zxVar2.C0.d0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            x1Var.R = org.telegram.messenger.dd.L0(2131752056, null);
            x1Var.T = org.telegram.messenger.dd.L0(2131752061, null);
            final int i11 = 1;
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752099, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.kx
                public final /* synthetic */ lx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.a.C0.d0.E();
                            break;
                        default:
                            zx zxVar2 = this.b.a;
                            if (!zxVar2.C0.d0.O()) {
                                org.telegram.ui.Components.an0 an0Var3 = zxVar2.C0.d0;
                                an0Var3.j0.c();
                                an0Var3.J.clear();
                                an0Var3.f();
                                break;
                            } else {
                                zxVar2.C0.d0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        zxVar.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, zxVar.getResourceProvider());
        }
    }

    public final void c() {
        jx jxVar = this.a.C0;
        if (jxVar != null) {
            org.telegram.ui.Components.xj0 xj0Var = jxVar.f0;
            int i10 = jxVar.U0;
            xj0Var.b(i10 > 0 ? i10 + 1 : 0);
            jxVar.U0 = jxVar.d0.b();
        }
    }

    public final void d(boolean z10, boolean z11) {
        zx zxVar = this.a;
        if (zxVar.C0.b0.getVisibility() == 0) {
            z11 = true;
        }
        if (zxVar.j2 && zxVar.k2) {
            jx jxVar = zxVar.C0;
            if (jxVar.b0 != null) {
                if (z10 || jxVar.d0.b() != 0) {
                    zxVar.C0.b0.e(true, z11);
                } else {
                    zxVar.C0.b0.e(false, z11);
                }
            }
        }
        if (z10 && zxVar.C0.d0.b() == 0) {
            jx jxVar2 = zxVar.C0;
            jxVar2.f0.a();
            jxVar2.a0.invalidate();
            jxVar2.U0 = 0;
        }
    }
}
