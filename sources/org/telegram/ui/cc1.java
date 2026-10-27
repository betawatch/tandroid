package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cc1 extends org.telegram.ui.Components.kb1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate d;

    public /* synthetic */ cc1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.c = i10;
        this.d = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.kb1
    public void M() {
        switch (this.c) {
            case 1:
                ((rh1) this.d).v.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.kb1
    public void P(int i10, int i11) {
        switch (this.c) {
            case 0:
                Point point = AndroidUtilities.displaySize;
                if ((point.x <= point.y) == (i10 <= i11)) {
                    ((vc1) this.d).y0.invalidate();
                    break;
                }
                break;
        }
    }
}
