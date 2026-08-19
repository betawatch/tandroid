package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
public final class h implements f {
    @Override // j$.time.format.f
    public final boolean l(r rVar, StringBuilder sb) {
        Long a = rVar.a(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        j$.time.temporal.l lVar = rVar.a;
        Long valueOf = lVar.h(aVar) ? Long.valueOf(lVar.u(aVar)) : null;
        int i = 0;
        if (a == null) {
            return false;
        }
        long longValue = a.longValue();
        int a2 = aVar.b.a(valueOf != null ? valueOf.longValue() : 0L, aVar);
        if (longValue >= -62167219200L) {
            long j = longValue - 253402300800L;
            long S = j$.com.android.tools.r8.a.S(j, 315569520000L) + 1;
            LocalDateTime K = LocalDateTime.K(j$.com.android.tools.r8.a.R(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (S > 0) {
                sb.append('+');
                sb.append(S);
            }
            sb.append(K);
            if (K.b.c == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime K2 = LocalDateTime.K(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(K2);
            if (K2.b.c == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (K2.a.getYear() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (a2 > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (a2 <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = a2 / i2;
                sb.append((char) (i3 + 48));
                a2 -= i3 * i2;
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
