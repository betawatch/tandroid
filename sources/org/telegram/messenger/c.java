package org.telegram.messenger;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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

    public final at b() {
        return at.f(this.a);
    }

    public final SharedPreferences c() {
        return wp.r1(this.a).e7;
    }

    public final e20 d() {
        return e20.i(this.a);
    }
}
