package org.telegram.ui;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mx {
    public final /* synthetic */ ay a;

    public mx(ay ayVar) {
        this.a = ayVar;
    }

    public final long a() {
        ay ayVar = this.a;
        xw xwVar = ayVar.F3;
        if (xwVar == null || !(xwVar.getFragment() instanceof pb1)) {
            return 0L;
        }
        return -((pb1) ayVar.F3.getFragment()).a;
    }

    public final void b() {
        ay ayVar = this.a;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ayVar.getParentActivity());
        org.telegram.ui.Components.zm0 zm0Var = ayVar.C0.d0;
        boolean z10 = zm0Var.N;
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        if (z10 && zm0Var.O()) {
            x1Var.R = org.telegram.messenger.cd.L0(2131752059, null);
            org.telegram.ui.Components.zm0 zm0Var2 = ayVar.C0.d0;
            ArrayList arrayList = zm0Var2.N ? zm0Var2.v0 : zm0Var2.u0;
            final int i10 = 0;
            x1Var.T = org.telegram.messenger.cd.G(arrayList != null ? arrayList.size() : 0, "ClearSearchAlertPartial", new Object[0]);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752101, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.lx
                public final /* synthetic */ mx b;

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
                            ay ayVar2 = this.b.a;
                            if (!ayVar2.C0.d0.O()) {
                                org.telegram.ui.Components.zm0 zm0Var3 = ayVar2.C0.d0;
                                zm0Var3.j0.c();
                                zm0Var3.J.clear();
                                zm0Var3.f();
                                break;
                            } else {
                                ayVar2.C0.d0.E();
                                break;
                            }
                    }
                }
            });
        } else {
            x1Var.R = org.telegram.messenger.cd.L0(2131752056, null);
            x1Var.T = org.telegram.messenger.cd.L0(2131752061, null);
            final int i11 = 1;
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752099, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.lx
                public final /* synthetic */ mx b;

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
                            ay ayVar2 = this.b.a;
                            if (!ayVar2.C0.d0.O()) {
                                org.telegram.ui.Components.zm0 zm0Var3 = ayVar2.C0.d0;
                                zm0Var3.j0.c();
                                zm0Var3.J.clear();
                                zm0Var3.f();
                                break;
                            } else {
                                ayVar2.C0.d0.E();
                                break;
                            }
                    }
                }
            });
        }
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        ayVar.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, ayVar.getResourceProvider());
        }
    }

    public final void c() {
        kx kxVar = this.a.C0;
        if (kxVar != null) {
            org.telegram.ui.Components.wj0 wj0Var = kxVar.f0;
            int i10 = kxVar.U0;
            wj0Var.b(i10 > 0 ? i10 + 1 : 0);
            kxVar.U0 = kxVar.d0.b();
        }
    }

    public final void d(boolean z10, boolean z11) {
        ay ayVar = this.a;
        if (ayVar.C0.b0.getVisibility() == 0) {
            z11 = true;
        }
        if (ayVar.j2 && ayVar.k2) {
            kx kxVar = ayVar.C0;
            if (kxVar.b0 != null) {
                if (z10 || kxVar.d0.b() != 0) {
                    ayVar.C0.b0.e(true, z11);
                } else {
                    ayVar.C0.b0.e(false, z11);
                }
            }
        }
        if (z10 && ayVar.C0.d0.b() == 0) {
            kx kxVar2 = ayVar.C0;
            kxVar2.f0.a();
            kxVar2.a0.invalidate();
            kxVar2.U0 = 0;
        }
    }
}
