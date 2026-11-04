package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b6 {
    public static final b6 c = new b6();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final r5 a = new r5();

    public final e6 a(Class cls) {
        e6 j10;
        Class cls2;
        Charset charset = i5.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        e6 e6Var = (e6) concurrentHashMap.get(cls);
        if (e6Var != null) {
            return e6Var;
        }
        r5 r5Var = this.a;
        r5Var.getClass();
        Class cls3 = f6.a;
        if (!c5.class.isAssignableFrom(cls) && (cls2 = f6.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        d6 zzb = ((q5) r5Var.a).zzb(cls);
        int i3 = zzb.d;
        r4 r4Var = zzb.a;
        if ((i3 & 2) == 2) {
            if (c5.class.isAssignableFrom(cls)) {
                j10 = new x5(f6.c, y4.a, r4Var);
            } else {
                h6 h6Var = f6.b;
                x4 x4Var = y4.b;
                if (x4Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                j10 = new x5(h6Var, x4Var, r4Var);
            }
        } else if (c5.class.isAssignableFrom(cls)) {
            if (zzb.a() - 1 != 1) {
                int i10 = z5.a;
                n5 n5Var = o5.b;
                h6 h6Var2 = f6.c;
                x4 x4Var2 = y4.a;
                int i11 = t5.a;
                j10 = w5.j(zzb, n5Var, h6Var2, x4Var2);
            } else {
                int i12 = z5.a;
                n5 n5Var2 = o5.b;
                h6 h6Var3 = f6.c;
                int i13 = t5.a;
                j10 = w5.j(zzb, n5Var2, h6Var3, null);
            }
        } else if (zzb.a() - 1 != 1) {
            int i14 = z5.a;
            m5 m5Var = o5.a;
            h6 h6Var4 = f6.b;
            x4 x4Var3 = y4.b;
            if (x4Var3 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            int i15 = t5.a;
            j10 = w5.j(zzb, m5Var, h6Var4, x4Var3);
        } else {
            int i16 = z5.a;
            m5 m5Var2 = o5.a;
            h6 h6Var5 = f6.b;
            int i17 = t5.a;
            j10 = w5.j(zzb, m5Var2, h6Var5, null);
        }
        e6 e6Var2 = (e6) concurrentHashMap.putIfAbsent(cls, j10);
        return e6Var2 == null ? j10 : e6Var2;
    }
}
