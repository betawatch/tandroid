package j$.time.temporal;

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public abstract class p {
    public static final j$.time.format.a a = new j$.time.format.a(1);
    public static final j$.time.format.a b = new j$.time.format.a(2);
    public static final j$.time.format.a c = new j$.time.format.a(3);
    public static final j$.time.format.a d = new j$.time.format.a(4);
    public static final j$.time.format.a e = new j$.time.format.a(5);
    public static final j$.time.format.a f = new j$.time.format.a(6);
    public static final j$.time.format.a g = new j$.time.format.a(7);

    public static int a(l lVar, o oVar) {
        s l = lVar.l(oVar);
        if (l.a < -2147483648L || l.d > 2147483647L) {
            throw new r("Invalid field " + oVar + " for get() method, use getLong() instead");
        }
        long y = lVar.y(oVar);
        if (l.d(y)) {
            return (int) y;
        }
        throw new j$.time.c("Invalid value for " + oVar + " (valid values " + l + "): " + y);
    }

    public static Temporal b(Temporal temporal, long j, q qVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.d(Long.MAX_VALUE, qVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.d(j2, qVar);
    }

    public static Object c(l lVar, j$.time.format.a aVar) {
        if (aVar == a || aVar == b || aVar == c) {
            return null;
        }
        return aVar.a(lVar);
    }

    public static s d(l lVar, o oVar) {
        if (!(oVar instanceof a)) {
            Objects.requireNonNull(oVar, "field");
            return oVar.k(lVar);
        }
        if (lVar.e(oVar)) {
            return ((a) oVar).b;
        }
        throw new r(j$.time.d.a("Unsupported field: ", oVar));
    }
}
