package org.telegram.ui;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                launchActivity.y1 = false;
                break;
            case 1:
                Pattern pattern = LaunchActivity.E1;
                AndroidUtilities.runOnUIThread(new p80(launchActivity, 6), 30000L);
                break;
            default:
                Pattern pattern2 = LaunchActivity.E1;
                AndroidUtilities.runOnUIThread(new p80(launchActivity, 7), 30000L);
                break;
        }
    }
}
