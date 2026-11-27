// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lp7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ NotificationsCustomSettingsActivity b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;

    public /* synthetic */ lp7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i, byte b) {
        this.a = b;
        this.b = notificationsCustomSettingsActivity;
        this.c = view;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        View view = this.c;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = notificationsCustomSettingsActivity.J;
                if (!(view instanceof ykb)) {
                    notificationsCustomSettingsActivity.p0(true);
                    break;
                } else {
                    if (i >= 0 && i < arrayList.size()) {
                        ((qp7) arrayList.get(i)).h = notificationsCustomSettingsActivity.f0();
                    }
                    ((ykb) view).b(notificationsCustomSettingsActivity.f0(), ob6.M0(2131748743, "LedColor"), true);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = notificationsCustomSettingsActivity.J;
                if (!(view instanceof qmb)) {
                    notificationsCustomSettingsActivity.p0(true);
                    break;
                } else {
                    if (i >= 0 && i < arrayList2.size()) {
                        ((qp7) arrayList2.get(i)).f = notificationsCustomSettingsActivity.g0();
                    }
                    qmb qmbVar = (qmb) view;
                    qmbVar.c(ob6.M0(2131746825, "PopupNotification"), notificationsCustomSettingsActivity.g0(), true, qmbVar.h);
                    break;
                }
                break;
            default:
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                if (!(view instanceof qmb)) {
                    notificationsCustomSettingsActivity.p0(true);
                    break;
                } else {
                    if (i >= 0 && i < arrayList3.size()) {
                        ((qp7) arrayList3.get(i)).f = notificationsCustomSettingsActivity.h0();
                    }
                    qmb qmbVar2 = (qmb) view;
                    qmbVar2.c(ob6.M0(2131747633, "NotificationsImportance"), notificationsCustomSettingsActivity.h0(), true, qmbVar2.h);
                    break;
                }
                break;
        }
    }
}
