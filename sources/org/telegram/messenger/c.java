package org.telegram.messenger;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

    public final qs b() {
        return qs.f(this.a);
    }

    public final SharedPreferences c() {
        return qp.s1(this.a).d7;
    }

    public final p10 d() {
        return p10.i(this.a);
    }
}
