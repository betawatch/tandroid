package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ik0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ vk0 c;
    public final /* synthetic */ View d;

    public /* synthetic */ ik0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vk0 vk0Var, View view, int i10, int i11) {
        this.a = i11;
        this.b = notificationsCustomSettingsActivity;
        this.c = vk0Var;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k0(this.c, this.d, false);
                break;
            case 1:
                this.b.e0(this.c, this.d);
                break;
            case 2:
                NotificationsCustomSettingsActivity.X(this.b, this.c, this.d);
                break;
            case 3:
                NotificationsCustomSettingsActivity.V(this.b, this.c, this.d);
                break;
            case 4:
                this.b.e0(this.c, this.d);
                break;
            default:
                this.b.k0(this.c, this.d, true);
                break;
        }
    }

    public /* synthetic */ ik0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, vk0 vk0Var, View view, boolean z10, int i10) {
        this.a = i10;
        this.b = notificationsCustomSettingsActivity;
        this.c = vk0Var;
        this.d = view;
    }
}
