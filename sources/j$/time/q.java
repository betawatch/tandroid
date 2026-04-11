package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class q implements Temporal, j$.time.temporal.n, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final j a;
    private final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q qVar = (q) obj;
        boolean equals = this.b.equals(qVar.b);
        j jVar = this.a;
        j jVar2 = qVar.a;
        if (equals) {
            return jVar.compareTo(jVar2);
        }
        int compare = Long.compare(L(), qVar.L());
        return compare == 0 ? jVar.compareTo(jVar2) : compare;
    }

    static {
        j jVar = j.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        jVar.getClass();
        I(jVar, zoneOffset);
        j jVar2 = j.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        jVar2.getClass();
        I(jVar2, zoneOffset2);
    }

    public static q I(j jVar, ZoneOffset zoneOffset) {
        return new q(jVar, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, j$.time.temporal.s sVar) {
        q qVar;
        if (temporal instanceof q) {
            qVar = (q) temporal;
        } else {
            try {
                qVar = new q(j.K(temporal), ZoneOffset.O(temporal));
            } catch (c e) {
                throw new c("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (sVar instanceof ChronoUnit) {
            long L = qVar.L() - L();
            switch (p.a[((ChronoUnit) sVar).ordinal()]) {
                case 1:
                    return L;
                case 2:
                    return L / 1000;
                case 3:
                    return L / 1000000;
                case 4:
                    return L / 1000000000;
                case 5:
                    return L / 60000000000L;
                case 6:
                    return L / 3600000000000L;
                case 7:
                    return L / 43200000000000L;
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return sVar.between(this, qVar);
    }

    private q(j jVar, ZoneOffset zoneOffset) {
        this.a = (j) Objects.requireNonNull(jVar, "time");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    private q M(j jVar, ZoneOffset zoneOffset) {
        return (this.a == jVar && this.b.equals(zoneOffset)) ? this : new q(jVar, zoneOffset);
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).J() || pVar == j$.time.temporal.a.OFFSET_SECONDS : pVar != null && pVar.n(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) pVar).k();
            }
            j jVar = this.a;
            jVar.getClass();
            return j$.time.temporal.l.d(jVar, pVar);
        }
        return pVar.s(this);
    }

    @Override // j$.time.temporal.m
    public final int l(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final long s(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.b.getTotalSeconds();
            }
            return this.a.s(pVar);
        }
        return pVar.l(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        localDate.getClass();
        return (q) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            j jVar = this.a;
            if (pVar == aVar) {
                return M(jVar, ZoneOffset.R(((j$.time.temporal.a) pVar).z(j)));
            }
            return M(jVar.d(j, pVar), this.b);
        }
        return (q) pVar.o(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final q e(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof ChronoUnit) {
            return M(this.a.e(j, sVar), this.b);
        }
        return (q) sVar.k(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final Object w(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.h() || rVar == j$.time.temporal.l.j()) {
            return this.b;
        }
        if (((rVar == j$.time.temporal.l.k()) || (rVar == j$.time.temporal.l.e())) || rVar == j$.time.temporal.l.f()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.g()) {
            return this.a;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        return rVar.a(this);
    }

    @Override // j$.time.temporal.n
    public final Temporal z(Temporal temporal) {
        return temporal.d(this.a.Y(), j$.time.temporal.a.NANO_OF_DAY).d(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    private long L() {
        return this.a.Y() - (this.b.getTotalSeconds() * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a.equals(qVar.a) && this.b.equals(qVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    private Object writeReplace() {
        return new r((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.a.c0(objectOutput);
        this.b.U(objectOutput);
    }

    static q K(ObjectInput objectInput) {
        return new q(j.X(objectInput), ZoneOffset.T(objectInput));
    }
}
