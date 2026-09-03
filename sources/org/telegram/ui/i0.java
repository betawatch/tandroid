package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class i0 extends org.telegram.ui.ActionBar.i5 {
    public final /* synthetic */ int f;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate h;

    public /* synthetic */ i0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f = i10;
        this.h = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.ActionBar.i5, org.telegram.ui.ActionBar.b3
    public boolean g() {
        switch (this.f) {
            case 0:
                l4 l4Var = (l4) this.h;
                org.telegram.ui.Cells.m9 m9Var = l4Var.M0;
                if (m9Var == null || !m9Var.y()) {
                    return true;
                }
                l4Var.M0.f(false);
                return false;
            default:
                return super.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.i5, org.telegram.ui.ActionBar.b3
    public void onOpenAnimationEnd() {
        switch (this.f) {
            case 1:
                ((org.telegram.ui.Components.lq0) this.h).V = true;
                break;
        }
    }
}
