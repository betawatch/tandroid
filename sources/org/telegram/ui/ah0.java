package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ lh0 c;
    public final /* synthetic */ View d;

    public /* synthetic */ ah0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lh0 lh0Var, View view, int i3, int i10) {
        this.a = i10;
        this.b = notificationsCustomSettingsActivity;
        this.c = lh0Var;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p0(this.c, this.d, false);
                break;
            case 1:
                this.b.j0(this.c, this.d);
                break;
            case 2:
                NotificationsCustomSettingsActivity.c0(this.b, this.c, this.d);
                break;
            case 3:
                NotificationsCustomSettingsActivity.a0(this.b, this.c, this.d);
                break;
            case 4:
                this.b.j0(this.c, this.d);
                break;
            default:
                this.b.p0(this.c, this.d, true);
                break;
        }
    }

    public /* synthetic */ ah0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, lh0 lh0Var, View view, boolean z10, int i3) {
        this.a = i3;
        this.b = notificationsCustomSettingsActivity;
        this.c = lh0Var;
        this.d = view;
    }
}
