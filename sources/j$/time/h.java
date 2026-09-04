package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class h implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h[] h = new h[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i10 = 0;
        while (true) {
            h[] hVarArr = h;
            if (i10 < hVarArr.length) {
                hVarArr[i10] = new h(i10, 0, 0, 0);
                i10++;
            } else {
                h hVar = hVarArr[0];
                g = hVar;
                h hVar2 = hVarArr[12];
                e = hVar;
                f = new h(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static h K(long j3) {
        j$.time.temporal.a.NANO_OF_DAY.w(j3);
        int i10 = (int) (j3 / 3600000000000L);
        long j10 = j3 - (i10 * 3600000000000L);
        int i11 = (int) (j10 / 60000000000L);
        long j11 = j10 - (i11 * 60000000000L);
        int i12 = (int) (j11 / 1000000000);
        return H(i10, i11, i12, (int) (j11 - (i12 * 1000000000)));
    }

    public static h I(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        h hVar = (h) lVar.m(j$.time.temporal.p.g);
        if (hVar != null) {
            return hVar;
        }
        throw new b("Unable to obtain LocalTime from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
    }

    public static h H(int i10, int i11, int i12, int i13) {
        if ((i11 | i12 | i13) == 0) {
            return h[i10];
        }
        return new h(i10, i11, i12, i13);
    }

    public h(int i10, int i11, int i12, int i13) {
        this.a = (byte) i10;
        this.b = (byte) i11;
        this.c = (byte) i12;
        this.d = i13;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).y();
        }
        return oVar != null && oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return J(oVar);
        }
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.NANO_OF_DAY) {
                return R();
            }
            if (oVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return R() / 1000;
            }
            return J(oVar);
        }
        return oVar.m(this);
    }

    public final int J(j$.time.temporal.o oVar) {
        switch (g.a[((j$.time.temporal.a) oVar).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new j$.time.temporal.r("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.d / MediaDataController.MAX_STYLE_RUNS_COUNT;
            case 4:
                throw new j$.time.temporal.r("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.d / MediaController.VIDEO_BITRATE_480;
            case 6:
                return (int) (R() / 1000000);
            case 7:
                return this.c;
            case 8:
                return S();
            case 9:
                return this.b;
            case 10:
                return (this.a * 60) + this.b;
            case 11:
                return this.a % 12;
            case 12:
                int i10 = this.a % 12;
                if (i10 % 12 == 0) {
                    return 12;
                }
                return i10;
            case 13:
                return this.a;
            case 14:
                byte b10 = this.a;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return this.a / 12;
            default:
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        localDate.getClass();
        return (h) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final h c(long j3, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (h) oVar.q(this, j3);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.w(j3);
        switch (g.a[aVar.ordinal()]) {
            case 1:
                return U((int) j3);
            case 2:
                return K(j3);
            case 3:
                return U(((int) j3) * MediaDataController.MAX_STYLE_RUNS_COUNT);
            case 4:
                return K(j3 * 1000);
            case 5:
                return U(((int) j3) * MediaController.VIDEO_BITRATE_480);
            case 6:
                return K(j3 * 1000000);
            case 7:
                int i10 = (int) j3;
                if (this.c != i10) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.w(i10);
                    return H(this.a, this.b, i10, this.d);
                }
                return this;
            case 8:
                return P(j3 - S());
            case 9:
                int i11 = (int) j3;
                if (this.b != i11) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.w(i11);
                    return H(this.a, i11, this.c, this.d);
                }
                return this;
            case 10:
                return N(j3 - ((this.a * 60) + this.b));
            case 11:
                return M(j3 - (this.a % 12));
            case 12:
                if (j3 == 12) {
                    j3 = 0;
                }
                return M(j3 - (this.a % 12));
            case 13:
                int i12 = (int) j3;
                if (this.a != i12) {
                    j$.time.temporal.a.HOUR_OF_DAY.w(i12);
                    return H(i12, this.b, this.c, this.d);
                }
                return this;
            case 14:
                if (j3 == 24) {
                    j3 = 0;
                }
                int i13 = (int) j3;
                if (this.a != i13) {
                    j$.time.temporal.a.HOUR_OF_DAY.w(i13);
                    return H(i13, this.b, this.c, this.d);
                }
                return this;
            case 15:
                return M((j3 - (this.a / 12)) * 12);
            default:
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
    }

    public final h U(int i10) {
        if (this.d == i10) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.w(i10);
        return H(this.a, this.b, this.c, i10);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final h d(long j3, j$.time.temporal.q qVar) {
        if (qVar instanceof ChronoUnit) {
            switch (g.b[((ChronoUnit) qVar).ordinal()]) {
                case 1:
                    return O(j3);
                case 2:
                    return O((j3 % 86400000000L) * 1000);
                case 3:
                    return O((j3 % 86400000) * 1000000);
                case 4:
                    return P(j3);
                case 5:
                    return N(j3);
                case 6:
                    return M(j3);
                case 7:
                    return M((j3 % 2) * 12);
                default:
                    throw new j$.time.temporal.r("Unsupported unit: " + qVar);
            }
        }
        return (h) qVar.j(this, j3);
    }

    public final h M(long j3) {
        return j3 == 0 ? this : H(((((int) (j3 % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final h N(long j3) {
        if (j3 != 0) {
            int i10 = (this.a * 60) + this.b;
            int i11 = ((((int) (j3 % 1440)) + i10) + 1440) % 1440;
            if (i10 != i11) {
                return H(i11 / 60, i11 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final h P(long j3) {
        if (j3 != 0) {
            int i10 = (this.b * 60) + (this.a * 3600) + this.c;
            int i11 = ((((int) (j3 % 86400)) + i10) + 86400) % 86400;
            if (i10 != i11) {
                return H(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.d);
            }
        }
        return this;
    }

    public final h O(long j3) {
        if (j3 != 0) {
            long R = R();
            long j10 = (((j3 % 86400000000000L) + R) + 86400000000000L) % 86400000000000L;
            if (R != j10) {
                return H((int) (j10 / 3600000000000L), (int) ((j10 / 60000000000L) % 60), (int) ((j10 / 1000000000) % 60), (int) (j10 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal w(long j3, ChronoUnit chronoUnit) {
        return j3 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j3, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object m(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.b || aVar == j$.time.temporal.p.a || aVar == j$.time.temporal.p.e || aVar == j$.time.temporal.p.d) {
            return null;
        }
        if (aVar == j$.time.temporal.p.g) {
            return this;
        }
        if (aVar == j$.time.temporal.p.f) {
            return null;
        }
        if (aVar == j$.time.temporal.p.c) {
            return ChronoUnit.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal q(Temporal temporal) {
        return temporal.c(R(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        h I = I(temporal);
        if (qVar instanceof ChronoUnit) {
            long R = I.R() - R();
            switch (g.b[((ChronoUnit) qVar).ordinal()]) {
                case 1:
                    return R;
                case 2:
                    return R / 1000;
                case 3:
                    return R / 1000000;
                case 4:
                    return R / 1000000000;
                case 5:
                    return R / 60000000000L;
                case 6:
                    return R / 3600000000000L;
                case 7:
                    return R / 43200000000000L;
                default:
                    throw new j$.time.temporal.r("Unsupported unit: " + qVar);
            }
        }
        return qVar.between(this, I);
    }

    public final int S() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final long R() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    @Override // java.lang.Comparable
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h hVar) {
        int compare = Integer.compare(this.a, hVar.a);
        return (compare == 0 && (compare = Integer.compare(this.b, hVar.b)) == 0 && (compare = Integer.compare(this.c, hVar.c)) == 0) ? Integer.compare(this.d, hVar.d) : compare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.a == hVar.a && this.b == hVar.b && this.c == hVar.c && this.d == hVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long R = R();
        return (int) (R ^ (R >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.a;
        byte b11 = this.b;
        byte b12 = this.c;
        int i10 = this.d;
        sb2.append(b10 < 10 ? "0" : "");
        sb2.append((int) b10);
        sb2.append(b11 < 10 ? ":0" : ":");
        sb2.append((int) b11);
        if (b12 > 0 || i10 > 0) {
            sb2.append(b12 < 10 ? ":0" : ":");
            sb2.append((int) b12);
            if (i10 > 0) {
                sb2.append('.');
                if (i10 % MediaController.VIDEO_BITRATE_480 == 0) {
                    sb2.append(Integer.toString((i10 / MediaController.VIDEO_BITRATE_480) + MediaDataController.MAX_STYLE_RUNS_COUNT).substring(1));
                } else if (i10 % MediaDataController.MAX_STYLE_RUNS_COUNT == 0) {
                    sb2.append(Integer.toString((i10 / MediaDataController.MAX_STYLE_RUNS_COUNT) + MediaController.VIDEO_BITRATE_480).substring(1));
                } else {
                    sb2.append(Integer.toString(i10 + 1000000000).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new p((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void V(DataOutput dataOutput) {
        if (this.d == 0) {
            if (this.c == 0) {
                if (this.b == 0) {
                    dataOutput.writeByte(~this.a);
                    return;
                } else {
                    dataOutput.writeByte(this.a);
                    dataOutput.writeByte(~this.b);
                    return;
                }
            }
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
            return;
        }
        dataOutput.writeByte(this.a);
        dataOutput.writeByte(this.b);
        dataOutput.writeByte(this.c);
        dataOutput.writeInt(this.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    public static h Q(DataInput dataInput) {
        int readInt;
        int i10;
        int readByte = dataInput.readByte();
        byte b10 = 0;
        if (readByte >= 0) {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                ?? r62 = ~readByte2;
                readInt = 0;
                b10 = r62;
                i10 = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i10 = ~readByte3;
                    b10 = readByte2;
                } else {
                    readInt = dataInput.readInt();
                    b10 = readByte2;
                    i10 = readByte3;
                }
            }
            j$.time.temporal.a.HOUR_OF_DAY.w(readByte);
            j$.time.temporal.a.MINUTE_OF_HOUR.w(b10);
            j$.time.temporal.a.SECOND_OF_MINUTE.w(i10);
            j$.time.temporal.a.NANO_OF_SECOND.w(readInt);
            return H(readByte, b10, i10, readInt);
        }
        readByte = ~readByte;
        i10 = 0;
        readInt = 0;
        j$.time.temporal.a.HOUR_OF_DAY.w(readByte);
        j$.time.temporal.a.MINUTE_OF_HOUR.w(b10);
        j$.time.temporal.a.SECOND_OF_MINUTE.w(i10);
        j$.time.temporal.a.NANO_OF_SECOND.w(readInt);
        return H(readByte, b10, i10, readInt);
    }
}
