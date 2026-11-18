package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh0 implements ww, org.telegram.ui.ActionBar.r1, ix0 {
    public final /* synthetic */ NotificationsCustomSettingsActivity a;

    public /* synthetic */ lh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.a = notificationsCustomSettingsActivity;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(cx cxVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.x.size();
        for (int i10 = 0; i10 < size; i10++) {
            uh0 uh0Var = (uh0) notificationsCustomSettingsActivity.x.get(i10);
            if (notificationsCustomSettingsActivity.s == 3) {
                edit.remove("stories_" + uh0Var.d);
            } else {
                edit.remove("notify2_" + uh0Var.d).remove("custom_" + uh0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().E1(uh0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().R.f(uh0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.x.size();
        for (int i11 = 0; i11 < size2; i11++) {
            notificationsCustomSettingsActivity.getNotificationsController().c0(((uh0) notificationsCustomSettingsActivity.x.get(i11)).d, 0, false);
        }
        notificationsCustomSettingsActivity.x.clear();
        notificationsCustomSettingsActivity.y.clear();
        notificationsCustomSettingsActivity.q0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().k(org.telegram.messenger.ks.f0, new Object[0]);
    }

    @Override // org.telegram.ui.ix0
    public void k(uh0 uh0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.x.add(0, uh0Var);
        notificationsCustomSettingsActivity.q0(true);
    }

    @Override // org.telegram.ui.ww
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        int i11 = 0;
        long j3 = ((org.telegram.messenger.sr) arrayList.get(0)).a;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        if (notificationsCustomSettingsActivity.s != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putBoolean("exception", true);
            jx0 jx0Var = new jx0(bundle, notificationsCustomSettingsActivity.getResourceProvider());
            jx0Var.s = new lh0(notificationsCustomSettingsActivity);
            notificationsCustomSettingsActivity.presentFragment(jx0Var, true);
            return true;
        }
        ArrayList arrayList2 = notificationsCustomSettingsActivity.w;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((uh0) it.next()).d == j3) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList3 = notificationsCustomSettingsActivity.x;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (((uh0) it2.next()).d == j3) {
                    it2.remove();
                }
            }
        }
        uh0 uh0Var = new uh0();
        uh0Var.d = j3;
        uh0Var.e = true;
        Boolean bool = notificationsCustomSettingsActivity.n;
        if (bool != null && bool.booleanValue()) {
            i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        uh0Var.c = i11;
        if (notificationsCustomSettingsActivity.x == null) {
            notificationsCustomSettingsActivity.x = new ArrayList();
        }
        notificationsCustomSettingsActivity.x.add(uh0Var);
        notificationsCustomSettingsActivity.q0(true);
        return true;
    }

    @Override // org.telegram.ui.ix0
    public /* synthetic */ void a0() {
    }
}
