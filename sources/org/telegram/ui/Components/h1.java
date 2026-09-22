package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ h1(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.p0(new LanguageSelectActivity());
                break;
            case 1:
                this.b.p0(new org.telegram.ui.z6());
                break;
            default:
                LaunchActivity launchActivity = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    launchActivity.startActivity(intent);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
        }
    }
}
