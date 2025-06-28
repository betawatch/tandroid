package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.util.A;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class ZoneRules implements Serializable {
    private static final long[] i = new long[0];
    private static final b[] j = new b[0];
    private static final LocalDateTime[] k = new LocalDateTime[0];
    private static final a[] l = new a[0];
    private final long[] a;
    private final ZoneOffset[] b;
    private final long[] c;
    private final LocalDateTime[] d;
    private final ZoneOffset[] e;
    private final b[] f;
    private final TimeZone g;
    private final transient ConcurrentHashMap h = new ConcurrentHashMap();

    private ZoneRules(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    ZoneRules(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {j(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }

    private static Object a(LocalDateTime localDateTime, a aVar) {
        LocalDateTime h = aVar.h();
        boolean n = aVar.n();
        boolean r = localDateTime.r(h);
        return n ? r ? aVar.k() : localDateTime.r(aVar.f()) ? aVar : aVar.j() : !r ? aVar.j() : localDateTime.r(aVar.f()) ? aVar.k() : aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a[] b(int i2) {
        long j2;
        Integer valueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = this.h;
        a[] aVarArr = (a[]) concurrentHashMap.get(valueOf);
        if (aVarArr != null) {
            return aVarArr;
        }
        TimeZone timeZone = this.g;
        if (timeZone == null) {
            b[] bVarArr = this.f;
            a[] aVarArr2 = new a[bVarArr.length];
            if (bVarArr.length > 0) {
                b bVar = bVarArr[0];
                throw null;
            }
            if (i2 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, aVarArr2);
            }
            return aVarArr2;
        }
        a[] aVarArr3 = l;
        if (i2 < 1800) {
            return aVarArr3;
        }
        long w = LocalDateTime.s(i2 - 1).w(this.b[0]);
        int offset = timeZone.getOffset(w * 1000);
        long j3 = 31968000 + w;
        while (w < j3) {
            long j4 = 7776000 + w;
            long j5 = w;
            if (offset != timeZone.getOffset(j4 * 1000)) {
                w = j5;
                while (j4 - w > 1) {
                    int i3 = offset;
                    long j6 = j3;
                    long j7 = j$.com.android.tools.r8.a.j(j4 + w, 2L);
                    if (timeZone.getOffset(j7 * 1000) == i3) {
                        w = j7;
                    } else {
                        j4 = j7;
                    }
                    offset = i3;
                    j3 = j6;
                }
                j2 = j3;
                int i4 = offset;
                if (timeZone.getOffset(w * 1000) == i4) {
                    w = j4;
                }
                ZoneOffset j8 = j(i4);
                offset = timeZone.getOffset(w * 1000);
                ZoneOffset j9 = j(offset);
                if (c(w, j9) == i2) {
                    aVarArr3 = (a[]) Arrays.copyOf(aVarArr3, aVarArr3.length + 1);
                    aVarArr3[aVarArr3.length - 1] = new a(w, j8, j9);
                }
            } else {
                j2 = j3;
                w = j4;
            }
            j3 = j2;
        }
        if (1916 <= i2 && i2 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, aVarArr3);
        }
        return aVarArr3;
    }

    private static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.v(j$.com.android.tools.r8.a.j(j2 + zoneOffset.getTotalSeconds(), 86400L)).getYear();
    }

    private Object d(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.b;
        int i2 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            a[] b = b(localDateTime.p());
            if (b.length == 0) {
                return j(timeZone.getOffset(localDateTime.w(zoneOffsetArr[0]) * 1000));
            }
            int length = b.length;
            while (i2 < length) {
                a aVar = b[i2];
                Object a = a(localDateTime, aVar);
                if ((a instanceof a) || a.equals(aVar.k())) {
                    return a;
                }
                i2++;
                obj = a;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f.length;
        LocalDateTime[] localDateTimeArr = this.d;
        if (length2 > 0 && localDateTime.q(localDateTimeArr[localDateTimeArr.length - 1])) {
            a[] b2 = b(localDateTime.p());
            int length3 = b2.length;
            while (i2 < length3) {
                a aVar2 = b2[i2];
                Object a2 = a(localDateTime, aVar2);
                if ((a2 instanceof a) || a2.equals(aVar2.k())) {
                    return a2;
                }
                i2++;
                obj = a2;
            }
            return obj;
        }
        int binarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.e;
        if (binarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else if (binarySearch < localDateTimeArr.length - 1) {
            int i3 = binarySearch + 1;
            if (localDateTimeArr[binarySearch].equals(localDateTimeArr[i3])) {
                binarySearch = i3;
            }
        }
        if ((binarySearch & 1) != 0) {
            return zoneOffsetArr2[(binarySearch / 2) + 1];
        }
        LocalDateTime localDateTime2 = localDateTimeArr[binarySearch];
        LocalDateTime localDateTime3 = localDateTimeArr[binarySearch + 1];
        int i4 = binarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr2[i4];
        ZoneOffset zoneOffset2 = zoneOffsetArr2[i4 + 1];
        return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? new a(localDateTime2, zoneOffset, zoneOffset2) : new a(localDateTime3, zoneOffset, zoneOffset2);
    }

    public static ZoneRules i(ZoneOffset zoneOffset) {
        A.z(zoneOffset, "offset");
        return new ZoneRules(zoneOffset);
    }

    private static ZoneOffset j(int i2) {
        return ZoneOffset.q(i2 / MediaDataController.MAX_STYLE_RUNS_COUNT);
    }

    public final a e(LocalDateTime localDateTime) {
        Object d = d(localDateTime);
        if (d instanceof a) {
            return (a) d;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneRules)) {
            return false;
        }
        ZoneRules zoneRules = (ZoneRules) obj;
        return A.y(this.g, zoneRules.g) && Arrays.equals(this.a, zoneRules.a) && Arrays.equals(this.b, zoneRules.b) && Arrays.equals(this.c, zoneRules.c) && Arrays.equals(this.e, zoneRules.e) && Arrays.equals(this.f, zoneRules.f);
    }

    public final List f(LocalDateTime localDateTime) {
        Object d = d(localDateTime);
        return d instanceof a ? ((a) d).m() : Collections.singletonList((ZoneOffset) d);
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffset = j(timeZone.getRawOffset());
        } else {
            int length = this.c.length;
            ZoneOffset[] zoneOffsetArr = this.b;
            if (length == 0) {
                zoneOffset = zoneOffsetArr[0];
            } else {
                int binarySearch = Arrays.binarySearch(this.a, instant.p());
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 2;
                }
                zoneOffset = zoneOffsetArr[binarySearch + 1];
            }
        }
        return !zoneOffset.equals(getOffset(instant));
    }

    public ZoneOffset getOffset(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return j(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long p = instant.p();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.e;
        if (length <= 0 || p <= jArr[jArr.length - 1]) {
            int binarySearch = Arrays.binarySearch(jArr, p);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            return zoneOffsetArr[binarySearch + 1];
        }
        a[] b = b(c(p, zoneOffsetArr[zoneOffsetArr.length - 1]));
        a aVar = null;
        for (int i2 = 0; i2 < b.length; i2++) {
            aVar = b[i2];
            if (p < aVar.l()) {
                return aVar.k();
            }
        }
        return aVar.j();
    }

    public final boolean h() {
        a aVar;
        TimeZone timeZone = this.g;
        if (timeZone == null) {
            return this.c.length == 0;
        }
        if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
            return false;
        }
        Instant now = Instant.now();
        long p = now.p();
        if (now.q() > 0 && p < Long.MAX_VALUE) {
            p++;
        }
        int c = c(p, getOffset(now));
        a[] b = b(c);
        int length = b.length - 1;
        while (true) {
            if (length < 0) {
                if (c > 1800) {
                    a[] b2 = b(c - 1);
                    int length2 = b2.length - 1;
                    while (true) {
                        if (length2 < 0) {
                            int offset = timeZone.getOffset((p - 1) * 1000);
                            long y = LocalDate.of(1800, 1, 1).y() * 86400;
                            for (long min = Math.min(p - 31104000, (j$.time.b.b().a() / 1000) + 31968000); y <= min; min -= 7776000) {
                                int offset2 = timeZone.getOffset(min * 1000);
                                if (offset != offset2) {
                                    int c2 = c(min, j(offset2));
                                    a[] b3 = b(c2 + 1);
                                    int length3 = b3.length - 1;
                                    while (true) {
                                        if (length3 < 0) {
                                            a[] b4 = b(c2);
                                            aVar = b4[b4.length - 1];
                                            break;
                                        }
                                        if (p > b3[length3].l()) {
                                            aVar = b3[length3];
                                            break;
                                        }
                                        length3--;
                                    }
                                }
                            }
                        } else {
                            if (p > b2[length2].l()) {
                                aVar = b2[length2];
                                break;
                            }
                            length2--;
                        }
                    }
                }
                aVar = null;
            } else {
                if (p > b[length].l()) {
                    aVar = b[length];
                    break;
                }
                length--;
            }
        }
        return aVar == null;
    }

    public final int hashCode() {
        TimeZone timeZone = this.g;
        return (((((timeZone != null ? timeZone.hashCode() : 0) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        StringBuilder sb = new StringBuilder("ZoneRules[currentStandardOffset=");
        sb.append(this.b[r2.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
