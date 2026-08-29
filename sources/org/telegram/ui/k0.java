package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k0 extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate h;

    public /* synthetic */ k0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.ActionBar.e5, org.telegram.ui.ActionBar.z2
    public boolean g() {
        switch (this.f) {
            case 0:
                m4 m4Var = (m4) this.h;
                org.telegram.ui.Cells.k9 k9Var = m4Var.L0;
                if (k9Var == null || !k9Var.y()) {
                    return true;
                }
                m4Var.L0.f(false);
                return false;
            default:
                return super.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.e5, org.telegram.ui.ActionBar.z2
    public void onOpenAnimationEnd() {
        switch (this.f) {
            case 1:
                ((org.telegram.ui.Components.dq0) this.h).U = true;
                break;
        }
    }
}
