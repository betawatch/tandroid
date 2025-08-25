package j$.time;

import j$.time.format.x;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class YearMonth implements j$.time.temporal.m, j$.time.temporal.p, Comparable<YearMonth>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    private final int a;
    private final int b;

    @Override // java.lang.Comparable
    public final int compareTo(YearMonth yearMonth) {
        YearMonth yearMonth2 = yearMonth;
        int i = this.a - yearMonth2.a;
        return i == 0 ? this.b - yearMonth2.b : i;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.m(j$.time.temporal.a.YEAR, 4, 10, x.EXCEEDS_PAD);
        pVar.e('-');
        pVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.w(Locale.getDefault());
    }

    public static YearMonth of(int i, int i2) {
        j$.time.temporal.a.YEAR.B(i);
        j$.time.temporal.a.MONTH_OF_YEAR.B(i2);
        return new YearMonth(i, i2);
    }

    private YearMonth(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private YearMonth F(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new YearMonth(i, i2);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.PROLEPTIC_MONTH || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA : rVar != null && rVar.l(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        return m(rVar).a(r(rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.j(this);
        }
        int i = t.a[((j$.time.temporal.a) rVar).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return B();
        }
        int i2 = this.a;
        if (i == 3) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 4) {
            return i2;
        }
        if (i == 5) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    private long B() {
        return ((this.a * 12) + this.b) - 1;
    }

    public int lengthOfMonth() {
        l E = l.E(this.b);
        j$.time.chrono.s sVar = j$.time.chrono.s.d;
        long j = this.a;
        sVar.getClass();
        return E.C(j$.time.chrono.s.l(j));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(LocalDate localDate) {
        localDate.getClass();
        return (YearMonth) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final YearMonth d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (YearMonth) rVar.m(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.B(j);
        int i = t.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.B(i3);
            return F(i2, i3);
        }
        if (i == 2) {
            return D(j - B());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            j$.time.temporal.a.YEAR.B(i5);
            return F(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            j$.time.temporal.a.YEAR.B(i6);
            return F(i6, i4);
        }
        if (i != 5) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        if (r(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        j$.time.temporal.a.YEAR.B(i7);
        return F(i7, i4);
    }

    @Override // j$.time.temporal.m
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final YearMonth e(long j, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (YearMonth) uVar.i(this, j);
        }
        switch (t.b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return D(j);
            case 2:
                return E(j);
            case 3:
                return E(j$.com.android.tools.r8.a.l(j, 10));
            case 4:
                return E(j$.com.android.tools.r8.a.l(j, 100));
            case 5:
                return E(j$.com.android.tools.r8.a.l(j, MediaDataController.MAX_STYLE_RUNS_COUNT));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.f(r(aVar), j), aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public final YearMonth E(long j) {
        return j == 0 ? this : F(j$.time.temporal.a.YEAR.v(this.a + j), this.b);
    }

    public final YearMonth D(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        long j3 = 12;
        return F(j$.time.temporal.a.YEAR.v(j$.com.android.tools.r8.a.k(j2, j3)), ((int) j$.com.android.tools.r8.a.j(j2, j3)) + 1);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e()) {
            return j$.time.chrono.s.d;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.MONTHS;
        }
        return j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        if (!((j$.time.chrono.a) j$.time.chrono.h.p(mVar)).equals(j$.time.chrono.s.d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return mVar.d(B(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YearMonth)) {
            return false;
        }
        YearMonth yearMonth = (YearMonth) obj;
        return this.a == yearMonth.a && this.b == yearMonth.b;
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    public final String toString() {
        int i = this.a;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (abs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void H(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
        dataOutput.writeByte(this.b);
    }
}
