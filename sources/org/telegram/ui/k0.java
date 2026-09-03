package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k0 extends org.telegram.ui.ActionBar.h5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate h;

    public /* synthetic */ k0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.ActionBar.h5, org.telegram.ui.ActionBar.a3
    public boolean g() {
        switch (this.f) {
            case 0:
                n4 n4Var = (n4) this.h;
                org.telegram.ui.Cells.l9 l9Var = n4Var.M0;
                if (l9Var == null || !l9Var.y()) {
                    return true;
                }
                n4Var.M0.f(false);
                return false;
            default:
                return super.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.h5, org.telegram.ui.ActionBar.a3
    public void onOpenAnimationEnd() {
        switch (this.f) {
            case 1:
                ((org.telegram.ui.Components.lq0) this.h).V = true;
                break;
        }
    }
}
