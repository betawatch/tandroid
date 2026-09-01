package com.google.android.gms.internal.cast;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c6 {
    public static final c6 c = new c6();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final s5 a = new s5();

    public final f6 a(Class cls) {
        f6 j10;
        Class cls2;
        Charset charset = j5.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        f6 f6Var = (f6) concurrentHashMap.get(cls);
        if (f6Var != null) {
            return f6Var;
        }
        s5 s5Var = this.a;
        s5Var.getClass();
        Class cls3 = g6.a;
        if (!d5.class.isAssignableFrom(cls) && (cls2 = g6.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        e6 zzb = ((r5) s5Var.a).zzb(cls);
        int i10 = zzb.d;
        s4 s4Var = zzb.a;
        if ((i10 & 2) == 2) {
            if (d5.class.isAssignableFrom(cls)) {
                j10 = new y5(g6.c, z4.a, s4Var);
            } else {
                i6 i6Var = g6.b;
                y4 y4Var = z4.b;
                if (y4Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                j10 = new y5(i6Var, y4Var, s4Var);
            }
        } else if (d5.class.isAssignableFrom(cls)) {
            if (zzb.a() - 1 != 1) {
                int i11 = a6.a;
                o5 o5Var = p5.b;
                i6 i6Var2 = g6.c;
                y4 y4Var2 = z4.a;
                int i12 = u5.a;
                j10 = x5.j(zzb, o5Var, i6Var2, y4Var2);
            } else {
                int i13 = a6.a;
                o5 o5Var2 = p5.b;
                i6 i6Var3 = g6.c;
                int i14 = u5.a;
                j10 = x5.j(zzb, o5Var2, i6Var3, null);
            }
        } else if (zzb.a() - 1 != 1) {
            int i15 = a6.a;
            n5 n5Var = p5.a;
            i6 i6Var4 = g6.b;
            y4 y4Var3 = z4.b;
            if (y4Var3 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            int i16 = u5.a;
            j10 = x5.j(zzb, n5Var, i6Var4, y4Var3);
        } else {
            int i17 = a6.a;
            n5 n5Var2 = p5.a;
            i6 i6Var5 = g6.b;
            int i18 = u5.a;
            j10 = x5.j(zzb, n5Var2, i6Var5, null);
        }
        f6 f6Var2 = (f6) concurrentHashMap.putIfAbsent(cls, j10);
        return f6Var2 == null ? j10 : f6Var2;
    }
}
