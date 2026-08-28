package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ m80(LaunchActivity launchActivity, int i9) {
        this.a = i9;
        this.b = launchActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i9 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i9) {
            case 0:
                launchActivity.r1 = false;
                break;
            case 1:
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new l80(launchActivity, 9), 30000L);
                break;
            default:
                Pattern pattern2 = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new l80(launchActivity, 10), 30000L);
                break;
        }
    }
}
