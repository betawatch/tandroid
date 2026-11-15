package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements lh.d, org.telegram.messenger.i9, cr0, r0.m, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ an a;

    public /* synthetic */ dh(an anVar) {
        this.a = anVar;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        an anVar = this.a;
        r0.k1 P8 = anVar.P8(k1Var);
        i0.c I0 = org.telegram.messenger.g0.I0(P8, false);
        int i7 = I0.a;
        int i10 = I0.c;
        if (anVar.qb != i7 || anVar.rb != i10) {
            anVar.qb = i7;
            anVar.rb = i10;
            anVar.m1.requestLayout();
        }
        anVar.w.j(P8);
        bi.g2 g2Var = anVar.Z3;
        if (g2Var != null) {
            g2Var.setPadding(i7, 0, i10, 0);
        }
        anVar.C7();
        anVar.G7();
        anVar.N9();
        boolean p10 = P8.a.p(8);
        if (anVar.pb != p10) {
            anVar.pb = p10;
            anVar.m1.R();
        }
        hi.i1 i1Var = anVar.F1;
        if (i1Var != null) {
            r0.i0.b(i1Var, P8);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.cr0
    public void a(float[] fArr) {
        an anVar = this.a;
        fArr[1] = anVar.A0.getBottom() - anVar.Xa;
        fArr[0] = (anVar.A0.getTop() + anVar.O9) - org.telegram.messenger.g0.L(4.0f);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        an anVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
            anVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.i9
    public boolean run() {
        an anVar = this.a;
        return anVar.h != null || anVar.W9();
    }
}
