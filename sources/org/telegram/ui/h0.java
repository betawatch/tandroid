package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class h0 extends org.telegram.ui.ActionBar.f5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate h;

    public /* synthetic */ h0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.ActionBar.f5, org.telegram.ui.ActionBar.z2
    public boolean g() {
        switch (this.f) {
            case 0:
                i4 i4Var = (i4) this.h;
                org.telegram.ui.Cells.q9 q9Var = i4Var.P0;
                if (q9Var == null || !q9Var.y()) {
                    return true;
                }
                i4Var.P0.f(false);
                return false;
            default:
                return super.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.f5, org.telegram.ui.ActionBar.z2
    public void onOpenAnimationEnd() {
        switch (this.f) {
            case 1:
                ((org.telegram.ui.Components.br0) this.h).Y = true;
                break;
        }
    }
}
