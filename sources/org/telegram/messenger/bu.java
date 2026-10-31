package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class bu implements us {
    public static final bu c;
    public static final List d;
    public boolean a;
    public ms b;

    static {
        bu buVar = new bu();
        buVar.b = new ms(buVar, 3);
        c = buVar;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.a = false;
        if (tz.a1) {
            ArrayList arrayList = new ArrayList(tz.z1);
            Collections.sort(arrayList, new bk(15));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                sz szVar = (sz) obj;
                if (szVar != tz.B1 && !szVar.c && szVar.d) {
                    SharedPreferences.Editor edit = vp.d1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    szVar.a.h(edit);
                    edit.apply();
                    tz.B1 = szVar;
                    zs.e().k(zs.A4, new Object[0]);
                    zs.e().k(zs.C4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, tz.B1.a);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ms msVar = this.b;
        if (i10 == zs.B4) {
            int i12 = tz.a;
            if (vp.d1().getBoolean("proxy_enabled", false) && tz.B1 != null && tz.a1 && tz.z1.size() > 1 && this.a) {
                a();
                return;
            }
            return;
        }
        if (i10 == zs.A4) {
            i0.r(msVar);
            return;
        }
        if (i10 == zs.T1 && i11 == d20.s0) {
            int i13 = tz.a;
            if (((!vp.d1().getBoolean("proxy_enabled", false) || tz.B1 == null) && !tz.a1) || tz.z1.size() <= 1) {
                return;
            }
            if (ConnectionsManager.getInstance(i11).getConnectionState() != 4) {
                i0.r(msVar);
            } else {
                if (this.a) {
                    return;
                }
                i0.h3(msVar, ((Integer) d.get(tz.b1)).intValue() * 1000);
            }
        }
    }
}
