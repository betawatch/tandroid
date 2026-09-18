package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai implements r0.n, yf.a0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ bo a;

    public /* synthetic */ ai(bo boVar) {
        this.a = boVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        bo boVar = this.a;
        if (boVar.Ta != i10 || boVar.Ua != i11) {
            boVar.Ta = i10;
            boVar.Ua = i11;
            boVar.X0.requestLayout();
        }
        boVar.v.i(l1Var);
        hh.f fVar = boVar.K3;
        if (fVar != null) {
            fVar.setPadding(i10, 0, i11, 0);
        }
        boVar.n7();
        boVar.r7();
        boVar.p9();
        boolean p5 = l1Var.a.p(8);
        if (boVar.Sa != p5) {
            boVar.Sa = p5;
            boVar.X0.S();
        }
        ci.i1 i1Var = boVar.q1;
        if (i1Var != null) {
            r0.i0.b(i1Var, l1Var);
        }
        return r0.l1.b;
    }

    @Override // yf.a0
    public void a(int i10) {
        bo.S0(this.a, i10);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        bo boVar = this.a;
        boVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            boVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
