package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class j implements Temporal, j$.time.temporal.m, Comparable, Serializable {
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j[] h = new j[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            j[] jVarArr = h;
            if (i >= 24) {
                j jVar = jVarArr[0];
                g = jVar;
                e = jVar;
                f = new j(23, 59, 59, 999999999);
                return;
            }
            jVarArr[i] = new j(i, 0, 0, 0);
            i++;
        }
    }

    public j(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    public static j J(DataInput dataInput) {
        int readInt;
        int i;
        int readByte = dataInput.readByte();
        byte b = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i = 0;
            readInt = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                ?? r7 = ~readByte2;
                readInt = 0;
                b = r7;
                i = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                    readInt = 0;
                    b = readByte2;
                } else {
                    readInt = dataInput.readInt();
                    b = readByte2;
                    i = readByte3;
                }
            }
        }
        j$.time.temporal.a.HOUR_OF_DAY.o(readByte);
        j$.time.temporal.a.MINUTE_OF_HOUR.o(b);
        j$.time.temporal.a.SECOND_OF_MINUTE.o(i);
        j$.time.temporal.a.NANO_OF_SECOND.o(readInt);
        return q(readByte, b, i, readInt);
    }

    public static j q(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? h[i] : new j(i, i2, i3, i4);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static j v(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        j jVar = (j) temporal.r(j$.time.temporal.p.g);
        if (jVar != null) {
            return jVar;
        }
        g.f("Unable to obtain LocalTime from TemporalAccessor: ", temporal, temporal.getClass().getName());
        return null;
    }

    private Object writeReplace() {
        return new r((byte) 4, this);
    }

    public static j x(long j) {
        j$.time.temporal.a.NANO_OF_DAY.o(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return q(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final j d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (j) qVar.j(this, j);
        }
        switch (i.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return H(j);
            case 2:
                return H((j % 86400000000L) * 1000);
            case 3:
                return H((j % 86400000) * 1000000);
            case 4:
                return I(j);
            case 5:
                return G(j);
            case 6:
                return F(j);
            case 7:
                return F((j % 2) * 12);
            default:
                g.b(qVar, "Unsupported unit: ");
                return null;
        }
    }

    public final j F(long j) {
        return j == 0 ? this : q(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final j G(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return q(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final j H(long j) {
        if (j != 0) {
            long K = K();
            long j2 = (((j % 86400000000000L) + K) + 86400000000000L) % 86400000000000L;
            if (K != j2) {
                return q((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final j I(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return q(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final long K() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    public final int L() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final j c(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (j) oVar.n(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.o(j);
        switch (i.a[aVar.ordinal()]) {
            case 1:
                return N((int) j);
            case 2:
                return x(j);
            case 3:
                return N(((int) j) * 1000);
            case 4:
                return x(j * 1000);
            case 5:
                return N(((int) j) * 1000000);
            case 6:
                return x(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.c != i) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.o(i);
                    return q(this.a, this.b, i, this.d);
                }
                return this;
            case 8:
                return I(j - L());
            case 9:
                int i2 = (int) j;
                if (this.b != i2) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.o(i2);
                    return q(this.a, i2, this.c, this.d);
                }
                return this;
            case 10:
                return G(j - ((this.a * 60) + this.b));
            case 11:
                return F(j - (this.a % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return F(j - (this.a % 12));
            case 13:
                int i3 = (int) j;
                if (this.a != i3) {
                    j$.time.temporal.a.HOUR_OF_DAY.o(i3);
                    return q(i3, this.b, this.c, this.d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.a != i4) {
                    j$.time.temporal.a.HOUR_OF_DAY.o(i4);
                    return q(i4, this.b, this.c, this.d);
                }
                return this;
            case 15:
                return F((j - (this.a / 12)) * 12);
            default:
                throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
        }
    }

    public final j N(int i) {
        if (this.d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.o(i);
        return q(this.a, this.b, this.c, i);
    }

    public final void O(DataOutput dataOutput) {
        if (this.d != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(this.c);
            dataOutput.writeInt(this.d);
            return;
        }
        if (this.c != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
            return;
        }
        byte b = this.b;
        byte b2 = this.a;
        if (b == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~this.b);
        }
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).q() : oVar != null && oVar.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.a == jVar.a && this.b == jVar.b && this.c == jVar.c && this.d == jVar.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        j v = v(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, v);
        }
        long K = v.K() - K();
        switch (i.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return K;
            case 2:
                return K / 1000;
            case 3:
                return K / 1000000;
            case 4:
                return K / 1000000000;
            case 5:
                return K / 60000000000L;
            case 6:
                return K / 3600000000000L;
            case 7:
                return K / 43200000000000L;
            default:
                g.b(qVar, "Unsupported unit: ");
                return 0L;
        }
    }

    public final int hashCode() {
        long K = K();
        return (int) (K ^ (K >>> 32));
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? w(oVar) : j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        localDate.getClass();
        return (j) a.a(localDate, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal n(Temporal temporal) {
        return temporal.c(K(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // java.lang.Comparable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j jVar) {
        int compare = Integer.compare(this.a, jVar.a);
        return (compare == 0 && (compare = Integer.compare(this.b, jVar.b)) == 0 && (compare = Integer.compare(this.c, jVar.c)) == 0) ? Integer.compare(this.d, jVar.d) : compare;
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.b || aVar == j$.time.temporal.p.a || aVar == j$.time.temporal.p.e || aVar == j$.time.temporal.p.d) {
            return null;
        }
        if (aVar == j$.time.temporal.p.g) {
            return this;
        }
        if (aVar != j$.time.temporal.p.f) {
            return aVar == j$.time.temporal.p.c ? ChronoUnit.NANOS : aVar.a(this);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        int i = this.d;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
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

    public final int w(j$.time.temporal.o oVar) {
        switch (i.a[((j$.time.temporal.a) oVar).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new j$.time.temporal.r("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.d / 1000;
            case 4:
                throw new j$.time.temporal.r("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.d / 1000000;
            case 6:
                return (int) (K() / 1000000);
            case 7:
                return this.c;
            case 8:
                return L();
            case 9:
                return this.b;
            case 10:
                return (this.a * 60) + this.b;
            case 11:
                return this.a % 12;
            case 12:
                int i = this.a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.a;
            case 14:
                byte b = this.a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.a / 12;
            default:
                throw new j$.time.temporal.r(d.a("Unsupported field: ", oVar));
        }
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.NANO_OF_DAY ? K() : oVar == j$.time.temporal.a.MICRO_OF_DAY ? K() / 1000 : w(oVar) : oVar.l(this);
    }
}
