package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai implements FlagSecureReason.FlagSecureCondition, tv0, r0.o, zf.b0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ fo a;

    public /* synthetic */ ai(fo foVar) {
        this.a = foVar;
    }

    @Override // r0.o
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        fo foVar = this.a;
        r0.l1 z82 = foVar.z8(l1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(z82, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        if (foVar.Ua != i10 || foVar.Va != i11) {
            foVar.Ua = i10;
            foVar.Va = i11;
            foVar.X0.requestLayout();
        }
        foVar.v.j(z82);
        ah.x xVar = foVar.K3;
        if (xVar != null) {
            xVar.setPadding(i10, 0, i11, 0);
        }
        foVar.q7();
        foVar.u7();
        foVar.u9();
        boolean p5 = z82.a.p(8);
        if (foVar.Ta != p5) {
            foVar.Ta = p5;
            foVar.X0.S();
        }
        di.h1 h1Var = foVar.q1;
        if (h1Var != null) {
            r0.j0.b(h1Var, z82);
        }
        return r0.l1.b;
    }

    @Override // zf.b0
    public void a(int i10) {
        fo.X0(this.a, i10);
    }

    @Override // org.telegram.ui.tv0
    public void b(float[] fArr) {
        fo foVar = this.a;
        fArr[1] = foVar.x0.getBottom() - foVar.Ba;
        fArr[0] = (foVar.x0.getTop() + foVar.s9) - AndroidUtilities.dp(4.0f);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        fo foVar = this.a;
        foVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            foVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        fo foVar = this.a;
        return foVar.h != null || foVar.D9();
    }
}
