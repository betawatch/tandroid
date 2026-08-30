package com.google.android.gms.internal.clearcut;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class v0 {
    public static final v0 c = new v0();
    public final k0 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public v0() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        k0 k0Var = null;
        for (int i10 = 0; i10 <= 0; i10++) {
            try {
                k0Var = (k0) Class.forName(strArr[0]).getConstructor(null).newInstance(null);
            } catch (Throwable unused) {
                k0Var = null;
            }
            if (k0Var != null) {
                break;
            }
        }
        this.a = k0Var == null ? new k0() : k0Var;
    }

    public final a1 a(Class cls) {
        s0 s0Var;
        h0 h0Var;
        d1 d1Var;
        r rVar;
        n0 n0Var;
        a1 n10;
        Class cls2;
        Charset charset = a0.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        a1 a1Var = (a1) concurrentHashMap.get(cls);
        if (a1Var != null) {
            return a1Var;
        }
        k0 k0Var = this.a;
        k0Var.getClass();
        Class cls3 = b1.a;
        if (!z.class.isAssignableFrom(cls) && (cls2 = b1.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        x0 zzb = k0Var.a.zzb(cls);
        y0 y0Var = zzb.b;
        j jVar = zzb.a;
        if ((y0Var.d & 2) != 2) {
            if (z.class.isAssignableFrom(cls)) {
                if ((zzb.b.d & 1) == 1) {
                    s0Var = t0.b;
                    h0Var = h0.b;
                    d1Var = b1.d;
                    rVar = s.a;
                } else {
                    s0Var = t0.b;
                    h0Var = h0.b;
                    d1Var = b1.d;
                    rVar = null;
                }
                n0Var = o0.b;
            } else {
                if ((zzb.b.d & 1) == 1) {
                    s0Var = t0.a;
                    h0Var = h0.a;
                    d1Var = b1.b;
                    rVar = s.b;
                    if (rVar == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                } else {
                    s0Var = t0.a;
                    h0Var = h0.a;
                    d1Var = b1.c;
                    rVar = null;
                }
                n0Var = o0.a;
            }
            n10 = q0.n(zzb, s0Var, h0Var, d1Var, rVar, n0Var);
        } else if (z.class.isAssignableFrom(cls)) {
            n10 = new r0(b1.d, s.a, jVar);
        } else {
            d1 d1Var2 = b1.b;
            r rVar2 = s.b;
            if (rVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            n10 = new r0(d1Var2, rVar2, jVar);
        }
        a1 a1Var2 = (a1) concurrentHashMap.putIfAbsent(cls, n10);
        return a1Var2 != null ? a1Var2 : n10;
    }
}
