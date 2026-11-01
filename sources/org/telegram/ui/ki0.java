package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ki0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;

    public /* synthetic */ ki0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
        this.a = i11;
        this.b = notificationsCustomSettingsActivity;
        this.c = view;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.d;
        View view = this.c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = notificationsCustomSettingsActivity.I;
                if (!(view instanceof org.telegram.ui.Cells.v8)) {
                    notificationsCustomSettingsActivity.q0(true);
                    break;
                } else {
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        ((oi0) arrayList.get(i11)).h = notificationsCustomSettingsActivity.k0();
                    }
                    ((org.telegram.ui.Cells.v8) view).b(notificationsCustomSettingsActivity.k0(), org.telegram.messenger.dd.L0(2131748999, "LedColor"), true);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.I;
                if (!(view instanceof org.telegram.ui.Cells.x9)) {
                    notificationsCustomSettingsActivity.q0(true);
                    break;
                } else {
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((oi0) arrayList2.get(i11)).f = notificationsCustomSettingsActivity.l0();
                    }
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                    x9Var.c(org.telegram.messenger.dd.L0(2131747113, "PopupNotification"), notificationsCustomSettingsActivity.l0(), true, x9Var.h);
                    break;
                }
                break;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
                if (!(view instanceof org.telegram.ui.Cells.x9)) {
                    notificationsCustomSettingsActivity.q0(true);
                    break;
                } else {
                    if (i11 >= 0 && i11 < arrayList3.size()) {
                        ((oi0) arrayList3.get(i11)).f = notificationsCustomSettingsActivity.m0();
                    }
                    org.telegram.ui.Cells.x9 x9Var2 = (org.telegram.ui.Cells.x9) view;
                    x9Var2.c(org.telegram.messenger.dd.L0(2131747922, "NotificationsImportance"), notificationsCustomSettingsActivity.m0(), true, x9Var2.h);
                    break;
                }
                break;
        }
    }
}
