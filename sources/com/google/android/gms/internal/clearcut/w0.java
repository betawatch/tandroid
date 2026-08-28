package com.google.android.gms.internal.clearcut;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class w0 {
    public static final w0 c = new w0();
    public final k0 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public w0() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        k0 k0Var = null;
        for (int i9 = 0; i9 <= 0; i9++) {
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

    public final b1 a(Class cls) {
        s0 s0Var;
        h0 h0Var;
        e1 e1Var;
        r rVar;
        n0 n0Var;
        b1 n10;
        Class cls2;
        Charset charset = a0.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        b1 b1Var = (b1) concurrentHashMap.get(cls);
        if (b1Var != null) {
            return b1Var;
        }
        k0 k0Var = this.a;
        k0Var.getClass();
        Class cls3 = c1.a;
        if (!z.class.isAssignableFrom(cls) && (cls2 = c1.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        y0 zzb = k0Var.a.zzb(cls);
        z0 z0Var = zzb.b;
        j jVar = zzb.a;
        if ((z0Var.d & 2) != 2) {
            if (z.class.isAssignableFrom(cls)) {
                if ((zzb.b.d & 1) == 1) {
                    s0Var = t0.b;
                    h0Var = h0.b;
                    e1Var = c1.d;
                    rVar = s.a;
                } else {
                    s0Var = t0.b;
                    h0Var = h0.b;
                    e1Var = c1.d;
                    rVar = null;
                }
                n0Var = o0.b;
            } else {
                if ((zzb.b.d & 1) == 1) {
                    s0Var = t0.a;
                    h0Var = h0.a;
                    e1Var = c1.b;
                    rVar = s.b;
                    if (rVar == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                } else {
                    s0Var = t0.a;
                    h0Var = h0.a;
                    e1Var = c1.c;
                    rVar = null;
                }
                n0Var = o0.a;
            }
            n10 = q0.n(zzb, s0Var, h0Var, e1Var, rVar, n0Var);
        } else if (z.class.isAssignableFrom(cls)) {
            n10 = new r0(c1.d, s.a, jVar);
        } else {
            e1 e1Var2 = c1.b;
            r rVar2 = s.b;
            if (rVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            n10 = new r0(e1Var2, rVar2, jVar);
        }
        b1 b1Var2 = (b1) concurrentHashMap.putIfAbsent(cls, n10);
        return b1Var2 != null ? b1Var2 : n10;
    }
}
