package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh0 implements qw, org.telegram.ui.ActionBar.r1, fx0 {
    public final /* synthetic */ NotificationsCustomSettingsActivity a;

    public /* synthetic */ fh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.a = notificationsCustomSettingsActivity;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.qw
    public /* synthetic */ boolean N(ww wwVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.x.size();
        for (int i10 = 0; i10 < size; i10++) {
            oh0 oh0Var = (oh0) notificationsCustomSettingsActivity.x.get(i10);
            if (notificationsCustomSettingsActivity.s == 3) {
                edit.remove("stories_" + oh0Var.d);
            } else {
                edit.remove("notify2_" + oh0Var.d).remove("custom_" + oh0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().E1(oh0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().Q.f(oh0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.x.size();
        for (int i11 = 0; i11 < size2; i11++) {
            notificationsCustomSettingsActivity.getNotificationsController().c0(((oh0) notificationsCustomSettingsActivity.x.get(i11)).d, 0, false);
        }
        notificationsCustomSettingsActivity.x.clear();
        notificationsCustomSettingsActivity.y.clear();
        notificationsCustomSettingsActivity.q0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().k(org.telegram.messenger.qs.f0, new Object[0]);
    }

    @Override // org.telegram.ui.fx0
    public void t(oh0 oh0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.x.add(0, oh0Var);
        notificationsCustomSettingsActivity.q0(true);
    }

    @Override // org.telegram.ui.qw
    public boolean y(ww wwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, v91 v91Var) {
        int i11 = 0;
        long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).a;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        if (notificationsCustomSettingsActivity.s != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putBoolean("exception", true);
            gx0 gx0Var = new gx0(bundle, notificationsCustomSettingsActivity.getResourceProvider());
            gx0Var.s = new fh0(notificationsCustomSettingsActivity);
            notificationsCustomSettingsActivity.presentFragment(gx0Var, true);
            return true;
        }
        ArrayList arrayList2 = notificationsCustomSettingsActivity.w;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((oh0) it.next()).d == j3) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList3 = notificationsCustomSettingsActivity.x;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (((oh0) it2.next()).d == j3) {
                    it2.remove();
                }
            }
        }
        oh0 oh0Var = new oh0();
        oh0Var.d = j3;
        oh0Var.e = true;
        Boolean bool = notificationsCustomSettingsActivity.n;
        if (bool != null && bool.booleanValue()) {
            i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        oh0Var.c = i11;
        if (notificationsCustomSettingsActivity.x == null) {
            notificationsCustomSettingsActivity.x = new ArrayList();
        }
        notificationsCustomSettingsActivity.x.add(oh0Var);
        notificationsCustomSettingsActivity.q0(true);
        return true;
    }

    @Override // org.telegram.ui.fx0
    public /* synthetic */ void c0() {
    }
}
