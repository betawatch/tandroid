package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ p80(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                launchActivity.r1 = false;
                break;
            case 1:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new o80(launchActivity, 9), 30000L);
                break;
            default:
                Pattern pattern2 = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new o80(launchActivity, 10), 30000L);
                break;
        }
    }
}
