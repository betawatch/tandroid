package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class y0 {
    public static final y0 c = new y0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final k0 a = new k0();

    public final b1 a(Class cls) {
        b1 w10;
        Class cls2;
        z.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        b1 b1Var = (b1) concurrentHashMap.get(cls);
        if (b1Var != null) {
            return b1Var;
        }
        k0 k0Var = this.a;
        k0Var.getClass();
        Class cls3 = c1.a;
        if (!w.class.isAssignableFrom(cls) && (cls2 = c1.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        a1 a2 = ((j0) k0Var.a).a(cls);
        int i10 = a2.d;
        a aVar = a2.a;
        if ((i10 & 2) == 2) {
            if (w.class.isAssignableFrom(cls)) {
                w10 = new t0(c1.d, p.a, aVar);
            } else {
                j1 j1Var = c1.b;
                o oVar = p.b;
                if (oVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                w10 = new t0(j1Var, oVar, aVar);
            }
        } else if (w.class.isAssignableFrom(cls)) {
            w10 = (a2.d & 1) == 1 ? s0.w(a2, v0.b, h0.b, c1.d, p.a, p0.b) : s0.w(a2, v0.b, h0.b, c1.d, null, p0.b);
        } else if ((a2.d & 1) == 1) {
            u0 u0Var = v0.a;
            f0 f0Var = h0.a;
            j1 j1Var2 = c1.b;
            o oVar2 = p.b;
            if (oVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            w10 = s0.w(a2, u0Var, f0Var, j1Var2, oVar2, p0.a);
        } else {
            w10 = s0.w(a2, v0.a, h0.a, c1.c, null, p0.a);
        }
        b1 b1Var2 = (b1) concurrentHashMap.putIfAbsent(cls, w10);
        return b1Var2 != null ? b1Var2 : w10;
    }
}
