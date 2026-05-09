package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class i implements Temporal, j$.time.temporal.n, Comparable, Serializable {
    public static final i e;
    public static final i f;
    public static final i g;
    private static final i[] h = new i[24];
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte a;
    private final byte b;
    private final byte c;
    private final int d;

    static {
        int i = 0;
        while (true) {
            i[] iVarArr = h;
            if (i < iVarArr.length) {
                iVarArr[i] = new i(i, 0, 0, 0);
                i++;
            } else {
                i iVar = iVarArr[0];
                g = iVar;
                i iVar2 = iVarArr[12];
                e = iVar;
                f = new i(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static i N(int i) {
        j$.time.temporal.a.HOUR_OF_DAY.G(i);
        return h[i];
    }

    public static i P(long j) {
        j$.time.temporal.a.SECOND_OF_DAY.G(j);
        int i = (int) (j / 3600);
        long j2 = j - (i * 3600);
        return H(i, (int) (j2 / 60), (int) (j2 - (r0 * 60)), 0);
    }

    public static i O(long j) {
        j$.time.temporal.a.NANO_OF_DAY.G(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return H(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    public static i I(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        i iVar = (i) temporal.v(j$.time.temporal.l.g());
        if (iVar != null) {
            return iVar;
        }
        throw new c("Unable to obtain LocalTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName());
    }

    private static i H(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return h[i];
        }
        return new i(i, i2, i3, i4);
    }

    private i(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).H();
        }
        return pVar != null && pVar.n(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final int l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return J(pVar);
        }
        return j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final long r(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.NANO_OF_DAY) {
                return W();
            }
            if (pVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return W() / 1000;
            }
            return J(pVar);
        }
        return pVar.l(this);
    }

    private int J(j$.time.temporal.p pVar) {
        int i = h.a[((j$.time.temporal.a) pVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new j$.time.temporal.t("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / MediaDataController.MAX_STYLE_RUNS_COUNT;
            case 4:
                throw new j$.time.temporal.t("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / MediaController.VIDEO_BITRATE_480;
            case 6:
                return (int) (W() / 1000000);
            case 7:
                return this.c;
            case 8:
                return X();
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
                throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
        }
    }

    public final int K() {
        return this.a;
    }

    public final int M() {
        return this.c;
    }

    public final int L() {
        return this.d;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        localDate.getClass();
        return (i) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final i d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (i) pVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.G(j);
        int i = h.a[aVar.ordinal()];
        byte b = this.b;
        byte b2 = this.c;
        int i2 = this.d;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return Z((int) j);
            case 2:
                return O(j);
            case 3:
                return Z(((int) j) * MediaDataController.MAX_STYLE_RUNS_COUNT);
            case 4:
                return O(j * 1000);
            case 5:
                return Z(((int) j) * MediaController.VIDEO_BITRATE_480);
            case 6:
                return O(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b2 == i3) {
                    return this;
                }
                j$.time.temporal.a.SECOND_OF_MINUTE.G(i3);
                return H(b3, b, i3, i2);
            case 8:
                return U(j - X());
            case 9:
                int i4 = (int) j;
                if (b == i4) {
                    return this;
                }
                j$.time.temporal.a.MINUTE_OF_HOUR.G(i4);
                return H(b3, i4, b2, i2);
            case 10:
                return S(j - ((b3 * 60) + b));
            case 11:
                return R(j - (b3 % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return R(j - (b3 % 12));
            case 13:
                int i5 = (int) j;
                if (b3 == i5) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.G(i5);
                return H(i5, b, b2, i2);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 == i6) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.G(i6);
                return H(i6, b, b2, i2);
            case 15:
                return R((j - (b3 / 12)) * 12);
            default:
                throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
        }
    }

    public final i Z(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.G(i);
        return H(this.a, this.b, this.c, i);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final i e(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof ChronoUnit) {
            switch (h.b[((ChronoUnit) sVar).ordinal()]) {
                case 1:
                    return T(j);
                case 2:
                    return T((j % 86400000000L) * 1000);
                case 3:
                    return T((j % 86400000) * 1000000);
                case 4:
                    return U(j);
                case 5:
                    return S(j);
                case 6:
                    return R(j);
                case 7:
                    return R((j % 2) * 12);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return (i) sVar.k(this, j);
    }

    public final i R(long j) {
        if (j == 0) {
            return this;
        }
        return H(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final i S(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.a * 60) + this.b;
        int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
        return i == i2 ? this : H(i2 / 60, i2 % 60, this.c, this.d);
    }

    public final i U(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.b * 60) + (this.a * 3600) + this.c;
        int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
        return i == i2 ? this : H(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
    }

    public final i T(long j) {
        if (j == 0) {
            return this;
        }
        long W = W();
        long j2 = (((j % 86400000000000L) + W) + 86400000000000L) % 86400000000000L;
        return W == j2 ? this : H((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final Object v(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e() || rVar == j$.time.temporal.l.k() || rVar == j$.time.temporal.l.j() || rVar == j$.time.temporal.l.h()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.g()) {
            return this;
        }
        if (rVar == j$.time.temporal.l.f()) {
            return null;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return ChronoUnit.NANOS;
        }
        return rVar.a(this);
    }

    @Override // j$.time.temporal.n
    public final Temporal x(Temporal temporal) {
        return temporal.d(W(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, j$.time.temporal.s sVar) {
        i I = I(temporal);
        if (sVar instanceof ChronoUnit) {
            long W = I.W() - W();
            switch (h.b[((ChronoUnit) sVar).ordinal()]) {
                case 1:
                    return W;
                case 2:
                    return W / 1000;
                case 3:
                    return W / 1000000;
                case 4:
                    return W / 1000000000;
                case 5:
                    return W / 60000000000L;
                case 6:
                    return W / 3600000000000L;
                case 7:
                    return W / 43200000000000L;
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return sVar.between(this, I);
    }

    public final int X() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final long W() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    @Override // java.lang.Comparable
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        int compare = Integer.compare(this.a, iVar.a);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Integer.compare(this.b, iVar.b);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Integer.compare(this.c, iVar.c);
        return compare3 == 0 ? Integer.compare(this.d, iVar.d) : compare3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.b == iVar.b && this.c == iVar.c && this.d == iVar.d;
    }

    public final int hashCode() {
        long W = W();
        return (int) (W ^ (W >>> 32));
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

    final void a0(DataOutput dataOutput) {
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
    static i V(ObjectInput objectInput) {
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
            j$.time.temporal.a.HOUR_OF_DAY.G(readByte);
            j$.time.temporal.a.MINUTE_OF_HOUR.G(b);
            j$.time.temporal.a.SECOND_OF_MINUTE.G(i);
            j$.time.temporal.a.NANO_OF_SECOND.G(i2);
            return H(readByte, b, i, i2);
        }
        readByte = ~readByte;
        i = 0;
        i2 = 0;
        j$.time.temporal.a.HOUR_OF_DAY.G(readByte);
        j$.time.temporal.a.MINUTE_OF_HOUR.G(b);
        j$.time.temporal.a.SECOND_OF_MINUTE.G(i);
        j$.time.temporal.a.NANO_OF_SECOND.G(i2);
        return H(readByte, b, i, i2);
    }
}
