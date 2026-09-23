package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class oj implements org.telegram.ui.Components.po {
    public final /* synthetic */ xn a;

    public oj(xn xnVar) {
        this.a = xnVar;
    }

    @Override // org.telegram.ui.Components.po
    public final void dismiss() {
        this.a.h0.M(null, null);
    }

    @Override // org.telegram.ui.Components.po
    public final void n() {
        xn xnVar = this.a;
        xnVar.bc(true);
        org.telegram.ui.Components.xc.A(xnVar, xnVar.getMessagesController().isDialogMuted(xnVar.T5, xnVar.d()), xnVar.ea).j();
    }

    @Override // org.telegram.ui.Components.po
    public final void o() {
        xn xnVar = this.a;
        if (xnVar.T5 == 0 || xnVar.R3 == 3) {
            return;
        }
        if (xnVar.f != null) {
            xnVar.getMessagesController().putUser(xnVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", xnVar.T5);
        if (xnVar.d() != 0) {
            bundle.putLong("topic_id", xnVar.d());
        }
        xnVar.presentFragment(new p11(bundle, xnVar.ea));
    }

    @Override // org.telegram.ui.Components.po
    public final void r() {
        int i10;
        xn xnVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(xnVar.T5, xnVar.d()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(xnVar.T5, xnVar.d()), z11).apply();
        if (org.telegram.ui.Components.xc.a(xnVar)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, xnVar, xnVar.getResourceProvider()).j();
        }
        xnVar.Pc(false);
    }

    @Override // org.telegram.ui.Components.po
    public final void t(int i10) {
        xn xnVar = this.a;
        if (i10 != 0) {
            xnVar.getNotificationsController().muteUntil(xnVar.T5, xnVar.d(), i10);
            if (org.telegram.ui.Components.xc.a(xnVar)) {
                org.telegram.ui.Components.xc.z(xnVar, 5, i10, xnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (xnVar.getMessagesController().isDialogMuted(xnVar.T5, xnVar.d())) {
            xnVar.bc(true);
        }
        if (org.telegram.ui.Components.xc.a(xnVar)) {
            org.telegram.ui.Components.xc.z(xnVar, 4, i10, xnVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.po
    public final /* synthetic */ void l() {
    }
}
