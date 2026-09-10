package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h0 extends org.telegram.ui.ActionBar.i5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate h;

    public /* synthetic */ h0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.ActionBar.i5, org.telegram.ui.ActionBar.b3
    public boolean g() {
        switch (this.f) {
            case 0:
                j4 j4Var = (j4) this.h;
                org.telegram.ui.Cells.s9 s9Var = j4Var.P0;
                if (s9Var == null || !s9Var.y()) {
                    return true;
                }
                j4Var.P0.f(false);
                return false;
            default:
                return super.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.i5, org.telegram.ui.ActionBar.b3
    public void onOpenAnimationEnd() {
        switch (this.f) {
            case 1:
                ((org.telegram.ui.Components.sq0) this.h).Y = true;
                break;
        }
    }
}
