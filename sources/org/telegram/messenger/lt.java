package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class lt implements gs {
    public static final lt c;
    public static final List d;
    public boolean a;
    public yr b;

    static {
        lt ltVar = new lt();
        ltVar.b = new yr(ltVar, 2);
        c = ltVar;
        d = Arrays.asList(5, 10, 15, 30, 60);
    }

    public final void a() {
        this.a = false;
        if (cz.a1) {
            ArrayList arrayList = new ArrayList(cz.z1);
            Collections.sort(arrayList, new el(12));
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                bz bzVar = (bz) obj;
                if (bzVar != cz.B1 && !bzVar.c && bzVar.d) {
                    SharedPreferences.Editor edit = np.g1().edit();
                    edit.putBoolean("proxy_enabled", true);
                    bzVar.a.i(edit);
                    edit.apply();
                    cz.B1 = bzVar;
                    ls.e().k(ls.D4, new Object[0]);
                    ls.e().k(ls.F4, new Object[0]);
                    ConnectionsManager.setProxySettings(true, cz.B1.a);
                    return;
                }
            }
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        yr yrVar = this.b;
        if (i7 == ls.E4) {
            int i11 = cz.a;
            if (np.g1().getBoolean("proxy_enabled", false) && cz.B1 != null && cz.a1 && cz.z1.size() > 1 && this.a) {
                a();
                return;
            }
            return;
        }
        if (i7 == ls.D4) {
            g0.r(yrVar);
            return;
        }
        if (i7 == ls.T1 && i10 == k10.t0) {
            int i12 = cz.a;
            if (((!np.g1().getBoolean("proxy_enabled", false) || cz.B1 == null) && !cz.a1) || cz.z1.size() <= 1) {
                return;
            }
            if (ConnectionsManager.getInstance(i10).getConnectionState() != 4) {
                g0.r(yrVar);
            } else {
                if (this.a) {
                    return;
                }
                g0.h3(yrVar, ((Integer) d.get(cz.b1)).intValue() * 1000);
            }
        }
    }
}
