package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q21 implements org.telegram.ui.ActionBar.a2, r0.n {
    public final /* synthetic */ f31 a;

    public /* synthetic */ q21(f31 f31Var) {
        this.a = f31Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        f31 f31Var = this.a;
        f31Var.Q = defaultWindowInsets;
        f31Var.fragmentView.requestLayout();
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        f31 f31Var = this.a;
        f31Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            f31Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
