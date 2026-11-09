package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class y0 {
    public static final y0 c = new y0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final l0 a = new l0();

    public final b1 a(Class cls) {
        b1 w10;
        Class cls2;
        c0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        b1 b1Var = (b1) concurrentHashMap.get(cls);
        if (b1Var != null) {
            return b1Var;
        }
        l0 l0Var = this.a;
        l0Var.getClass();
        Class cls3 = c1.a;
        if (!z.class.isAssignableFrom(cls) && (cls2 = c1.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        a1 a10 = ((k0) l0Var.a).a(cls);
        int i7 = a10.d;
        a aVar = a10.a;
        if ((i7 & 2) == 2) {
            if (z.class.isAssignableFrom(cls)) {
                w10 = new u0(c1.c, r.a, aVar);
            } else {
                i1 i1Var = c1.b;
                q qVar = r.b;
                if (qVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                w10 = new u0(i1Var, qVar, aVar);
            }
        } else if (z.class.isAssignableFrom(cls)) {
            q qVar2 = null;
            v0 v0Var = w0.b;
            h0 h0Var = i0.b;
            i1 i1Var2 = c1.c;
            if (p1.g.c(a10.a()) != 1) {
                qVar2 = r.a;
            }
            q qVar3 = qVar2;
            p0 p0Var = q0.b;
            if (!(a10 instanceof a1)) {
                int[] iArr = t0.n;
                a10.getClass();
                throw new ClassCastException();
            }
            w10 = t0.w(a10, v0Var, h0Var, i1Var2, qVar3, p0Var);
        } else {
            q qVar4 = null;
            v0 v0Var2 = w0.a;
            h0 h0Var2 = i0.a;
            i1 i1Var3 = c1.b;
            if (p1.g.c(a10.a()) != 1 && (qVar4 = r.b) == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            q qVar5 = qVar4;
            p0 p0Var2 = q0.a;
            if (!(a10 instanceof a1)) {
                int[] iArr2 = t0.n;
                a10.getClass();
                throw new ClassCastException();
            }
            w10 = t0.w(a10, v0Var2, h0Var2, i1Var3, qVar5, p0Var2);
        }
        b1 b1Var2 = (b1) concurrentHashMap.putIfAbsent(cls, w10);
        return b1Var2 != null ? b1Var2 : w10;
    }
}
