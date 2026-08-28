package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fj implements org.telegram.ui.Components.eo {
    public final /* synthetic */ qn a;

    public fj(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.ui.Components.eo
    public final void A(int i9) {
        qn qnVar = this.a;
        if (i9 != 0) {
            qnVar.getNotificationsController().muteUntil(qnVar.P5, qnVar.b(), i9);
            if (org.telegram.ui.Components.oc.a(qnVar)) {
                org.telegram.ui.Components.oc.z(qnVar, 5, i9, qnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (qnVar.getMessagesController().isDialogMuted(qnVar.P5, qnVar.b())) {
            qnVar.bc(true);
        }
        if (org.telegram.ui.Components.oc.a(qnVar)) {
            org.telegram.ui.Components.oc.z(qnVar, 4, i9, qnVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.eo
    public final void dismiss() {
        this.a.d0.M(null, null);
    }

    @Override // org.telegram.ui.Components.eo
    public final void p() {
        qn qnVar = this.a;
        qnVar.bc(true);
        org.telegram.ui.Components.oc.A(qnVar, qnVar.getMessagesController().isDialogMuted(qnVar.P5, qnVar.b()), qnVar.aa).j();
    }

    @Override // org.telegram.ui.Components.eo
    public final void s() {
        qn qnVar = this.a;
        if (qnVar.P5 == 0 || qnVar.N3 == 3) {
            return;
        }
        if (qnVar.f != null) {
            qnVar.getMessagesController().putUser(qnVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", qnVar.P5);
        if (qnVar.b() != 0) {
            bundle.putLong("topic_id", qnVar.b());
        }
        qnVar.presentFragment(new s01(bundle, qnVar.aa));
    }

    @Override // org.telegram.ui.Components.eo
    public final void w() {
        int i9;
        qn qnVar = this.a;
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i9);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(qnVar.P5, qnVar.b()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(qnVar.P5, qnVar.b()), z11).apply();
        if (org.telegram.ui.Components.oc.a(qnVar)) {
            org.telegram.ui.Components.oc.S(z10 ? 1 : 0, qnVar, qnVar.getResourceProvider()).j();
        }
        qnVar.Pc(false);
    }

    @Override // org.telegram.ui.Components.eo
    public final /* synthetic */ void o() {
    }
}
