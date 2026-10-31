package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class li0 implements ux, org.telegram.ui.ActionBar.u1, ty0 {
    public final /* synthetic */ NotificationsCustomSettingsActivity a;

    public /* synthetic */ li0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.a = notificationsCustomSettingsActivity;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean N(ay ayVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.x.size();
        for (int i11 = 0; i11 < size; i11++) {
            ui0 ui0Var = (ui0) notificationsCustomSettingsActivity.x.get(i11);
            if (notificationsCustomSettingsActivity.s == 3) {
                edit.remove("stories_" + ui0Var.d);
            } else {
                edit.remove("notify2_" + ui0Var.d).remove("custom_" + ui0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().E1(ui0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().Q.f(ui0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.x.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().c0(((ui0) notificationsCustomSettingsActivity.x.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.x.clear();
        notificationsCustomSettingsActivity.y.clear();
        notificationsCustomSettingsActivity.p0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().k(org.telegram.messenger.zs.f0, new Object[0]);
    }

    @Override // org.telegram.ui.ty0
    public void w(ui0 ui0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.x.add(0, ui0Var);
        notificationsCustomSettingsActivity.p0(true);
    }

    @Override // org.telegram.ui.ux
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        int i12 = 0;
        long j10 = ((org.telegram.messenger.gs) arrayList.get(0)).a;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        if (notificationsCustomSettingsActivity.s != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putBoolean("exception", true);
            uy0 uy0Var = new uy0(bundle, notificationsCustomSettingsActivity.getResourceProvider());
            uy0Var.s = new li0(notificationsCustomSettingsActivity);
            notificationsCustomSettingsActivity.presentFragment(uy0Var, true);
            return true;
        }
        ArrayList arrayList2 = notificationsCustomSettingsActivity.w;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((ui0) it.next()).d == j10) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList3 = notificationsCustomSettingsActivity.x;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (((ui0) it2.next()).d == j10) {
                    it2.remove();
                }
            }
        }
        ui0 ui0Var = new ui0();
        ui0Var.d = j10;
        ui0Var.e = true;
        Boolean bool = notificationsCustomSettingsActivity.n;
        if (bool != null && bool.booleanValue()) {
            i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        ui0Var.c = i12;
        if (notificationsCustomSettingsActivity.x == null) {
            notificationsCustomSettingsActivity.x = new ArrayList();
        }
        notificationsCustomSettingsActivity.x.add(ui0Var);
        notificationsCustomSettingsActivity.p0(true);
        return true;
    }

    @Override // org.telegram.ui.ty0
    public /* synthetic */ void b0() {
    }
}
