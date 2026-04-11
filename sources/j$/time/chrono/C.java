package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class C extends d {
    private static final long serialVersionUID = 1300372329181994526L;
    private final transient LocalDate a;

    C(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    @Override // j$.time.chrono.b
    public final l a() {
        return A.d;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        A.d.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.d
    public final m J() {
        return P() >= 1 ? D.ROC : D.BEFORE_ROC;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.s(this);
        }
        if (!h.h(this, pVar)) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = B.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.o(pVar);
        }
        if (i != 4) {
            return A.d.C(aVar);
        }
        j$.time.temporal.u k = j$.time.temporal.a.YEAR.k();
        return j$.time.temporal.u.j(1L, P() <= 0 ? (-k.e()) + 1912 : k.d() - 1911);
    }

    @Override // j$.time.temporal.m
    public final long s(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i = B.a[((j$.time.temporal.a) pVar).ordinal()];
            if (i == 4) {
                int P = P();
                if (P < 1) {
                    P = 1 - P;
                }
                return P;
            }
            LocalDate localDate = this.a;
            if (i == 5) {
                return ((P() * 12) + localDate.O()) - 1;
            }
            if (i == 6) {
                return P();
            }
            if (i != 7) {
                return localDate.s(pVar);
            }
            return P() < 1 ? 0 : 1;
        }
        return pVar.l(this);
    }

    private int P() {
        return this.a.getYear() - 1911;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C d(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (s(aVar) == j) {
                return this;
            }
            int[] iArr = B.a;
            int i = iArr[aVar.ordinal()];
            LocalDate localDate = this.a;
            if (i != 4) {
                if (i == 5) {
                    A.d.C(aVar).b(j, aVar);
                    return R(localDate.X(j - (((P() * 12) + localDate.O()) - 1)));
                }
                if (i != 6) {
                }
            }
            int a = A.d.C(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 4) {
                return R(localDate.d0(P() >= 1 ? a + 1911 : 1912 - a));
            }
            if (i2 == 6) {
                return R(localDate.d0(a + 1911));
            }
            if (i2 == 7) {
                return R(localDate.d0(1912 - P()));
            }
            return R(localDate.d(j, pVar));
        }
        return (C) super.d(j, pVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: O */
    public final b n(j$.time.temporal.n nVar) {
        return (C) super.n(nVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        return (C) super.n(localDate);
    }

    @Override // j$.time.chrono.d
    final b N(long j) {
        return R(this.a.Y(j));
    }

    @Override // j$.time.chrono.d
    final b M(long j) {
        return R(this.a.X(j));
    }

    @Override // j$.time.chrono.d
    final b L(long j) {
        return R(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b e(long j, j$.time.temporal.s sVar) {
        return (C) super.e(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal e(long j, j$.time.temporal.s sVar) {
        return (C) super.e(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: E */
    public final b k(long j, j$.time.temporal.s sVar) {
        return (C) super.k(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return (C) super.k(j, chronoUnit);
    }

    private C R(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new C(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long t() {
        return this.a.t();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C) {
            return this.a.equals(((C) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 7, this);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime u(j$.time.j jVar) {
        return f.J(this, jVar);
    }
}
