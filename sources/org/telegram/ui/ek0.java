package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ek0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ rk0 c;
    public final /* synthetic */ View d;

    public /* synthetic */ ek0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, rk0 rk0Var, View view, int i10, int i11) {
        this.a = i11;
        this.b = notificationsCustomSettingsActivity;
        this.c = rk0Var;
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
                NotificationsCustomSettingsActivity.W(this.b, this.c, this.d);
                break;
            case 3:
                NotificationsCustomSettingsActivity.T(this.b, this.c, this.d);
                break;
            case 4:
                this.b.e0(this.c, this.d);
                break;
            default:
                this.b.k0(this.c, this.d, true);
                break;
        }
    }

    public /* synthetic */ ek0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, rk0 rk0Var, View view, boolean z10, int i10) {
        this.a = i10;
        this.b = notificationsCustomSettingsActivity;
        this.c = rk0Var;
        this.d = view;
    }
}
