package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;

    public /* synthetic */ mh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i7, int i10) {
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
                ArrayList arrayList = notificationsCustomSettingsActivity.J;
                if (!(view instanceof org.telegram.ui.Cells.u8)) {
                    notificationsCustomSettingsActivity.q0(true);
                    break;
                } else {
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((qh0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.k0();
                    }
                    ((org.telegram.ui.Cells.u8) view).b(notificationsCustomSettingsActivity.k0(), org.telegram.messenger.hd.N0(2131748796, "LedColor"), true);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.J;
                if (!(view instanceof org.telegram.ui.Cells.x9)) {
                    notificationsCustomSettingsActivity.q0(true);
                    break;
                } else {
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        ((qh0) arrayList2.get(i10)).f = notificationsCustomSettingsActivity.l0();
                    }
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                    x9Var.c(org.telegram.messenger.hd.N0(2131746904, "PopupNotification"), notificationsCustomSettingsActivity.l0(), true, x9Var.h);
                    break;
                }
                break;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                if (!(view instanceof org.telegram.ui.Cells.x9)) {
                    notificationsCustomSettingsActivity.q0(true);
                    break;
                } else {
                    if (i10 >= 0 && i10 < arrayList3.size()) {
                        ((qh0) arrayList3.get(i10)).f = notificationsCustomSettingsActivity.m0();
                    }
                    org.telegram.ui.Cells.x9 x9Var2 = (org.telegram.ui.Cells.x9) view;
                    x9Var2.c(org.telegram.messenger.hd.N0(2131747712, "NotificationsImportance"), notificationsCustomSettingsActivity.m0(), true, x9Var2.h);
                    break;
                }
                break;
        }
    }
}
