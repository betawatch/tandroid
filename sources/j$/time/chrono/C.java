package j$.time.chrono;

import j$.time.LocalDate;
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
    public final m C() {
        return I() >= 1 ? D.ROC : D.BEFORE_ROC;
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
        int i = B.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.m(rVar);
        }
        if (i != 4) {
            return A.d.l(aVar);
        }
        j$.time.temporal.w i2 = j$.time.temporal.a.YEAR.i();
        return j$.time.temporal.w.j(1L, I() <= 0 ? (-i2.e()) + 1912 : i2.d() - 1911);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = B.a[((j$.time.temporal.a) rVar).ordinal()];
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
        return this.a.getYear() - 1911;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (r(aVar) == j) {
                return this;
            }
            int[] iArr = B.a;
            int i = iArr[aVar.ordinal()];
            LocalDate localDate = this.a;
            if (i != 4) {
                if (i == 5) {
                    A.d.l(aVar).b(j, aVar);
                    return K(localDate.P(j - (((I() * 12) + localDate.H()) - 1)));
                }
                if (i != 6) {
                }
            }
            int a = A.d.l(aVar).a(j, aVar);
            int i2 = iArr[aVar.ordinal()];
            if (i2 == 4) {
                return K(localDate.V(I() >= 1 ? a + 1911 : 1912 - a));
            }
            if (i2 == 6) {
                return K(localDate.V(a + 1911));
            }
            if (i2 == 7) {
                return K(localDate.V(1912 - I()));
            }
            return K(localDate.d(j, rVar));
        }
        return (C) super.d(j, rVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: H */
    public final b l(j$.time.temporal.p pVar) {
        return (C) super.l(pVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m l(LocalDate localDate) {
        return (C) super.l(localDate);
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
        return (C) super.e(j, uVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.u uVar) {
        return (C) super.e(j, uVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: D */
    public final b i(long j, j$.time.temporal.u uVar) {
        return (C) super.i(j, uVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.b bVar) {
        return (C) super.i(j, bVar);
    }

    private C K(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new C(localDate);
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
    public final ChronoLocalDateTime t(j$.time.j jVar) {
        return f.C(this, jVar);
    }
}
