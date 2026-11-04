package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q2 {
    public static final q2 c = new q2();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final i2 a = new i2();

    public final t2 a(Class cls) {
        t2 r5;
        Charset charset = a2.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        t2 t2Var = (t2) concurrentHashMap.get(cls);
        if (t2Var != null) {
            return t2Var;
        }
        i2 i2Var = this.a;
        i2Var.getClass();
        t1 t1Var = u2.a;
        v1.class.isAssignableFrom(cls);
        s2 zzb = ((i2) i2Var.a).zzb(cls);
        if ((zzb.d & 2) == 2) {
            t1 t1Var2 = u2.a;
            t1 t1Var3 = p1.a;
            r5 = new o2(t1Var2, zzb.a);
        } else {
            int i3 = p2.a;
            int i10 = f2.a;
            t1 t1Var4 = u2.a;
            t1 t1Var5 = zzb.a() + (-1) != 1 ? p1.a : null;
            int i11 = k2.a;
            r5 = n2.r(zzb, t1Var4, t1Var5);
        }
        t2 t2Var2 = (t2) concurrentHashMap.putIfAbsent(cls, r5);
        return t2Var2 != null ? t2Var2 : r5;
    }
}
