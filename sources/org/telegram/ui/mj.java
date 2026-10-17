package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class mj implements org.telegram.ui.Components.yo {
    public final /* synthetic */ sn a;

    public mj(sn snVar) {
        this.a = snVar;
    }

    @Override // org.telegram.ui.Components.yo
    public final void dismiss() {
        this.a.h0.M(null, null);
    }

    @Override // org.telegram.ui.Components.yo
    public final void n() {
        sn snVar = this.a;
        snVar.fc(true);
        org.telegram.ui.Components.xc.A(snVar, snVar.getMessagesController().isDialogMuted(snVar.T5, snVar.d()), snVar.ea).j();
    }

    @Override // org.telegram.ui.Components.yo
    public final void p() {
        sn snVar = this.a;
        if (snVar.T5 == 0 || snVar.R3 == 3) {
            return;
        }
        if (snVar.f != null) {
            snVar.getMessagesController().putUser(snVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", snVar.T5);
        if (snVar.d() != 0) {
            bundle.putLong("topic_id", snVar.d());
        }
        snVar.presentFragment(new b11(bundle, snVar.ea));
    }

    @Override // org.telegram.ui.Components.yo
    public final void t() {
        int i10;
        sn snVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(snVar.T5, snVar.d()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(snVar.T5, snVar.d()), z11).apply();
        if (org.telegram.ui.Components.xc.a(snVar)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, snVar, snVar.getResourceProvider()).j();
        }
        snVar.Tc(false);
    }

    @Override // org.telegram.ui.Components.yo
    public final void y(int i10) {
        sn snVar = this.a;
        if (i10 != 0) {
            snVar.getNotificationsController().muteUntil(snVar.T5, snVar.d(), i10);
            if (org.telegram.ui.Components.xc.a(snVar)) {
                org.telegram.ui.Components.xc.z(snVar, 5, i10, snVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (snVar.getMessagesController().isDialogMuted(snVar.T5, snVar.d())) {
            snVar.fc(true);
        }
        if (org.telegram.ui.Components.xc.a(snVar)) {
            org.telegram.ui.Components.xc.z(snVar, 4, i10, snVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.yo
    public final /* synthetic */ void m() {
    }
}
