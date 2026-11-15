package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class nt implements is {
    public static final nt c;
    public static final List d;
    public boolean a;
    public as b;

    static {
        nt ntVar = new nt();
        ntVar.b = new as(ntVar, 2);
        c = ntVar;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.a = false;
        if (gz.a1) {
            ArrayList arrayList = new ArrayList(gz.z1);
            Collections.sort(arrayList, new gl(12));
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                fz fzVar = (fz) obj;
                if (fzVar != gz.B1 && !fzVar.c && fzVar.d) {
                    SharedPreferences.Editor edit = np.e1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    fzVar.a.i(edit);
                    edit.apply();
                    gz.B1 = fzVar;
                    ns.e().k(ns.A4, new Object[0]);
                    ns.e().k(ns.C4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, gz.B1.a);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        as asVar = this.b;
        if (i7 == ns.B4) {
            int i11 = gz.a;
            if (np.e1().getBoolean("proxy_enabled", false) && gz.B1 != null && gz.a1 && gz.z1.size() > 1 && this.a) {
                a();
                return;
            }
            return;
        }
        if (i7 == ns.A4) {
            g0.r(asVar);
            return;
        }
        if (i7 == ns.T1 && i10 == m10.t0) {
            int i12 = gz.a;
            if (((!np.e1().getBoolean("proxy_enabled", false) || gz.B1 == null) && !gz.a1) || gz.z1.size() <= 1) {
                return;
            }
            if (ConnectionsManager.getInstance(i10).getConnectionState() != 4) {
                g0.r(asVar);
            } else {
                if (this.a) {
                    return;
                }
                g0.i3(asVar, ((Integer) d.get(gz.b1)).intValue() * 1000);
            }
        }
    }
}
