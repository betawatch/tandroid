package org.telegram.messenger;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c {
    public static volatile c[] b = new c[4];
    public int a;

    public static c a(int i3) {
        c cVar;
        c cVar2 = b[i3];
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (c.class) {
            try {
                cVar = b[i3];
                if (cVar == null) {
                    c[] cVarArr = b;
                    c cVar3 = new c();
                    cVar3.a = i3;
                    cVarArr[i3] = cVar3;
                    cVar = cVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public final hs b() {
        return hs.f(this.a);
    }

    public final SharedPreferences c() {
        return hp.s1(this.a).d7;
    }

    public final h10 d() {
        return h10.i(this.a);
    }
}
