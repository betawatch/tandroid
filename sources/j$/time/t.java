package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class t implements Temporal, j$.time.temporal.n, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    private final int a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((t) obj).a;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.m(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.x.EXCEEDS_PAD);
        pVar.w(Locale.getDefault());
    }

    public static t I(int i) {
        j$.time.temporal.a.YEAR.I(i);
        return new t(i);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, j$.time.temporal.s sVar) {
        t I;
        if (temporal instanceof t) {
            I = (t) temporal;
        } else {
            Objects.requireNonNull(temporal, "temporal");
            try {
                if (!j$.time.chrono.s.d.equals(j$.time.chrono.h.q(temporal))) {
                    temporal = LocalDate.K(temporal);
                }
                I = I(temporal.l(j$.time.temporal.a.YEAR));
            } catch (c e) {
                throw new c("Unable to obtain Year from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (sVar instanceof ChronoUnit) {
            long j = I.a - this.a;
            int i = s.b[((ChronoUnit) sVar).ordinal()];
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
                return I.s(aVar) - s(aVar);
            }
            throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
        return sVar.between(this, I);
    }

    private t(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA : pVar != null && pVar.n(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.j(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final int l(j$.time.temporal.p pVar) {
        return o(pVar).a(s(pVar), pVar);
    }

    @Override // j$.time.temporal.m
    public final long s(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = s.a[((j$.time.temporal.a) pVar).ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return i2;
        }
        if (i == 3) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        localDate.getClass();
        return (t) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final t d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (t) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.I(j);
        int i = s.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return I((int) j);
        }
        if (i == 2) {
            return I((int) j);
        }
        if (i == 3) {
            return s(j$.time.temporal.a.ERA) == j ? this : I(1 - i2);
        }
        throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final t e(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof ChronoUnit)) {
            return (t) sVar.k(this, j);
        }
        int i = s.b[((ChronoUnit) sVar).ordinal()];
        if (i == 1) {
            return K(j);
        }
        if (i == 2) {
            return K(j$.com.android.tools.r8.a.l(j, 10));
        }
        if (i == 3) {
            return K(j$.com.android.tools.r8.a.l(j, 100));
        }
        if (i == 4) {
            return K(j$.com.android.tools.r8.a.l(j, MediaDataController.MAX_STYLE_RUNS_COUNT));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return d(j$.com.android.tools.r8.a.f(s(aVar), j), aVar);
        }
        throw new j$.time.temporal.t("Unsupported unit: " + sVar);
    }

    public final t K(long j) {
        return j == 0 ? this : I(j$.time.temporal.a.YEAR.z(this.a + j));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final Object w(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e()) {
            return j$.time.chrono.s.d;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.YEARS;
        }
        return j$.time.temporal.l.c(this, rVar);
    }

    @Override // j$.time.temporal.n
    public final Temporal z(Temporal temporal) {
        if (!((j$.time.chrono.a) j$.time.chrono.h.q(temporal)).equals(j$.time.chrono.s.d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return temporal.d(this.a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.a == ((t) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    private Object writeReplace() {
        return new r((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void M(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
    }
}
