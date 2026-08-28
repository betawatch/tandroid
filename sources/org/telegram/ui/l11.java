package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l11 implements org.telegram.ui.ActionBar.b2, r0.o {
    public final /* synthetic */ z11 a;

    public /* synthetic */ l11(z11 z11Var) {
        this.a = z11Var;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        z11 z11Var = this.a;
        z11Var.M = defaultWindowInsets;
        z11Var.fragmentView.requestLayout();
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        z11 z11Var = this.a;
        z11Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            z11Var.getParentActivity().startActivity(intent);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
