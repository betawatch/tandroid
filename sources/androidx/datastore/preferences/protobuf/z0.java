package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z0 {
    public static final z0 c = new z0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final l0 a = new l0();

    public final c1 a(Class cls) {
        c1 w8;
        Class cls2;
        a0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        c1 c1Var = (c1) concurrentHashMap.get(cls);
        if (c1Var != null) {
            return c1Var;
        }
        l0 l0Var = this.a;
        l0Var.getClass();
        Class cls3 = d1.a;
        if (!x.class.isAssignableFrom(cls) && (cls2 = d1.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        b1 a2 = ((k0) l0Var.a).a(cls);
        int i9 = a2.d;
        a aVar = a2.a;
        if ((i9 & 2) == 2) {
            if (x.class.isAssignableFrom(cls)) {
                w8 = new u0(d1.d, p.a, aVar);
            } else {
                k1 k1Var = d1.b;
                o oVar = p.b;
                if (oVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                w8 = new u0(k1Var, oVar, aVar);
            }
        } else if (x.class.isAssignableFrom(cls)) {
            w8 = (a2.d & 1) == 1 ? t0.w(a2, w0.b, i0.b, d1.d, p.a, q0.b) : t0.w(a2, w0.b, i0.b, d1.d, null, q0.b);
        } else if ((a2.d & 1) == 1) {
            v0 v0Var = w0.a;
            g0 g0Var = i0.a;
            k1 k1Var2 = d1.b;
            o oVar2 = p.b;
            if (oVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            w8 = t0.w(a2, v0Var, g0Var, k1Var2, oVar2, q0.a);
        } else {
            w8 = t0.w(a2, w0.a, i0.a, d1.c, null, q0.a);
        }
        c1 c1Var2 = (c1) concurrentHashMap.putIfAbsent(cls, w8);
        return c1Var2 != null ? c1Var2 : w8;
    }
}
