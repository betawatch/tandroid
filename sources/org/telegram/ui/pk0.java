package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pk0 implements org.telegram.ui.Components.nl0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ NotificationsSettingsActivity a;

    public /* synthetic */ pk0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.a = notificationsSettingsActivity;
    }

    @Override // org.telegram.ui.Components.nl0
    public void c(float f7, float f10, int i10, View view) {
        NotificationsSettingsActivity.X(this.a, view, i10, f7);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsSettingsActivity.Y(this.a);
    }

    @Override // org.telegram.ui.Components.nl0
    public /* synthetic */ void s0(View view, float f7, float f10) {
    }
}
