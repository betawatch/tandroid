package org.telegram.ui;

import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class el0 {
    public final LaunchActivity a;
    public final ArrayList b = new ArrayList();
    public int c = TLObject.FLAG_31;

    public el0(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    public final void a() {
        boolean isEmpty = this.b.isEmpty();
        LaunchActivity launchActivity = this.a;
        try {
            if (isEmpty || launchActivity.getResources().getConfiguration().smallestScreenWidthDp >= 600 || (Build.VERSION.SDK_INT >= 24 && launchActivity.isInMultiWindowMode())) {
                int i10 = this.c;
                if (i10 != Integer.MIN_VALUE) {
                    launchActivity.setRequestedOrientation(i10);
                    this.c = TLObject.FLAG_31;
                    return;
                }
                return;
            }
            if (this.c == Integer.MIN_VALUE) {
                this.c = launchActivity.getRequestedOrientation();
            }
            if (launchActivity.getRequestedOrientation() != 1) {
                launchActivity.setRequestedOrientation(1);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
