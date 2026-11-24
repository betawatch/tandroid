// default package

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class no7 implements hk3, ee, rt8 {
    public final /* synthetic */ NotificationsCustomSettingsActivity a;

    public /* synthetic */ no7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.a = notificationsCustomSettingsActivity;
    }

    @Override // hk3
    public final boolean E() {
        return false;
    }

    @Override // rt8
    public final void f(zo7 zo7Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.x.add(0, zo7Var);
        notificationsCustomSettingsActivity.q0(true);
    }

    @Override // hk3
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.getClass();
        int i3 = 0;
        long j = ((bf7) arrayList.get(0)).a;
        if (notificationsCustomSettingsActivity.s != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j);
            bundle.putBoolean("exception", true);
            st8 st8Var = new st8(bundle, notificationsCustomSettingsActivity.getResourceProvider());
            st8Var.s = new no7(notificationsCustomSettingsActivity);
            notificationsCustomSettingsActivity.presentFragment(st8Var, true);
            return true;
        }
        ArrayList arrayList2 = notificationsCustomSettingsActivity.w;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((zo7) it.next()).d == j) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList3 = notificationsCustomSettingsActivity.x;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (((zo7) it2.next()).d == j) {
                    it2.remove();
                }
            }
        }
        zo7 zo7Var = new zo7();
        zo7Var.d = j;
        zo7Var.e = true;
        Boolean bool = notificationsCustomSettingsActivity.n;
        if (bool != null && bool.booleanValue()) {
            i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        zo7Var.c = i3;
        ArrayList arrayList4 = notificationsCustomSettingsActivity.x;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            notificationsCustomSettingsActivity.x = arrayList4;
        }
        arrayList4.add(zo7Var);
        notificationsCustomSettingsActivity.q0(true);
        return true;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            zo7 zo7Var = (zo7) notificationsCustomSettingsActivity.x.get(i2);
            if (notificationsCustomSettingsActivity.s == 3) {
                edit.remove("stories_" + zo7Var.d);
            } else {
                edit.remove("notify2_" + zo7Var.d).remove("custom_" + zo7Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().B1(zo7Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().R.f(zo7Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.x.size();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = notificationsCustomSettingsActivity.x;
            if (i3 >= size2) {
                arrayList.clear();
                notificationsCustomSettingsActivity.y.clear();
                notificationsCustomSettingsActivity.q0(true);
                notificationsCustomSettingsActivity.getNotificationCenter().k(nm7.f0, new Object[0]);
                return;
            }
            notificationsCustomSettingsActivity.getNotificationsController().c0(((zo7) arrayList.get(i3)).d, 0L, false);
            i3++;
        }
    }

    @Override // hk3
    public final boolean s(nk3 nk3Var) {
        return false;
    }

    @Override // rt8
    public final void v() {
    }
}
