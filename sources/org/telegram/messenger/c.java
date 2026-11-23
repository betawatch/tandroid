package org.telegram.messenger;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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

    public final mp b() {
        return mp.u1(this.a);
    }

    public final ks c() {
        return ks.f(this.a);
    }

    public final SharedPreferences d() {
        return mp.u1(this.a).g7;
    }

    public final i10 e() {
        return i10.i(this.a);
    }
}
