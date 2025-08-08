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

    public final int hashCode() {
        TimeZone timeZone = this.g;
        return (((((timeZone != null ? timeZone.hashCode() : 0) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public static ZoneRules h(ZoneOffset zoneOffset) {
        A.z(zoneOffset, "offset");
        return new ZoneRules(zoneOffset);
    }

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
        ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }

    private static ZoneOffset i(int i2) {
        return ZoneOffset.p(i2 / MediaDataController.MAX_STYLE_RUNS_COUNT);
    }

    public ZoneOffset getOffset(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long o = instant.o();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.e;
        if (length > 0 && o > jArr[jArr.length - 1]) {
            a[] b = b(c(o, zoneOffsetArr[zoneOffsetArr.length - 1]));
            a aVar = null;
            for (int i2 = 0; i2 < b.length; i2++) {
                aVar = b[i2];
                if (o < aVar.k()) {
                    return aVar.j();
                }
            }
            return aVar.i();
        }
        int binarySearch = Arrays.binarySearch(jArr, o);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return zoneOffsetArr[binarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object d = d(localDateTime);
        if (d instanceof a) {
            return ((a) d).l();
        }
        return Collections.singletonList((ZoneOffset) d);
    }

    public final a e(LocalDateTime localDateTime) {
        Object d = d(localDateTime);
        if (d instanceof a) {
            return (a) d;
        }
        return null;
    }

    private Object d(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.b;
        int i2 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            a[] b = b(localDateTime.o());
            if (b.length == 0) {
                return i(timeZone.getOffset(localDateTime.v(zoneOffsetArr[0]) * 1000));
            }
            int length = b.length;
            while (i2 < length) {
                a aVar = b[i2];
                Object a = a(localDateTime, aVar);
                if ((a instanceof a) || a.equals(aVar.j())) {
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
        if (length2 > 0 && localDateTime.p(localDateTimeArr[localDateTimeArr.length - 1])) {
            a[] b2 = b(localDateTime.o());
            int length3 = b2.length;
            while (i2 < length3) {
                a aVar2 = b2[i2];
                Object a2 = a(localDateTime, aVar2);
                if ((a2 instanceof a) || a2.equals(aVar2.j())) {
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
        if ((binarySearch & 1) == 0) {
            LocalDateTime localDateTime2 = localDateTimeArr[binarySearch];
            LocalDateTime localDateTime3 = localDateTimeArr[binarySearch + 1];
            int i4 = binarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr2[i4];
            ZoneOffset zoneOffset2 = zoneOffsetArr2[i4 + 1];
            if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                return new a(localDateTime2, zoneOffset, zoneOffset2);
            }
            return new a(localDateTime3, zoneOffset, zoneOffset2);
        }
        return zoneOffsetArr2[(binarySearch / 2) + 1];
    }

    private static Object a(LocalDateTime localDateTime, a aVar) {
        LocalDateTime g = aVar.g();
        if (aVar.m()) {
            if (localDateTime.q(g)) {
                return aVar.j();
            }
            return localDateTime.q(aVar.f()) ? aVar : aVar.i();
        }
        if (localDateTime.q(g)) {
            return localDateTime.q(aVar.f()) ? aVar.j() : aVar;
        }
        return aVar.i();
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
        if (timeZone != null) {
            a[] aVarArr2 = l;
            if (i2 < 1800) {
                return aVarArr2;
            }
            long v = LocalDateTime.r(i2 - 1).v(this.b[0]);
            int offset = timeZone.getOffset(v * 1000);
            long j3 = 31968000 + v;
            while (v < j3) {
                long j4 = 7776000 + v;
                long j5 = v;
                if (offset != timeZone.getOffset(j4 * 1000)) {
                    v = j5;
                    while (j4 - v > 1) {
                        int i3 = offset;
                        long j6 = j3;
                        long i4 = j$.com.android.tools.r8.a.i(j4 + v, 2L);
                        if (timeZone.getOffset(i4 * 1000) == i3) {
                            v = i4;
                        } else {
                            j4 = i4;
                        }
                        offset = i3;
                        j3 = j6;
                    }
                    j2 = j3;
                    int i5 = offset;
                    if (timeZone.getOffset(v * 1000) == i5) {
                        v = j4;
                    }
                    ZoneOffset i6 = i(i5);
                    offset = timeZone.getOffset(v * 1000);
                    ZoneOffset i7 = i(offset);
                    if (c(v, i7) == i2) {
                        aVarArr2 = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length + 1);
                        aVarArr2[aVarArr2.length - 1] = new a(v, i6, i7);
                    }
                } else {
                    j2 = j3;
                    v = j4;
                }
                j3 = j2;
            }
            if (1916 <= i2 && i2 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, aVarArr2);
            }
            return aVarArr2;
        }
        b[] bVarArr = this.f;
        a[] aVarArr3 = new a[bVarArr.length];
        if (bVarArr.length > 0) {
            b bVar = bVarArr[0];
            throw null;
        }
        if (i2 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, aVarArr3);
        }
        return aVarArr3;
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffset = i(timeZone.getRawOffset());
        } else {
            int length = this.c.length;
            ZoneOffset[] zoneOffsetArr = this.b;
            if (length == 0) {
                zoneOffset = zoneOffsetArr[0];
            } else {
                int binarySearch = Arrays.binarySearch(this.a, instant.o());
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 2;
                }
                zoneOffset = zoneOffsetArr[binarySearch + 1];
            }
        }
        return !zoneOffset.equals(getOffset(instant));
    }

    private static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.u(j$.com.android.tools.r8.a.i(j2 + zoneOffset.getTotalSeconds(), 86400L)).getYear();
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
