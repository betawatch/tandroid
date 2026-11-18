package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class kt implements fs {
    public static final kt c;
    public static final List d;
    public boolean a;
    public xr b;

    static {
        kt ktVar = new kt();
        ktVar.b = new xr(ktVar, 2);
        c = ktVar;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.a = false;
        if (bz.a1) {
            ArrayList arrayList = new ArrayList(bz.z1);
            Collections.sort(arrayList, new dl(12));
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                az azVar = (az) obj;
                if (azVar != bz.B1 && !azVar.c && azVar.d) {
                    SharedPreferences.Editor edit = mp.g1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    azVar.a.i(edit);
                    edit.apply();
                    bz.B1 = azVar;
                    ks.e().k(ks.C4, new Object[0]);
                    ks.e().k(ks.E4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, bz.B1.a);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        xr xrVar = this.b;
        if (i7 == ks.D4) {
            int i11 = bz.a;
            if (mp.g1().getBoolean("proxy_enabled", false) && bz.B1 != null && bz.a1 && bz.z1.size() > 1 && this.a) {
                a();
                return;
            }
            return;
        }
        if (i7 == ks.C4) {
            g0.r(xrVar);
            return;
        }
        if (i7 == ks.T1 && i10 == j10.t0) {
            int i12 = bz.a;
            if (((!mp.g1().getBoolean("proxy_enabled", false) || bz.B1 == null) && !bz.a1) || bz.z1.size() <= 1) {
                return;
            }
            if (ConnectionsManager.getInstance(i10).getConnectionState() != 4) {
                g0.r(xrVar);
            } else {
                if (this.a) {
                    return;
                }
                g0.h3(xrVar, ((Integer) d.get(bz.b1)).intValue() * 1000);
            }
        }
    }
}
