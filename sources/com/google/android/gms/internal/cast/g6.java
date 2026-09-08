package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class g6 {
    public static final g6 c = new g6();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final w5 a = new w5();

    public final j6 a(Class cls) {
        j6 j3;
        Class cls2;
        Charset charset = n5.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        j6 j6Var = (j6) concurrentHashMap.get(cls);
        if (j6Var != null) {
            return j6Var;
        }
        w5 w5Var = this.a;
        w5Var.getClass();
        Class cls3 = k6.a;
        if (!h5.class.isAssignableFrom(cls) && (cls2 = k6.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        i6 zzb = ((v5) w5Var.a).zzb(cls);
        int i10 = zzb.d;
        v4 v4Var = zzb.a;
        if ((i10 & 2) == 2) {
            if (h5.class.isAssignableFrom(cls)) {
                j3 = new c6(k6.c, d5.a, v4Var);
            } else {
                m6 m6Var = k6.b;
                c5 c5Var = d5.b;
                if (c5Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                j3 = new c6(m6Var, c5Var, v4Var);
            }
        } else if (h5.class.isAssignableFrom(cls)) {
            if (zzb.a() - 1 != 1) {
                int i11 = e6.a;
                s5 s5Var = t5.b;
                m6 m6Var2 = k6.c;
                c5 c5Var2 = d5.a;
                int i12 = y5.a;
                j3 = b6.j(zzb, s5Var, m6Var2, c5Var2);
            } else {
                int i13 = e6.a;
                s5 s5Var2 = t5.b;
                m6 m6Var3 = k6.c;
                int i14 = y5.a;
                j3 = b6.j(zzb, s5Var2, m6Var3, null);
            }
        } else if (zzb.a() - 1 != 1) {
            int i15 = e6.a;
            r5 r5Var = t5.a;
            m6 m6Var4 = k6.b;
            c5 c5Var3 = d5.b;
            if (c5Var3 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            int i16 = y5.a;
            j3 = b6.j(zzb, r5Var, m6Var4, c5Var3);
        } else {
            int i17 = e6.a;
            r5 r5Var2 = t5.a;
            m6 m6Var5 = k6.b;
            int i18 = y5.a;
            j3 = b6.j(zzb, r5Var2, m6Var5, null);
        }
        j6 j6Var2 = (j6) concurrentHashMap.putIfAbsent(cls, j3);
        return j6Var2 == null ? j3 : j6Var2;
    }
}
