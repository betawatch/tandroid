package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph0 implements org.telegram.ui.Components.hj0, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ NotificationsSettingsActivity a;

    public /* synthetic */ ph0(NotificationsSettingsActivity notificationsSettingsActivity) {
        this.a = notificationsSettingsActivity;
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        NotificationsSettingsActivity.d0(this.a, view, i7, f10);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        NotificationsSettingsActivity.e0(this.a);
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
