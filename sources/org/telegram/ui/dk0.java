package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ qk0 c;
    public final /* synthetic */ View d;

    public /* synthetic */ dk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, qk0 qk0Var, View view, int i10, int i11) {
        this.a = i11;
        this.b = notificationsCustomSettingsActivity;
        this.c = qk0Var;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.l0(this.c, this.d, false);
                break;
            case 1:
                this.b.f0(this.c, this.d);
                break;
            case 2:
                NotificationsCustomSettingsActivity.Y(this.b, this.c, this.d);
                break;
            case 3:
                NotificationsCustomSettingsActivity.W(this.b, this.c, this.d);
                break;
            case 4:
                this.b.f0(this.c, this.d);
                break;
            default:
                this.b.l0(this.c, this.d, true);
                break;
        }
    }

    public /* synthetic */ dk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, qk0 qk0Var, View view, boolean z10, int i10) {
        this.a = i10;
        this.b = notificationsCustomSettingsActivity;
        this.c = qk0Var;
        this.d = view;
    }
}
