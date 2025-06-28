package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.A;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class j {
    static final m a;
    static final m b;
    static final m c;
    static final m d;
    static final m e;
    static final m f;
    static final m g;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.m] */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.m] */
    /* JADX WARN: Type inference failed for: r0v2, types: [j$.time.temporal.m] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.m] */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.time.temporal.m] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.time.temporal.m] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.time.temporal.m] */
    static {
        final int i = 0;
        a = new n() { // from class: j$.time.temporal.m
            @Override // j$.time.temporal.n
            public final Object a(k kVar) {
                switch (i) {
                    case 0:
                        return (ZoneId) kVar.i(j.a);
                    case 1:
                        return (j$.time.chrono.e) kVar.i(j.b);
                    case 2:
                        return (o) kVar.i(j.c);
                    case 3:
                        ZoneId zoneId = (ZoneId) kVar.i(j.a);
                        return zoneId != null ? zoneId : (ZoneId) kVar.i(j.d);
                    case 4:
                        a aVar = a.OFFSET_SECONDS;
                        if (kVar.k(aVar)) {
                            return ZoneOffset.q(kVar.j(aVar));
                        }
                        return null;
                    case 5:
                        l lVar = a.EPOCH_DAY;
                        if (kVar.k(lVar)) {
                            return LocalDate.v(kVar.h(lVar));
                        }
                        return null;
                    default:
                        l lVar2 = a.NANO_OF_DAY;
                        if (kVar.k(lVar2)) {
                            return j$.time.h.r(kVar.h(lVar2));
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        b = new n() { // from class: j$.time.temporal.m
            @Override // j$.time.temporal.n
            public final Object a(k kVar) {
                switch (i2) {
                    case 0:
                        return (ZoneId) kVar.i(j.a);
                    case 1:
                        return (j$.time.chrono.e) kVar.i(j.b);
                    case 2:
                        return (o) kVar.i(j.c);
                    case 3:
                        ZoneId zoneId = (ZoneId) kVar.i(j.a);
                        return zoneId != null ? zoneId : (ZoneId) kVar.i(j.d);
                    case 4:
                        a aVar = a.OFFSET_SECONDS;
                        if (kVar.k(aVar)) {
                            return ZoneOffset.q(kVar.j(aVar));
                        }
                        return null;
                    case 5:
                        l lVar = a.EPOCH_DAY;
                        if (kVar.k(lVar)) {
                            return LocalDate.v(kVar.h(lVar));
                        }
                        return null;
                    default:
                        l lVar2 = a.NANO_OF_DAY;
                        if (kVar.k(lVar2)) {
                            return j$.time.h.r(kVar.h(lVar2));
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        c = new n() { // from class: j$.time.temporal.m
            @Override // j$.time.temporal.n
            public final Object a(k kVar) {
                switch (i3) {
                    case 0:
                        return (ZoneId) kVar.i(j.a);
                    case 1:
                        return (j$.time.chrono.e) kVar.i(j.b);
                    case 2:
                        return (o) kVar.i(j.c);
                    case 3:
                        ZoneId zoneId = (ZoneId) kVar.i(j.a);
                        return zoneId != null ? zoneId : (ZoneId) kVar.i(j.d);
                    case 4:
                        a aVar = a.OFFSET_SECONDS;
                        if (kVar.k(aVar)) {
                            return ZoneOffset.q(kVar.j(aVar));
                        }
                        return null;
                    case 5:
                        l lVar = a.EPOCH_DAY;
                        if (kVar.k(lVar)) {
                            return LocalDate.v(kVar.h(lVar));
                        }
                        return null;
                    default:
                        l lVar2 = a.NANO_OF_DAY;
                        if (kVar.k(lVar2)) {
                            return j$.time.h.r(kVar.h(lVar2));
                        }
                        return null;
                }
            }
        };
        final int i4 = 4;
        d = new n() { // from class: j$.time.temporal.m
            @Override // j$.time.temporal.n
            public final Object a(k kVar) {
                switch (i4) {
                    case 0:
                        return (ZoneId) kVar.i(j.a);
                    case 1:
                        return (j$.time.chrono.e) kVar.i(j.b);
                    case 2:
                        return (o) kVar.i(j.c);
                    case 3:
                        ZoneId zoneId = (ZoneId) kVar.i(j.a);
                        return zoneId != null ? zoneId : (ZoneId) kVar.i(j.d);
                    case 4:
                        a aVar = a.OFFSET_SECONDS;
                        if (kVar.k(aVar)) {
                            return ZoneOffset.q(kVar.j(aVar));
                        }
                        return null;
                    case 5:
                        l lVar = a.EPOCH_DAY;
                        if (kVar.k(lVar)) {
                            return LocalDate.v(kVar.h(lVar));
                        }
                        return null;
                    default:
                        l lVar2 = a.NANO_OF_DAY;
                        if (kVar.k(lVar2)) {
                            return j$.time.h.r(kVar.h(lVar2));
                        }
                        return null;
                }
            }
        };
        final int i5 = 3;
        e = new n() { // from class: j$.time.temporal.m
            @Override // j$.time.temporal.n
            public final Object a(k kVar) {
                switch (i5) {
                    case 0:
                        return (ZoneId) kVar.i(j.a);
                    case 1:
                        return (j$.time.chrono.e) kVar.i(j.b);
                    case 2:
                        return (o) kVar.i(j.c);
                    case 3:
                        ZoneId zoneId = (ZoneId) kVar.i(j.a);
                        return zoneId != null ? zoneId : (ZoneId) kVar.i(j.d);
                    case 4:
                        a aVar = a.OFFSET_SECONDS;
                        if (kVar.k(aVar)) {
                            return ZoneOffset.q(kVar.j(aVar));
                        }
                        return null;
                    case 5:
                        l lVar = a.EPOCH_DAY;
                        if (kVar.k(lVar)) {
                            return LocalDate.v(kVar.h(lVar));
                        }
                        return null;
                    default:
                        l lVar2 = a.NANO_OF_DAY;
                        if (kVar.k(lVar2)) {
                            return j$.time.h.r(kVar.h(lVar2));
                        }
                        return null;
                }
            }
        };
        final int i6 = 5;
        f = new n() { // from class: j$.time.temporal.m
            @Override // j$.time.temporal.n
            public final Object a(k kVar) {
                switch (i6) {
                    case 0:
                        return (ZoneId) kVar.i(j.a);
                    case 1:
                        return (j$.time.chrono.e) kVar.i(j.b);
                    case 2:
                        return (o) kVar.i(j.c);
                    case 3:
                        ZoneId zoneId = (ZoneId) kVar.i(j.a);
                        return zoneId != null ? zoneId : (ZoneId) kVar.i(j.d);
                    case 4:
                        a aVar = a.OFFSET_SECONDS;
                        if (kVar.k(aVar)) {
                            return ZoneOffset.q(kVar.j(aVar));
                        }
                        return null;
                    case 5:
                        l lVar = a.EPOCH_DAY;
                        if (kVar.k(lVar)) {
                            return LocalDate.v(kVar.h(lVar));
                        }
                        return null;
                    default:
                        l lVar2 = a.NANO_OF_DAY;
                        if (kVar.k(lVar2)) {
                            return j$.time.h.r(kVar.h(lVar2));
                        }
                        return null;
                }
            }
        };
        final int i7 = 6;
        g = new n() { // from class: j$.time.temporal.m
            @Override // j$.time.temporal.n
            public final Object a(k kVar) {
                switch (i7) {
                    case 0:
                        return (ZoneId) kVar.i(j.a);
                    case 1:
                        return (j$.time.chrono.e) kVar.i(j.b);
                    case 2:
                        return (o) kVar.i(j.c);
                    case 3:
                        ZoneId zoneId = (ZoneId) kVar.i(j.a);
                        return zoneId != null ? zoneId : (ZoneId) kVar.i(j.d);
                    case 4:
                        a aVar = a.OFFSET_SECONDS;
                        if (kVar.k(aVar)) {
                            return ZoneOffset.q(kVar.j(aVar));
                        }
                        return null;
                    case 5:
                        l lVar = a.EPOCH_DAY;
                        if (kVar.k(lVar)) {
                            return LocalDate.v(kVar.h(lVar));
                        }
                        return null;
                    default:
                        l lVar2 = a.NANO_OF_DAY;
                        if (kVar.k(lVar2)) {
                            return j$.time.h.r(kVar.h(lVar2));
                        }
                        return null;
                }
            }
        };
    }

    public static int a(k kVar, a aVar) {
        q f2 = kVar.f(aVar);
        if (!f2.g()) {
            throw new p("Invalid field " + aVar + " for get() method, use getLong() instead");
        }
        long h = kVar.h(aVar);
        if (f2.h(h)) {
            return (int) h;
        }
        throw new j$.time.c("Invalid value for " + aVar + " (valid values " + f2 + "): " + h);
    }

    public static Object b(k kVar, n nVar) {
        if (nVar == a || nVar == b || nVar == c) {
            return null;
        }
        return nVar.a(kVar);
    }

    public static q c(k kVar, l lVar) {
        if (!(lVar instanceof a)) {
            A.z(lVar, "field");
            return lVar.j(kVar);
        }
        if (kVar.k(lVar)) {
            return ((a) lVar).f();
        }
        throw new p("Unsupported field: " + lVar);
    }

    public static m d() {
        return b;
    }

    public static m e() {
        return f;
    }

    public static m f() {
        return g;
    }

    public static m g() {
        return d;
    }

    public static m h() {
        return c;
    }

    public static m i() {
        return e;
    }

    public static m j() {
        return a;
    }
}
