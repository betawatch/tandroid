package j$.time.chrono;

import j$.time.LocalDate;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class I extends d {
    private static final long serialVersionUID = -8722293800195731463L;
    private final transient LocalDate a;

    I(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    @Override // j$.time.chrono.b
    public final l a() {
        return G.d;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        G.d.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.d
    public final m C() {
        return I() >= 1 ? J.BE : J.BEFORE_BE;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        if (!h.h(this, rVar)) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i = H.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.m(rVar);
        }
        if (i != 4) {
            return G.d.l(aVar);
        }
        j$.time.temporal.w i2 = j$.time.temporal.a.YEAR.i();
        return j$.time.temporal.w.j(1L, I() <= 0 ? (-(i2.e() + 543)) + 1 : 543 + i2.d());
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = H.a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 4) {
                int I = I();
                if (I < 1) {
                    I = 1 - I;
                }
                return I;
            }
            LocalDate localDate = this.a;
            if (i == 5) {
                return ((I() * 12) + localDate.H()) - 1;
            }
            if (i == 6) {
                return I();
            }
            if (i != 7) {
                return localDate.r(rVar);
            }
            return I() < 1 ? 0 : 1;
        }
        return rVar.j(this);
    }

    private int I() {
        return this.a.getYear() + 543;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final I d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (r(aVar) == j) {
                return this;
            }
            int[] iArr = H.a;
            int i = iArr[aVar.ordinal()];
            LocalDate localDate = this.a;
            if (i != 4) {
                if (i == 5) {
                    G.d.l(aVar).b(j, aVar);
                    return K(localDate.P(j - (((I() * 12) + localDate.H()) - 1)));
                }
                if (i != 6) {
                }
            }
            int a = G.d.l(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 4) {
                if (I() < 1) {
                    a = 1 - a;
                }
                return K(localDate.V(a - 543));
            }
            if (i2 == 6) {
                return K(localDate.V(a - 543));
            }
            if (i2 == 7) {
                return K(localDate.V((-542) - I()));
            }
            return K(localDate.d(j, rVar));
        }
        return (I) super.d(j, rVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: H */
    public final b l(j$.time.temporal.p pVar) {
        return (I) super.l(pVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m l(LocalDate localDate) {
        return (I) super.l(localDate);
    }

    @Override // j$.time.chrono.d
    final b G(long j) {
        return K(this.a.Q(j));
    }

    @Override // j$.time.chrono.d
    final b F(long j) {
        return K(this.a.P(j));
    }

    @Override // j$.time.chrono.d
    final b E(long j) {
        return K(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b e(long j, j$.time.temporal.u uVar) {
        return (I) super.e(j, uVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return (I) super.e(j, uVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: D */
    public final b i(long j, j$.time.temporal.u uVar) {
        return (I) super.i(j, uVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.b bVar) {
        return (I) super.i(j, bVar);
    }

    private I K(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new I(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long s() {
        return this.a.s();
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            return this.a.equals(((I) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 8, this);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime t(j$.time.j jVar) {
        return f.C(this, jVar);
    }
}
