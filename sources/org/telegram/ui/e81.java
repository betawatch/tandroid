package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e81 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionsActivity b;

    public /* synthetic */ e81(SessionsActivity sessionsActivity, int i10) {
        this.a = i10;
        this.b = sessionsActivity;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                SessionsActivity sessionsActivity = this.b;
                sessionsActivity.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    sessionsActivity.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                SessionsActivity.U(this.b);
                break;
        }
    }
}
