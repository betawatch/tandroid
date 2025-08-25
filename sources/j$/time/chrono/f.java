package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneOffset;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
final class f implements ChronoLocalDateTime, j$.time.temporal.m, j$.time.temporal.p, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final transient b a;
    private final transient j$.time.j b;

    public final /* synthetic */ long G(ZoneOffset zoneOffset) {
        return h.n(this, zoneOffset);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object u(j$.time.temporal.t tVar) {
        return h.k(this, tVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: w */
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return h.c(this, chronoLocalDateTime);
    }

    static f C(b bVar, j$.time.j jVar) {
        return new f(bVar, jVar);
    }

    static f B(l lVar, j$.time.temporal.m mVar) {
        f fVar = (f) mVar;
        a aVar = (a) lVar;
        if (aVar.equals(fVar.a.a())) {
            return fVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + aVar.getId() + ", actual: " + fVar.a.a().getId());
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final l a() {
        return this.a.a();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.b bVar) {
        return B(this.a.a(), j$.time.temporal.n.b(this, j, bVar));
    }

    private f(b bVar, j$.time.j jVar) {
        Objects.requireNonNull(bVar, "date");
        Objects.requireNonNull(jVar, "time");
        this.a = bVar;
        this.b = jVar;
    }

    private f I(j$.time.temporal.m mVar, j$.time.j jVar) {
        b bVar = this.a;
        return (bVar == mVar && this.b == jVar) ? this : new f(d.B(bVar.a(), mVar), jVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final b c() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.j b() {
        return this.b;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar != null && rVar.l(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        return aVar.u() || aVar.C();
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (!((j$.time.temporal.a) rVar).C()) {
                return this.a.m(rVar);
            }
            j$.time.j jVar = this.b;
            jVar.getClass();
            return j$.time.temporal.n.d(jVar, rVar);
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).C() ? this.b.j(rVar) : this.a.j(rVar);
        }
        return m(rVar).a(r(rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).C() ? this.b.r(rVar) : this.a.r(rVar);
        }
        return rVar.j(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(LocalDate localDate) {
        if (localDate instanceof b) {
            return I(localDate, this.b);
        }
        l a = this.a.a();
        localDate.getClass();
        return B(a, (f) h.a(localDate, this));
    }

    @Override // j$.time.temporal.m
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final f d(long j, j$.time.temporal.r rVar) {
        boolean z = rVar instanceof j$.time.temporal.a;
        b bVar = this.a;
        if (z) {
            boolean C = ((j$.time.temporal.a) rVar).C();
            j$.time.j jVar = this.b;
            if (C) {
                return I(bVar, jVar.d(j, rVar));
            }
            return I(bVar.d(j, rVar), jVar);
        }
        return B(bVar.a(), rVar.m(this, j));
    }

    @Override // j$.time.temporal.m
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final f e(long j, j$.time.temporal.u uVar) {
        boolean z = uVar instanceof j$.time.temporal.b;
        b bVar = this.a;
        if (z) {
            int i = e.a[((j$.time.temporal.b) uVar).ordinal()];
            j$.time.j jVar = this.b;
            switch (i) {
                case 1:
                    return F(this.a, 0L, 0L, 0L, j);
                case 2:
                    f I = I(bVar.e(j / 86400000000L, (j$.time.temporal.u) j$.time.temporal.b.DAYS), jVar);
                    return I.F(I.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    f I2 = I(bVar.e(j / 86400000, (j$.time.temporal.u) j$.time.temporal.b.DAYS), jVar);
                    return I2.F(I2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return E(j);
                case 5:
                    return F(this.a, 0L, j, 0L, 0L);
                case 6:
                    return F(this.a, j, 0L, 0L, 0L);
                case 7:
                    f I3 = I(bVar.e(j / 256, (j$.time.temporal.u) j$.time.temporal.b.DAYS), jVar);
                    return I3.F(I3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return I(bVar.e(j, uVar), jVar);
            }
        }
        return B(bVar.a(), uVar.i(this, j));
    }

    final f E(long j) {
        return F(this.a, 0L, 0L, j, 0L);
    }

    private f F(b bVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.j jVar = this.b;
        if (j5 == 0) {
            return I(bVar, jVar);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long R = jVar.R();
        long j10 = j9 + R;
        long k = j$.com.android.tools.r8.a.k(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long j11 = j$.com.android.tools.r8.a.j(j10, 86400000000000L);
        if (j11 != R) {
            jVar = j$.time.j.J(j11);
        }
        return I(bVar.e(k, (j$.time.temporal.u) j$.time.temporal.b.DAYS), jVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime o(ZoneOffset zoneOffset) {
        return k.B(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return mVar.d(c().s(), j$.time.temporal.a.EPOCH_DAY).d(b().R(), j$.time.temporal.a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new E((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && h.c(this, (ChronoLocalDateTime) obj) == 0;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final Instant toInstant(ZoneOffset zoneOffset) {
        return Instant.G(G(zoneOffset), b().G());
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }
}
