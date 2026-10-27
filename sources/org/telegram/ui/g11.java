package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class g11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ String a;
    public final /* synthetic */ j11 b;

    public g11(j11 j11Var, String str) {
        this.b = j11Var;
        this.a = str;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        j11 j11Var = this.b;
        long j10 = j11Var.h;
        long j11 = j11Var.f;
        String str = this.a;
        if (i10 == -1) {
            if (!j11Var.n && j11Var.r) {
                i17 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
                MessagesController.getNotificationsSettings(i17).edit().putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            SharedPreferences.Editor edit = notificationsSettings.edit();
            edit.putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, true);
            i12 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(j11);
            if (j11Var.r) {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + str, 0);
                if (j10 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
                    MessagesStorage.getInstance(i16).setDialogFlags(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + str, 2);
                if (j10 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
                    NotificationsController.getInstance(i13).removeNotificationsForDialog(j11);
                    i14 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
                    MessagesStorage.getInstance(i14).setDialogFlags(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
            i15 = ((org.telegram.ui.ActionBar.r2) j11Var).currentAccount;
            NotificationsController.getInstance(i15).updateServerNotificationsSettings(j11, j10);
            if (j11Var.s != null) {
                qk0 qk0Var = new qk0();
                qk0Var.d = j11;
                qk0Var.b = true;
                int d = org.telegram.messenger.t.d(NotificationsSettingsFacade.PROPERTY_NOTIFY, str, notificationsSettings, 0);
                qk0Var.c = d;
                if (d != 0) {
                    qk0Var.a = org.telegram.messenger.t.d(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL, str, notificationsSettings, 0);
                }
                j11Var.s.t(qk0Var);
            }
        }
        j11Var.finishFragment();
    }
}
