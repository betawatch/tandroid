package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
final class h implements f {
    @Override // j$.time.format.f
    public final boolean k(r rVar, StringBuilder sb) {
        Long e = rVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.m d = rVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = d.g(aVar) ? Long.valueOf(rVar.d().r(aVar)) : null;
        int i = 0;
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        int x = aVar.x(valueOf != null ? valueOf.longValue() : 0L);
        if (longValue >= -62167219200L) {
            long j = longValue - 253402300800L;
            long k = j$.com.android.tools.r8.a.k(j, 315569520000L) + 1;
            LocalDateTime P = LocalDateTime.P(j$.com.android.tools.r8.a.j(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (k > 0) {
                sb.append('+');
                sb.append(k);
            }
            sb.append(P);
            if (P.J() == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime P2 = LocalDateTime.P(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(P2);
            if (P2.J() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (P2.K() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (x > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (x <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = x / i2;
                sb.append((char) (i3 + 48));
                x -= i3 * i2;
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
