package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k70 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ k70(LaunchActivity launchActivity, int i7) {
        this.a = i7;
        this.b = launchActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i7) {
            case 0:
                launchActivity.w1 = false;
                break;
            case 1:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new s60(launchActivity, 7), 30000L);
                break;
            default:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new s60(launchActivity, 10), 30000L);
                break;
        }
    }
}
