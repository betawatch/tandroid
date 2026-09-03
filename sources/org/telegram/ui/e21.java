package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e21 implements org.telegram.ui.ActionBar.c2, r0.o {
    public final /* synthetic */ u21 a;

    public /* synthetic */ e21(u21 u21Var) {
        this.a = u21Var;
    }

    @Override // r0.o
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        u21 u21Var = this.a;
        u21Var.N = defaultWindowInsets;
        u21Var.fragmentView.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        u21 u21Var = this.a;
        u21Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            u21Var.getParentActivity().startActivity(intent);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
