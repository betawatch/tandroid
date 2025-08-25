package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.p, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    private final long a;
    private final int b;

    public static Instant now() {
        a.b.getClass();
        return F(System.currentTimeMillis());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int compare = Long.compare(this.a, instant2.a);
        return compare != 0 ? compare : this.b - instant2.b;
    }

    static {
        G(-31557014167219200L, 0L);
        G(31556889864403199L, 999999999L);
    }

    public static Instant G(long j, long j2) {
        return B(j$.com.android.tools.r8.a.f(j, j$.com.android.tools.r8.a.k(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.j(j2, 1000000000L));
    }

    public static Instant F(long j) {
        long j2 = MediaDataController.MAX_STYLE_RUNS_COUNT;
        return B(j$.com.android.tools.r8.a.k(j, j2), ((int) j$.com.android.tools.r8.a.j(j, j2)) * MediaController.VIDEO_BITRATE_480);
    }

    public static Instant C(j$.time.temporal.o oVar) {
        if (oVar instanceof Instant) {
            return (Instant) oVar;
        }
        Objects.requireNonNull(oVar, "temporal");
        try {
            return G(oVar.r(j$.time.temporal.a.INSTANT_SECONDS), oVar.j(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (c e) {
            throw new c("Unable to obtain Instant from TemporalAccessor: " + oVar + " of type " + oVar.getClass().getName(), e);
        }
    }

    private static Instant B(long j, int i) {
        if ((i | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    private Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.NANO_OF_SECOND || rVar == j$.time.temporal.a.MICRO_OF_SECOND || rVar == j$.time.temporal.a.MILLI_OF_SECOND : rVar != null && rVar.l(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.d(this, rVar).a(rVar.j(this), rVar);
        }
        int i = f.a[((j$.time.temporal.a) rVar).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        if (i == 3) {
            return i2 / MediaController.VIDEO_BITRATE_480;
        }
        if (i == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.v(this.a);
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        int i;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.j(this);
        }
        int i2 = f.a[((j$.time.temporal.a) rVar).ordinal()];
        int i3 = this.b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / MediaDataController.MAX_STYLE_RUNS_COUNT;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
            }
            i = i3 / MediaController.VIDEO_BITRATE_480;
        }
        return i;
    }

    public final long D() {
        return this.a;
    }

    public final int E() {
        return this.b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(LocalDate localDate) {
        localDate.getClass();
        return (Instant) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (Instant) rVar.m(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.B(j);
        int i = f.a[aVar.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i != 1) {
            if (i == 2) {
                int i3 = ((int) j) * MediaDataController.MAX_STYLE_RUNS_COUNT;
                if (i3 != i2) {
                    return B(j2, i3);
                }
            } else if (i == 3) {
                int i4 = ((int) j) * MediaController.VIDEO_BITRATE_480;
                if (i4 != i2) {
                    return B(j2, i4);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
                }
                if (j != j2) {
                    return B(j, i2);
                }
            }
        } else if (j != i2) {
            return B(j2, (int) j);
        }
        return this;
    }

    @Override // j$.time.temporal.m
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final Instant e(long j, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (Instant) uVar.i(this, j);
        }
        switch (f.b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return H(0L, j);
            case 2:
                return H(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return H(j / 1000, (j % 1000) * 1000000);
            case 4:
                return H(j, 0L);
            case 5:
                return H(j$.com.android.tools.r8.a.l(j, 60), 0L);
            case 6:
                return H(j$.com.android.tools.r8.a.l(j, 3600), 0L);
            case 7:
                return H(j$.com.android.tools.r8.a.l(j, 43200), 0L);
            case 8:
                return H(j$.com.android.tools.r8.a.l(j, 86400), 0L);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    private Instant H(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return G(j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.f(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        if (tVar == j$.time.temporal.n.e() || tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.f() || tVar == j$.time.temporal.n.g()) {
            return null;
        }
        return tVar.a(this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return mVar.d(this.a, j$.time.temporal.a.INSTANT_SECONDS).d(this.b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.C(this, zoneOffset);
    }

    public long toEpochMilli() {
        int i = this.b;
        long j = this.a;
        return (j >= 0 || i <= 0) ? j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j, MediaDataController.MAX_STYLE_RUNS_COUNT), i / MediaController.VIDEO_BITRATE_480) : j$.com.android.tools.r8.a.f(j$.com.android.tools.r8.a.l(j + 1, MediaDataController.MAX_STYLE_RUNS_COUNT), (i / MediaController.VIDEO_BITRATE_480) - MediaDataController.MAX_STYLE_RUNS_COUNT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.a == instant.a && this.b == instant.b;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.e.a(this);
    }

    private Object writeReplace() {
        return new q((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void J(DataOutput dataOutput) {
        dataOutput.writeLong(this.a);
        dataOutput.writeInt(this.b);
    }
}
