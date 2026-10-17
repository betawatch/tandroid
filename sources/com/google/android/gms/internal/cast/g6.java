package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class g6 {
    public static final g6 c = new g6();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final u5 a = new u5();

    public final j6 a(Class cls) {
        j6 j10;
        Class cls2;
        Charset charset = l5.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        j6 j6Var = (j6) concurrentHashMap.get(cls);
        if (j6Var != null) {
            return j6Var;
        }
        u5 u5Var = this.a;
        u5Var.getClass();
        Class cls3 = k6.a;
        if (!f5.class.isAssignableFrom(cls) && (cls2 = k6.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        i6 zzb = ((t5) u5Var.a).zzb(cls);
        int i10 = zzb.d;
        t4 t4Var = zzb.a;
        if ((i10 & 2) == 2) {
            if (f5.class.isAssignableFrom(cls)) {
                j10 = new c6(k6.c, b5.a, t4Var);
            } else {
                m6 m6Var = k6.b;
                a5 a5Var = b5.b;
                if (a5Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                j10 = new c6(m6Var, a5Var, t4Var);
            }
        } else if (f5.class.isAssignableFrom(cls)) {
            if (zzb.a() - 1 != 1) {
                int i11 = e6.a;
                q5 q5Var = r5.b;
                m6 m6Var2 = k6.c;
                a5 a5Var2 = b5.a;
                int i12 = w5.a;
                j10 = b6.j(zzb, q5Var, m6Var2, a5Var2);
            } else {
                int i13 = e6.a;
                q5 q5Var2 = r5.b;
                m6 m6Var3 = k6.c;
                int i14 = w5.a;
                j10 = b6.j(zzb, q5Var2, m6Var3, null);
            }
        } else if (zzb.a() - 1 != 1) {
            int i15 = e6.a;
            p5 p5Var = r5.a;
            m6 m6Var4 = k6.b;
            a5 a5Var3 = b5.b;
            if (a5Var3 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            int i16 = w5.a;
            j10 = b6.j(zzb, p5Var, m6Var4, a5Var3);
        } else {
            int i17 = e6.a;
            p5 p5Var2 = r5.a;
            m6 m6Var5 = k6.b;
            int i18 = w5.a;
            j10 = b6.j(zzb, p5Var2, m6Var5, null);
        }
        j6 j6Var2 = (j6) concurrentHashMap.putIfAbsent(cls, j10);
        return j6Var2 == null ? j10 : j6Var2;
    }
}
