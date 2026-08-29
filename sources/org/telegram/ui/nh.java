package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh implements r0.o, jf.d0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ tn a;

    public /* synthetic */ nh(tn tnVar) {
        this.a = tnVar;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        int i10 = defaultWindowInsets.a;
        int i11 = defaultWindowInsets.c;
        tn tnVar = this.a;
        if (tnVar.Qa != i10 || tnVar.Ra != i11) {
            tnVar.Qa = i10;
            tnVar.Ra = i11;
            tnVar.T0.requestLayout();
        }
        tnVar.v.i(m1Var);
        sg.e eVar = tnVar.G3;
        if (eVar != null) {
            eVar.setPadding(i10, 0, i11, 0);
        }
        tnVar.n7();
        tnVar.r7();
        tnVar.p9();
        boolean p10 = m1Var.a.p(8);
        if (tnVar.Pa != p10) {
            tnVar.Pa = p10;
            tnVar.T0.S();
        }
        nh.g1 g1Var = tnVar.m1;
        if (g1Var != null) {
            r0.j0.b(g1Var, m1Var);
        }
        return r0.m1.b;
    }

    @Override // jf.d0
    public void b(int i10) {
        tn.S0(this.a, i10);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        tn tnVar = this.a;
        tnVar.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            tnVar.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
