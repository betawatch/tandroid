package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pj implements org.telegram.ui.Components.jo {
    public final /* synthetic */ zn a;

    public pj(zn znVar) {
        this.a = znVar;
    }

    @Override // org.telegram.ui.Components.jo
    public final void dismiss() {
        this.a.e0.M(null, null);
    }

    @Override // org.telegram.ui.Components.jo
    public final void k() {
        zn znVar = this.a;
        znVar.bc(true);
        org.telegram.ui.Components.qc.A(znVar, znVar.getMessagesController().isDialogMuted(znVar.Q5, znVar.d()), znVar.ba).j();
    }

    @Override // org.telegram.ui.Components.jo
    public final void l() {
        zn znVar = this.a;
        if (znVar.Q5 == 0 || znVar.O3 == 3) {
            return;
        }
        if (znVar.f != null) {
            znVar.getMessagesController().putUser(znVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", znVar.Q5);
        if (znVar.d() != 0) {
            bundle.putLong("topic_id", znVar.d());
        }
        znVar.presentFragment(new l11(bundle, znVar.ba));
    }

    @Override // org.telegram.ui.Components.jo
    public final void o() {
        int i10;
        zn znVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z4 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(znVar.Q5, znVar.d()), true);
        boolean z10 = !z4;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(znVar.Q5, znVar.d()), z10).apply();
        if (org.telegram.ui.Components.qc.a(znVar)) {
            org.telegram.ui.Components.qc.S(z4 ? 1 : 0, znVar, znVar.getResourceProvider()).j();
        }
        znVar.Pc(false);
    }

    @Override // org.telegram.ui.Components.jo
    public final void s(int i10) {
        zn znVar = this.a;
        if (i10 != 0) {
            znVar.getNotificationsController().muteUntil(znVar.Q5, znVar.d(), i10);
            if (org.telegram.ui.Components.qc.a(znVar)) {
                org.telegram.ui.Components.qc.z(znVar, 5, i10, znVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (znVar.getMessagesController().isDialogMuted(znVar.Q5, znVar.d())) {
            znVar.bc(true);
        }
        if (org.telegram.ui.Components.qc.a(znVar)) {
            org.telegram.ui.Components.qc.z(znVar, 4, i10, znVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.jo
    public final /* synthetic */ void j() {
    }
}
