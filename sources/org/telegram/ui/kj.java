package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class kj implements org.telegram.ui.Components.yo {
    public final /* synthetic */ qn a;

    public kj(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.ui.Components.yo
    public final void dismiss() {
        this.a.h0.M(null, null);
    }

    @Override // org.telegram.ui.Components.yo
    public final void n() {
        qn qnVar = this.a;
        qnVar.gc(true);
        org.telegram.ui.Components.xc.A(qnVar, qnVar.getMessagesController().isDialogMuted(qnVar.T5, qnVar.d()), qnVar.ea).j();
    }

    @Override // org.telegram.ui.Components.yo
    public final void o() {
        qn qnVar = this.a;
        if (qnVar.T5 == 0 || qnVar.R3 == 3) {
            return;
        }
        if (qnVar.f != null) {
            qnVar.getMessagesController().putUser(qnVar.f, true);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", qnVar.T5);
        if (qnVar.d() != 0) {
            bundle.putLong("topic_id", qnVar.d());
        }
        qnVar.presentFragment(new z01(bundle, qnVar.ea));
    }

    @Override // org.telegram.ui.Components.yo
    public final void t() {
        int i10;
        qn qnVar = this.a;
        i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(qnVar.T5, qnVar.d()), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(qnVar.T5, qnVar.d()), z11).apply();
        if (org.telegram.ui.Components.xc.a(qnVar)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, qnVar, qnVar.getResourceProvider()).j();
        }
        qnVar.Uc(false);
    }

    @Override // org.telegram.ui.Components.yo
    public final void x(int i10) {
        qn qnVar = this.a;
        if (i10 != 0) {
            qnVar.getNotificationsController().muteUntil(qnVar.T5, qnVar.d(), i10);
            if (org.telegram.ui.Components.xc.a(qnVar)) {
                org.telegram.ui.Components.xc.z(qnVar, 5, i10, qnVar.getResourceProvider()).j();
                return;
            }
            return;
        }
        if (qnVar.getMessagesController().isDialogMuted(qnVar.T5, qnVar.d())) {
            qnVar.gc(true);
        }
        if (org.telegram.ui.Components.xc.a(qnVar)) {
            org.telegram.ui.Components.xc.z(qnVar, 4, i10, qnVar.getResourceProvider()).j();
        }
    }

    @Override // org.telegram.ui.Components.yo
    public final /* synthetic */ void m() {
    }
}
