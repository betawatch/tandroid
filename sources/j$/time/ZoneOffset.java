package j$.time;

import j$.time.temporal.Temporal;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.telegram.messenger.RichMessageLayout;

/* loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements j$.time.temporal.l, j$.time.temporal.m, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;
    public final int b;
    public final transient String c;
    public static final ConcurrentHashMap d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ConcurrentHashMap e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = O(0);
    public static final ZoneOffset f = O(-64800);
    public static final ZoneOffset g = O(64800);

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.b - this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZoneOffset M(String str) {
        int P;
        int i10;
        int i11;
        char charAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else if (length != 3) {
            if (length == 5) {
                P = P(str, 1, false);
                i10 = P(str, 3, false);
            } else if (length == 6) {
                P = P(str, 1, false);
                i10 = P(str, 4, true);
            } else {
                if (length == 7) {
                    P = P(str, 1, false);
                    i10 = P(str, 3, false);
                    i11 = P(str, 5, false);
                } else if (length == 9) {
                    P = P(str, 1, false);
                    i10 = P(str, 4, true);
                    i11 = P(str, 7, true);
                } else {
                    throw new b("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                charAt = str.charAt(0);
                if (charAt == '+' && charAt != '-') {
                    throw new b("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                }
                if (charAt == '-') {
                    return N(-P, -i10, -i11);
                }
                return N(P, i10, i11);
            }
            i11 = 0;
            charAt = str.charAt(0);
            if (charAt == '+') {
            }
            if (charAt == '-') {
            }
        }
        P = P(str, 1, false);
        i10 = 0;
        i11 = 0;
        charAt = str.charAt(0);
        if (charAt == '+') {
        }
        if (charAt == '-') {
        }
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        Objects.requireNonNull(this, "offset");
        return new ZoneRules(this);
    }

    public static int P(CharSequence charSequence, int i10, boolean z10) {
        if (z10) {
            String str = (String) charSequence;
            if (str.charAt(i10 - 1) != ':') {
                throw new b("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char charAt = str2.charAt(i10);
        char charAt2 = str2.charAt(i10 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new b("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    public static ZoneOffset L(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporal.m(j$.time.temporal.p.d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new b("Unable to obtain ZoneOffset from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName());
    }

    public static ZoneOffset N(int i10, int i11, int i12) {
        if (i10 < -18 || i10 > 18) {
            throw new b("Zone offset hours not in valid range: value " + i10 + " is not in the range -18 to 18");
        }
        if (i10 > 0) {
            if (i11 < 0 || i12 < 0) {
                throw new b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i10 < 0) {
            if (i11 > 0 || i12 > 0) {
                throw new b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i11 > 0 && i12 < 0) || (i11 < 0 && i12 > 0)) {
            throw new b("Zone offset minutes and seconds must have the same sign");
        }
        if (i11 < -59 || i11 > 59) {
            throw new b("Zone offset minutes not in valid range: value " + i11 + " is not in the range -59 to 59");
        }
        if (i12 < -59 || i12 > 59) {
            throw new b("Zone offset seconds not in valid range: value " + i12 + " is not in the range -59 to 59");
        }
        if (Math.abs(i10) == 18 && (i11 | i12) != 0) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        }
        return O((i11 * 60) + (i10 * 3600) + i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset O(int i10) {
        if (i10 < -64800 || i10 > 64800) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i10 % RichMessageLayout.PART_MAX_HEIGHT_DP == 0) {
            Integer valueOf = Integer.valueOf(i10);
            ConcurrentHashMap concurrentHashMap = d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i10));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
            e.putIfAbsent(zoneOffset2.c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i10);
    }

    public ZoneOffset(int i10) {
        String sb2;
        this.b = i10;
        if (i10 == 0) {
            sb2 = "Z";
        } else {
            int abs = Math.abs(i10);
            StringBuilder sb3 = new StringBuilder();
            int i11 = abs / 3600;
            int i12 = (abs / 60) % 60;
            sb3.append(i10 < 0 ? "-" : "+");
            sb3.append(i11 < 10 ? "0" : "");
            sb3.append(i11);
            sb3.append(i12 < 10 ? ":0" : ":");
            sb3.append(i12);
            int i13 = abs % 60;
            if (i13 != 0) {
                sb3.append(i13 < 10 ? ":0" : ":");
                sb3.append(i13);
            }
            sb2 = sb3.toString();
        }
        this.c = sb2;
    }

    public int getTotalSeconds() {
        return this.b;
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.c;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.OFFSET_SECONDS : oVar != null && oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (c.b(oVar)) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
        return j$.time.temporal.p.d(this, oVar).a(y(oVar), oVar);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
        return oVar.m(this);
    }

    @Override // j$.time.temporal.l
    public final Object m(j$.time.format.a aVar) {
        return (aVar == j$.time.temporal.p.d || aVar == j$.time.temporal.p.e) ? this : j$.time.temporal.p.c(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal q(Temporal temporal) {
        return temporal.c(this.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.b == ((ZoneOffset) obj).b;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.b;
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.c;
    }

    private Object writeReplace() {
        return new p((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    public final void K(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        R(dataOutput);
    }

    public final void R(DataOutput dataOutput) {
        int i10 = this.b;
        int i11 = i10 % RichMessageLayout.PART_MAX_HEIGHT_DP == 0 ? i10 / RichMessageLayout.PART_MAX_HEIGHT_DP : 127;
        dataOutput.writeByte(i11);
        if (i11 == 127) {
            dataOutput.writeInt(i10);
        }
    }

    public static ZoneOffset Q(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? O(dataInput.readInt()) : O(readByte * 900);
    }
}
