package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.q;
import j$.time.j;
import j$.time.l;
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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
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
                LocalDateTime x = LocalDateTime.x(jArr2[i2], 0, zoneOffset);
                if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                    arrayList.add(x);
                    arrayList.add(x.F(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                } else {
                    arrayList.add(x.F(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                    arrayList.add(x);
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.b;
        if (bVar.j()) {
            if (localDateTime.v(localDateTime2)) {
                return bVar.c;
            }
            if (!localDateTime.v(bVar.b.F(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()))) {
                return bVar.d;
            }
        } else {
            if (!localDateTime.v(localDateTime2)) {
                return bVar.d;
            }
            if (localDateTime.v(bVar.b.F(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()))) {
                return bVar.c;
            }
        }
        return bVar;
    }

    public static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.K(j$.time.a.Q(j2 + zoneOffset.getTotalSeconds(), 86400L)).getYear();
    }

    public static ZoneOffset h(int i2) {
        return ZoneOffset.H(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b[] b(int i2) {
        LocalDate q;
        b[] bVarArr = l;
        Integer valueOf = Integer.valueOf(i2);
        b[] bVarArr2 = (b[]) this.h.get(valueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j2 = 1;
        final byte b = 0;
        final byte b2 = 1;
        if (this.g != null) {
            if (i2 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.c;
            LocalDate of = LocalDate.of(i2 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.o(0L);
            long v = j$.time.a.v(new LocalDateTime(of, j.h[0]), this.b[0]);
            long j3 = 1000;
            int offset = this.g.getOffset(v * 1000);
            long j4 = 31968000 + v;
            while (v < j4) {
                long j5 = v + 7776000;
                long j6 = j3;
                if (offset != this.g.getOffset(j5 * j6)) {
                    while (j5 - v > j2) {
                        long Q = j$.time.a.Q(j5 + v, 2L);
                        if (this.g.getOffset(Q * j6) == offset) {
                            v = Q;
                        } else {
                            j5 = Q;
                        }
                        j2 = 1;
                    }
                    if (this.g.getOffset(v * j6) == offset) {
                        v = j5;
                    }
                    ZoneOffset h = h(offset);
                    int offset2 = this.g.getOffset(v * j6);
                    ZoneOffset h2 = h(offset2);
                    if (c(v, h2) == i2) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(v, h, h2);
                    }
                    offset = offset2;
                } else {
                    v = j5;
                }
                j3 = j6;
                j2 = 1;
            }
            if (1916 <= i2 && i2 < 2100) {
                this.h.putIfAbsent(valueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i3 = 0;
        while (i3 < eVarArr.length) {
            e eVar = eVarArr[i3];
            byte b3 = eVar.b;
            l lVar = eVar.a;
            if (b3 < 0) {
                long j7 = i2;
                q.c.getClass();
                int q2 = lVar.q(q.x(j7)) + 1 + eVar.b;
                LocalDate localDate = LocalDate.d;
                j$.time.temporal.a.YEAR.o(j7);
                Objects.requireNonNull(lVar, "month");
                j$.time.temporal.a.DAY_OF_MONTH.o(q2);
                q = LocalDate.q(i2, lVar.getValue(), q2);
                DayOfWeek dayOfWeek = eVar.c;
                if (dayOfWeek != null) {
                    final int value = dayOfWeek.getValue();
                    q = (LocalDate) new m() { // from class: j$.time.temporal.n
                        @Override // j$.time.temporal.m
                        public final Temporal n(Temporal temporal) {
                            byte b4 = b2;
                            int i4 = value;
                            switch (b4) {
                                case 0:
                                    int j8 = temporal.j(a.DAY_OF_WEEK);
                                    if (j8 == i4) {
                                        return temporal;
                                    }
                                    return temporal.d(j8 - i4 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                                default:
                                    int j9 = temporal.j(a.DAY_OF_WEEK);
                                    if (j9 == i4) {
                                        return temporal;
                                    }
                                    return temporal.u(i4 - j9 >= 0 ? 7 - r2 : -r2, ChronoUnit.DAYS);
                            }
                        }
                    }.n(q);
                }
            } else {
                LocalDate localDate2 = LocalDate.d;
                j$.time.temporal.a.YEAR.o(i2);
                Objects.requireNonNull(lVar, "month");
                j$.time.temporal.a.DAY_OF_MONTH.o(b3);
                q = LocalDate.q(i2, lVar.getValue(), b3);
                DayOfWeek dayOfWeek2 = eVar.c;
                if (dayOfWeek2 != null) {
                    final int value2 = dayOfWeek2.getValue();
                    q = (LocalDate) new m() { // from class: j$.time.temporal.n
                        @Override // j$.time.temporal.m
                        public final Temporal n(Temporal temporal) {
                            byte b4 = b;
                            int i4 = value2;
                            switch (b4) {
                                case 0:
                                    int j8 = temporal.j(a.DAY_OF_WEEK);
                                    if (j8 == i4) {
                                        return temporal;
                                    }
                                    return temporal.d(j8 - i4 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                                default:
                                    int j9 = temporal.j(a.DAY_OF_WEEK);
                                    if (j9 == i4) {
                                        return temporal;
                                    }
                                    return temporal.u(i4 - j9 >= 0 ? 7 - r2 : -r2, ChronoUnit.DAYS);
                            }
                        }
                    }.n(q);
                }
            }
            if (eVar.e) {
                q = q.plusDays(1L);
            }
            LocalDateTime w = LocalDateTime.w(q, eVar.d);
            d dVar = eVar.f;
            ZoneOffset zoneOffset = eVar.g;
            ZoneOffset zoneOffset2 = eVar.h;
            dVar.getClass();
            int i4 = c.a[dVar.ordinal()];
            if (i4 == 1) {
                w = w.F(zoneOffset2.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
            } else if (i4 == 2) {
                w = w.F(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds());
            }
            bVarArr3[i3] = new b(w, eVar.h, eVar.i);
            i3++;
            b = 0;
        }
        if (i2 < 2100) {
            this.h.putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (r9.o(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0086, code lost:
    
        if (r9.b.K() <= r0.b.K()) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(LocalDateTime localDateTime) {
        boolean z;
        Object obj = null;
        int i2 = 0;
        if (this.g != null) {
            b[] b = b(localDateTime.a.getYear());
            if (b.length == 0) {
                return h(this.g.getOffset(j$.time.a.v(localDateTime, this.b[0]) * 1000));
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
            return this.b[0];
        }
        if (this.f.length > 0) {
            LocalDateTime[] localDateTimeArr = this.d;
            LocalDateTime localDateTime2 = localDateTimeArr[localDateTimeArr.length - 1];
            if (localDateTime2 != null) {
                localDateTime.getClass();
            } else {
                long z2 = localDateTime.a.z();
                long z3 = localDateTime2.a.z();
                if (z2 <= z3) {
                    if (z2 == z3) {
                    }
                    z = false;
                }
                z = true;
            }
            if (z) {
                b[] b2 = b(localDateTime.a.getYear());
                int length2 = b2.length;
                while (i2 < length2) {
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
        int binarySearch = Arrays.binarySearch(this.d, localDateTime);
        if (binarySearch == -1) {
            return this.e[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            Object[] objArr = this.d;
            if (binarySearch < objArr.length - 1) {
                int i3 = binarySearch + 1;
                if (objArr[binarySearch].equals(objArr[i3])) {
                    binarySearch = i3;
                }
            }
        }
        if ((binarySearch & 1) != 0) {
            return this.e[(binarySearch / 2) + 1];
        }
        LocalDateTime[] localDateTimeArr2 = this.d;
        LocalDateTime localDateTime3 = localDateTimeArr2[binarySearch];
        LocalDateTime localDateTime4 = localDateTimeArr2[binarySearch + 1];
        ZoneOffset[] zoneOffsetArr = this.e;
        int i4 = binarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr[i4];
        ZoneOffset zoneOffset2 = zoneOffsetArr[i4 + 1];
        return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? new b(localDateTime3, zoneOffset, zoneOffset2) : new b(localDateTime4, zoneOffset, zoneOffset2);
    }

    public final b e(LocalDateTime localDateTime) {
        Object d = d(localDateTime);
        if (d instanceof b) {
            return (b) d;
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
        return Objects.equals(this.g, zoneRules.g) && Arrays.equals(this.a, zoneRules.a) && Arrays.equals(this.b, zoneRules.b) && Arrays.equals(this.c, zoneRules.c) && Arrays.equals(this.e, zoneRules.e) && Arrays.equals(this.f, zoneRules.f);
    }

    public final List f(LocalDateTime localDateTime) {
        Object d = d(localDateTime);
        if (!(d instanceof b)) {
            return Collections.singletonList((ZoneOffset) d);
        }
        b bVar = (b) d;
        if (bVar.j()) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {bVar.c, bVar.d};
        ArrayList arrayList = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            arrayList.add(Objects.requireNonNull(objArr[i2]));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffset = h(timeZone.getRawOffset());
        } else if (this.c.length == 0) {
            zoneOffset = this.b[0];
        } else {
            int binarySearch = Arrays.binarySearch(this.a, instant.a);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            zoneOffset = this.b[binarySearch + 1];
        }
        return !zoneOffset.equals(getOffset(instant));
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
        if (this.f.length <= 0 || j2 <= jArr[jArr.length - 1]) {
            int binarySearch = Arrays.binarySearch(jArr, j2);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            return this.e[binarySearch + 1];
        }
        b[] b = b(c(j2, this.e[r8.length - 1]));
        b bVar = null;
        for (int i2 = 0; i2 < b.length; i2++) {
            bVar = b[i2];
            if (j2 < bVar.a) {
                return bVar.c;
            }
        }
        return bVar.d;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.a)) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.c)) ^ Arrays.hashCode(this.e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.b[r3.length - 1] + "]";
    }

    public ZoneOffset getOffset(LocalDateTime localDateTime) {
        Object d = d(localDateTime);
        if (d instanceof b) {
            return ((b) d).c;
        }
        return (ZoneOffset) d;
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
}
