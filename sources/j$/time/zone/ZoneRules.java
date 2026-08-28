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

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.b;
        if (bVar.j()) {
            if (localDateTime.I(localDateTime2)) {
                return bVar.c;
            }
            if (!localDateTime.I(bVar.b.M(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()))) {
                return bVar.d;
            }
        } else {
            if (!localDateTime.I(localDateTime2)) {
                return bVar.d;
            }
            if (localDateTime.I(bVar.b.M(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()))) {
                return bVar.c;
            }
        }
        return bVar;
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
            int i9 = 0;
            while (i9 < jArr2.length) {
                int i10 = i9 + 1;
                b bVar = new b(jArr2[i9], zoneOffsetArr2[i9], zoneOffsetArr2[i10]);
                if (bVar.j()) {
                    arrayList.add(bVar.b);
                    arrayList.add(bVar.b.M(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()));
                } else {
                    arrayList.add(bVar.b.M(bVar.d.getTotalSeconds() - bVar.c.getTotalSeconds()));
                    arrayList.add(bVar.b);
                }
                i9 = i10;
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

    public static ZoneOffset h(int i9) {
        return ZoneOffset.O(i9 / MediaDataController.MAX_STYLE_RUNS_COUNT);
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
        long j10 = instant.a;
        if (this.f.length > 0 && j10 > jArr[jArr.length - 1]) {
            b[] b10 = b(c(j10, this.e[r8.length - 1]));
            b bVar = null;
            for (int i9 = 0; i9 < b10.length; i9++) {
                bVar = b10[i9];
                if (j10 < bVar.a) {
                    return bVar.c;
                }
            }
            return bVar.d;
        }
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.e[binarySearch + 1];
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
        if (bVar.j()) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {bVar.c, bVar.d};
        ArrayList arrayList = new ArrayList(2);
        for (int i9 = 0; i9 < 2; i9++) {
            arrayList.add(Objects.requireNonNull(objArr[i9]));
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

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r9.G(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
    
        if (r9.b.R() <= r0.b.R()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(LocalDateTime localDateTime) {
        Object obj = null;
        int i9 = 0;
        if (this.g != null) {
            b[] b10 = b(localDateTime.a.getYear());
            if (b10.length == 0) {
                return h(this.g.getOffset(j$.com.android.tools.r8.a.w(localDateTime, this.b[0]) * 1000));
            }
            int length = b10.length;
            while (i9 < length) {
                b bVar = b10[i9];
                Object a2 = a(localDateTime, bVar);
                if ((a2 instanceof b) || a2.equals(bVar.c)) {
                    return a2;
                }
                i9++;
                obj = a2;
            }
            return obj;
        }
        if (this.c.length == 0) {
            return this.b[0];
        }
        if (this.f.length > 0) {
            LocalDateTime localDateTime2 = this.d[r0.length - 1];
            if (localDateTime2 == null) {
                long z10 = localDateTime.a.z();
                long z11 = localDateTime2.a.z();
                if (z10 <= z11) {
                    if (z10 == z11) {
                    }
                }
                b[] b11 = b(localDateTime.a.getYear());
                int length2 = b11.length;
                while (i9 < length2) {
                    b bVar2 = b11[i9];
                    Object a3 = a(localDateTime, bVar2);
                    if ((a3 instanceof b) || a3.equals(bVar2.c)) {
                        return a3;
                    }
                    i9++;
                    obj = a3;
                }
                return obj;
            }
            localDateTime.getClass();
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
                int i10 = binarySearch + 1;
                if (objArr[binarySearch].equals(objArr[i10])) {
                    binarySearch = i10;
                }
            }
        }
        if ((binarySearch & 1) != 0) {
            return this.e[(binarySearch / 2) + 1];
        }
        LocalDateTime[] localDateTimeArr = this.d;
        LocalDateTime localDateTime3 = localDateTimeArr[binarySearch];
        LocalDateTime localDateTime4 = localDateTimeArr[binarySearch + 1];
        ZoneOffset[] zoneOffsetArr = this.e;
        int i11 = binarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr[i11];
        ZoneOffset zoneOffset2 = zoneOffsetArr[i11 + 1];
        return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? new b(localDateTime3, zoneOffset, zoneOffset2) : new b(localDateTime4, zoneOffset, zoneOffset2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b[] b(int i9) {
        LocalDate H;
        b[] bVarArr = l;
        Integer valueOf = Integer.valueOf(i9);
        b[] bVarArr2 = (b[]) this.h.get(valueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j10 = 1;
        final int i10 = 0;
        final int i11 = 1;
        if (this.g != null) {
            if (i9 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.c;
            LocalDate of2 = LocalDate.of(i9 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.w(0);
            long w8 = j$.com.android.tools.r8.a.w(new LocalDateTime(of2, j$.time.h.h[0]), this.b[0]);
            long j11 = 1000;
            int offset = this.g.getOffset(w8 * 1000);
            long j12 = 31968000 + w8;
            while (w8 < j12) {
                long j13 = w8 + 7776000;
                long j14 = j11;
                if (offset != this.g.getOffset(j13 * j14)) {
                    while (j13 - w8 > j10) {
                        long S = j$.com.android.tools.r8.a.S(j13 + w8, 2L);
                        if (this.g.getOffset(S * j14) == offset) {
                            w8 = S;
                        } else {
                            j13 = S;
                        }
                        j10 = 1;
                    }
                    if (this.g.getOffset(w8 * j14) == offset) {
                        w8 = j13;
                    }
                    ZoneOffset h = h(offset);
                    int offset2 = this.g.getOffset(w8 * j14);
                    ZoneOffset h10 = h(offset2);
                    if (c(w8, h10) == i9) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(w8, h, h10);
                    }
                    offset = offset2;
                } else {
                    w8 = j13;
                }
                j11 = j14;
                j10 = 1;
            }
            if (1916 <= i9 && i9 < 2100) {
                this.h.putIfAbsent(valueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i12 = 0;
        while (i12 < eVarArr.length) {
            e eVar = eVarArr[i12];
            byte b10 = eVar.b;
            if (b10 < 0) {
                j jVar = eVar.a;
                long j15 = i9;
                r.c.getClass();
                int H2 = jVar.H(r.k(j15)) + 1 + eVar.b;
                LocalDate localDate = LocalDate.d;
                j$.time.temporal.a.YEAR.w(j15);
                Objects.requireNonNull(jVar, "month");
                j$.time.temporal.a.DAY_OF_MONTH.w(H2);
                H = LocalDate.H(i9, jVar.getValue(), H2);
                DayOfWeek dayOfWeek = eVar.c;
                if (dayOfWeek != null) {
                    final int value = dayOfWeek.getValue();
                    H = (LocalDate) new m() { // from class: j$.time.temporal.n
                        @Override // j$.time.temporal.m
                        public final Temporal q(Temporal temporal) {
                            switch (i11) {
                                case 0:
                                    int j16 = temporal.j(a.DAY_OF_WEEK);
                                    int i13 = value;
                                    if (j16 == i13) {
                                        return temporal;
                                    }
                                    return temporal.d(j16 - i13 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                                default:
                                    int j17 = temporal.j(a.DAY_OF_WEEK);
                                    int i14 = value;
                                    if (j17 == i14) {
                                        return temporal;
                                    }
                                    return temporal.w(i14 - j17 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
                            }
                        }
                    }.q(H);
                }
            } else {
                j jVar2 = eVar.a;
                LocalDate localDate2 = LocalDate.d;
                j$.time.temporal.a.YEAR.w(i9);
                Objects.requireNonNull(jVar2, "month");
                j$.time.temporal.a.DAY_OF_MONTH.w(b10);
                H = LocalDate.H(i9, jVar2.getValue(), b10);
                DayOfWeek dayOfWeek2 = eVar.c;
                if (dayOfWeek2 != null) {
                    final int value2 = dayOfWeek2.getValue();
                    H = (LocalDate) new m() { // from class: j$.time.temporal.n
                        @Override // j$.time.temporal.m
                        public final Temporal q(Temporal temporal) {
                            switch (i10) {
                                case 0:
                                    int j16 = temporal.j(a.DAY_OF_WEEK);
                                    int i13 = value2;
                                    if (j16 == i13) {
                                        return temporal;
                                    }
                                    return temporal.d(j16 - i13 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                                default:
                                    int j17 = temporal.j(a.DAY_OF_WEEK);
                                    int i14 = value2;
                                    if (j17 == i14) {
                                        return temporal;
                                    }
                                    return temporal.w(i14 - j17 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
                            }
                        }
                    }.q(H);
                }
            }
            if (eVar.e) {
                H = H.plusDays(1L);
            }
            LocalDateTime J = LocalDateTime.J(H, eVar.d);
            d dVar = eVar.f;
            ZoneOffset zoneOffset = eVar.g;
            ZoneOffset zoneOffset2 = eVar.h;
            dVar.getClass();
            int i13 = c.a[dVar.ordinal()];
            if (i13 == 1) {
                J = J.M(zoneOffset2.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
            } else if (i13 == 2) {
                J = J.M(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds());
            }
            bVarArr3[i12] = new b(J, eVar.h, eVar.i);
            i12++;
            i10 = 0;
        }
        if (i9 < 2100) {
            this.h.putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffset = h(timeZone.getRawOffset());
        } else if (this.c.length != 0) {
            int binarySearch = Arrays.binarySearch(this.a, instant.a);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            zoneOffset = this.b[binarySearch + 1];
        } else {
            zoneOffset = this.b[0];
        }
        return !zoneOffset.equals(getOffset(instant));
    }

    public static int c(long j10, ZoneOffset zoneOffset) {
        return LocalDate.R(j$.com.android.tools.r8.a.S(j10 + zoneOffset.getTotalSeconds(), 86400)).getYear();
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
        return "ZoneRules[currentStandardOffset=" + this.b[r0.length - 1] + "]";
    }
}
