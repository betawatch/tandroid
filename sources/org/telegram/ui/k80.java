package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ k80(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                launchActivity.x1 = false;
                break;
            case 1:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.h3(new q70(launchActivity, 7), 30000L);
                break;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.i0.h3(new q70(launchActivity, 10), 30000L);
                break;
        }
    }
}
