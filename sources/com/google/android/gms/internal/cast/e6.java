package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e6 {
    public static final e6 c = new e6();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final u5 a = new u5();

    public final h6 a(Class cls) {
        h6 j10;
        Class cls2;
        Charset charset = l5.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        h6 h6Var = (h6) concurrentHashMap.get(cls);
        if (h6Var != null) {
            return h6Var;
        }
        u5 u5Var = this.a;
        u5Var.getClass();
        Class cls3 = i6.a;
        if (!f5.class.isAssignableFrom(cls) && (cls2 = i6.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        g6 zzb = ((t5) u5Var.a).zzb(cls);
        int i10 = zzb.d;
        t4 t4Var = zzb.a;
        if ((i10 & 2) == 2) {
            if (f5.class.isAssignableFrom(cls)) {
                j10 = new a6(i6.c, b5.a, t4Var);
            } else {
                k6 k6Var = i6.b;
                a5 a5Var = b5.b;
                if (a5Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                j10 = new a6(k6Var, a5Var, t4Var);
            }
        } else if (f5.class.isAssignableFrom(cls)) {
            if (zzb.a() - 1 != 1) {
                int i11 = c6.a;
                q5 q5Var = r5.b;
                k6 k6Var2 = i6.c;
                a5 a5Var2 = b5.a;
                int i12 = w5.a;
                j10 = z5.j(zzb, q5Var, k6Var2, a5Var2);
            } else {
                int i13 = c6.a;
                q5 q5Var2 = r5.b;
                k6 k6Var3 = i6.c;
                int i14 = w5.a;
                j10 = z5.j(zzb, q5Var2, k6Var3, null);
            }
        } else if (zzb.a() - 1 != 1) {
            int i15 = c6.a;
            p5 p5Var = r5.a;
            k6 k6Var4 = i6.b;
            a5 a5Var3 = b5.b;
            if (a5Var3 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            int i16 = w5.a;
            j10 = z5.j(zzb, p5Var, k6Var4, a5Var3);
        } else {
            int i17 = c6.a;
            p5 p5Var2 = r5.a;
            k6 k6Var5 = i6.b;
            int i18 = w5.a;
            j10 = z5.j(zzb, p5Var2, k6Var5, null);
        }
        h6 h6Var2 = (h6) concurrentHashMap.putIfAbsent(cls, j10);
        return h6Var2 == null ? j10 : h6Var2;
    }
}
