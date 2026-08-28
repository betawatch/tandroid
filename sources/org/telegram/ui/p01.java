package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p01 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ String a;
    public final /* synthetic */ s01 b;

    public p01(s01 s01Var, String str) {
        this.b = s01Var;
        this.a = str;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        s01 s01Var = this.b;
        long j10 = s01Var.f;
        long j11 = s01Var.e;
        String str = this.a;
        if (i9 == -1) {
            if (!s01Var.h && s01Var.n) {
                i16 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                MessagesController.getNotificationsSettings(i16).edit().putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + str, 0).apply();
            }
        } else if (i9 == 1) {
            i10 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
            SharedPreferences.Editor edit = notificationsSettings.edit();
            edit.putBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + str, true);
            i11 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i11).dialogs_dict.f(j11);
            if (s01Var.n) {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + str, 0);
                if (j10 == 0) {
                    i15 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                    MessagesStorage.getInstance(i15).setDialogFlags(j11, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + str, 2);
                if (j10 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                    NotificationsController.getInstance(i12).removeNotificationsForDialog(j11);
                    i13 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
                    MessagesStorage.getInstance(i13).setDialogFlags(j11, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
            i14 = ((org.telegram.ui.ActionBar.o2) s01Var).currentAccount;
            NotificationsController.getInstance(i14).updateServerNotificationsSettings(j11, j10);
            if (s01Var.r != null) {
                ek0 ek0Var = new ek0();
                ek0Var.d = j11;
                ek0Var.b = true;
                int c10 = org.telegram.messenger.l0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, str, notificationsSettings, 0);
                ek0Var.c = c10;
                if (c10 != 0) {
                    ek0Var.a = org.telegram.messenger.l0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL, str, notificationsSettings, 0);
                }
                s01Var.r.g(ek0Var);
            }
        }
        s01Var.finishFragment();
    }
}
