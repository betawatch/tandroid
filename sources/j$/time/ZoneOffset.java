package j$.time;

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

/* loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements j$.time.temporal.o, j$.time.temporal.p, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;
    private final int b;
    private final transient String c;
    private static final ConcurrentHashMap d = new ConcurrentHashMap(16, 0.75f, 4);
    private static final ConcurrentHashMap e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = I(0);
    public static final ZoneOffset f = I(-64800);
    public static final ZoneOffset g = I(64800);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZoneOffset G(String str) {
        int J;
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
                J = J(str, 1, false);
                i = J(str, 3, false);
            } else if (length == 6) {
                J = J(str, 1, false);
                i = J(str, 4, true);
            } else {
                if (length == 7) {
                    J = J(str, 1, false);
                    i = J(str, 3, false);
                    i2 = J(str, 5, false);
                } else if (length == 9) {
                    J = J(str, 1, false);
                    i = J(str, 4, true);
                    i2 = J(str, 7, true);
                } else {
                    throw new c("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                charAt = str.charAt(0);
                if (charAt == '+' && charAt != '-') {
                    throw new c("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                }
                if (charAt == '-') {
                    return H(-J, -i, -i2);
                }
                return H(J, i, i2);
            }
            i2 = 0;
            charAt = str.charAt(0);
            if (charAt == '+') {
            }
            if (charAt == '-') {
            }
        }
        J = J(str, 1, false);
        i = 0;
        i2 = 0;
        charAt = str.charAt(0);
        if (charAt == '+') {
        }
        if (charAt == '-') {
        }
    }

    private static int J(String str, int i, boolean z) {
        if (z && str.charAt(i - 1) != ':') {
            throw new c("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char charAt = str.charAt(i);
        char charAt2 = str.charAt(i + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new c("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    public static ZoneOffset H(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new c("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new c("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new c("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        }
        if (i3 < -59 || i3 > 59) {
            throw new c("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) == 18 && (i2 | i3) != 0) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        return I((i2 * 60) + (i * 3600) + i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset I(int i) {
        if (i < -64800 || i > 64800) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 == 0) {
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

    private ZoneOffset(int i) {
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

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        return ZoneRules.h(this);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.OFFSET_SECONDS : rVar != null && rVar.l(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return j$.time.temporal.n.d(this, rVar).a(r(rVar), rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return rVar.j(this);
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        return (tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.j()) ? this : j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return mVar.d(this.b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.b - this.b;
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.b == ((ZoneOffset) obj).b;
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
        return new q((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    final void E(ObjectOutput objectOutput) {
        objectOutput.writeByte(8);
        L(objectOutput);
    }

    final void L(DataOutput dataOutput) {
        int i = this.b;
        int i2 = i % 900 == 0 ? i / 900 : NotificationCenter.messageTranslated;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    static ZoneOffset K(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? I(objectInput.readInt()) : I(readByte * 900);
    }
}
