package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g0 extends org.telegram.ui.ActionBar.h5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate h;

    public /* synthetic */ g0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.ActionBar.h5, org.telegram.ui.ActionBar.a3
    public boolean g() {
        switch (this.f) {
            case 0:
                h4 h4Var = (h4) this.h;
                org.telegram.ui.Cells.q9 q9Var = h4Var.P0;
                if (q9Var == null || !q9Var.y()) {
                    return true;
                }
                h4Var.P0.f(false);
                return false;
            default:
                return super.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.h5, org.telegram.ui.ActionBar.a3
    public void onOpenAnimationEnd() {
        switch (this.f) {
            case 1:
                ((org.telegram.ui.Components.iq0) this.h).Y = true;
                break;
        }
    }
}
