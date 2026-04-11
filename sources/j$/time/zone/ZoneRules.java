package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class ZoneRules implements Serializable {
    private static final long[] i = new long[0];
    private static final e[] j = new e[0];
    private static final LocalDateTime[] k = new LocalDateTime[0];
    private static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    private final long[] a;
    private final ZoneOffset[] b;
    private final long[] c;
    private final LocalDateTime[] d;
    private final ZoneOffset[] e;
    private final e[] f;
    private final TimeZone g;
    private final transient ConcurrentHashMap h = new ConcurrentHashMap();

    public static ZoneRules h(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return new ZoneRules(zoneOffset);
    }

    private ZoneRules(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
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
                int i3 = i2 + 1;
                b bVar = new b(jArr2[i2], zoneOffsetArr2[i2], zoneOffsetArr2[i3]);
                if (bVar.z()) {
                    arrayList.add(bVar.l());
                    arrayList.add(bVar.k());
                } else {
                    arrayList.add(bVar.k());
                    arrayList.add(bVar.l());
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
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
        return ZoneOffset.R(i2 / MediaDataController.MAX_STYLE_RUNS_COUNT);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        long[] jArr = this.a;
        objectOutput.writeInt(jArr.length);
        for (long j2 : jArr) {
            a.c(j2, objectOutput);
        }
        for (ZoneOffset zoneOffset : this.b) {
            a.d(zoneOffset, objectOutput);
        }
        long[] jArr2 = this.c;
        objectOutput.writeInt(jArr2.length);
        for (long j3 : jArr2) {
            a.c(j3, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : this.e) {
            a.d(zoneOffset2, objectOutput);
        }
        e[] eVarArr = this.f;
        objectOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }

    final void k(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.g.getID());
    }

    static ZoneRules j(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        long[] jArr = i;
        long[] jArr2 = readInt == 0 ? jArr : new long[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            jArr2[i2] = a.a(objectInput);
        }
        int i3 = readInt + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            zoneOffsetArr[i4] = a.b(objectInput);
        }
        int readInt2 = objectInput.readInt();
        if (readInt2 != 0) {
            jArr = new long[readInt2];
        }
        long[] jArr3 = jArr;
        for (int i5 = 0; i5 < readInt2; i5++) {
            jArr3[i5] = a.a(objectInput);
        }
        int i6 = readInt2 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            zoneOffsetArr2[i7] = a.b(objectInput);
        }
        int readByte = objectInput.readByte();
        e[] eVarArr = readByte == 0 ? j : new e[readByte];
        for (int i8 = 0; i8 < readByte; i8++) {
            eVarArr[i8] = e.b(objectInput);
        }
        return new ZoneRules(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
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
        long K = instant.K();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.e;
        if (length > 0 && K > jArr[jArr.length - 1]) {
            b[] b = b(c(K, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i2 = 0; i2 < b.length; i2++) {
                bVar = b[i2];
                if (K < bVar.H()) {
                    return bVar.s();
                }
            }
            return bVar.o();
        }
        int binarySearch = Arrays.binarySearch(jArr, K);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return zoneOffsetArr[binarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object d = d(localDateTime);
        if (d instanceof b) {
            return ((b) d).w();
        }
        return Collections.singletonList((ZoneOffset) d);
    }

    public final b e(LocalDateTime localDateTime) {
        Object d = d(localDateTime);
        if (d instanceof b) {
            return (b) d;
        }
        return null;
    }

    private Object d(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.b;
        int i2 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] b = b(localDateTime.M());
            if (b.length == 0) {
                return i(timeZone.getOffset(j$.time.chrono.h.n(localDateTime, zoneOffsetArr[0]) * 1000));
            }
            int length = b.length;
            while (i2 < length) {
                b bVar = b[i2];
                Object a = a(localDateTime, bVar);
                if ((a instanceof b) || a.equals(bVar.s())) {
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
        if (length2 > 0 && localDateTime.N(localDateTimeArr[localDateTimeArr.length - 1])) {
            b[] b2 = b(localDateTime.M());
            int length3 = b2.length;
            while (i2 < length3) {
                b bVar2 = b2[i2];
                Object a2 = a(localDateTime, bVar2);
                if ((a2 instanceof b) || a2.equals(bVar2.s())) {
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
        return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? new b(localDateTime2, zoneOffset, zoneOffset2) : new b(localDateTime3, zoneOffset, zoneOffset2);
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime l2 = bVar.l();
        if (bVar.z()) {
            if (localDateTime.O(l2)) {
                return bVar.s();
            }
            return localDateTime.O(bVar.k()) ? bVar : bVar.o();
        }
        if (localDateTime.O(l2)) {
            return localDateTime.O(bVar.k()) ? bVar.s() : bVar;
        }
        return bVar.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b[] b(int i2) {
        long j2;
        Integer valueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = this.h;
        b[] bVarArr = (b[]) concurrentHashMap.get(valueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.g;
        if (timeZone == null) {
            e[] eVarArr = this.f;
            b[] bVarArr2 = new b[eVarArr.length];
            for (int i3 = 0; i3 < eVarArr.length; i3++) {
                bVarArr2[i3] = eVarArr[i3].a(i2);
            }
            if (i2 < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, bVarArr2);
            }
            return bVarArr2;
        }
        b[] bVarArr3 = l;
        if (i2 < 1800) {
            return bVarArr3;
        }
        long n = j$.time.chrono.h.n(LocalDateTime.P(i2 - 1), this.b[0]);
        int offset = timeZone.getOffset(n * 1000);
        long j3 = 31968000 + n;
        while (n < j3) {
            long j4 = 7776000 + n;
            long j5 = n;
            if (offset != timeZone.getOffset(j4 * 1000)) {
                n = j5;
                while (j4 - n > 1) {
                    int i4 = offset;
                    long j6 = j3;
                    long k2 = j$.com.android.tools.r8.a.k(j4 + n, 2L);
                    if (timeZone.getOffset(k2 * 1000) == i4) {
                        n = k2;
                    } else {
                        j4 = k2;
                    }
                    offset = i4;
                    j3 = j6;
                }
                j2 = j3;
                int i5 = offset;
                if (timeZone.getOffset(n * 1000) == i5) {
                    n = j4;
                }
                ZoneOffset i6 = i(i5);
                offset = timeZone.getOffset(n * 1000);
                ZoneOffset i7 = i(offset);
                if (c(n, i7) == i2) {
                    bVarArr3 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length + 1);
                    bVarArr3[bVarArr3.length - 1] = new b(n, i6, i7);
                }
            } else {
                j2 = j3;
                n = j4;
            }
            j3 = j2;
        }
        if (1916 <= i2 && i2 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
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
                int binarySearch = Arrays.binarySearch(this.a, instant.K());
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 2;
                }
                zoneOffset = zoneOffsetArr[binarySearch + 1];
            }
        }
        return !zoneOffset.equals(getOffset(instant));
    }

    private static int c(long j2, ZoneOffset zoneOffset) {
        return LocalDate.V(j$.com.android.tools.r8.a.k(j2 + zoneOffset.getTotalSeconds(), 86400)).getYear();
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
