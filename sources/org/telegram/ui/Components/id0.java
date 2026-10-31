package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class id0 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ id0(Activity activity, int i10) {
        this.a = i10;
        this.b = activity;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                Activity activity = this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                    activity.startActivity(intent);
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                Activity activity2 = this.b;
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                    activity2.startActivity(intent2);
                    break;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
        }
    }
}
