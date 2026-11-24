// default package

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class km7 implements wi3, ed, or8 {
    public final /* synthetic */ NotificationsCustomSettingsActivity a;

    public /* synthetic */ km7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.a = notificationsCustomSettingsActivity;
    }

    @Override // wi3
    public final boolean G() {
        return false;
    }

    @Override // or8
    public final void h(vm7 vm7Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.x.add(0, vm7Var);
        notificationsCustomSettingsActivity.p0(true);
    }

    @Override // wi3
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        notificationsCustomSettingsActivity.getClass();
        int i3 = 0;
        long j = ((zc7) arrayList.get(0)).a;
        if (notificationsCustomSettingsActivity.s != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j);
            bundle.putBoolean("exception", true);
            pr8 pr8Var = new pr8(bundle, notificationsCustomSettingsActivity.getResourceProvider());
            pr8Var.s = new km7(notificationsCustomSettingsActivity);
            notificationsCustomSettingsActivity.presentFragment(pr8Var, true);
            return true;
        }
        ArrayList arrayList2 = notificationsCustomSettingsActivity.w;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((vm7) it.next()).d == j) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList3 = notificationsCustomSettingsActivity.x;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (((vm7) it2.next()).d == j) {
                    it2.remove();
                }
            }
        }
        vm7 vm7Var = new vm7();
        vm7Var.d = j;
        vm7Var.e = true;
        Boolean bool = notificationsCustomSettingsActivity.n;
        if (bool != null && bool.booleanValue()) {
            i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        vm7Var.c = i3;
        ArrayList arrayList4 = notificationsCustomSettingsActivity.x;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            notificationsCustomSettingsActivity.x = arrayList4;
        }
        arrayList4.add(vm7Var);
        notificationsCustomSettingsActivity.p0(true);
        return true;
    }

    @Override // wi3
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            vm7 vm7Var = (vm7) notificationsCustomSettingsActivity.x.get(i2);
            if (notificationsCustomSettingsActivity.s == 3) {
                edit.remove("stories_" + vm7Var.d);
            } else {
                edit.remove("notify2_" + vm7Var.d).remove("custom_" + vm7Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().B1(vm7Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().R.f(vm7Var.d);
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
                notificationsCustomSettingsActivity.p0(true);
                notificationsCustomSettingsActivity.getNotificationCenter().k(kk7.e0, new Object[0]);
                return;
            }
            notificationsCustomSettingsActivity.getNotificationsController().c0(((vm7) arrayList.get(i3)).d, 0L, false);
            i3++;
        }
    }

    @Override // or8
    public final void n() {
    }
}
