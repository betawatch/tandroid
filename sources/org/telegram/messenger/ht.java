package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ht implements cs {
    public static final ht c;
    public static final List d;
    public boolean a;
    public vs b;

    static {
        ht htVar = new ht();
        htVar.b = new vs(htVar, 2);
        c = htVar;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.a = false;
        if (az.a1) {
            ArrayList arrayList = new ArrayList(az.z1);
            Collections.sort(arrayList, new tq(3));
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                zy zyVar = (zy) obj;
                if (zyVar != az.B1 && !zyVar.c && zyVar.d) {
                    SharedPreferences.Editor edit = hp.e1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    zyVar.a.i(edit);
                    edit.apply();
                    az.B1 = zyVar;
                    hs.e().k(hs.A4, new Object[0]);
                    hs.e().k(hs.C4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, az.B1.a);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        vs vsVar = this.b;
        if (i3 == hs.B4) {
            int i11 = az.a;
            if (hp.e1().getBoolean("proxy_enabled", false) && az.B1 != null && az.a1 && az.z1.size() > 1 && this.a) {
                a();
                return;
            }
            return;
        }
        if (i3 == hs.A4) {
            g0.r(vsVar);
            return;
        }
        if (i3 == hs.T1 && i10 == h10.t0) {
            int i12 = az.a;
            if (((!hp.e1().getBoolean("proxy_enabled", false) || az.B1 == null) && !az.a1) || az.z1.size() <= 1) {
                return;
            }
            if (ConnectionsManager.getInstance(i10).getConnectionState() != 4) {
                g0.r(vsVar);
            } else {
                if (this.a) {
                    return;
                }
                g0.i3(vsVar, ((Integer) d.get(az.b1)).intValue() * 1000);
            }
        }
    }
}
