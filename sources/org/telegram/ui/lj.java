package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lj implements org.telegram.ui.Components.ap {
    public final /* synthetic */ un a;

    public lj(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.ui.Components.ap
    public final void dismiss() {
        this.a.h0.U(null, null);
    }

    @Override // org.telegram.ui.Components.ap
    public final void n() {
        un unVar = this.a;
        unVar.nc(true);
        org.telegram.ui.Components.wc.A(unVar, unVar.getMessagesController().isDialogMuted(unVar.f6, unVar.b()), unVar.qa).j();
    }

    @Override // org.telegram.ui.Components.ap
    public final void o() {
        un unVar = this.a;
        if (unVar.f6 == 0 || unVar.d4 == 3) {
            return;
        }
        if (unVar.f != null) {
            unVar.getMessagesController().putUser(unVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", unVar.f6);
        if (unVar.b() != 0) {
            bundle.putLong("topic_id", unVar.b());
        }
        unVar.presentFragment(new h11(bundle, unVar.qa));
    }

    @Override // org.telegram.ui.Components.ap
    public final void r() {
        int i10;
        un unVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(unVar.f6, unVar.b()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(unVar.f6, unVar.b()), z11).apply();
        if (org.telegram.ui.Components.wc.a(unVar)) {
            org.telegram.ui.Components.wc.T(z10 ? 1 : 0, unVar, unVar.getResourceProvider()).j();
        }
        unVar.cd(false);
    }

    @Override // org.telegram.ui.Components.ap
    public final void u(int i10) {
        un unVar = this.a;
        if (i10 != 0) {
            unVar.getNotificationsController().muteUntil(unVar.f6, unVar.b(), i10);
            if (org.telegram.ui.Components.wc.a(unVar)) {
                org.telegram.ui.Components.wc.z(unVar, 5, i10, unVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (unVar.getMessagesController().isDialogMuted(unVar.f6, unVar.b())) {
            unVar.nc(true);
        }
        if (org.telegram.ui.Components.wc.a(unVar)) {
            org.telegram.ui.Components.wc.z(unVar, 4, i10, unVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ap
    public final /* synthetic */ void m() {
    }
}
