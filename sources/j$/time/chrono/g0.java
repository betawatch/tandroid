package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class g0 extends d {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient LocalDate a;

    public g0(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 8, this);
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
        return (g0) super.k(mVar);
    }

    public final int G() {
        return this.a.getYear() + 543;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r2 != 7) goto L20;
     */
    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g0 c(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (g0) super.c(j, oVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        if (y(aVar) == j) {
            return this;
        }
        int[] iArr = f0.a;
        int i = iArr[aVar.ordinal()];
        if (i != 4) {
            if (i == 5) {
                e0.c.r(aVar).b(j, aVar);
                long G = G() * 12;
                return I(this.a.M(j - ((G + r10.b) - 1)));
            }
            if (i != 6) {
            }
        }
        int a = e0.c.r(aVar).a(j, aVar);
        int i2 = iArr[aVar.ordinal()];
        if (i2 == 4) {
            LocalDate localDate = this.a;
            if (G() < 1) {
                a = 1 - a;
            }
            return I(localDate.R(a - 543));
        }
        if (i2 == 6) {
            return I(this.a.R(a - 543));
        }
        if (i2 == 7) {
            return I(this.a.R((-542) - G()));
        }
        return I(this.a.c(j, oVar));
    }

    public final g0 I(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new g0(localDate);
    }

    @Override // j$.time.chrono.b
    public final a a() {
        return e0.c;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.Temporal
    public final b d(long j, j$.time.temporal.q qVar) {
        return (g0) super.d(j, qVar);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            return this.a.equals(((g0) obj).a);
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        e0.c.getClass();
        return 146118545 ^ this.a.hashCode();
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        return (g0) super.k(localDate);
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
        int i = f0.a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.l(oVar);
        }
        if (i != 4) {
            return e0.c.r(aVar);
        }
        j$.time.temporal.s sVar = j$.time.temporal.a.YEAR.b;
        return j$.time.temporal.s.e(1L, G() <= 0 ? (-(sVar.a + 543)) + 1 : sVar.d + 543);
    }

    @Override // j$.time.chrono.d
    public final k q() {
        return G() >= 1 ? h0.BE : h0.BEFORE_BE;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    /* renamed from: s */
    public final b u(long j, j$.time.temporal.q qVar) {
        return (g0) super.u(j, qVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.Temporal
    public final Temporal u(long j, ChronoUnit chronoUnit) {
        return (g0) super.u(j, chronoUnit);
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
        int i = f0.a[((j$.time.temporal.a) oVar).ordinal()];
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
        return (g0) super.d(j, qVar);
    }
}
