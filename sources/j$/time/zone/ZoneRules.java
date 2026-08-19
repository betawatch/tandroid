package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.r;
import j$.time.j;
import j$.time.temporal.m;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class ZoneRules implements Serializable {
    public static final long[] i = new long[0];
    public static final e[] j = new e[0];
    public static final LocalDateTime[] k = new LocalDateTime[0];
    public static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    public final long[] a;
    public final ZoneOffset[] b;
    public final long[] c;
    public final LocalDateTime[] d;
    public final ZoneOffset[] e;
    public final e[] f;
    public final TimeZone g;
    public final transient ConcurrentHashMap h = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:9:0x0046 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.b;
        boolean l2 = bVar.l();
        LocalDateTime localDateTime3 = bVar.b;
        ZoneOffset zoneOffset = bVar.c;
        ZoneOffset zoneOffset2 = bVar.d;
        if (l2) {
            if (!localDateTime.I(localDateTime2)) {
                return localDateTime.I(localDateTime3.M((long) (zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()))) ? bVar : zoneOffset2;
            }
            return zoneOffset;
        }
        if (localDateTime.I(localDateTime2)) {
            if (localDateTime.I(localDateTime3.M(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()))) {
                return zoneOffset;
            }
        }
    }

    public ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.a = jArr;
        this.b = zoneOffsetArr;
        this.c = jArr2;
        this.e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                ZoneOffset zoneOffset = zoneOffsetArr2[i2];
                int i3 = i2 + 1;
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i3];
                LocalDateTime K = LocalDateTime.K(jArr2[i2], 0, zoneOffset);
                if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                    arrayList.add(K);
                    arrayList.add(K.M(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                } else {
                    arrayList.add(K.M(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                    arrayList.add(K);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public ZoneRules(ZoneOffset zoneOffset) {
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

    public ZoneRules(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {h(timeZone.getRawOffset())};
        this.b = zoneOffsetArr;
        long[] jArr = i;
        this.a = jArr;
        this.c = jArr;
        this.d = k;
        this.e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }

    public static ZoneOffset h(int i2) {
        return ZoneOffset.O(i2 / MediaDataController.MAX_STYLE_RUNS_COUNT);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public ZoneOffset getOffset(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return h(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.c;
        if (jArr.length == 0) {
            return this.b[0];
        }
        long j2 = instant.a;
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.e;
        if (length > 0 && j2 > jArr[jArr.length - 1]) {
            b[] b = b(c(j2, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i2 = 0; i2 < b.length; i2++) {
                bVar = b[i2];
                if (j2 < bVar.a) {
                    return bVar.c;
                }
            }
            return bVar.d;
        }
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return zoneOffsetArr[binarySearch + 1];
    }

    public ZoneOffset getOffset(LocalDateTime localDateTime) {
        Object d = d(localDateTime);
        if (d instanceof b) {
            return ((b) d).c;
        }
        return (ZoneOffset) d;
    }

    public final List f(LocalDateTime localDateTime) {
        Object d = d(localDateTime);
        if (!(d instanceof b)) {
            return Collections.singletonList((ZoneOffset) d);
        }
        b bVar = (b) d;
        if (bVar.l()) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {bVar.c, bVar.d};
        ArrayList arrayList = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList.add(Objects.requireNonNull(objArr[i2]));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final b e(LocalDateTime localDateTime) {
        Object d = d(localDateTime);
        if (d instanceof b) {
            return (b) d;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (r11.E(r1) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0084, code lost:
    
        if (r11.b.R() <= r1.b.R()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.b;
        int i2 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] b = b(localDateTime.a.getYear());
            if (b.length == 0) {
                return h(timeZone.getOffset(j$.com.android.tools.r8.a.w(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = b.length;
            while (i2 < length) {
                b bVar = b[i2];
                Object a = a(localDateTime, bVar);
                if ((a instanceof b) || a.equals(bVar.c)) {
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
        if (length2 > 0) {
            LocalDateTime localDateTime2 = localDateTimeArr[localDateTimeArr.length - 1];
            localDateTime.getClass();
            LocalDate localDate = localDateTime.a;
            if (localDateTime2 == null) {
                long v = localDate.v();
                long v2 = localDateTime2.a.v();
                if (v <= v2) {
                    if (v == v2) {
                    }
                }
                b[] b2 = b(localDate.getYear());
                int length3 = b2.length;
                while (i2 < length3) {
                    b bVar2 = b2[i2];
                    Object a2 = a(localDateTime, bVar2);
                    if ((a2 instanceof b) || a2.equals(bVar2.c)) {
                        return a2;
                    }
                    i2++;
                    obj = a2;
                }
                return obj;
            }
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
        LocalDateTime localDateTime3 = localDateTimeArr[binarySearch];
        LocalDateTime localDateTime4 = localDateTimeArr[binarySearch + 1];
        int i4 = binarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr2[i4];
        ZoneOffset zoneOffset2 = zoneOffsetArr2[i4 + 1];
        return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? new b(localDateTime3, zoneOffset, zoneOffset2) : new b(localDateTime4, zoneOffset, zoneOffset2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b[] b(int i2) {
        Integer num;
        b[] bVarArr;
        int i3;
        LocalDate H;
        long j2;
        int i4;
        Integer num2;
        Integer valueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = this.h;
        b[] bVarArr2 = (b[]) concurrentHashMap.get(valueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bVarArr3 = l;
            if (i2 < 1800) {
                return bVarArr3;
            }
            LocalDateTime localDateTime = LocalDateTime.c;
            LocalDate of = LocalDate.of(i2 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.x(0);
            long w = j$.com.android.tools.r8.a.w(new LocalDateTime(of, j$.time.h.h[0]), this.b[0]);
            int offset = timeZone.getOffset(w * 1000);
            long j3 = 31968000 + w;
            while (w < j3) {
                long j4 = w + 7776000;
                if (offset != timeZone.getOffset(j4 * 1000)) {
                    while (j4 - w > 1) {
                        Integer num3 = valueOf;
                        long S = j$.com.android.tools.r8.a.S(j4 + w, 2L);
                        if (timeZone.getOffset(S * 1000) == offset) {
                            w = S;
                        } else {
                            j4 = S;
                        }
                        valueOf = num3;
                    }
                    num2 = valueOf;
                    if (timeZone.getOffset(w * 1000) == offset) {
                        w = j4;
                    }
                    ZoneOffset h = h(offset);
                    int offset2 = timeZone.getOffset(w * 1000);
                    ZoneOffset h2 = h(offset2);
                    if (c(w, h2) == i2) {
                        b[] bVarArr4 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                        bVarArr4[bVarArr4.length - 1] = new b(w, h, h2);
                        offset = offset2;
                        bVarArr3 = bVarArr4;
                    } else {
                        offset = offset2;
                    }
                } else {
                    num2 = valueOf;
                    w = j4;
                }
                valueOf = num2;
            }
            Integer num4 = valueOf;
            if (1916 <= i2 && i2 < 2100) {
                concurrentHashMap.putIfAbsent(num4, bVarArr3);
            }
            return bVarArr3;
        }
        Integer num5 = valueOf;
        long j5 = 1;
        e[] eVarArr = this.f;
        b[] bVarArr5 = new b[eVarArr.length];
        int i5 = 0;
        while (i5 < eVarArr.length) {
            e eVar = eVarArr[i5];
            DayOfWeek dayOfWeek = eVar.c;
            j jVar = eVar.a;
            byte b = eVar.b;
            if (b < 0) {
                bVarArr = bVarArr5;
                long j6 = i2;
                r.c.getClass();
                int H2 = jVar.H(r.o(j6)) + 1 + b;
                LocalDate localDate = LocalDate.d;
                j$.time.temporal.a.YEAR.x(j6);
                Objects.requireNonNull(jVar, "month");
                num = num5;
                j$.time.temporal.a.DAY_OF_MONTH.x(H2);
                H = LocalDate.H(i2, jVar.getValue(), H2);
                if (dayOfWeek != null) {
                    final int value = dayOfWeek.getValue();
                    final int i6 = 1;
                    H = (LocalDate) new m() { // from class: j$.time.temporal.n
                        @Override // j$.time.temporal.m
                        public final Temporal x(Temporal temporal) {
                            switch (i6) {
                                case 0:
                                    int o = temporal.o(a.DAY_OF_WEEK);
                                    int i7 = value;
                                    if (o == i7) {
                                        return temporal;
                                    }
                                    return temporal.f(o - i7 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                                default:
                                    int o2 = temporal.o(a.DAY_OF_WEEK);
                                    int i8 = value;
                                    if (o2 == i8) {
                                        return temporal;
                                    }
                                    return temporal.l(i8 - o2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
                            }
                        }
                    }.x(H);
                }
                i3 = i5;
            } else {
                num = num5;
                bVarArr = bVarArr5;
                LocalDate localDate2 = LocalDate.d;
                i3 = i5;
                j$.time.temporal.a.YEAR.x(i2);
                Objects.requireNonNull(jVar, "month");
                j$.time.temporal.a.DAY_OF_MONTH.x(b);
                H = LocalDate.H(i2, jVar.getValue(), b);
                if (dayOfWeek != null) {
                    final int value2 = dayOfWeek.getValue();
                    final int i7 = 0;
                    H = (LocalDate) new m() { // from class: j$.time.temporal.n
                        @Override // j$.time.temporal.m
                        public final Temporal x(Temporal temporal) {
                            switch (i7) {
                                case 0:
                                    int o = temporal.o(a.DAY_OF_WEEK);
                                    int i72 = value2;
                                    if (o == i72) {
                                        return temporal;
                                    }
                                    return temporal.f(o - i72 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                                default:
                                    int o2 = temporal.o(a.DAY_OF_WEEK);
                                    int i8 = value2;
                                    if (o2 == i8) {
                                        return temporal;
                                    }
                                    return temporal.l(i8 - o2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
                            }
                        }
                    }.x(H);
                    if (eVar.e) {
                        j2 = j5;
                    } else {
                        j2 = j5;
                        H = H.plusDays(j2);
                    }
                    LocalDateTime J = LocalDateTime.J(H, eVar.d);
                    d dVar = eVar.f;
                    dVar.getClass();
                    i4 = c.a[dVar.ordinal()];
                    ZoneOffset zoneOffset = eVar.h;
                    if (i4 != 1) {
                        J = J.M(zoneOffset.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
                    } else if (i4 == 2) {
                        J = J.M(zoneOffset.getTotalSeconds() - eVar.g.getTotalSeconds());
                    }
                    bVarArr[i3] = new b(J, zoneOffset, eVar.i);
                    int i8 = i3 + 1;
                    j5 = j2;
                    bVarArr5 = bVarArr;
                    num5 = num;
                    i5 = i8;
                }
            }
            if (eVar.e) {
            }
            LocalDateTime J2 = LocalDateTime.J(H, eVar.d);
            d dVar2 = eVar.f;
            dVar2.getClass();
            i4 = c.a[dVar2.ordinal()];
            ZoneOffset zoneOffset2 = eVar.h;
            if (i4 != 1) {
            }
            bVarArr[i3] = new b(J2, zoneOffset2, eVar.i);
            int i82 = i3 + 1;
            j5 = j2;
            bVarArr5 = bVarArr;
            num5 = num;
            i5 = i82;
        }
        Integer num6 = num5;
        b[] bVarArr6 = bVarArr5;
        if (i2 >= 2100) {
            return bVarArr6;
        }
        concurrentHashMap.putIfAbsent(num6, bVarArr6);
        return bVarArr6;
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffset = h(timeZone.getRawOffset());
        } else {
            int length = this.c.length;
            ZoneOffset[] zoneOffsetArr = this.b;
            if (length != 0) {
                int binarySearch = Arrays.binarySearch(this.a, instant.a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 2;
                }
                zoneOffset = zoneOffsetArr[binarySearch + 1];
            } else {
                zoneOffset = zoneOffsetArr[0];
            }
        }
        return !zoneOffset.equals(getOffset(instant));
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.R(j$.com.android.tools.r8.a.S(j2 + zoneOffset.getTotalSeconds(), 86400)).getYear();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneRules) {
            ZoneRules zoneRules = (ZoneRules) obj;
            if (Objects.equals(this.g, zoneRules.g) && Arrays.equals(this.a, zoneRules.a) && Arrays.equals(this.b, zoneRules.b) && Arrays.equals(this.c, zoneRules.c) && Arrays.equals(this.e, zoneRules.e) && Arrays.equals(this.f, zoneRules.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.b[r1.length - 1] + "]";
    }
}
