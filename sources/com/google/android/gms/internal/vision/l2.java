package com.google.android.gms.internal.vision;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class l2 {
    public static final l2 c = new l2();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final y1 a = new y1();

    public final o2 a(Class cls) {
        o2 k10;
        Class cls2;
        Charset charset = j1.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        o2 o2Var = (o2) concurrentHashMap.get(cls);
        if (o2Var != null) {
            return o2Var;
        }
        y1 y1Var = this.a;
        y1Var.getClass();
        Class cls3 = p2.a;
        if (!f1.class.isAssignableFrom(cls) && (cls2 = p2.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        m2 zzb = ((z1) y1Var.a).zzb(cls);
        int i10 = zzb.d;
        l0 l0Var = zzb.a;
        if ((i10 & 2) == 2) {
            if (f1.class.isAssignableFrom(cls)) {
                k10 = new g2(p2.d, w0.a, l0Var);
            } else {
                q2 q2Var = p2.b;
                v0 v0Var = w0.b;
                if (v0Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                k10 = new g2(q2Var, v0Var, l0Var);
            }
        } else if (f1.class.isAssignableFrom(cls)) {
            k10 = (zzb.d & 1) == 1 ? f2.k(zzb, h2.b, s1.b, p2.d, w0.a, c2.b) : f2.k(zzb, h2.b, s1.b, p2.d, null, c2.b);
        } else if ((zzb.d & 1) == 1) {
            i2 i2Var = h2.a;
            u1 u1Var = s1.a;
            q2 q2Var2 = p2.b;
            v0 v0Var2 = w0.b;
            if (v0Var2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            k10 = f2.k(zzb, i2Var, u1Var, q2Var2, v0Var2, c2.a);
        } else {
            k10 = f2.k(zzb, h2.a, s1.a, p2.c, null, c2.a);
        }
        o2 o2Var2 = (o2) concurrentHashMap.putIfAbsent(cls, k10);
        return o2Var2 != null ? o2Var2 : k10;
    }
}
