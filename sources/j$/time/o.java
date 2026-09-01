package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final h a;
    public final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        if (this.b.equals(oVar.b)) {
            return this.a.compareTo(oVar.a);
        }
        int compare = Long.compare(H(), oVar.H());
        return compare == 0 ? this.a.compareTo(oVar.a) : compare;
    }

    static {
        h hVar = h.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        hVar.getClass();
        new o(hVar, zoneOffset);
        h hVar2 = h.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        hVar2.getClass();
        new o(hVar2, zoneOffset2);
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        o oVar;
        if (temporal instanceof o) {
            oVar = (o) temporal;
        } else {
            try {
                oVar = new o(h.I(temporal), ZoneOffset.L(temporal));
            } catch (b e6) {
                throw new b("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e6);
            }
        }
        if (qVar instanceof ChronoUnit) {
            long H = oVar.H() - H();
            switch (n.a[((ChronoUnit) qVar).ordinal()]) {
                case 1:
                    return H;
                case 2:
                    return H / 1000;
                case 3:
                    return H / 1000000;
                case 4:
                    return H / 1000000000;
                case 5:
                    return H / 60000000000L;
                case 6:
                    return H / 3600000000000L;
                case 7:
                    return H / 43200000000000L;
                default:
                    throw new j$.time.temporal.r("Unsupported unit: " + qVar);
            }
        }
        return qVar.between(this, oVar);
    }

    public o(h hVar, ZoneOffset zoneOffset) {
        this.a = (h) Objects.requireNonNull(hVar, "time");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public final o I(h hVar, ZoneOffset zoneOffset) {
        return (this.a == hVar && this.b.equals(zoneOffset)) ? this : new o(hVar, zoneOffset);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).y() || oVar == j$.time.temporal.a.OFFSET_SECONDS : oVar != null && oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar != j$.time.temporal.a.OFFSET_SECONDS) {
                h hVar = this.a;
                hVar.getClass();
                return j$.time.temporal.p.d(hVar, oVar);
            }
            return ((j$.time.temporal.a) oVar).b;
        }
        return oVar.k(this);
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.b.getTotalSeconds();
            }
            return this.a.y(oVar);
        }
        return oVar.m(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        localDate.getClass();
        return (o) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.OFFSET_SECONDS) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
                return I(this.a, ZoneOffset.O(aVar.b.a(j10, aVar)));
            }
            return I(this.a.c(j10, oVar), this.b);
        }
        return (o) oVar.q(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final o d(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof ChronoUnit) {
            return I(this.a.d(j10, qVar), this.b);
        }
        return (o) qVar.j(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal w(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object m(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.d || aVar == j$.time.temporal.p.e) {
            return this.b;
        }
        if (((aVar == j$.time.temporal.p.a) || (aVar == j$.time.temporal.p.b)) || aVar == j$.time.temporal.p.f) {
            return null;
        }
        if (aVar == j$.time.temporal.p.g) {
            return this.a;
        }
        if (aVar == j$.time.temporal.p.c) {
            return ChronoUnit.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal q(Temporal temporal) {
        return temporal.c(this.a.R(), j$.time.temporal.a.NANO_OF_DAY).c(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final long H() {
        return this.a.R() - (this.b.getTotalSeconds() * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.a.equals(oVar.a) && this.b.equals(oVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }

    private Object writeReplace() {
        return new p((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
