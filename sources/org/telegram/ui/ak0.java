package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ak0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;

    public /* synthetic */ ak0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
        this.a = i11;
        this.b = notificationsCustomSettingsActivity;
        this.c = view;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.b;
                ArrayList arrayList = notificationsCustomSettingsActivity.F;
                View view = this.c;
                if (!(view instanceof org.telegram.ui.Cells.t8)) {
                    notificationsCustomSettingsActivity.l0(true);
                    break;
                } else {
                    int i10 = this.d;
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((fk0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.f0();
                    }
                    ((org.telegram.ui.Cells.t8) view).b(notificationsCustomSettingsActivity.f0(), LocaleController.getString("LedColor", R.string.LedColor), true);
                    break;
                }
                break;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.b;
                ArrayList arrayList2 = notificationsCustomSettingsActivity2.F;
                View view2 = this.c;
                if (!(view2 instanceof org.telegram.ui.Cells.z9)) {
                    notificationsCustomSettingsActivity2.l0(true);
                    break;
                } else {
                    int i11 = this.d;
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((fk0) arrayList2.get(i11)).f = notificationsCustomSettingsActivity2.g0();
                    }
                    org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) view2;
                    z9Var.c(LocaleController.getString("PopupNotification", R.string.PopupNotification), notificationsCustomSettingsActivity2.g0(), true, z9Var.h);
                    break;
                }
                break;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = this.b;
                ArrayList arrayList3 = notificationsCustomSettingsActivity3.F;
                View view3 = this.c;
                if (!(view3 instanceof org.telegram.ui.Cells.z9)) {
                    notificationsCustomSettingsActivity3.l0(true);
                    break;
                } else {
                    int i12 = this.d;
                    if (i12 >= 0 && i12 < arrayList3.size()) {
                        ((fk0) arrayList3.get(i12)).f = notificationsCustomSettingsActivity3.h0();
                    }
                    org.telegram.ui.Cells.z9 z9Var2 = (org.telegram.ui.Cells.z9) view3;
                    z9Var2.c(LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), notificationsCustomSettingsActivity3.h0(), true, z9Var2.h);
                    break;
                }
                break;
        }
    }
}
