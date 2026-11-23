package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements lh.d, org.telegram.messenger.i9, er0, r0.m, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ bn a;

    public /* synthetic */ dh(bn bnVar) {
        this.a = bnVar;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        bn bnVar = this.a;
        r0.l1 P8 = bnVar.P8(l1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(P8, false);
        int i7 = I0.a;
        int i10 = I0.c;
        if (bnVar.rb != i7 || bnVar.sb != i10) {
            bnVar.rb = i7;
            bnVar.sb = i10;
            bnVar.m1.requestLayout();
        }
        bnVar.w.j(P8);
        bi.e3 e3Var = bnVar.Z3;
        if (e3Var != null) {
            e3Var.setPadding(i7, 0, i10, 0);
        }
        bnVar.C7();
        bnVar.G7();
        bnVar.N9();
        boolean p10 = P8.a.p(8);
        if (bnVar.qb != p10) {
            bnVar.qb = p10;
            bnVar.m1.R();
        }
        hi.i1 i1Var = bnVar.F1;
        if (i1Var != null) {
            r0.i0.b(i1Var, P8);
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.er0
    public void a(float[] fArr) {
        bn bnVar = this.a;
        fArr[1] = bnVar.A0.getBottom() - bnVar.Ya;
        fArr[0] = (bnVar.A0.getTop() + bnVar.P9) - org.telegram.messenger.g0.L(4.0f);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        bn bnVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
            bnVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.i9
    public boolean run() {
        bn bnVar = this.a;
        return bnVar.h != null || bnVar.W9();
    }
}
