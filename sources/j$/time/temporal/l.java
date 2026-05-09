package j$.time.temporal;

import j$.util.Objects;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class l {
    static final r a = new q(0);
    static final r b = new q(1);
    static final r c = new q(2);
    static final r d = new q(3);
    static final r e = new q(4);
    static final r f = new q(5);
    static final r g = new q(6);

    public static r k() {
        return a;
    }

    public static u d(m mVar, p pVar) {
        if (!(pVar instanceof a)) {
            Objects.requireNonNull(pVar, "field");
            return pVar.r(mVar);
        }
        if (mVar.g(pVar)) {
            return ((a) pVar).k();
        }
        throw new t(j$.time.d.a("Unsupported field: ", pVar));
    }

    public static r e() {
        return b;
    }

    public static int a(m mVar, p pVar) {
        u o = mVar.o(pVar);
        if (!o.h()) {
            throw new t("Invalid field " + pVar + " for get() method, use getLong() instead");
        }
        long r = mVar.r(pVar);
        if (o.i(r)) {
            return (int) r;
        }
        throw new j$.time.c("Invalid value for " + pVar + " (valid values " + o + "): " + r);
    }

    public static r i() {
        return c;
    }

    public static r j() {
        return e;
    }

    public static r h() {
        return d;
    }

    public static Object c(m mVar, r rVar) {
        if (rVar == a || rVar == b || rVar == c) {
            return null;
        }
        return rVar.a(mVar);
    }

    public static r f() {
        return f;
    }

    public static r g() {
        return g;
    }

    public static Temporal b(Temporal temporal, long j, s sVar) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.e(Long.MAX_VALUE, sVar);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.e(j2, sVar);
    }
}
