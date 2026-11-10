package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ rh0 c;
    public final /* synthetic */ View d;

    public /* synthetic */ hh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, rh0 rh0Var, View view, int i7, int i10) {
        this.a = i10;
        this.b = notificationsCustomSettingsActivity;
        this.c = rh0Var;
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

    public /* synthetic */ hh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, rh0 rh0Var, View view, boolean z9, int i7) {
        this.a = i7;
        this.b = notificationsCustomSettingsActivity;
        this.c = rh0Var;
        this.d = view;
    }
}
