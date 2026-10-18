package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph implements FlagSecureReason.FlagSecureCondition, uu0, r0.n, zf.a0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ sn a;

    public /* synthetic */ ph(sn snVar) {
        this.a = snVar;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        sn snVar = this.a;
        r0.k1 z82 = snVar.z8(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(z82, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        if (snVar.Ua != i10 || snVar.Va != i11) {
            snVar.Ua = i10;
            snVar.Va = i11;
            snVar.X0.requestLayout();
        }
        snVar.v.j(z82);
        ah.x xVar = snVar.K3;
        if (xVar != null) {
            xVar.setPadding(i10, 0, i11, 0);
        }
        snVar.q7();
        snVar.u7();
        snVar.u9();
        boolean p5 = z82.a.p(8);
        if (snVar.Ta != p5) {
            snVar.Ta = p5;
            snVar.X0.S();
        }
        ei.h1 h1Var = snVar.q1;
        if (h1Var != null) {
            r0.i0.b(h1Var, z82);
        }
        return r0.k1.b;
    }

    @Override // zf.a0
    public void a(int i10) {
        sn.X0(this.a, i10);
    }

    @Override // org.telegram.ui.uu0
    public void b(float[] fArr) {
        sn snVar = this.a;
        fArr[1] = snVar.x0.getBottom() - snVar.Ba;
        fArr[0] = (snVar.x0.getTop() + snVar.s9) - AndroidUtilities.dp(4.0f);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        sn snVar = this.a;
        snVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            snVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        sn snVar = this.a;
        return snVar.h != null || snVar.D9();
    }
}
