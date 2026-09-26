package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bk0 implements ky, org.telegram.ui.ActionBar.z1, m11 {
    public final /* synthetic */ NotificationsCustomSettingsActivity a;

    public /* synthetic */ bk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.a = notificationsCustomSettingsActivity;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.ky
    public /* synthetic */ boolean K(qy qyVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.w.size();
        for (int i11 = 0; i11 < size; i11++) {
            nk0 nk0Var = (nk0) notificationsCustomSettingsActivity.w.get(i11);
            if (notificationsCustomSettingsActivity.s == 3) {
                edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + nk0Var.d);
            } else {
                edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + nk0Var.d).remove(NotificationsSettingsFacade.PROPERTY_CUSTOM + nk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(nk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(nk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((nk0) notificationsCustomSettingsActivity.w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.w.clear();
        notificationsCustomSettingsActivity.x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override // org.telegram.ui.ky
    public boolean u(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        int i12 = 0;
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        if (notificationsCustomSettingsActivity.s != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putBoolean("exception", true);
            n11 n11Var = new n11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
            n11Var.r = new bk0(notificationsCustomSettingsActivity);
            notificationsCustomSettingsActivity.presentFragment(n11Var, true);
            return true;
        }
        ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((nk0) it.next()).d == j3) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList3 = notificationsCustomSettingsActivity.w;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (((nk0) it2.next()).d == j3) {
                    it2.remove();
                }
            }
        }
        nk0 nk0Var = new nk0();
        nk0Var.d = j3;
        nk0Var.e = true;
        Boolean bool = notificationsCustomSettingsActivity.n;
        if (bool != null && bool.booleanValue()) {
            i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        nk0Var.c = i12;
        if (notificationsCustomSettingsActivity.w == null) {
            notificationsCustomSettingsActivity.w = new ArrayList();
        }
        notificationsCustomSettingsActivity.w.add(nk0Var);
        notificationsCustomSettingsActivity.l0(true);
        return true;
    }

    @Override // org.telegram.ui.m11
    public void v(nk0 nk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.w.add(0, nk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override // org.telegram.ui.m11
    public /* synthetic */ void c0() {
    }
}
