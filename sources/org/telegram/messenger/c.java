package org.telegram.messenger;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class c {
    public static volatile c[] b = new c[4];
    public int a;

    public static c a(int i7) {
        c cVar;
        c cVar2 = b[i7];
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (c.class) {
            try {
                cVar = b[i7];
                if (cVar == null) {
                    c[] cVarArr = b;
                    c cVar3 = new c();
                    cVar3.a = i7;
                    cVarArr[i7] = cVar3;
                    cVar = cVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public final np b() {
        return np.u1(this.a);
    }

    public final ls c() {
        return ls.f(this.a);
    }

    public final SharedPreferences d() {
        return np.u1(this.a).g7;
    }

    public final k10 e() {
        return k10.i(this.a);
    }
}
