package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p2 {
    public static final p2 c = new p2();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final h2 a = new h2();

    public final s2 a(Class cls) {
        s2 r10;
        Charset charset = z1.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        s2 s2Var = (s2) concurrentHashMap.get(cls);
        if (s2Var != null) {
            return s2Var;
        }
        h2 h2Var = this.a;
        h2Var.getClass();
        s1 s1Var = t2.a;
        u1.class.isAssignableFrom(cls);
        r2 zzb = ((h2) h2Var.a).zzb(cls);
        if ((zzb.d & 2) == 2) {
            s1 s1Var2 = t2.a;
            s1 s1Var3 = o1.a;
            r10 = new n2(s1Var2, zzb.a);
        } else {
            int i10 = o2.a;
            int i11 = e2.a;
            s1 s1Var4 = t2.a;
            s1 s1Var5 = zzb.a() + (-1) != 1 ? o1.a : null;
            int i12 = j2.a;
            r10 = m2.r(zzb, s1Var4, s1Var5);
        }
        s2 s2Var2 = (s2) concurrentHashMap.putIfAbsent(cls, r10);
        return s2Var2 != null ? s2Var2 : r10;
    }
}
