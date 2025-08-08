package j$.time;

import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.zone.ZoneRules;
import j$.util.A;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements j$.time.temporal.k, Comparable<ZoneOffset>, Serializable {
    private final int b;
    private final transient String c;
    private static final ConcurrentHashMap d = new ConcurrentHashMap(16, 0.75f, 4);
    private static final ConcurrentHashMap e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = p(0);
    public static final ZoneOffset f = p(-64800);
    public static final ZoneOffset g = p(64800);

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
    public static ZoneOffset n(String str) {
        int q;
        int i;
        int i2;
        char charAt;
        A.z(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else if (length != 3) {
            if (length == 5) {
                q = q(str, 1, false);
                i = q(str, 3, false);
            } else if (length == 6) {
                q = q(str, 1, false);
                i = q(str, 4, true);
            } else {
                if (length == 7) {
                    q = q(str, 1, false);
                    i = q(str, 3, false);
                    i2 = q(str, 5, false);
                } else if (length == 9) {
                    q = q(str, 1, false);
                    i = q(str, 4, true);
                    i2 = q(str, 7, true);
                } else {
                    throw new c("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                charAt = str.charAt(0);
                if (charAt == '+' && charAt != '-') {
                    throw new c("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                }
                if (charAt == '-') {
                    return o(-q, -i, -i2);
                }
                return o(q, i, i2);
            }
            i2 = 0;
            charAt = str.charAt(0);
            if (charAt == '+') {
            }
            if (charAt == '-') {
            }
        }
        q = q(str, 1, false);
        i = 0;
        i2 = 0;
        charAt = str.charAt(0);
        if (charAt == '+') {
        }
        if (charAt == '-') {
        }
    }

    private static int q(String str, int i, boolean z) {
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

    public static ZoneOffset o(int i, int i2, int i3) {
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
        return p((i2 * 60) + (i * 3600) + i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset p(int i) {
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

    @Override // j$.time.temporal.k
    public final boolean j(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? lVar == j$.time.temporal.a.OFFSET_SECONDS : lVar != null && lVar.g(this);
    }

    @Override // j$.time.temporal.k
    public final q i(j$.time.temporal.a aVar) {
        return j$.time.temporal.j.c(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (aVar instanceof j$.time.temporal.a) {
            throw new p("Unsupported field: " + aVar);
        }
        return j$.time.temporal.j.c(this, aVar).a(f(aVar), aVar);
    }

    @Override // j$.time.temporal.k
    public final long f(j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.b;
        }
        if (lVar instanceof j$.time.temporal.a) {
            throw new p("Unsupported field: " + lVar);
        }
        return lVar.f(this);
    }

    @Override // j$.time.temporal.k
    public final Object g(j$.time.temporal.n nVar) {
        return (nVar == j$.time.temporal.j.g() || nVar == j$.time.temporal.j.i()) ? this : j$.time.temporal.j.b(this, nVar);
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
}
