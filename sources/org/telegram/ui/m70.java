package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m70 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ m70(LaunchActivity launchActivity, int i7) {
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
                org.telegram.messenger.g0.i3(new u60(launchActivity, 7), 30000L);
                break;
            default:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.i3(new u60(launchActivity, 10), 30000L);
                break;
        }
    }
}
