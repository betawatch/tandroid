package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n70 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ n70(LaunchActivity launchActivity, int i7) {
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
                org.telegram.messenger.g0.i3(new v60(launchActivity, 7), 30000L);
                break;
            default:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.i3(new v60(launchActivity, 10), 30000L);
                break;
        }
    }
}
