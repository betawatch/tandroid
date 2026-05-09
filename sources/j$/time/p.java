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
public final class p implements Temporal, j$.time.temporal.n, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;
    private final i a;
    private final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        boolean equals = this.b.equals(pVar.b);
        i iVar = this.a;
        i iVar2 = pVar.a;
        if (equals) {
            return iVar.compareTo(iVar2);
        }
        int compare = Long.compare(J(), pVar.J());
        return compare == 0 ? iVar.compareTo(iVar2) : compare;
    }

    static {
        i iVar = i.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        iVar.getClass();
        G(iVar, zoneOffset);
        i iVar2 = i.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        iVar2.getClass();
        G(iVar2, zoneOffset2);
    }

    public static p G(i iVar, ZoneOffset zoneOffset) {
        return new p(iVar, zoneOffset);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, j$.time.temporal.s sVar) {
        p pVar;
        if (temporal instanceof p) {
            pVar = (p) temporal;
        } else {
            try {
                pVar = new p(i.I(temporal), ZoneOffset.M(temporal));
            } catch (c e) {
                throw new c("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (sVar instanceof ChronoUnit) {
            long J = pVar.J() - J();
            switch (o.a[((ChronoUnit) sVar).ordinal()]) {
                case 1:
                    return J;
                case 2:
                    return J / 1000;
                case 3:
                    return J / 1000000;
                case 4:
                    return J / 1000000000;
                case 5:
                    return J / 60000000000L;
                case 6:
                    return J / 3600000000000L;
                case 7:
                    return J / 43200000000000L;
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return sVar.between(this, pVar);
    }

    private p(i iVar, ZoneOffset zoneOffset) {
        this.a = (i) Objects.requireNonNull(iVar, "time");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    private p K(i iVar, ZoneOffset zoneOffset) {
        return (this.a == iVar && this.b.equals(zoneOffset)) ? this : new p(iVar, zoneOffset);
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) pVar).H() || pVar == j$.time.temporal.a.OFFSET_SECONDS : pVar != null && pVar.n(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) pVar).k();
            }
            i iVar = this.a;
            iVar.getClass();
            return j$.time.temporal.l.d(iVar, pVar);
        }
        return pVar.r(this);
    }

    @Override // j$.time.temporal.m
    public final int l(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final long r(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.b.getTotalSeconds();
            }
            return this.a.r(pVar);
        }
        return pVar.l(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        localDate.getClass();
        return (p) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            i iVar = this.a;
            if (pVar == aVar) {
                return K(iVar, ZoneOffset.P(((j$.time.temporal.a) pVar).x(j)));
            }
            return K(iVar.d(j, pVar), this.b);
        }
        return (p) pVar.o(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final p e(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof ChronoUnit) {
            return K(this.a.e(j, sVar), this.b);
        }
        return (p) sVar.k(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final Object v(j$.time.temporal.r rVar) {
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
    public final Temporal x(Temporal temporal) {
        return temporal.d(this.a.W(), j$.time.temporal.a.NANO_OF_DAY).d(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    private long J() {
        return this.a.W() - (this.b.getTotalSeconds() * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a.equals(pVar.a) && this.b.equals(pVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }

    private Object writeReplace() {
        return new q((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.a.a0(objectOutput);
        this.b.S(objectOutput);
    }

    static p I(ObjectInput objectInput) {
        return new p(i.V(objectInput), ZoneOffset.R(objectInput));
    }
}
