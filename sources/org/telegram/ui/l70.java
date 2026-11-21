package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l70 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ l70(LaunchActivity launchActivity, int i7) {
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
                org.telegram.messenger.g0.h3(new t60(launchActivity, 7), 30000L);
                break;
            default:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new t60(launchActivity, 10), 30000L);
                break;
        }
    }
}
