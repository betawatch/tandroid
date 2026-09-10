package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai implements r0.n, xf.b0, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ eo a;

    public /* synthetic */ ai(eo eoVar) {
        this.a = eoVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        eo eoVar = this.a;
        if (eoVar.Ua != i10 || eoVar.Va != i11) {
            eoVar.Ua = i10;
            eoVar.Va = i11;
            eoVar.X0.requestLayout();
        }
        eoVar.v.i(l1Var);
        gh.f fVar = eoVar.K3;
        if (fVar != null) {
            fVar.setPadding(i10, 0, i11, 0);
        }
        eoVar.n7();
        eoVar.r7();
        eoVar.p9();
        boolean p5 = l1Var.a.p(8);
        if (eoVar.Ta != p5) {
            eoVar.Ta = p5;
            eoVar.X0.S();
        }
        bi.p1 p1Var = eoVar.q1;
        if (p1Var != null) {
            r0.i0.b(p1Var, l1Var);
        }
        return r0.l1.b;
    }

    @Override // xf.b0
    public void b(int i10) {
        eo.S0(this.a, i10);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        eo eoVar = this.a;
        eoVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            eoVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
