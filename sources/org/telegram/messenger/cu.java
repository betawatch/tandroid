package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class cu implements vs {
    public static final cu c;
    public static final List d;
    public boolean a;
    public ns b;

    static {
        cu cuVar = new cu();
        cuVar.b = new ns(cuVar, 3);
        c = cuVar;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.a = false;
        if (uz.a1) {
            ArrayList arrayList = new ArrayList(uz.z1);
            Collections.sort(arrayList, new ck(15));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                tz tzVar = (tz) obj;
                if (tzVar != uz.B1 && !tzVar.c && tzVar.d) {
                    SharedPreferences.Editor edit = wp.d1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    tzVar.a.h(edit);
                    edit.apply();
                    uz.B1 = tzVar;
                    at.e().k(at.A4, new Object[0]);
                    at.e().k(at.C4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, uz.B1.a);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ns nsVar = this.b;
        if (i10 == at.B4) {
            int i12 = uz.a;
            if (wp.d1().getBoolean("proxy_enabled", false) && uz.B1 != null && uz.a1 && uz.z1.size() > 1 && this.a) {
                a();
                return;
            }
            return;
        }
        if (i10 == at.A4) {
            i0.r(nsVar);
            return;
        }
        if (i10 == at.T1 && i11 == e20.s0) {
            int i13 = uz.a;
            if (((!wp.d1().getBoolean("proxy_enabled", false) || uz.B1 == null) && !uz.a1) || uz.z1.size() <= 1) {
                return;
            }
            if (ConnectionsManager.getInstance(i11).getConnectionState() != 4) {
                i0.r(nsVar);
            } else {
                if (this.a) {
                    return;
                }
                i0.h3(nsVar, ((Integer) d.get(uz.b1)).intValue() * 1000);
            }
        }
    }
}
