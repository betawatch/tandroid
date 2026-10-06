package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class pj implements org.telegram.ui.Components.ro {
    public final /* synthetic */ yn a;

    public pj(yn ynVar) {
        this.a = ynVar;
    }

    @Override // org.telegram.ui.Components.ro
    public final void dismiss() {
        this.a.f0.M(null, null);
    }

    @Override // org.telegram.ui.Components.ro
    public final void k() {
        yn ynVar = this.a;
        ynVar.ac(true);
        org.telegram.ui.Components.yc.A(ynVar, ynVar.getMessagesController().isDialogMuted(ynVar.R5, ynVar.d()), ynVar.ca).j();
    }

    @Override // org.telegram.ui.Components.ro
    public final void l() {
        yn ynVar = this.a;
        if (ynVar.R5 == 0 || ynVar.P3 == 3) {
            return;
        }
        if (ynVar.f != null) {
            ynVar.getMessagesController().putUser(ynVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ynVar.R5);
        if (ynVar.d() != 0) {
            bundle.putLong("topic_id", ynVar.d());
        }
        ynVar.presentFragment(new p11(bundle, ynVar.ca));
    }

    @Override // org.telegram.ui.Components.ro
    public final void r() {
        int i10;
        yn ynVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(ynVar.R5, ynVar.d()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(ynVar.R5, ynVar.d()), z11).apply();
        if (org.telegram.ui.Components.yc.a(ynVar)) {
            org.telegram.ui.Components.yc.S(z10 ? 1 : 0, ynVar, ynVar.getResourceProvider()).j();
        }
        ynVar.Oc(false);
    }

    @Override // org.telegram.ui.Components.ro
    public final void t(int i10) {
        yn ynVar = this.a;
        if (i10 != 0) {
            ynVar.getNotificationsController().muteUntil(ynVar.R5, ynVar.d(), i10);
            if (org.telegram.ui.Components.yc.a(ynVar)) {
                org.telegram.ui.Components.yc.z(ynVar, 5, i10, ynVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (ynVar.getMessagesController().isDialogMuted(ynVar.R5, ynVar.d())) {
            ynVar.ac(true);
        }
        if (org.telegram.ui.Components.yc.a(ynVar)) {
            org.telegram.ui.Components.yc.z(ynVar, 4, i10, ynVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ro
    public final /* synthetic */ void j() {
    }
}
