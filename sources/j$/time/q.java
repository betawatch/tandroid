package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class q implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final j a;
    public final ZoneOffset b;

    static {
        j jVar = j.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        jVar.getClass();
        new q(jVar, zoneOffset);
        j jVar2 = j.f;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        jVar2.getClass();
        new q(jVar2, zoneOffset2);
    }

    public q(j jVar, ZoneOffset zoneOffset) {
        this.a = (j) Objects.requireNonNull(jVar, "time");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 9, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (q) oVar.n(this, j);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
        j jVar = this.a;
        if (oVar != aVar) {
            return v(jVar.c(j, oVar), this.b);
        }
        j$.time.temporal.a aVar2 = (j$.time.temporal.a) oVar;
        return v(jVar, ZoneOffset.H(aVar2.b.a(j, aVar2)));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q qVar = (q) obj;
        if (this.b.equals(qVar.b)) {
            return this.a.compareTo(qVar.a);
        }
        int compare = Long.compare(q(), qVar.q());
        return compare == 0 ? this.a.compareTo(qVar.a) : compare;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).q() || oVar == j$.time.temporal.a.OFFSET_SECONDS : oVar != null && oVar.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.a.equals(qVar.a) && this.b.equals(qVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        q qVar2;
        if (temporal instanceof q) {
            qVar2 = (q) temporal;
        } else {
            try {
                qVar2 = new q(j.v(temporal), ZoneOffset.C(temporal));
            } catch (c e) {
                g.g("Unable to obtain OffsetTime from TemporalAccessor: ", temporal, temporal.getClass().getName(), e);
                return 0L;
            }
        }
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, qVar2);
        }
        long q = qVar2.q() - q();
        switch (p.a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return q;
            case 2:
                return q / 1000;
            case 3:
                return q / 1000000;
            case 4:
                return q / 1000000000;
            case 5:
                return q / 60000000000L;
            case 6:
                return q / 3600000000000L;
            case 7:
                return q / 43200000000000L;
            default:
                g.b(qVar, "Unsupported unit: ");
                return 0L;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        localDate.getClass();
        return (q) a.a(localDate, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.k(this);
        }
        if (oVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return ((j$.time.temporal.a) oVar).b;
        }
        j jVar = this.a;
        jVar.getClass();
        return j$.time.temporal.p.d(jVar, oVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal n(Temporal temporal) {
        return temporal.c(this.a.K(), j$.time.temporal.a.NANO_OF_DAY).c(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final q d(long j, j$.time.temporal.q qVar) {
        return qVar instanceof ChronoUnit ? v(this.a.d(j, qVar), this.b) : (q) qVar.j(this, j);
    }

    public final long q() {
        return this.a.K() - (this.b.getTotalSeconds() * 1000000000);
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.d || aVar == j$.time.temporal.p.e) {
            return this.b;
        }
        if (((aVar == j$.time.temporal.p.a) || (aVar == j$.time.temporal.p.b)) || aVar == j$.time.temporal.p.f) {
            return null;
        }
        return aVar == j$.time.temporal.p.g ? this.a : aVar == j$.time.temporal.p.c ? ChronoUnit.NANOS : aVar.a(this);
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal u(long j, ChronoUnit chronoUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = d(Long.MAX_VALUE, chronoUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.d(j2, chronoUnit);
    }

    public final q v(j jVar, ZoneOffset zoneOffset) {
        return (this.a == jVar && this.b.equals(zoneOffset)) ? this : new q(jVar, zoneOffset);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.OFFSET_SECONDS ? this.b.getTotalSeconds() : this.a.y(oVar) : oVar.l(this);
    }
}
