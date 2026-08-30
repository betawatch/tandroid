package com.google.android.gms.internal.vision;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class k2 {
    public static final k2 c = new k2();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final y1 a = new y1();

    public final n2 a(Class cls) {
        n2 k10;
        Class cls2;
        Charset charset = j1.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        n2 n2Var = (n2) concurrentHashMap.get(cls);
        if (n2Var != null) {
            return n2Var;
        }
        y1 y1Var = this.a;
        y1Var.getClass();
        Class cls3 = o2.a;
        if (!f1.class.isAssignableFrom(cls) && (cls2 = o2.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        l2 zzb = ((z1) y1Var.a).zzb(cls);
        int i10 = zzb.d;
        l0 l0Var = zzb.a;
        if ((i10 & 2) == 2) {
            if (f1.class.isAssignableFrom(cls)) {
                k10 = new f2(o2.d, w0.a, l0Var);
            } else {
                p2 p2Var = o2.b;
                v0 v0Var = w0.b;
                if (v0Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                k10 = new f2(p2Var, v0Var, l0Var);
            }
        } else if (f1.class.isAssignableFrom(cls)) {
            k10 = (zzb.d & 1) == 1 ? e2.k(zzb, g2.b, s1.b, o2.d, w0.a, c2.b) : e2.k(zzb, g2.b, s1.b, o2.d, null, c2.b);
        } else if ((zzb.d & 1) == 1) {
            h2 h2Var = g2.a;
            u1 u1Var = s1.a;
            p2 p2Var2 = o2.b;
            v0 v0Var2 = w0.b;
            if (v0Var2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            k10 = e2.k(zzb, h2Var, u1Var, p2Var2, v0Var2, c2.a);
        } else {
            k10 = e2.k(zzb, g2.a, s1.a, o2.c, null, c2.a);
        }
        n2 n2Var2 = (n2) concurrentHashMap.putIfAbsent(cls, k10);
        return n2Var2 != null ? n2Var2 : k10;
    }
}
