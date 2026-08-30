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
            return oVar.k(lVar);
        }
        if (lVar.e(oVar)) {
            return ((a) oVar).b;
        }
        throw new r(j$.time.c.a("Unsupported field: ", oVar));
    }

    public static int a(l lVar, o oVar) {
        s l10 = lVar.l(oVar);
        if (l10.a < -2147483648L || l10.d > 2147483647L) {
            throw new r("Invalid field " + oVar + " for get() method, use getLong() instead");
        }
        long y10 = lVar.y(oVar);
        if (l10.d(y10)) {
            return (int) y10;
        }
        throw new j$.time.b("Invalid value for " + oVar + " (valid values " + l10 + "): " + y10);
    }

    public static Object c(l lVar, j$.time.format.a aVar) {
        if (aVar == a || aVar == b || aVar == c) {
            return null;
        }
        return aVar.a(lVar);
    }

    public static Temporal b(Temporal temporal, long j10, q qVar) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            temporal = temporal.d(Long.MAX_VALUE, qVar);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return temporal.d(j11, qVar);
    }
}
