package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a6 {
    public static final a6 c = new a6();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final q5 a = new q5();

    public final d6 a(Class cls) {
        d6 j3;
        Class cls2;
        Charset charset = h5.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        d6 d6Var = (d6) concurrentHashMap.get(cls);
        if (d6Var != null) {
            return d6Var;
        }
        q5 q5Var = this.a;
        q5Var.getClass();
        Class cls3 = e6.a;
        if (!b5.class.isAssignableFrom(cls) && (cls2 = e6.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        c6 zzb = ((p5) q5Var.a).zzb(cls);
        int i7 = zzb.d;
        q4 q4Var = zzb.a;
        if ((i7 & 2) == 2) {
            if (b5.class.isAssignableFrom(cls)) {
                j3 = new w5(e6.c, x4.a, q4Var);
            } else {
                g6 g6Var = e6.b;
                w4 w4Var = x4.b;
                if (w4Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                j3 = new w5(g6Var, w4Var, q4Var);
            }
        } else if (b5.class.isAssignableFrom(cls)) {
            if (zzb.a() - 1 != 1) {
                int i10 = y5.a;
                m5 m5Var = n5.b;
                g6 g6Var2 = e6.c;
                w4 w4Var2 = x4.a;
                int i11 = s5.a;
                j3 = v5.j(zzb, m5Var, g6Var2, w4Var2);
            } else {
                int i12 = y5.a;
                m5 m5Var2 = n5.b;
                g6 g6Var3 = e6.c;
                int i13 = s5.a;
                j3 = v5.j(zzb, m5Var2, g6Var3, null);
            }
        } else if (zzb.a() - 1 != 1) {
            int i14 = y5.a;
            l5 l5Var = n5.a;
            g6 g6Var4 = e6.b;
            w4 w4Var3 = x4.b;
            if (w4Var3 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            int i15 = s5.a;
            j3 = v5.j(zzb, l5Var, g6Var4, w4Var3);
        } else {
            int i16 = y5.a;
            l5 l5Var2 = n5.a;
            g6 g6Var5 = e6.b;
            int i17 = s5.a;
            j3 = v5.j(zzb, l5Var2, g6Var5, null);
        }
        d6 d6Var2 = (d6) concurrentHashMap.putIfAbsent(cls, j3);
        return d6Var2 == null ? j3 : d6Var2;
    }
}
