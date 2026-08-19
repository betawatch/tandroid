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
        boolean equals = this.b.equals(oVar.b);
        h hVar = this.a;
        h hVar2 = oVar.a;
        if (equals) {
            return hVar.compareTo(hVar2);
        }
        int compare = Long.compare(H(), oVar.H());
        return compare == 0 ? hVar.compareTo(hVar2) : compare;
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
            } catch (b e) {
                throw new b("Unable to obtain OffsetTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
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
    public final boolean h(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).E() || oVar == j$.time.temporal.a.OFFSET_SECONDS : oVar != null && oVar.p(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar != j$.time.temporal.a.OFFSET_SECONDS) {
                h hVar = this.a;
                hVar.getClass();
                return j$.time.temporal.p.d(hVar, oVar);
            }
            return ((j$.time.temporal.a) oVar).b;
        }
        return oVar.r(this);
    }

    @Override // j$.time.temporal.l
    public final int o(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.b.getTotalSeconds();
            }
            return this.a.u(oVar);
        }
        return oVar.o(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(LocalDate localDate) {
        localDate.getClass();
        return (o) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal e(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            h hVar = this.a;
            if (oVar == aVar) {
                j$.time.temporal.a aVar2 = (j$.time.temporal.a) oVar;
                return I(hVar, ZoneOffset.O(aVar2.b.a(j, aVar2)));
            }
            return I(hVar.e(j, oVar), this.b);
        }
        return (o) oVar.q(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final o f(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof ChronoUnit) {
            return I(this.a.f(j, qVar), this.b);
        }
        return (o) qVar.l(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, chronoUnit).f(1L, chronoUnit) : f(-j, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
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
    public final Temporal x(Temporal temporal) {
        return temporal.e(this.a.R(), j$.time.temporal.a.NANO_OF_DAY).e(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
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
