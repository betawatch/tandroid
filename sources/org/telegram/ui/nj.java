package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class nj implements org.telegram.ui.Components.mo {
    public final /* synthetic */ xn a;

    public nj(xn xnVar) {
        this.a = xnVar;
    }

    @Override // org.telegram.ui.Components.mo
    public final void dismiss() {
        this.a.e0.M(null, null);
    }

    @Override // org.telegram.ui.Components.mo
    public final void k() {
        xn xnVar = this.a;
        xnVar.bc(true);
        org.telegram.ui.Components.qc.A(xnVar, xnVar.getMessagesController().isDialogMuted(xnVar.Q5, xnVar.b()), xnVar.ba).j();
    }

    @Override // org.telegram.ui.Components.mo
    public final void o() {
        xn xnVar = this.a;
        if (xnVar.Q5 == 0 || xnVar.O3 == 3) {
            return;
        }
        if (xnVar.f != null) {
            xnVar.getMessagesController().putUser(xnVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", xnVar.Q5);
        if (xnVar.b() != 0) {
            bundle.putLong("topic_id", xnVar.b());
        }
        xnVar.presentFragment(new k11(bundle, xnVar.ba));
    }

    @Override // org.telegram.ui.Components.mo
    public final void u() {
        int i10;
        xn xnVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z4 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(xnVar.Q5, xnVar.b()), true);
        boolean z10 = !z4;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(xnVar.Q5, xnVar.b()), z10).apply();
        if (org.telegram.ui.Components.qc.a(xnVar)) {
            org.telegram.ui.Components.qc.S(z4 ? 1 : 0, xnVar, xnVar.getResourceProvider()).j();
        }
        xnVar.Pc(false);
    }

    @Override // org.telegram.ui.Components.mo
    public final void v(int i10) {
        xn xnVar = this.a;
        if (i10 != 0) {
            xnVar.getNotificationsController().muteUntil(xnVar.Q5, xnVar.b(), i10);
            if (org.telegram.ui.Components.qc.a(xnVar)) {
                org.telegram.ui.Components.qc.z(xnVar, 5, i10, xnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (xnVar.getMessagesController().isDialogMuted(xnVar.Q5, xnVar.b())) {
            xnVar.bc(true);
        }
        if (org.telegram.ui.Components.qc.a(xnVar)) {
            org.telegram.ui.Components.qc.z(xnVar, 4, i10, xnVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.mo
    public final /* synthetic */ void j() {
    }
}
