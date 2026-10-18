package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ m80(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                launchActivity.w1 = false;
                break;
            case 1:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new l80(launchActivity, 6), 30000L);
                break;
            default:
                Pattern pattern2 = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new l80(launchActivity, 7), 30000L);
                break;
        }
    }
}
