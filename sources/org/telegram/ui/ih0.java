package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;

    public /* synthetic */ ih0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i7, int i10) {
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
                if (!(view instanceof org.telegram.ui.Cells.s8)) {
                    notificationsCustomSettingsActivity.q0(true);
                    break;
                } else {
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((mh0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.k0();
                    }
                    ((org.telegram.ui.Cells.s8) view).b(notificationsCustomSettingsActivity.k0(), org.telegram.messenger.hd.M0(2131748989, "LedColor"), true);
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
                        ((mh0) arrayList2.get(i10)).f = notificationsCustomSettingsActivity.l0();
                    }
                    org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
                    v9Var.c(org.telegram.messenger.hd.M0(2131747098, "PopupNotification"), notificationsCustomSettingsActivity.l0(), true, v9Var.h);
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
                        ((mh0) arrayList3.get(i10)).f = notificationsCustomSettingsActivity.m0();
                    }
                    org.telegram.ui.Cells.v9 v9Var2 = (org.telegram.ui.Cells.v9) view;
                    v9Var2.c(org.telegram.messenger.hd.M0(2131747906, "NotificationsImportance"), notificationsCustomSettingsActivity.m0(), true, v9Var2.h);
                    break;
                }
                break;
        }
    }
}
