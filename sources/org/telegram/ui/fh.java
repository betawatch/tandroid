package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh implements lh.d, org.telegram.messenger.j9, gr0, r0.m, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ cn a;

    public /* synthetic */ fh(cn cnVar) {
        this.a = cnVar;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        cn cnVar = this.a;
        r0.k1 O8 = cnVar.O8(k1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(O8, false);
        int i7 = I0.a;
        int i10 = I0.c;
        if (cnVar.pb != i7 || cnVar.qb != i10) {
            cnVar.pb = i7;
            cnVar.qb = i10;
            cnVar.l1.requestLayout();
        }
        cnVar.w.j(O8);
        bi.e5 e5Var = cnVar.Y3;
        if (e5Var != null) {
            e5Var.setPadding(i7, 0, i10, 0);
        }
        cnVar.C7();
        cnVar.G7();
        cnVar.M9();
        boolean p10 = O8.a.p(8);
        if (cnVar.ob != p10) {
            cnVar.ob = p10;
            cnVar.l1.R();
        }
        fi.g1 g1Var = cnVar.E1;
        if (g1Var != null) {
            r0.i0.b(g1Var, O8);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.gr0
    public void a(float[] fArr) {
        cn cnVar = this.a;
        fArr[1] = cnVar.z0.getBottom() - cnVar.Wa;
        fArr[0] = (cnVar.z0.getTop() + cnVar.N9) - org.telegram.messenger.g0.L(4.0f);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        cn cnVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
            cnVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.j9
    public boolean run() {
        cn cnVar = this.a;
        return cnVar.h != null || cnVar.V9();
    }
}
