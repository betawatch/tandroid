package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class f6 {
    public static final f6 c = new f6();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final u5 a = new u5();

    public final i6 a(Class cls) {
        i6 j10;
        Class cls2;
        Charset charset = l5.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        i6 i6Var = (i6) concurrentHashMap.get(cls);
        if (i6Var != null) {
            return i6Var;
        }
        u5 u5Var = this.a;
        u5Var.getClass();
        Class cls3 = j6.a;
        if (!f5.class.isAssignableFrom(cls) && (cls2 = j6.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        h6 zzb = ((t5) u5Var.a).zzb(cls);
        int i10 = zzb.d;
        t4 t4Var = zzb.a;
        if ((i10 & 2) == 2) {
            if (f5.class.isAssignableFrom(cls)) {
                j10 = new b6(j6.c, b5.a, t4Var);
            } else {
                l6 l6Var = j6.b;
                a5 a5Var = b5.b;
                if (a5Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                j10 = new b6(l6Var, a5Var, t4Var);
            }
        } else if (f5.class.isAssignableFrom(cls)) {
            if (zzb.a() - 1 != 1) {
                int i11 = d6.a;
                q5 q5Var = r5.b;
                l6 l6Var2 = j6.c;
                a5 a5Var2 = b5.a;
                int i12 = w5.a;
                j10 = a6.j(zzb, q5Var, l6Var2, a5Var2);
            } else {
                int i13 = d6.a;
                q5 q5Var2 = r5.b;
                l6 l6Var3 = j6.c;
                int i14 = w5.a;
                j10 = a6.j(zzb, q5Var2, l6Var3, null);
            }
        } else if (zzb.a() - 1 != 1) {
            int i15 = d6.a;
            p5 p5Var = r5.a;
            l6 l6Var4 = j6.b;
            a5 a5Var3 = b5.b;
            if (a5Var3 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            int i16 = w5.a;
            j10 = a6.j(zzb, p5Var, l6Var4, a5Var3);
        } else {
            int i17 = d6.a;
            p5 p5Var2 = r5.a;
            l6 l6Var5 = j6.b;
            int i18 = w5.a;
            j10 = a6.j(zzb, p5Var2, l6Var5, null);
        }
        i6 i6Var2 = (i6) concurrentHashMap.putIfAbsent(cls, j10);
        return i6Var2 == null ? j10 : i6Var2;
    }
}
