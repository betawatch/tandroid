package j$.time;

import j$.time.temporal.Temporal;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.telegram.messenger.NotificationCenter;
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
        int i;
        int i2;
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
                i = P(str, 3, false);
            } else if (length == 6) {
                P = P(str, 1, false);
                i = P(str, 4, true);
            } else {
                if (length == 7) {
                    P = P(str, 1, false);
                    i = P(str, 3, false);
                    i2 = P(str, 5, false);
                } else if (length == 9) {
                    P = P(str, 1, false);
                    i = P(str, 4, true);
                    i2 = P(str, 7, true);
                } else {
                    throw new b("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                charAt = str.charAt(0);
                if (charAt == '+' && charAt != '-') {
                    throw new b("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                }
                if (charAt == '-') {
                    return N(-P, -i, -i2);
                }
                return N(P, i, i2);
            }
            i2 = 0;
            charAt = str.charAt(0);
            if (charAt == '+') {
            }
            if (charAt == '-') {
            }
        }
        P = P(str, 1, false);
        i = 0;
        i2 = 0;
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

    public static int P(String str, int i, boolean z) {
        if (z && str.charAt(i - 1) != ':') {
            throw new b("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char charAt = str.charAt(i);
        char charAt2 = str.charAt(i + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new b("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    public static ZoneOffset L(Temporal temporal) {
        Objects.requireNonNull(temporal, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporal.r(j$.time.temporal.p.d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new b("Unable to obtain ZoneOffset from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName());
    }

    public static ZoneOffset N(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new b("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new b("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new b("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        }
        if (i3 < -59 || i3 > 59) {
            throw new b("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) == 18 && (i2 | i3) != 0) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        }
        return O((i2 * 60) + (i * 3600) + i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset O(int i) {
        if (i < -64800 || i > 64800) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % RichMessageLayout.PART_MAX_HEIGHT_DP == 0) {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentHashMap concurrentHashMap = d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
            e.putIfAbsent(zoneOffset2.c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i);
    }

    public ZoneOffset(int i) {
        String sb;
        this.b = i;
        if (i == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb2 = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            sb2.append(i < 0 ? "-" : "+");
            sb2.append(i2 < 10 ? "0" : "");
            sb2.append(i2);
            sb2.append(i3 < 10 ? ":0" : ":");
            sb2.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb2.append(i4 < 10 ? ":0" : ":");
                sb2.append(i4);
            }
            sb = sb2.toString();
        }
        this.c = sb;
    }

    public int getTotalSeconds() {
        return this.b;
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.c;
    }

    @Override // j$.time.temporal.l
    public final boolean h(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? oVar == j$.time.temporal.a.OFFSET_SECONDS : oVar != null && oVar.p(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final int o(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (c.b(oVar)) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
        return j$.time.temporal.p.d(this, oVar).a(u(oVar), oVar);
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        if (oVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (oVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
        return oVar.o(this);
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        return (aVar == j$.time.temporal.p.d || aVar == j$.time.temporal.p.e) ? this : j$.time.temporal.p.c(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal x(Temporal temporal) {
        return temporal.e(this.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            if (this.b == ((ZoneOffset) obj).b) {
                return true;
            }
        }
        return false;
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
    public final void K(ObjectOutput objectOutput) {
        objectOutput.writeByte(8);
        R(objectOutput);
    }

    public final void R(DataOutput dataOutput) {
        int i = this.b;
        int i2 = i % RichMessageLayout.PART_MAX_HEIGHT_DP == 0 ? i / RichMessageLayout.PART_MAX_HEIGHT_DP : NotificationCenter.needDeleteBusinessLink;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    public static ZoneOffset Q(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? O(objectInput.readInt()) : O(readByte * 900);
    }
}
