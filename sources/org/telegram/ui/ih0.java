package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ih0 implements tw, org.telegram.ui.ActionBar.r1, kx0 {
    public final /* synthetic */ NotificationsCustomSettingsActivity a;

    public /* synthetic */ ih0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.a = notificationsCustomSettingsActivity;
    }

    @Override // org.telegram.ui.tw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.tw
    public /* synthetic */ boolean N(zw zwVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.x.size();
        for (int i10 = 0; i10 < size; i10++) {
            rh0 rh0Var = (rh0) notificationsCustomSettingsActivity.x.get(i10);
            if (notificationsCustomSettingsActivity.s == 3) {
                edit.remove("stories_" + rh0Var.d);
            } else {
                edit.remove("notify2_" + rh0Var.d).remove("custom_" + rh0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().E1(rh0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().Q.f(rh0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.x.size();
        for (int i11 = 0; i11 < size2; i11++) {
            notificationsCustomSettingsActivity.getNotificationsController().c0(((rh0) notificationsCustomSettingsActivity.x.get(i11)).d, 0, false);
        }
        notificationsCustomSettingsActivity.x.clear();
        notificationsCustomSettingsActivity.y.clear();
        notificationsCustomSettingsActivity.q0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().k(org.telegram.messenger.qs.f0, new Object[0]);
    }

    @Override // org.telegram.ui.kx0
    public void t(rh0 rh0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.x.add(0, rh0Var);
        notificationsCustomSettingsActivity.q0(true);
    }

    @Override // org.telegram.ui.tw
    public boolean y(zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        int i11 = 0;
        long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).a;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        if (notificationsCustomSettingsActivity.s != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putBoolean("exception", true);
            lx0 lx0Var = new lx0(bundle, notificationsCustomSettingsActivity.getResourceProvider());
            lx0Var.s = new ih0(notificationsCustomSettingsActivity);
            notificationsCustomSettingsActivity.presentFragment(lx0Var, true);
            return true;
        }
        ArrayList arrayList2 = notificationsCustomSettingsActivity.w;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((rh0) it.next()).d == j3) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList3 = notificationsCustomSettingsActivity.x;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (((rh0) it2.next()).d == j3) {
                    it2.remove();
                }
            }
        }
        rh0 rh0Var = new rh0();
        rh0Var.d = j3;
        rh0Var.e = true;
        Boolean bool = notificationsCustomSettingsActivity.n;
        if (bool != null && bool.booleanValue()) {
            i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        rh0Var.c = i11;
        if (notificationsCustomSettingsActivity.x == null) {
            notificationsCustomSettingsActivity.x = new ArrayList();
        }
        notificationsCustomSettingsActivity.x.add(rh0Var);
        notificationsCustomSettingsActivity.q0(true);
        return true;
    }

    @Override // org.telegram.ui.kx0
    public /* synthetic */ void c0() {
    }
}
