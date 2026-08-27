package j$.time;

import j$.time.format.w;
import j$.time.format.x;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class r implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((r) obj).a;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.h(j$.time.temporal.a.YEAR, 4, 10, x.EXCEEDS_PAD);
        pVar.l(Locale.getDefault(), w.SMART, null);
    }

    public static r G(int i10) {
        j$.time.temporal.a.YEAR.w(i10);
        return new r(i10);
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        r G;
        if (temporal instanceof r) {
            G = (r) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.r.c.equals(j$.com.android.tools.r8.a.N(temporal))) {
                    temporal = LocalDate.I(temporal);
                }
                G = G(temporal.j(j$.time.temporal.a.YEAR));
            } catch (b e9) {
                throw new b("Unable to obtain Year from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e9);
            }
        }
        if (qVar instanceof ChronoUnit) {
            long j10 = G.a - this.a;
            int i10 = q.b[((ChronoUnit) qVar).ordinal()];
            if (i10 == 1) {
                return j10;
            }
            if (i10 == 2) {
                return j10 / 10;
            }
            if (i10 == 3) {
                return j10 / 100;
            }
            if (i10 == 4) {
                return j10 / 1000;
            }
            if (i10 == 5) {
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return G.y(aVar) - y(aVar);
            }
            throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
        return qVar.between(this, G);
    }

    public r(int i10) {
        this.a = i10;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.YEAR || oVar == j$.time.temporal.a.YEAR_OF_ERA || oVar == j$.time.temporal.a.ERA : oVar != null && oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.s.e(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        return l(oVar).a(y(oVar), oVar);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.m(this);
        }
        int i10 = q.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i10 == 1) {
            int i11 = this.a;
            if (i11 < 1) {
                i11 = 1 - i11;
            }
            return i11;
        }
        if (i10 == 2) {
            return this.a;
        }
        if (i10 == 3) {
            return this.a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        localDate.getClass();
        return (r) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final r c(long j10, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (r) oVar.q(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.w(j10);
        int i10 = q.a[aVar.ordinal()];
        if (i10 == 1) {
            if (this.a < 1) {
                j10 = 1 - j10;
            }
            return G((int) j10);
        }
        if (i10 == 2) {
            return G((int) j10);
        }
        if (i10 == 3) {
            return y(j$.time.temporal.a.ERA) == j10 ? this : G(1 - this.a);
        }
        throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final r d(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (r) qVar.j(this, j10);
        }
        int i10 = q.b[((ChronoUnit) qVar).ordinal()];
        if (i10 == 1) {
            return I(j10);
        }
        if (i10 == 2) {
            return I(j$.com.android.tools.r8.a.T(j10, 10));
        }
        if (i10 == 3) {
            return I(j$.com.android.tools.r8.a.T(j10, 100));
        }
        if (i10 == 4) {
            return I(j$.com.android.tools.r8.a.T(j10, MediaDataController.MAX_STYLE_RUNS_COUNT));
        }
        if (i10 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return c(j$.com.android.tools.r8.a.O(y(aVar), j10), aVar);
        }
        throw new j$.time.temporal.r("Unsupported unit: " + qVar);
    }

    public final r I(long j10) {
        if (j10 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return G(aVar.b.a(this.a + j10, aVar));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal w(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object m(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.b) {
            return j$.time.chrono.r.c;
        }
        if (aVar == j$.time.temporal.p.c) {
            return ChronoUnit.YEARS;
        }
        return j$.time.temporal.p.c(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal q(Temporal temporal) {
        if (!j$.com.android.tools.r8.a.N(temporal).equals(j$.time.chrono.r.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return temporal.c(this.a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.a == ((r) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    private Object writeReplace() {
        return new p((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
