package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d6 {
    public static final d6 c = new d6();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final t5 a = new t5();

    public final g6 a(Class cls) {
        g6 j10;
        Class cls2;
        Charset charset = k5.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        g6 g6Var = (g6) concurrentHashMap.get(cls);
        if (g6Var != null) {
            return g6Var;
        }
        t5 t5Var = this.a;
        t5Var.getClass();
        Class cls3 = h6.a;
        if (!e5.class.isAssignableFrom(cls) && (cls2 = h6.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        f6 zzb = ((s5) t5Var.a).zzb(cls);
        int i10 = zzb.d;
        t4 t4Var = zzb.a;
        if ((i10 & 2) == 2) {
            if (e5.class.isAssignableFrom(cls)) {
                j10 = new z5(h6.c, a5.a, t4Var);
            } else {
                j6 j6Var = h6.b;
                z4 z4Var = a5.b;
                if (z4Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                j10 = new z5(j6Var, z4Var, t4Var);
            }
        } else if (e5.class.isAssignableFrom(cls)) {
            if (zzb.a() - 1 != 1) {
                int i11 = b6.a;
                p5 p5Var = q5.b;
                j6 j6Var2 = h6.c;
                z4 z4Var2 = a5.a;
                int i12 = v5.a;
                j10 = y5.j(zzb, p5Var, j6Var2, z4Var2);
            } else {
                int i13 = b6.a;
                p5 p5Var2 = q5.b;
                j6 j6Var3 = h6.c;
                int i14 = v5.a;
                j10 = y5.j(zzb, p5Var2, j6Var3, null);
            }
        } else if (zzb.a() - 1 != 1) {
            int i15 = b6.a;
            o5 o5Var = q5.a;
            j6 j6Var4 = h6.b;
            z4 z4Var3 = a5.b;
            if (z4Var3 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            int i16 = v5.a;
            j10 = y5.j(zzb, o5Var, j6Var4, z4Var3);
        } else {
            int i17 = b6.a;
            o5 o5Var2 = q5.a;
            j6 j6Var5 = h6.b;
            int i18 = v5.a;
            j10 = y5.j(zzb, o5Var2, j6Var5, null);
        }
        g6 g6Var2 = (g6) concurrentHashMap.putIfAbsent(cls, j10);
        return g6Var2 == null ? j10 : g6Var2;
    }
}
