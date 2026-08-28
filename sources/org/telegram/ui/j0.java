package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j0 extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate h;

    public /* synthetic */ j0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.f = i9;
        this.h = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.ActionBar.e5, org.telegram.ui.ActionBar.z2
    public boolean g() {
        switch (this.f) {
            case 0:
                l4 l4Var = (l4) this.h;
                org.telegram.ui.Cells.n9 n9Var = l4Var.L0;
                if (n9Var == null || !n9Var.y()) {
                    return true;
                }
                l4Var.L0.f(false);
                return false;
            default:
                return super.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.e5, org.telegram.ui.ActionBar.z2
    public void onOpenAnimationEnd() {
        switch (this.f) {
            case 1:
                ((org.telegram.ui.Components.rp0) this.h).U = true;
                break;
        }
    }
}
