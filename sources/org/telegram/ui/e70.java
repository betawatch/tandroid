package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e70 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ e70(LaunchActivity launchActivity, int i3) {
        this.a = i3;
        this.b = launchActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i3 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i3) {
            case 0:
                launchActivity.y1 = false;
                break;
            case 1:
                String str = LaunchActivity.E1;
                org.telegram.messenger.g0.i3(new m60(launchActivity, 7), 30000L);
                break;
            default:
                String str2 = LaunchActivity.E1;
                org.telegram.messenger.g0.i3(new m60(launchActivity, 10), 30000L);
                break;
        }
    }
}
