package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hj implements org.telegram.ui.Components.bo {
    public final /* synthetic */ rn a;

    public hj(rn rnVar) {
        this.a = rnVar;
    }

    @Override // org.telegram.ui.Components.bo
    public final void dismiss() {
        this.a.d0.M(null, null);
    }

    @Override // org.telegram.ui.Components.bo
    public final void m() {
        rn rnVar = this.a;
        rnVar.bc(true);
        org.telegram.ui.Components.mc.A(rnVar, rnVar.getMessagesController().isDialogMuted(rnVar.P5, rnVar.b()), rnVar.aa).j();
    }

    @Override // org.telegram.ui.Components.bo
    public final void o() {
        rn rnVar = this.a;
        if (rnVar.P5 == 0 || rnVar.N3 == 3) {
            return;
        }
        if (rnVar.f != null) {
            rnVar.getMessagesController().putUser(rnVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", rnVar.P5);
        if (rnVar.b() != 0) {
            bundle.putLong("topic_id", rnVar.b());
        }
        rnVar.presentFragment(new t01(bundle, rnVar.aa));
    }

    @Override // org.telegram.ui.Components.bo
    public final void u() {
        int i10;
        rn rnVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(rnVar.P5, rnVar.b()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(rnVar.P5, rnVar.b()), z11).apply();
        if (org.telegram.ui.Components.mc.a(rnVar)) {
            org.telegram.ui.Components.mc.S(z10 ? 1 : 0, rnVar, rnVar.getResourceProvider()).j();
        }
        rnVar.Pc(false);
    }

    @Override // org.telegram.ui.Components.bo
    public final void v(int i10) {
        rn rnVar = this.a;
        if (i10 != 0) {
            rnVar.getNotificationsController().muteUntil(rnVar.P5, rnVar.b(), i10);
            if (org.telegram.ui.Components.mc.a(rnVar)) {
                org.telegram.ui.Components.mc.z(rnVar, 5, i10, rnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (rnVar.getMessagesController().isDialogMuted(rnVar.P5, rnVar.b())) {
            rnVar.bc(true);
        }
        if (org.telegram.ui.Components.mc.a(rnVar)) {
            org.telegram.ui.Components.mc.z(rnVar, 4, i10, rnVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.bo
    public final /* synthetic */ void k() {
    }
}
