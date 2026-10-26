package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ac1 extends org.telegram.ui.Components.gb1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;

    public /* synthetic */ ac1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.c = i10;
        this.d = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.gb1
    public void M() {
        switch (this.c) {
            case 1:
                ((ph1) this.d).v.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.gb1
    public void P(int i10, int i11) {
        switch (this.c) {
            case 0:
                Point point = AndroidUtilities.displaySize;
                if ((point.x <= point.y) == (i10 <= i11)) {
                    ((tc1) this.d).y0.invalidate();
                    break;
                }
                break;
        }
    }
}
