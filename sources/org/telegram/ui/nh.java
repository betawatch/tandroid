package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh implements FlagSecureReason.FlagSecureCondition, su0, r0.n, zf.a0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ qn a;

    public /* synthetic */ nh(qn qnVar) {
        this.a = qnVar;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        qn qnVar = this.a;
        r0.k1 z82 = qnVar.z8(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(z82, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        if (qnVar.Ua != i10 || qnVar.Va != i11) {
            qnVar.Ua = i10;
            qnVar.Va = i11;
            qnVar.X0.requestLayout();
        }
        qnVar.v.j(z82);
        ah.x xVar = qnVar.K3;
        if (xVar != null) {
            xVar.setPadding(i10, 0, i11, 0);
        }
        qnVar.q7();
        qnVar.u7();
        qnVar.u9();
        boolean p5 = z82.a.p(8);
        if (qnVar.Ta != p5) {
            qnVar.Ta = p5;
            qnVar.X0.S();
        }
        ei.h1 h1Var = qnVar.q1;
        if (h1Var != null) {
            r0.i0.b(h1Var, z82);
        }
        return r0.k1.b;
    }

    @Override // zf.a0
    public void a(int i10) {
        qn.X0(this.a, i10);
    }

    @Override // org.telegram.ui.su0
    public void b(float[] fArr) {
        qn qnVar = this.a;
        fArr[1] = qnVar.x0.getBottom() - qnVar.Ba;
        fArr[0] = (qnVar.x0.getTop() + qnVar.s9) - AndroidUtilities.dp(4.0f);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        qn qnVar = this.a;
        qnVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            qnVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        qn qnVar = this.a;
        return qnVar.h != null || qnVar.D9();
    }
}
