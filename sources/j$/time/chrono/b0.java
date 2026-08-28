package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class b0 extends d {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient LocalDate a;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime A(j$.time.h hVar) {
        return new f(this, hVar);
    }

    public b0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    @Override // j$.time.chrono.b
    public final k a() {
        return z.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        z.c.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.d
    public final l H() {
        return N() >= 1 ? c0.ROC : c0.BEFORE_ROC;
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
        int i9 = a0.a[aVar.ordinal()];
        if (i9 == 1 || i9 == 2 || i9 == 3) {
            return this.a.l(oVar);
        }
        if (i9 != 4) {
            return z.c.s(aVar);
        }
        j$.time.temporal.s sVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.e(1L, N() <= 0 ? (-sVar.a) + 1912 : sVar.d - 1911);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i9 = a0.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i9 == 4) {
                int N = N();
                if (N < 1) {
                    N = 1 - N;
                }
                return N;
            }
            if (i9 == 5) {
                return ((N() * 12) + this.a.b) - 1;
            }
            if (i9 == 6) {
                return N();
            }
            if (i9 != 7) {
                return this.a.y(oVar);
            }
            return N() < 1 ? 0 : 1;
        }
        return oVar.m(this);
    }

    public final int N() {
        return this.a.getYear() - 1911;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b0 c(long j10, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            if (y(aVar) == j10) {
                return this;
            }
            int[] iArr = a0.a;
            int i9 = iArr[aVar.ordinal()];
            if (i9 != 4) {
                if (i9 == 5) {
                    z.c.s(aVar).b(j10, aVar);
                    long N = N() * 12;
                    return P(this.a.T(j10 - ((N + r10.b) - 1)));
                }
                if (i9 != 6) {
                }
            }
            int a2 = z.c.s(aVar).a(j10, aVar);
            int i10 = iArr[aVar.ordinal()];
            if (i10 == 4) {
                return P(this.a.Y(N() >= 1 ? a2 + 1911 : 1912 - a2));
            }
            if (i10 == 6) {
                return P(this.a.Y(a2 + 1911));
            }
            if (i10 == 7) {
                return P(this.a.Y(1912 - N()));
            }
            return P(this.a.c(j10, oVar));
        }
        return (b0) super.c(j10, oVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: M */
    public final b k(j$.time.temporal.m mVar) {
        return (b0) super.k(mVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        return (b0) super.k(localDate);
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
        return (b0) super.d(j10, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal d(long j10, j$.time.temporal.q qVar) {
        return (b0) super.d(j10, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: t */
    public final b w(long j10, j$.time.temporal.q qVar) {
        return (b0) super.w(j10, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal w(long j10, ChronoUnit chronoUnit) {
        return (b0) super.w(j10, chronoUnit);
    }

    public final b0 P(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new b0(localDate);
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
        if (obj instanceof b0) {
            return this.a.equals(((b0) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new d0((byte) 7, this);
    }
}
