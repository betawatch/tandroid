package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh implements r0.o, gf.e0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ rn a;

    public /* synthetic */ oh(rn rnVar) {
        this.a = rnVar;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        rn rnVar = this.a;
        if (rnVar.Qa != i10 || rnVar.Ra != i11) {
            rnVar.Qa = i10;
            rnVar.Ra = i11;
            rnVar.T0.requestLayout();
        }
        rnVar.v.i(m1Var);
        qg.e eVar = rnVar.G3;
        if (eVar != null) {
            eVar.setPadding(i10, 0, i11, 0);
        }
        rnVar.n7();
        rnVar.r7();
        rnVar.p9();
        boolean p6 = m1Var.a.p(8);
        if (rnVar.Pa != p6) {
            rnVar.Pa = p6;
            rnVar.T0.S();
        }
        lh.h1 h1Var = rnVar.m1;
        if (h1Var != null) {
            r0.j0.b(h1Var, m1Var);
        }
        return r0.m1.b;
    }

    @Override // gf.e0
    public void a(int i10) {
        rn.S0(this.a, i10);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        rn rnVar = this.a;
        rnVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            rnVar.getParentActivity().startActivity(intent);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
