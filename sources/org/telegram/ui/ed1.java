package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class ed1 extends w7.i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ ed1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // w7.i0
    public void a() {
        switch (this.a) {
            case 1:
                ((ui1) this.b).v.invalidate();
                break;
        }
    }

    @Override // w7.i0
    public void b(int i10, int i11) {
        switch (this.a) {
            case 0:
                Point point = AndroidUtilities.displaySize;
                if ((point.x <= point.y) == (i10 <= i11)) {
                    ((wd1) this.b).x0.invalidate();
                    break;
                }
                break;
        }
    }
}
