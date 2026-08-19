package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class H extends d {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient LocalDate a;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime w(j$.time.h hVar) {
        return new f(this, hVar);
    }

    public H(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    @Override // j$.time.chrono.b
    public final k b() {
        return F.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        F.c.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.d
    public final l H() {
        return N() >= 1 ? I.BE : I.BEFORE_BE;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.r(this);
        }
        if (!j$.com.android.tools.r8.a.q(this, oVar)) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        int i = G.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.q(oVar);
        }
        if (i != 4) {
            return F.c.y(aVar);
        }
        j$.time.temporal.s sVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.e(1L, N() <= 0 ? (-(sVar.a + 543)) + 1 : 543 + sVar.d);
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = G.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i == 4) {
                int N = N();
                if (N < 1) {
                    N = 1 - N;
                }
                return N;
            }
            LocalDate localDate = this.a;
            if (i == 5) {
                return ((N() * 12) + localDate.b) - 1;
            }
            if (i == 6) {
                return N();
            }
            if (i != 7) {
                return localDate.u(oVar);
            }
            return N() < 1 ? 0 : 1;
        }
        return oVar.o(this);
    }

    public final int N() {
        return this.a.getYear() + 543;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final H e(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            if (u(aVar) == j) {
                return this;
            }
            int[] iArr = G.a;
            int i = iArr[aVar.ordinal()];
            LocalDate localDate = this.a;
            if (i != 4) {
                if (i == 5) {
                    F.c.y(aVar).b(j, aVar);
                    return P(localDate.T(j - (((N() * 12) + localDate.b) - 1)));
                }
                if (i != 6) {
                }
            }
            int a = F.c.y(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 4) {
                if (N() < 1) {
                    a = 1 - a;
                }
                return P(localDate.Y(a - 543));
            }
            if (i2 == 6) {
                return P(localDate.Y(a - 543));
            }
            if (i2 == 7) {
                return P(localDate.Y((-542) - N()));
            }
            return P(localDate.e(j, oVar));
        }
        return (H) super.e(j, oVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: M */
    public final b p(j$.time.temporal.m mVar) {
        return (H) super.p(mVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal p(LocalDate localDate) {
        return (H) super.p(localDate);
    }

    @Override // j$.time.chrono.d
    public final b L(long j) {
        return P(this.a.U(j));
    }

    @Override // j$.time.chrono.d
    public final b K(long j) {
        return P(this.a.T(j));
    }

    @Override // j$.time.chrono.d
    public final b J(long j) {
        return P(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b f(long j, j$.time.temporal.q qVar) {
        return (H) super.f(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal f(long j, j$.time.temporal.q qVar) {
        return (H) super.f(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: D */
    public final b l(long j, j$.time.temporal.q qVar) {
        return (H) super.l(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal l(long j, ChronoUnit chronoUnit) {
        return (H) super.l(j, chronoUnit);
    }

    public final H P(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new H(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long v() {
        return this.a.v();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H) {
            return this.a.equals(((H) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 8, this);
    }
}
