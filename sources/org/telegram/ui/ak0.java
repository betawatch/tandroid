package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ak0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ nk0 c;
    public final /* synthetic */ View d;

    public /* synthetic */ ak0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, nk0 nk0Var, View view, int i10, int i11) {
        this.a = i11;
        this.b = notificationsCustomSettingsActivity;
        this.c = nk0Var;
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

    public /* synthetic */ ak0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, nk0 nk0Var, View view, boolean z10, int i10) {
        this.a = i10;
        this.b = notificationsCustomSettingsActivity;
        this.c = nk0Var;
        this.d = view;
    }
}
