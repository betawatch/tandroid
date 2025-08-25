package j$.time;

import j$.time.format.x;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class s implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    private final int a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((s) obj).a;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.m(j$.time.temporal.a.YEAR, 4, 10, x.EXCEEDS_PAD);
        pVar.w(Locale.getDefault());
    }

    public static s B(int i) {
        j$.time.temporal.a.YEAR.B(i);
        return new s(i);
    }

    private s(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA : rVar != null && rVar.l(this);
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
        int i = r.a[((j$.time.temporal.a) rVar).ordinal()];
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
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(LocalDate localDate) {
        localDate.getClass();
        return (s) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final s d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (s) rVar.m(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.B(j);
        int i = r.a[aVar.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return B((int) j);
        }
        if (i == 2) {
            return B((int) j);
        }
        if (i == 3) {
            return r(j$.time.temporal.a.ERA) == j ? this : B(1 - i2);
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.m
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final s e(long j, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (s) uVar.i(this, j);
        }
        int i = r.b[((j$.time.temporal.b) uVar).ordinal()];
        if (i == 1) {
            return D(j);
        }
        if (i == 2) {
            return D(j$.com.android.tools.r8.a.l(j, 10));
        }
        if (i == 3) {
            return D(j$.com.android.tools.r8.a.l(j, 100));
        }
        if (i == 4) {
            return D(j$.com.android.tools.r8.a.l(j, MediaDataController.MAX_STYLE_RUNS_COUNT));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return d(j$.com.android.tools.r8.a.f(r(aVar), j), aVar);
        }
        throw new j$.time.temporal.v("Unsupported unit: " + uVar);
    }

    public final s D(long j) {
        return j == 0 ? this : B(j$.time.temporal.a.YEAR.v(this.a + j));
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
            return j$.time.temporal.b.YEARS;
        }
        return j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        if (!((j$.time.chrono.a) j$.time.chrono.h.p(mVar)).equals(j$.time.chrono.s.d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return mVar.d(this.a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.a == ((s) obj).a;
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
        return new q((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void F(DataOutput dataOutput) {
        dataOutput.writeInt(this.a);
    }
}
