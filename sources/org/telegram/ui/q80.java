package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q80 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LaunchActivity b;

    public /* synthetic */ q80(LaunchActivity launchActivity, int i10) {
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
                AndroidUtilities.runOnUIThread(new p80(launchActivity, 6), 30000L);
                break;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new p80(launchActivity, 9), 30000L);
                break;
        }
    }
}
