package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h90 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ h90(LaunchActivity launchActivity, int i10) {
        this.a = i10;
        this.b = launchActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.a;
        LaunchActivity launchActivity = this.b;
        switch (i10) {
            case 0:
                launchActivity.v1 = false;
                break;
            case 1:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new f90(launchActivity, 9), 30000L);
                break;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new f90(launchActivity, 10), 30000L);
                break;
        }
    }
}
