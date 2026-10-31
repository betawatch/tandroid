package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;

    public /* synthetic */ mi0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
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
                    notificationsCustomSettingsActivity.p0(true);
                    break;
                } else {
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        ((qi0) arrayList.get(i11)).h = notificationsCustomSettingsActivity.j0();
                    }
                    ((org.telegram.ui.Cells.v8) view).b(notificationsCustomSettingsActivity.j0(), org.telegram.messenger.cd.L0(2131748999, "LedColor"), true);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.I;
                if (!(view instanceof org.telegram.ui.Cells.x9)) {
                    notificationsCustomSettingsActivity.p0(true);
                    break;
                } else {
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((qi0) arrayList2.get(i11)).f = notificationsCustomSettingsActivity.k0();
                    }
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                    x9Var.c(org.telegram.messenger.cd.L0(2131747113, "PopupNotification"), notificationsCustomSettingsActivity.k0(), true, x9Var.h);
                    break;
                }
                break;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
                if (!(view instanceof org.telegram.ui.Cells.x9)) {
                    notificationsCustomSettingsActivity.p0(true);
                    break;
                } else {
                    if (i11 >= 0 && i11 < arrayList3.size()) {
                        ((qi0) arrayList3.get(i11)).f = notificationsCustomSettingsActivity.l0();
                    }
                    org.telegram.ui.Cells.x9 x9Var2 = (org.telegram.ui.Cells.x9) view;
                    x9Var2.c(org.telegram.messenger.cd.L0(2131747922, "NotificationsImportance"), notificationsCustomSettingsActivity.l0(), true, x9Var2.h);
                    break;
                }
                break;
        }
    }
}
