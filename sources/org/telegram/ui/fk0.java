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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fk0 implements oy, org.telegram.ui.ActionBar.a2, o11 {
    public final /* synthetic */ NotificationsCustomSettingsActivity a;

    public /* synthetic */ fk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.a = notificationsCustomSettingsActivity;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.oy
    public /* synthetic */ boolean H(uy uyVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.w.size();
        for (int i11 = 0; i11 < size; i11++) {
            rk0 rk0Var = (rk0) notificationsCustomSettingsActivity.w.get(i11);
            if (notificationsCustomSettingsActivity.s == 3) {
                edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + rk0Var.d);
            } else {
                edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + rk0Var.d).remove(NotificationsSettingsFacade.PROPERTY_CUSTOM + rk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(rk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(rk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((rk0) notificationsCustomSettingsActivity.w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.w.clear();
        notificationsCustomSettingsActivity.x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override // org.telegram.ui.oy
    public boolean u(uy uyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, wf1 wf1Var) {
        int i12 = 0;
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        if (notificationsCustomSettingsActivity.s != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putBoolean("exception", true);
            p11 p11Var = new p11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
            p11Var.s = new fk0(notificationsCustomSettingsActivity);
            notificationsCustomSettingsActivity.presentFragment(p11Var, true);
            return true;
        }
        ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((rk0) it.next()).d == j3) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList3 = notificationsCustomSettingsActivity.w;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (((rk0) it2.next()).d == j3) {
                    it2.remove();
                }
            }
        }
        rk0 rk0Var = new rk0();
        rk0Var.d = j3;
        rk0Var.e = true;
        Boolean bool = notificationsCustomSettingsActivity.n;
        if (bool != null && bool.booleanValue()) {
            i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        rk0Var.c = i12;
        if (notificationsCustomSettingsActivity.w == null) {
            notificationsCustomSettingsActivity.w = new ArrayList();
        }
        notificationsCustomSettingsActivity.w.add(rk0Var);
        notificationsCustomSettingsActivity.l0(true);
        return true;
    }

    @Override // org.telegram.ui.o11
    public void v(rk0 rk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.w.add(0, rk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override // org.telegram.ui.o11
    public /* synthetic */ void d0() {
    }
}
