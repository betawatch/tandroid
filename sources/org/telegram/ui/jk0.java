package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class jk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ wk0 c;
    public final /* synthetic */ View d;

    public /* synthetic */ jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, wk0 wk0Var, View view, int i10, int i11) {
        this.a = i11;
        this.b = notificationsCustomSettingsActivity;
        this.c = wk0Var;
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

    public /* synthetic */ jk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, wk0 wk0Var, View view, boolean z10, int i10) {
        this.a = i10;
        this.b = notificationsCustomSettingsActivity;
        this.c = wk0Var;
        this.d = view;
    }
}
