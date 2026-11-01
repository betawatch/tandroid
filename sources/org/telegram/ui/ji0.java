package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ji0 implements tx, org.telegram.ui.ActionBar.u1, sy0 {
    public final /* synthetic */ NotificationsCustomSettingsActivity a;

    public /* synthetic */ ji0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.a = notificationsCustomSettingsActivity;
    }

    @Override // org.telegram.ui.tx
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.tx
    public /* synthetic */ boolean O(zx zxVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.x.size();
        for (int i11 = 0; i11 < size; i11++) {
            si0 si0Var = (si0) notificationsCustomSettingsActivity.x.get(i11);
            if (notificationsCustomSettingsActivity.s == 3) {
                edit.remove("stories_" + si0Var.d);
            } else {
                edit.remove("notify2_" + si0Var.d).remove("custom_" + si0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().E1(si0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().Q.f(si0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.x.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().c0(((si0) notificationsCustomSettingsActivity.x.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.x.clear();
        notificationsCustomSettingsActivity.y.clear();
        notificationsCustomSettingsActivity.q0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().k(org.telegram.messenger.at.f0, new Object[0]);
    }

    @Override // org.telegram.ui.sy0
    public void w(si0 si0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.x.add(0, si0Var);
        notificationsCustomSettingsActivity.q0(true);
    }

    @Override // org.telegram.ui.tx
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        int i12 = 0;
        long j10 = ((org.telegram.messenger.hs) arrayList.get(0)).a;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        if (notificationsCustomSettingsActivity.s != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putBoolean("exception", true);
            ty0 ty0Var = new ty0(bundle, notificationsCustomSettingsActivity.getResourceProvider());
            ty0Var.s = new ji0(notificationsCustomSettingsActivity);
            notificationsCustomSettingsActivity.presentFragment(ty0Var, true);
            return true;
        }
        ArrayList arrayList2 = notificationsCustomSettingsActivity.w;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((si0) it.next()).d == j10) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList3 = notificationsCustomSettingsActivity.x;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (((si0) it2.next()).d == j10) {
                    it2.remove();
                }
            }
        }
        si0 si0Var = new si0();
        si0Var.d = j10;
        si0Var.e = true;
        Boolean bool = notificationsCustomSettingsActivity.n;
        if (bool != null && bool.booleanValue()) {
            i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        si0Var.c = i12;
        if (notificationsCustomSettingsActivity.x == null) {
            notificationsCustomSettingsActivity.x = new ArrayList();
        }
        notificationsCustomSettingsActivity.x.add(si0Var);
        notificationsCustomSettingsActivity.q0(true);
        return true;
    }

    @Override // org.telegram.ui.sy0
    public /* synthetic */ void b0() {
    }
}
