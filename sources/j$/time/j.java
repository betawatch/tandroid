package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class j implements j$.time.temporal.m, j$.time.temporal.p, Comparable, Serializable {
    public static final j e;
    public static final j f;
    public static final j g;
    private static final j[] h = new j[24];
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;

    static {
        int i = 0;
        while (true) {
            j[] jVarArr = h;
            if (i < jVarArr.length) {
                jVarArr[i] = new j(i, 0, 0, 0);
                i++;
            } else {
                j jVar = jVarArr[0];
                g = jVar;
                j jVar2 = jVarArr[12];
                e = jVar;
                f = new j(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static j I(int i) {
        j$.time.temporal.a.HOUR_OF_DAY.B(i);
        return h[i];
    }

    public static j K(long j) {
        j$.time.temporal.a.SECOND_OF_DAY.B(j);
        int i = (int) (j / 3600);
        long j2 = j - (i * 3600);
        return C(i, (int) (j2 / 60), (int) (j2 - (r0 * 60)), 0);
    }

    public static j J(long j) {
        j$.time.temporal.a.NANO_OF_DAY.B(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return C(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    public static j D(j$.time.temporal.o oVar) {
        Objects.requireNonNull(oVar, "temporal");
        j jVar = (j) oVar.u(j$.time.temporal.n.g());
        if (jVar != null) {
            return jVar;
        }
        throw new c("Unable to obtain LocalTime from TemporalAccessor: " + oVar + " of type " + oVar.getClass().getName());
    }

    private static j C(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return h[i];
        }
        return new j(i, i2, i3, i4);
    }

    private j(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).C();
        }
        return rVar != null && rVar.l(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return E(rVar);
        }
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.NANO_OF_DAY) {
                return R();
            }
            if (rVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return R() / 1000;
            }
            return E(rVar);
        }
        return rVar.j(this);
    }

    private int E(j$.time.temporal.r rVar) {
        int i = i.a[((j$.time.temporal.a) rVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new j$.time.temporal.v("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / MediaDataController.MAX_STYLE_RUNS_COUNT;
            case 4:
                throw new j$.time.temporal.v("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / MediaController.VIDEO_BITRATE_480;
            case 6:
                return (int) (R() / 1000000);
            case 7:
                return this.c;
            case 8:
                return S();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 13:
                return b2;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
    }

    public final int F() {
        return this.a;
    }

    public final int H() {
        return this.c;
    }

    public final int G() {
        return this.d;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(LocalDate localDate) {
        localDate.getClass();
        return (j) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final j d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (j) rVar.m(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.B(j);
        int i = i.a[aVar.ordinal()];
        byte b = this.b;
        byte b2 = this.c;
        int i2 = this.d;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return U((int) j);
            case 2:
                return J(j);
            case 3:
                return U(((int) j) * MediaDataController.MAX_STYLE_RUNS_COUNT);
            case 4:
                return J(j * 1000);
            case 5:
                return U(((int) j) * MediaController.VIDEO_BITRATE_480);
            case 6:
                return J(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b2 == i3) {
                    return this;
                }
                j$.time.temporal.a.SECOND_OF_MINUTE.B(i3);
                return C(b3, b, i3, i2);
            case 8:
                return P(j - S());
            case 9:
                int i4 = (int) j;
                if (b == i4) {
                    return this;
                }
                j$.time.temporal.a.MINUTE_OF_HOUR.B(i4);
                return C(b3, i4, b2, i2);
            case 10:
                return N(j - ((b3 * 60) + b));
            case 11:
                return M(j - (b3 % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return M(j - (b3 % 12));
            case 13:
                int i5 = (int) j;
                if (b3 == i5) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.B(i5);
                return C(i5, b, b2, i2);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 == i6) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.B(i6);
                return C(i6, b, b2, i2);
            case 15:
                return M((j - (b3 / 12)) * 12);
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
    }

    public final j U(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.B(i);
        return C(this.a, this.b, this.c, i);
    }

    @Override // j$.time.temporal.m
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final j e(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (i.b[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return O(j);
                case 2:
                    return O((j % 86400000000L) * 1000);
                case 3:
                    return O((j % 86400000) * 1000000);
                case 4:
                    return P(j);
                case 5:
                    return N(j);
                case 6:
                    return M(j);
                case 7:
                    return M((j % 2) * 12);
                default:
                    throw new j$.time.temporal.v("Unsupported unit: " + uVar);
            }
        }
        return (j) uVar.i(this, j);
    }

    public final j M(long j) {
        if (j == 0) {
            return this;
        }
        return C(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final j N(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.a * 60) + this.b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : C(i2 / 60, i2 % 60, this.c, this.d);
    }

    public final j P(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.b * 60) + (this.a * 3600) + this.c;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i == i2 ? this : C(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
    }

    public final j O(long j) {
        if (j == 0) {
            return this;
        }
        long R = R();
        long j2 = (((j % 86400000000000L) + R) + 86400000000000L) % 86400000000000L;
        return R == j2 ? this : C((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e() || tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.g()) {
            return this;
        }
        if (tVar == j$.time.temporal.n.f()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.a(this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return mVar.d(R(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int S() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final long R() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    @Override // java.lang.Comparable
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j jVar) {
        int compare = Integer.compare(this.a, jVar.a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.b, jVar.b);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(this.c, jVar.c);
        return compare3 == 0 ? Integer.compare(this.d, jVar.d) : compare3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && this.b == jVar.b && this.c == jVar.c && this.d == jVar.d;
    }

    public final int hashCode() {
        long R = R();
        return (int) (R ^ (R >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % MediaController.VIDEO_BITRATE_480 == 0) {
                    sb.append(Integer.toString((i / MediaController.VIDEO_BITRATE_480) + MediaDataController.MAX_STYLE_RUNS_COUNT).substring(1));
                } else if (i % MediaDataController.MAX_STYLE_RUNS_COUNT == 0) {
                    sb.append(Integer.toString((i / MediaDataController.MAX_STYLE_RUNS_COUNT) + MediaController.VIDEO_BITRATE_480).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new q((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void V(DataOutput dataOutput) {
        byte b = this.c;
        byte b2 = this.a;
        byte b3 = this.b;
        int i = this.d;
        if (i != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b);
            dataOutput.writeInt(i);
            return;
        }
        if (b != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b);
        } else if (b3 == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~b3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    static j Q(ObjectInput objectInput) {
        int i;
        int i2;
        int readByte = objectInput.readByte();
        byte b = 0;
        if (readByte >= 0) {
            byte readByte2 = objectInput.readByte();
            if (readByte2 < 0) {
                ?? r7 = ~readByte2;
                i2 = 0;
                b = r7;
                i = 0;
            } else {
                byte readByte3 = objectInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                    b = readByte2;
                } else {
                    int readInt = objectInput.readInt();
                    i = readByte3;
                    i2 = readInt;
                    b = readByte2;
                }
            }
            j$.time.temporal.a.HOUR_OF_DAY.B(readByte);
            j$.time.temporal.a.MINUTE_OF_HOUR.B(b);
            j$.time.temporal.a.SECOND_OF_MINUTE.B(i);
            j$.time.temporal.a.NANO_OF_SECOND.B(i2);
            return C(readByte, b, i, i2);
        }
        readByte = ~readByte;
        i = 0;
        i2 = 0;
        j$.time.temporal.a.HOUR_OF_DAY.B(readByte);
        j$.time.temporal.a.MINUTE_OF_HOUR.B(b);
        j$.time.temporal.a.SECOND_OF_MINUTE.B(i);
        j$.time.temporal.a.NANO_OF_SECOND.B(i2);
        return C(readByte, b, i, i2);
    }
}
