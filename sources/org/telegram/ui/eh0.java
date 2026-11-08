package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ oh0 c;
    public final /* synthetic */ View d;

    public /* synthetic */ eh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, oh0 oh0Var, View view, int i7, int i10) {
        this.a = i10;
        this.b = notificationsCustomSettingsActivity;
        this.c = oh0Var;
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

    public /* synthetic */ eh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, oh0 oh0Var, View view, boolean z9, int i7) {
        this.a = i7;
        this.b = notificationsCustomSettingsActivity;
        this.c = oh0Var;
        this.d = view;
    }
}
