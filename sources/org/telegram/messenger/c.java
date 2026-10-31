package org.telegram.messenger;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c {
    public static volatile c[] b = new c[4];
    public int a;

    public static c a(int i10) {
        c cVar;
        c cVar2 = b[i10];
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (c.class) {
            try {
                cVar = b[i10];
                if (cVar == null) {
                    c[] cVarArr = b;
                    c cVar3 = new c();
                    cVar3.a = i10;
                    cVarArr[i10] = cVar3;
                    cVar = cVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public final zs b() {
        return zs.f(this.a);
    }

    public final SharedPreferences c() {
        return vp.r1(this.a).e7;
    }

    public final d20 d() {
        return d20.i(this.a);
    }
}
