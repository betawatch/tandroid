package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class a0 extends d {
    private static final long serialVersionUID = 1300372329181994526L;
    public final transient LocalDate a;

    public a0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 7, this);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final ChronoLocalDateTime A(j$.time.j jVar) {
        return new f(this, jVar);
    }

    @Override // j$.time.chrono.d
    public final b C(long j) {
        return I(this.a.N(j));
    }

    @Override // j$.time.chrono.d
    /* renamed from: F */
    public final b k(j$.time.temporal.m mVar) {
        return (a0) super.k(mVar);
    }

    public final int G() {
        return this.a.getYear() - 1911;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a0 c(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (a0) super.c(j, oVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        if (y(aVar) == j) {
            return this;
        }
        int[] iArr = z.a;
        int i = iArr[aVar.ordinal()];
        if (i != 4) {
            if (i == 5) {
                y.c.r(aVar).b(j, aVar);
                long G = G() * 12;
                return I(this.a.M(j - ((G + r10.b) - 1)));
            }
            if (i != 6) {
            }
        }
        int a = y.c.r(aVar).a(j, aVar);
        int i2 = iArr[aVar.ordinal()];
        if (i2 == 4) {
            return I(this.a.R(G() >= 1 ? a + 1911 : 1912 - a));
        }
        if (i2 == 6) {
            return I(this.a.R(a + 1911));
        }
        if (i2 == 7) {
            return I(this.a.R(1912 - G()));
        }
        return I(this.a.c(j, oVar));
    }

    public final a0 I(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new a0(localDate);
    }

    @Override // j$.time.chrono.b
    public final a a() {
        return y.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b d(long j, j$.time.temporal.q qVar) {
        return (a0) super.d(j, qVar);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return this.a.equals(((a0) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        y.c.getClass();
        return (-1990173233) ^ this.a.hashCode();
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        return (a0) super.k(localDate);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.k(this);
        }
        if (!j$.time.a.p(this, oVar)) {
            throw new j$.time.temporal.r(j$.time.d.a("Unsupported field: ", oVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        int i = z.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.l(oVar);
        }
        if (i != 4) {
            return y.c.r(aVar);
        }
        j$.time.temporal.s sVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.e(1L, G() <= 0 ? (-sVar.a) + 1912 : sVar.d - 1911);
    }

    @Override // j$.time.chrono.d
    public final k q() {
        return G() >= 1 ? b0.ROC : b0.BEFORE_ROC;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: s */
    public final b u(long j, j$.time.temporal.q qVar) {
        return (a0) super.u(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal u(long j, ChronoUnit chronoUnit) {
        return (a0) super.u(j, chronoUnit);
    }

    @Override // j$.time.chrono.d
    public final b w(long j) {
        return I(this.a.plusDays(j));
    }

    @Override // j$.time.chrono.d
    public final b x(long j) {
        return I(this.a.M(j));
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.l(this);
        }
        int i = z.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i == 4) {
            int G = G();
            if (G < 1) {
                G = 1 - G;
            }
            return G;
        }
        if (i == 5) {
            return ((G() * 12) + this.a.b) - 1;
        }
        if (i == 6) {
            return G();
        }
        if (i != 7) {
            return this.a.y(oVar);
        }
        return G() < 1 ? 0 : 1;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long z() {
        return this.a.z();
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.q qVar) {
        return (a0) super.d(j, qVar);
    }
}
