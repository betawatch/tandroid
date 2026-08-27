package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class h0 extends d {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient LocalDate a;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime A(j$.time.h hVar) {
        return new f(this, hVar);
    }

    public h0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    @Override // j$.time.chrono.b
    public final k a() {
        return f0.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        f0.c.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.d
    public final l H() {
        return N() >= 1 ? i0.BE : i0.BEFORE_BE;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.k(this);
        }
        if (!j$.com.android.tools.r8.a.q(this, oVar)) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        int i10 = g0.a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.a.l(oVar);
        }
        if (i10 != 4) {
            return f0.c.s(aVar);
        }
        j$.time.temporal.s sVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.e(1L, N() <= 0 ? (-(sVar.a + 543)) + 1 : 543 + sVar.d);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = g0.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i10 == 4) {
                int N = N();
                if (N < 1) {
                    N = 1 - N;
                }
                return N;
            }
            if (i10 == 5) {
                return ((N() * 12) + this.a.b) - 1;
            }
            if (i10 == 6) {
                return N();
            }
            if (i10 != 7) {
                return this.a.y(oVar);
            }
            return N() < 1 ? 0 : 1;
        }
        return oVar.m(this);
    }

    public final int N() {
        return this.a.getYear() + 543;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h0 c(long j10, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            if (y(aVar) == j10) {
                return this;
            }
            int[] iArr = g0.a;
            int i10 = iArr[aVar.ordinal()];
            if (i10 != 4) {
                if (i10 == 5) {
                    f0.c.s(aVar).b(j10, aVar);
                    long N = N() * 12;
                    return P(this.a.T(j10 - ((N + r10.b) - 1)));
                }
                if (i10 != 6) {
                }
            }
            int a2 = f0.c.s(aVar).a(j10, aVar);
            int i11 = iArr[aVar.ordinal()];
            if (i11 == 4) {
                LocalDate localDate = this.a;
                if (N() < 1) {
                    a2 = 1 - a2;
                }
                return P(localDate.Y(a2 - 543));
            }
            if (i11 == 6) {
                return P(this.a.Y(a2 - 543));
            }
            if (i11 == 7) {
                return P(this.a.Y((-542) - N()));
            }
            return P(this.a.c(j10, oVar));
        }
        return (h0) super.c(j10, oVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: M */
    public final b k(j$.time.temporal.m mVar) {
        return (h0) super.k(mVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        return (h0) super.k(localDate);
    }

    @Override // j$.time.chrono.d
    public final b L(long j10) {
        return P(this.a.U(j10));
    }

    @Override // j$.time.chrono.d
    public final b K(long j10) {
        return P(this.a.T(j10));
    }

    @Override // j$.time.chrono.d
    public final b J(long j10) {
        return P(this.a.plusDays(j10));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b d(long j10, j$.time.temporal.q qVar) {
        return (h0) super.d(j10, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal d(long j10, j$.time.temporal.q qVar) {
        return (h0) super.d(j10, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: t */
    public final b w(long j10, j$.time.temporal.q qVar) {
        return (h0) super.w(j10, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal w(long j10, ChronoUnit chronoUnit) {
        return (h0) super.w(j10, chronoUnit);
    }

    public final h0 P(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new h0(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long z() {
        return this.a.z();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            return this.a.equals(((h0) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 8, this);
    }
}
