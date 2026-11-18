package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ th0 c;
    public final /* synthetic */ View d;

    public /* synthetic */ jh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, th0 th0Var, View view, int i7, int i10) {
        this.a = i10;
        this.b = notificationsCustomSettingsActivity;
        this.c = th0Var;
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

    public /* synthetic */ jh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, th0 th0Var, View view, boolean z10, int i7) {
        this.a = i7;
        this.b = notificationsCustomSettingsActivity;
        this.c = th0Var;
        this.d = view;
    }
}
