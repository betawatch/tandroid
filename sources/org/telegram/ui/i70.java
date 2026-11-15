package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class i70 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ i70(LaunchActivity launchActivity, int i7) {
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
                org.telegram.messenger.g0.i3(new q60(launchActivity, 7), 30000L);
                break;
            default:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.i3(new q60(launchActivity, 10), 30000L);
                break;
        }
    }
}
