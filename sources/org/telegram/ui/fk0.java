package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;

    public /* synthetic */ fk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
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
                ArrayList arrayList = notificationsCustomSettingsActivity.I;
                View view = this.c;
                if (!(view instanceof org.telegram.ui.Cells.c9)) {
                    notificationsCustomSettingsActivity.m0(true);
                    break;
                } else {
                    int i10 = this.d;
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((kk0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.g0();
                    }
                    ((org.telegram.ui.Cells.c9) view).b(notificationsCustomSettingsActivity.g0(), LocaleController.getString("LedColor", R.string.LedColor), true);
                    break;
                }
                break;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.b;
                ArrayList arrayList2 = notificationsCustomSettingsActivity2.I;
                View view2 = this.c;
                if (!(view2 instanceof org.telegram.ui.Cells.ga)) {
                    notificationsCustomSettingsActivity2.m0(true);
                    break;
                } else {
                    int i11 = this.d;
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((kk0) arrayList2.get(i11)).f = notificationsCustomSettingsActivity2.h0();
                    }
                    org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view2;
                    gaVar.c(LocaleController.getString("PopupNotification", R.string.PopupNotification), notificationsCustomSettingsActivity2.h0(), true, gaVar.h);
                    break;
                }
                break;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = this.b;
                ArrayList arrayList3 = notificationsCustomSettingsActivity3.I;
                View view3 = this.c;
                if (!(view3 instanceof org.telegram.ui.Cells.ga)) {
                    notificationsCustomSettingsActivity3.m0(true);
                    break;
                } else {
                    int i12 = this.d;
                    if (i12 >= 0 && i12 < arrayList3.size()) {
                        ((kk0) arrayList3.get(i12)).f = notificationsCustomSettingsActivity3.i0();
                    }
                    org.telegram.ui.Cells.ga gaVar2 = (org.telegram.ui.Cells.ga) view3;
                    gaVar2.c(LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), notificationsCustomSettingsActivity3.i0(), true, gaVar2.h);
                    break;
                }
                break;
        }
    }
}
