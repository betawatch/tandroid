package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class kj implements org.telegram.ui.Components.yo {
    public final /* synthetic */ sn a;

    public kj(sn snVar) {
        this.a = snVar;
    }

    @Override // org.telegram.ui.Components.yo
    public final void dismiss() {
        this.a.h0.M(null, null);
    }

    @Override // org.telegram.ui.Components.yo
    public final void o() {
        sn snVar = this.a;
        snVar.hc(true);
        org.telegram.ui.Components.xc.A(snVar, snVar.getMessagesController().isDialogMuted(snVar.f6, snVar.d()), snVar.qa).j();
    }

    @Override // org.telegram.ui.Components.yo
    public final void p() {
        sn snVar = this.a;
        if (snVar.f6 == 0 || snVar.d4 == 3) {
            return;
        }
        if (snVar.f != null) {
            snVar.getMessagesController().putUser(snVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", snVar.f6);
        if (snVar.d() != 0) {
            bundle.putLong("topic_id", snVar.d());
        }
        snVar.presentFragment(new d11(bundle, snVar.qa));
    }

    @Override // org.telegram.ui.Components.yo
    public final void t() {
        int i10;
        sn snVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(snVar.f6, snVar.d()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(snVar.f6, snVar.d()), z11).apply();
        if (org.telegram.ui.Components.xc.a(snVar)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, snVar, snVar.getResourceProvider()).j();
        }
        snVar.Wc(false);
    }

    @Override // org.telegram.ui.Components.yo
    public final void v(int i10) {
        sn snVar = this.a;
        if (i10 != 0) {
            snVar.getNotificationsController().muteUntil(snVar.f6, snVar.d(), i10);
            if (org.telegram.ui.Components.xc.a(snVar)) {
                org.telegram.ui.Components.xc.z(snVar, 5, i10, snVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (snVar.getMessagesController().isDialogMuted(snVar.f6, snVar.d())) {
            snVar.hc(true);
        }
        if (org.telegram.ui.Components.xc.a(snVar)) {
            org.telegram.ui.Components.xc.z(snVar, 4, i10, snVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.yo
    public final /* synthetic */ void m() {
    }
}
