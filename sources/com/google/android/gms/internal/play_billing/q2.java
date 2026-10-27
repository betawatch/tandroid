package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class q2 {
    public static final q2 c = new q2();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final i2 a = new i2();

    public final t2 a(Class cls) {
        t2 r6;
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
            r6 = new o2(t1Var2, zzb.a);
        } else {
            int i10 = p2.a;
            int i11 = f2.a;
            t1 t1Var4 = u2.a;
            t1 t1Var5 = zzb.a() + (-1) != 1 ? p1.a : null;
            int i12 = k2.a;
            r6 = n2.r(zzb, t1Var4, t1Var5);
        }
        t2 t2Var2 = (t2) concurrentHashMap.putIfAbsent(cls, r6);
        return t2Var2 != null ? t2Var2 : r6;
    }
}
