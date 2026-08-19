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
        int i = 0;
        while (true) {
            h[] hVarArr = h;
            if (i < hVarArr.length) {
                hVarArr[i] = new h(i, 0, 0, 0);
                i++;
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

    public static h K(long j) {
        j$.time.temporal.a.NANO_OF_DAY.x(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return H(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    public static h I(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        h hVar = (h) temporal.r(j$.time.temporal.p.g);
        if (hVar != null) {
            return hVar;
        }
        throw new b("Unable to obtain LocalTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName());
    }

    public static h H(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return h[i];
        }
        return new h(i, i2, i3, i4);
    }

    public h(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    @Override // j$.time.temporal.l
    public final boolean h(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).E();
        }
        return oVar != null && oVar.p(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final int o(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return J(oVar);
        }
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.NANO_OF_DAY) {
                return R();
            }
            if (oVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return R() / 1000;
            }
            return J(oVar);
        }
        return oVar.o(this);
    }

    public final int J(j$.time.temporal.o oVar) {
        int i = g.a[((j$.time.temporal.a) oVar).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new j$.time.temporal.r("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / MediaDataController.MAX_STYLE_RUNS_COUNT;
            case 4:
                throw new j$.time.temporal.r("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
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
            case 14:
                if (b2 == 0) {
                    return 24;
                }
            case 13:
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(LocalDate localDate) {
        localDate.getClass();
        return (h) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final h e(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (h) oVar.q(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.x(j);
        int i = g.a[aVar.ordinal()];
        byte b = this.b;
        byte b2 = this.c;
        int i2 = this.d;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return U((int) j);
            case 2:
                return K(j);
            case 3:
                return U(((int) j) * MediaDataController.MAX_STYLE_RUNS_COUNT);
            case 4:
                return K(j * 1000);
            case 5:
                return U(((int) j) * MediaController.VIDEO_BITRATE_480);
            case 6:
                return K(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b2 != i3) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.x(i3);
                    return H(b3, b, i3, i2);
                }
                return this;
            case 8:
                return P(j - S());
            case 9:
                int i4 = (int) j;
                if (b != i4) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.x(i4);
                    return H(b3, i4, b2, i2);
                }
                return this;
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
                if (b3 != i5) {
                    j$.time.temporal.a.HOUR_OF_DAY.x(i5);
                    return H(i5, b, b2, i2);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 != i6) {
                    j$.time.temporal.a.HOUR_OF_DAY.x(i6);
                    return H(i6, b, b2, i2);
                }
                return this;
            case 15:
                return M((j - (b3 / 12)) * 12);
            default:
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
    }

    public final h U(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.x(i);
        return H(this.a, this.b, this.c, i);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final h f(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof ChronoUnit) {
            switch (g.b[((ChronoUnit) qVar).ordinal()]) {
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
                    throw new j$.time.temporal.r("Unsupported unit: " + qVar);
            }
        }
        return (h) qVar.l(this, j);
    }

    public final h M(long j) {
        if (j == 0) {
            return this;
        }
        return H(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final h N(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return H(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final h P(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return H(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final h O(long j) {
        if (j != 0) {
            long R = R();
            long j2 = (((j % 86400000000000L) + R) + 86400000000000L) % 86400000000000L;
            if (R != j2) {
                return H((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, chronoUnit).f(1L, chronoUnit) : f(-j, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
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
    public final Temporal x(Temporal temporal) {
        return temporal.e(R(), j$.time.temporal.a.NANO_OF_DAY);
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
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
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
        return new p((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void V(DataOutput dataOutput) {
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
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    public static h Q(ObjectInput objectInput) {
        int readInt;
        int i;
        int readByte = objectInput.readByte();
        byte b = 0;
        if (readByte >= 0) {
            byte readByte2 = objectInput.readByte();
            if (readByte2 < 0) {
                ?? r6 = ~readByte2;
                readInt = 0;
                b = r6;
                i = 0;
            } else {
                byte readByte3 = objectInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                    b = readByte2;
                } else {
                    readInt = objectInput.readInt();
                    b = readByte2;
                    i = readByte3;
                }
            }
            j$.time.temporal.a.HOUR_OF_DAY.x(readByte);
            j$.time.temporal.a.MINUTE_OF_HOUR.x(b);
            j$.time.temporal.a.SECOND_OF_MINUTE.x(i);
            j$.time.temporal.a.NANO_OF_SECOND.x(readInt);
            return H(readByte, b, i, readInt);
        }
        readByte = ~readByte;
        i = 0;
        readInt = 0;
        j$.time.temporal.a.HOUR_OF_DAY.x(readByte);
        j$.time.temporal.a.MINUTE_OF_HOUR.x(b);
        j$.time.temporal.a.SECOND_OF_MINUTE.x(i);
        j$.time.temporal.a.NANO_OF_SECOND.x(readInt);
        return H(readByte, b, i, readInt);
    }
}
