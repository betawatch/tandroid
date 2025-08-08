package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
final class h implements f {
    @Override // j$.time.format.f
    public final boolean f(r rVar, StringBuilder sb) {
        Long e = rVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.k d = rVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = d.j(aVar) ? Long.valueOf(rVar.d().f(aVar)) : null;
        int i = 0;
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        int i2 = aVar.i(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j = longValue - 253402300800L;
            long i3 = j$.com.android.tools.r8.a.i(j, 315569520000L) + 1;
            LocalDateTime t = LocalDateTime.t(j$.com.android.tools.r8.a.h(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (i3 > 0) {
                sb.append('+');
                sb.append(i3);
            }
            sb.append(t);
            if (t.n() == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime t2 = LocalDateTime.t(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(t2);
            if (t2.n() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (t2.o() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (i2 > 0) {
            sb.append('.');
            int i4 = 100000000;
            while (true) {
                if (i2 <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i5 = i2 / i4;
                sb.append((char) (i5 + 48));
                i2 -= i5 * i4;
                i4 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
