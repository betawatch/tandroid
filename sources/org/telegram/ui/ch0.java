package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;

    public /* synthetic */ ch0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i3, int i10) {
        this.a = i10;
        this.b = notificationsCustomSettingsActivity;
        this.c = view;
        this.d = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = this.d;
        View view = this.c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.b;
        switch (i3) {
            case 0:
                ArrayList arrayList = notificationsCustomSettingsActivity.J;
                if (!(view instanceof org.telegram.ui.Cells.s8)) {
                    notificationsCustomSettingsActivity.q0(true);
                    break;
                } else {
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((gh0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.k0();
                    }
                    ((org.telegram.ui.Cells.s8) view).b(notificationsCustomSettingsActivity.k0(), org.telegram.messenger.bd.M0(2131748997, "LedColor"), true);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.J;
                if (!(view instanceof org.telegram.ui.Cells.v9)) {
                    notificationsCustomSettingsActivity.q0(true);
                    break;
                } else {
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        ((gh0) arrayList2.get(i10)).f = notificationsCustomSettingsActivity.l0();
                    }
                    org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                    v9Var.c(org.telegram.messenger.bd.M0(2131747106, "PopupNotification"), notificationsCustomSettingsActivity.l0(), true, v9Var.h);
                    break;
                }
                break;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                if (!(view instanceof org.telegram.ui.Cells.v9)) {
                    notificationsCustomSettingsActivity.q0(true);
                    break;
                } else {
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        ((gh0) arrayList3.get(i10)).f = notificationsCustomSettingsActivity.m0();
                    }
                    org.telegram.ui.Cells.v9 v9Var2 = (org.telegram.ui.Cells.v9) view;
                    v9Var2.c(org.telegram.messenger.bd.M0(2131747914, "NotificationsImportance"), notificationsCustomSettingsActivity.m0(), true, v9Var2.h);
                    break;
                }
                break;
        }
    }
}
