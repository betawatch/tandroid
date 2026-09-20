package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class g0 extends org.telegram.ui.ActionBar.g5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate h;

    public /* synthetic */ g0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.ActionBar.g5, org.telegram.ui.ActionBar.z2
    public boolean g() {
        switch (this.f) {
            case 0:
                h4 h4Var = (h4) this.h;
                org.telegram.ui.Cells.r9 r9Var = h4Var.P0;
                if (r9Var == null || !r9Var.y()) {
                    return true;
                }
                h4Var.P0.f(false);
                return false;
            default:
                return super.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.g5, org.telegram.ui.ActionBar.z2
    public void onOpenAnimationEnd() {
        switch (this.f) {
            case 1:
                ((org.telegram.ui.Components.uq0) this.h).Y = true;
                break;
        }
    }
}
