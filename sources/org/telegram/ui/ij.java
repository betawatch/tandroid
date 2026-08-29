package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ij implements org.telegram.ui.Components.io {
    public final /* synthetic */ tn a;

    public ij(tn tnVar) {
        this.a = tnVar;
    }

    @Override // org.telegram.ui.Components.io
    public final void dismiss() {
        this.a.d0.M(null, null);
    }

    @Override // org.telegram.ui.Components.io
    public final void k() {
        tn tnVar = this.a;
        tnVar.bc(true);
        org.telegram.ui.Components.tc.A(tnVar, tnVar.getMessagesController().isDialogMuted(tnVar.P5, tnVar.b()), tnVar.aa).j();
    }

    @Override // org.telegram.ui.Components.io
    public final void l() {
        tn tnVar = this.a;
        if (tnVar.P5 == 0 || tnVar.N3 == 3) {
            return;
        }
        if (tnVar.f != null) {
            tnVar.getMessagesController().putUser(tnVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", tnVar.P5);
        if (tnVar.b() != 0) {
            bundle.putLong("topic_id", tnVar.b());
        }
        tnVar.presentFragment(new t01(bundle, tnVar.aa));
    }

    @Override // org.telegram.ui.Components.io
    public final void u() {
        int i10;
        tn tnVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(tnVar.P5, tnVar.b()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(tnVar.P5, tnVar.b()), z11).apply();
        if (org.telegram.ui.Components.tc.a(tnVar)) {
            org.telegram.ui.Components.tc.S(z10 ? 1 : 0, tnVar, tnVar.getResourceProvider()).j();
        }
        tnVar.Pc(false);
    }

    @Override // org.telegram.ui.Components.io
    public final void w(int i10) {
        tn tnVar = this.a;
        if (i10 != 0) {
            tnVar.getNotificationsController().muteUntil(tnVar.P5, tnVar.b(), i10);
            if (org.telegram.ui.Components.tc.a(tnVar)) {
                org.telegram.ui.Components.tc.z(tnVar, 5, i10, tnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (tnVar.getMessagesController().isDialogMuted(tnVar.P5, tnVar.b())) {
            tnVar.bc(true);
        }
        if (org.telegram.ui.Components.tc.a(tnVar)) {
            org.telegram.ui.Components.tc.z(tnVar, 4, i10, tnVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.io
    public final /* synthetic */ void j() {
    }
}
