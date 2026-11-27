package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class t implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.x.EXCEEDS_PAD);
        pVar.l(Locale.getDefault(), j$.time.format.w.SMART, null);
    }

    public t(int i) {
        this.a = i;
    }

    public static t o(int i) {
        j$.time.temporal.a.YEAR.o(i);
        return new t(i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 11, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((t) obj).a;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.YEAR || oVar == j$.time.temporal.a.YEAR_OF_ERA || oVar == j$.time.temporal.a.ERA : oVar != null && oVar.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.a == ((t) obj).a;
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        t o;
        if (temporal instanceof t) {
            o = (t) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.q.c.equals(a.M(temporal))) {
                    temporal = LocalDate.v(temporal);
                }
                o = o(temporal.j(j$.time.temporal.a.YEAR));
            } catch (c e) {
                g.g("Unable to obtain Year from TemporalAccessor: ", temporal, temporal.getClass().getName(), e);
                return 0L;
            }
        }
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, o);
        }
        long j = o.a - this.a;
        int i = s.b[((ChronoUnit) qVar).ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j / 10;
        }
        if (i == 3) {
            return j / 100;
        }
        if (i == 4) {
            return j / 1000;
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return o.y(aVar) - y(aVar);
        }
        g.b(qVar, "Unsupported unit: ");
        return 0L;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        return l(oVar).a(y(oVar), oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        localDate.getClass();
        return (t) a.a(localDate, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.s.e(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal n(Temporal temporal) {
        if (!a.M(temporal).equals(j$.time.chrono.q.c)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return temporal.c(this.a, j$.time.temporal.a.YEAR);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final t d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (t) qVar.j(this, j);
        }
        int i = s.b[((ChronoUnit) qVar).ordinal()];
        if (i == 1) {
            return v(j);
        }
        if (i == 2) {
            return v(a.R(j, 10L));
        }
        if (i == 3) {
            return v(a.R(j, 100L));
        }
        if (i == 4) {
            return v(a.R(j, 1000L));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return c(a.N(y(aVar), j), aVar);
        }
        g.b(qVar, "Unsupported unit: ");
        return null;
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.p.b ? j$.time.chrono.q.c : aVar == j$.time.temporal.p.c ? ChronoUnit.YEARS : j$.time.temporal.p.c(this, aVar);
    }

    public final String toString() {
        return Integer.toString(this.a);
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

    public final t v(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return o(aVar.b.a(this.a + j, aVar));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final t c(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (t) oVar.n(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.o(j);
        int i = s.a[aVar.ordinal()];
        if (i == 1) {
            if (this.a < 1) {
                j = 1 - j;
            }
            return o((int) j);
        }
        if (i == 2) {
            return o((int) j);
        }
        if (i == 3) {
            return y(j$.time.temporal.a.ERA) == j ? this : o(1 - this.a);
        }
        throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.l(this);
        }
        int i = s.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i == 1) {
            int i2 = this.a;
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return this.a;
        }
        if (i == 3) {
            return this.a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
    }
}
