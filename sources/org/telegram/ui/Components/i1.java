package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ i1(Activity activity, int i10) {
        this.a = i10;
        this.b = activity;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 0:
                z4.a(this.b);
                break;
            case 1:
                Activity activity = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                Activity activity2 = this.b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity2.startActivity(intent2);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
