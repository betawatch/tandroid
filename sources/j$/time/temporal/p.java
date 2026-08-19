package j$.time.temporal;

import j$.util.Objects;

/* loaded from: classes2.dex */
public abstract class p {
    public static final j$.time.format.a a = new j$.time.format.a(1);
    public static final j$.time.format.a b = new j$.time.format.a(2);
    public static final j$.time.format.a c = new j$.time.format.a(3);
    public static final j$.time.format.a d = new j$.time.format.a(4);
    public static final j$.time.format.a e = new j$.time.format.a(5);
    public static final j$.time.format.a f = new j$.time.format.a(6);
    public static final j$.time.format.a g = new j$.time.format.a(7);

    public static s d(l lVar, o oVar) {
        if (!(oVar instanceof a)) {
            Objects.requireNonNull(oVar, "field");
            return oVar.r(lVar);
        }
        if (lVar.h(oVar)) {
            return ((a) oVar).b;
        }
        throw new r(j$.time.c.a("Unsupported field: ", oVar));
    }

    public static int a(l lVar, o oVar) {
        s q = lVar.q(oVar);
        if (q.a < -2147483648L || q.d > 2147483647L) {
            throw new r("Invalid field " + oVar + " for get() method, use getLong() instead");
        }
        long u = lVar.u(oVar);
        if (q.d(u)) {
            return (int) u;
        }
        throw new j$.time.b("Invalid value for " + oVar + " (valid values " + q + "): " + u);
    }

    public static Object c(l lVar, j$.time.format.a aVar) {
        if (aVar == a || aVar == b || aVar == c) {
            return null;
        }
        return aVar.a(lVar);
    }

    public static Temporal b(Temporal temporal, long j, q qVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.f(Long.MAX_VALUE, qVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.f(j2, qVar);
    }
}
