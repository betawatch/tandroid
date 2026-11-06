package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;

    public /* synthetic */ gh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i7, int i10) {
        this.a = i10;
        this.b = notificationsCustomSettingsActivity;
        this.c = view;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.d;
        View view = this.c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = notificationsCustomSettingsActivity.I;
                if (!(view instanceof org.telegram.ui.Cells.t8)) {
                    notificationsCustomSettingsActivity.q0(true);
                    break;
                } else {
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((kh0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.k0();
                    }
                    ((org.telegram.ui.Cells.t8) view).b(notificationsCustomSettingsActivity.k0(), org.telegram.messenger.hd.M0(2131748988, "LedColor"), true);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.I;
                if (!(view instanceof org.telegram.ui.Cells.w9)) {
                    notificationsCustomSettingsActivity.q0(true);
                    break;
                } else {
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        ((kh0) arrayList2.get(i10)).f = notificationsCustomSettingsActivity.l0();
                    }
                    org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
                    w9Var.c(org.telegram.messenger.hd.M0(2131747097, "PopupNotification"), notificationsCustomSettingsActivity.l0(), true, w9Var.h);
                    break;
                }
                break;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
                if (!(view instanceof org.telegram.ui.Cells.w9)) {
                    notificationsCustomSettingsActivity.q0(true);
                    break;
                } else {
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        ((kh0) arrayList3.get(i10)).f = notificationsCustomSettingsActivity.m0();
                    }
                    org.telegram.ui.Cells.w9 w9Var2 = (org.telegram.ui.Cells.w9) view;
                    w9Var2.c(org.telegram.messenger.hd.M0(2131747905, "NotificationsImportance"), notificationsCustomSettingsActivity.m0(), true, w9Var2.h);
                    break;
                }
                break;
        }
    }
}
