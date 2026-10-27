package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class oj implements org.telegram.ui.Components.ap {
    public final /* synthetic */ wn a;

    public oj(wn wnVar) {
        this.a = wnVar;
    }

    @Override // org.telegram.ui.Components.ap
    public final void dismiss() {
        this.a.h0.U(null, null);
    }

    @Override // org.telegram.ui.Components.ap
    public final void n() {
        wn wnVar = this.a;
        wnVar.rc(true);
        org.telegram.ui.Components.wc.A(wnVar, wnVar.getMessagesController().isDialogMuted(wnVar.j6, wnVar.b()), wnVar.ua).j();
    }

    @Override // org.telegram.ui.Components.ap
    public final void o() {
        wn wnVar = this.a;
        if (wnVar.j6 == 0 || wnVar.d4 == 3) {
            return;
        }
        if (wnVar.f != null) {
            wnVar.getMessagesController().putUser(wnVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", wnVar.j6);
        if (wnVar.b() != 0) {
            bundle.putLong("topic_id", wnVar.b());
        }
        wnVar.presentFragment(new j11(bundle, wnVar.ua));
    }

    @Override // org.telegram.ui.Components.ap
    public final void s() {
        int i10;
        wn wnVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(wnVar.j6, wnVar.b()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(wnVar.j6, wnVar.b()), z11).apply();
        if (org.telegram.ui.Components.wc.a(wnVar)) {
            org.telegram.ui.Components.wc.T(z10 ? 1 : 0, wnVar, wnVar.getResourceProvider()).j();
        }
        wnVar.gd(false);
    }

    @Override // org.telegram.ui.Components.ap
    public final void w(int i10) {
        wn wnVar = this.a;
        if (i10 != 0) {
            wnVar.getNotificationsController().muteUntil(wnVar.j6, wnVar.b(), i10);
            if (org.telegram.ui.Components.wc.a(wnVar)) {
                org.telegram.ui.Components.wc.z(wnVar, 5, i10, wnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (wnVar.getMessagesController().isDialogMuted(wnVar.j6, wnVar.b())) {
            wnVar.rc(true);
        }
        if (org.telegram.ui.Components.wc.a(wnVar)) {
            org.telegram.ui.Components.wc.z(wnVar, 4, i10, wnVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.ap
    public final /* synthetic */ void m() {
    }
}
