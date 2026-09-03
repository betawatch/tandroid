package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ String a;
    public final /* synthetic */ k11 b;

    public h11(k11 k11Var, String str) {
        this.b = k11Var;
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
        k11 k11Var = this.b;
        long j10 = k11Var.f;
        long j11 = k11Var.e;
        String str = this.a;
        if (i10 == -1) {
            if (!k11Var.h && k11Var.n) {
                i17 = ((org.telegram.ui.ActionBar.p2) k11Var).currentAccount;
                MessagesController.getNotificationsSettings(i17).edit().putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + str, 0).apply();
            }
        } else if (i10 == 1) {
            i11 = ((org.telegram.ui.ActionBar.p2) k11Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            SharedPreferences.Editor edit = notificationsSettings.edit();
            edit.putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, true);
            i12 = ((org.telegram.ui.ActionBar.p2) k11Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(j11);
            if (k11Var.n) {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + str, 0);
                if (j10 == 0) {
                    i16 = ((org.telegram.ui.ActionBar.p2) k11Var).currentAccount;
                    MessagesStorage.getInstance(i16).setDialogFlags(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + str, 2);
                if (j10 == 0) {
                    i13 = ((org.telegram.ui.ActionBar.p2) k11Var).currentAccount;
                    NotificationsController.getInstance(i13).removeNotificationsForDialog(j11);
                    i14 = ((org.telegram.ui.ActionBar.p2) k11Var).currentAccount;
                    MessagesStorage.getInstance(i14).setDialogFlags(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
            i15 = ((org.telegram.ui.ActionBar.p2) k11Var).currentAccount;
            NotificationsController.getInstance(i15).updateServerNotificationsSettings(j11, j10);
            if (k11Var.r != null) {
                lk0 lk0Var = new lk0();
                lk0Var.d = j11;
                lk0Var.b = true;
                int c3 = org.telegram.messenger.y3.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, str, notificationsSettings, 0);
                lk0Var.c = c3;
                if (c3 != 0) {
                    lk0Var.a = org.telegram.messenger.y3.c(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL, str, notificationsSettings, 0);
                }
                k11Var.r.u(lk0Var);
            }
        }
        k11Var.finishFragment();
    }
}
