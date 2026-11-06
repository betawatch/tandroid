package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class qt implements ls {
    public static final qt c;
    public static final List d;
    public boolean a;
    public ds b;

    static {
        qt qtVar = new qt();
        qtVar.b = new ds(qtVar, 2);
        c = qtVar;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.a = false;
        if (iz.a1) {
            ArrayList arrayList = new ArrayList(iz.z1);
            Collections.sort(arrayList, new vj(13));
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                hz hzVar = (hz) obj;
                if (hzVar != iz.B1 && !hzVar.c && hzVar.d) {
                    SharedPreferences.Editor edit = qp.e1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    hzVar.a.i(edit);
                    edit.apply();
                    iz.B1 = hzVar;
                    qs.e().k(qs.A4, new Object[0]);
                    qs.e().k(qs.C4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, iz.B1.a);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ds dsVar = this.b;
        if (i7 == qs.B4) {
            int i11 = iz.a;
            if (qp.e1().getBoolean("proxy_enabled", false) && iz.B1 != null && iz.a1 && iz.z1.size() > 1 && this.a) {
                a();
                return;
            }
            return;
        }
        if (i7 == qs.A4) {
            g0.r(dsVar);
            return;
        }
        if (i7 == qs.T1 && i10 == p10.s0) {
            int i12 = iz.a;
            if (((!qp.e1().getBoolean("proxy_enabled", false) || iz.B1 == null) && !iz.a1) || iz.z1.size() <= 1) {
                return;
            }
            if (ConnectionsManager.getInstance(i10).getConnectionState() != 4) {
                g0.r(dsVar);
            } else {
                if (this.a) {
                    return;
                }
                g0.i3(dsVar, ((Integer) d.get(iz.b1)).intValue() * 1000);
            }
        }
    }
}
