package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e81 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionsActivity b;

    public /* synthetic */ e81(SessionsActivity sessionsActivity, int i10) {
        this.a = i10;
        this.b = sessionsActivity;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                SessionsActivity sessionsActivity = this.b;
                sessionsActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                SessionsActivity.W(this.b);
                break;
        }
    }
}
