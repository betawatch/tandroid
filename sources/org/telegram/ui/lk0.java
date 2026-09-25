package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk0 implements org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ NotificationsSettingsActivity a;

    public /* synthetic */ lk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.a = notificationsSettingsActivity;
    }

    @Override // org.telegram.ui.Components.ll0
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.Y(this.a, view, i10, f7);
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ boolean d1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        NotificationsSettingsActivity.Z(this.a);
    }

    @Override // org.telegram.ui.Components.ll0
    public /* synthetic */ void r0(View view, float f7, float f10) {
    }
}
