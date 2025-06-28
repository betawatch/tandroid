package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
final class h implements f {
    h() {
    }

    @Override // j$.time.format.f
    public final boolean f(r rVar, StringBuilder sb) {
        Long e = rVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.k d = rVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = d.k(aVar) ? Long.valueOf(rVar.d().h(aVar)) : null;
        int i = 0;
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        int m = aVar.m(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j = longValue - 253402300800L;
            long j2 = j$.com.android.tools.r8.a.j(j, 315569520000L) + 1;
            LocalDateTime u = LocalDateTime.u(j$.com.android.tools.r8.a.i(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (j2 > 0) {
                sb.append('+');
                sb.append(j2);
            }
            sb.append(u);
            if (u.o() == 0) {
                sb.append(":00");
            }
        } else {
            long j3 = longValue + 62167219200L;
            long j4 = j3 / 315569520000L;
            long j5 = j3 % 315569520000L;
            LocalDateTime u2 = LocalDateTime.u(j5 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(u2);
            if (u2.o() == 0) {
                sb.append(":00");
            }
            if (j4 < 0) {
                if (u2.p() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j4 - 1));
                } else if (j5 == 0) {
                    sb.insert(length, j4);
                } else {
                    sb.insert(length + 1, Math.abs(j4));
                }
            }
        }
        if (m > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (m <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = m / i2;
                sb.append((char) (i3 + 48));
                m -= i3 * i2;
                i2 /= 10;
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
