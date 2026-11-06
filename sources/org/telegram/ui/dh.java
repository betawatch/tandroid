package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements org.telegram.messenger.j9, er0, r0.m, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ an a;

    public /* synthetic */ dh(an anVar) {
        this.a = anVar;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        an anVar = this.a;
        r0.k1 N8 = anVar.N8(k1Var);
        i0.b I0 = org.telegram.messenger.g0.I0(N8, false);
        int i7 = I0.a;
        int i10 = I0.c;
        if (anVar.nb != i7 || anVar.ob != i10) {
            anVar.nb = i7;
            anVar.ob = i10;
            anVar.l1.requestLayout();
        }
        anVar.w.j(N8);
        bi.e5 e5Var = anVar.Y3;
        if (e5Var != null) {
            e5Var.setPadding(i7, 0, i10, 0);
        }
        anVar.B7();
        anVar.F7();
        anVar.L9();
        boolean p10 = N8.a.p(8);
        if (anVar.mb != p10) {
            anVar.mb = p10;
            anVar.l1.R();
        }
        fi.g1 g1Var = anVar.E1;
        if (g1Var != null) {
            r0.i0.b(g1Var, N8);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.er0
    public void a(float[] fArr) {
        an anVar = this.a;
        fArr[1] = anVar.z0.getBottom() - anVar.Ua;
        fArr[0] = (anVar.z0.getTop() + anVar.L9) - org.telegram.messenger.g0.L(4.0f);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        an anVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
            anVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.messenger.j9
    public boolean run() {
        an anVar = this.a;
        return anVar.h != null || anVar.U9();
    }
}
