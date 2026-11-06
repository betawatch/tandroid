package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                launchActivity.v1 = false;
                break;
            case 1:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.i3(new s60(launchActivity, 7), 30000L);
                break;
            default:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.i3(new s60(launchActivity, 10), 30000L);
                break;
        }
    }
}
