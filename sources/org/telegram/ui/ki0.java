package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ki0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ ui0 c;
    public final /* synthetic */ View d;

    public /* synthetic */ ki0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ui0 ui0Var, View view, int i10, int i11) {
        this.a = i11;
        this.b = notificationsCustomSettingsActivity;
        this.c = ui0Var;
        this.d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o0(this.c, this.d, false);
                break;
            case 1:
                this.b.i0(this.c, this.d);
                break;
            case 2:
                NotificationsCustomSettingsActivity.b0(this.b, this.c, this.d);
                break;
            case 3:
                NotificationsCustomSettingsActivity.Z(this.b, this.c, this.d);
                break;
            case 4:
                this.b.i0(this.c, this.d);
                break;
            default:
                this.b.o0(this.c, this.d, true);
                break;
        }
    }

    public /* synthetic */ ki0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, ui0 ui0Var, View view, boolean z10, int i10) {
        this.a = i10;
        this.b = notificationsCustomSettingsActivity;
        this.c = ui0Var;
        this.d = view;
    }
}
