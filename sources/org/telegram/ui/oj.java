package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class oj implements org.telegram.ui.Components.po {
    public final /* synthetic */ wn a;

    public oj(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.ui.Components.po
    public final void dismiss() {
        this.a.h0.M(null, null);
    }

    @Override // org.telegram.ui.Components.po
    public final void n() {
        wn wnVar = this.a;
        wnVar.bc(true);
        org.telegram.ui.Components.xc.A(wnVar, wnVar.getMessagesController().isDialogMuted(wnVar.T5, wnVar.d()), wnVar.ea).j();
    }

    @Override // org.telegram.ui.Components.po
    public final void o() {
        wn wnVar = this.a;
        if (wnVar.T5 == 0 || wnVar.R3 == 3) {
            return;
        }
        if (wnVar.f != null) {
            wnVar.getMessagesController().putUser(wnVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", wnVar.T5);
        if (wnVar.d() != 0) {
            bundle.putLong("topic_id", wnVar.d());
        }
        wnVar.presentFragment(new n11(bundle, wnVar.ea));
    }

    @Override // org.telegram.ui.Components.po
    public final void r() {
        int i10;
        wn wnVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(wnVar.T5, wnVar.d()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(wnVar.T5, wnVar.d()), z11).apply();
        if (org.telegram.ui.Components.xc.a(wnVar)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, wnVar, wnVar.getResourceProvider()).j();
        }
        wnVar.Pc(false);
    }

    @Override // org.telegram.ui.Components.po
    public final void u(int i10) {
        wn wnVar = this.a;
        if (i10 != 0) {
            wnVar.getNotificationsController().muteUntil(wnVar.T5, wnVar.d(), i10);
            if (org.telegram.ui.Components.xc.a(wnVar)) {
                org.telegram.ui.Components.xc.z(wnVar, 5, i10, wnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (wnVar.getMessagesController().isDialogMuted(wnVar.T5, wnVar.d())) {
            wnVar.bc(true);
        }
        if (org.telegram.ui.Components.xc.a(wnVar)) {
            org.telegram.ui.Components.xc.z(wnVar, 4, i10, wnVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.po
    public final /* synthetic */ void m() {
    }
}
