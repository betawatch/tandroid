package com.google.android.gms.internal.clearcut;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class v0 {
    public static final v0 c = new v0();
    public final j0 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public v0() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        j0 j0Var = null;
        for (int i10 = 0; i10 <= 0; i10++) {
            try {
                j0Var = (j0) Class.forName(strArr[0]).getConstructor(null).newInstance(null);
            } catch (Throwable unused) {
                j0Var = null;
            }
            if (j0Var != null) {
                break;
            }
        }
        this.a = j0Var == null ? new j0() : j0Var;
    }

    public final z0 a(Class cls) {
        r0 r0Var;
        g0 g0Var;
        c1 c1Var;
        q qVar;
        m0 m0Var;
        z0 n10;
        Class cls2;
        Charset charset = z.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        z0 z0Var = (z0) concurrentHashMap.get(cls);
        if (z0Var != null) {
            return z0Var;
        }
        j0 j0Var = this.a;
        j0Var.getClass();
        Class cls3 = a1.a;
        if (!y.class.isAssignableFrom(cls) && (cls2 = a1.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        x0 zzb = j0Var.a.zzb(cls);
        y0 y0Var = zzb.b;
        i iVar = zzb.a;
        if ((y0Var.d & 2) != 2) {
            if (y.class.isAssignableFrom(cls)) {
                if ((zzb.b.d & 1) == 1) {
                    r0Var = s0.b;
                    g0Var = g0.b;
                    c1Var = a1.d;
                    qVar = r.a;
                } else {
                    r0Var = s0.b;
                    g0Var = g0.b;
                    c1Var = a1.d;
                    qVar = null;
                }
                m0Var = n0.b;
            } else {
                if ((zzb.b.d & 1) == 1) {
                    r0Var = s0.a;
                    g0Var = g0.a;
                    c1Var = a1.b;
                    qVar = r.b;
                    if (qVar == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                } else {
                    r0Var = s0.a;
                    g0Var = g0.a;
                    c1Var = a1.c;
                    qVar = null;
                }
                m0Var = n0.a;
            }
            n10 = p0.n(zzb, r0Var, g0Var, c1Var, qVar, m0Var);
        } else if (y.class.isAssignableFrom(cls)) {
            n10 = new q0(a1.d, r.a, iVar);
        } else {
            c1 c1Var2 = a1.b;
            q qVar2 = r.b;
            if (qVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            n10 = new q0(c1Var2, qVar2, iVar);
        }
        z0 z0Var2 = (z0) concurrentHashMap.putIfAbsent(cls, n10);
        return z0Var2 != null ? z0Var2 : n10;
    }
}
