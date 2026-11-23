package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ uh0 c;
    public final /* synthetic */ View d;

    public /* synthetic */ kh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, uh0 uh0Var, View view, int i7, int i10) {
        this.a = i10;
        this.b = notificationsCustomSettingsActivity;
        this.c = uh0Var;
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

    public /* synthetic */ kh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, uh0 uh0Var, View view, boolean z10, int i7) {
        this.a = i7;
        this.b = notificationsCustomSettingsActivity;
        this.c = uh0Var;
        this.d = view;
    }
}
