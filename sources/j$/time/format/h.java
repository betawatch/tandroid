package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
public final class h implements f {
    @Override // j$.time.format.f
    public final boolean j(r rVar, StringBuilder sb) {
        Long a2 = rVar.a(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.l lVar = rVar.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = lVar.e(aVar) ? Long.valueOf(lVar.y(aVar)) : null;
        int i10 = 0;
        if (a2 == null) {
            return false;
        }
        long longValue = a2.longValue();
        int a10 = aVar.b.a(valueOf != null ? valueOf.longValue() : 0L, aVar);
        if (longValue >= -62167219200L) {
            long j10 = longValue - 253402300800L;
            long S = 1 + j$.com.android.tools.r8.a.S(j10, 315569520000L);
            LocalDateTime K = LocalDateTime.K(j$.com.android.tools.r8.a.R(j10, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (S > 0) {
                sb.append('+');
                sb.append(S);
            }
            sb.append(K);
            if (K.b.c == 0) {
                sb.append(":00");
            }
        } else {
            long j11 = longValue + 62167219200L;
            long j12 = j11 / 315569520000L;
            long j13 = j11 % 315569520000L;
            LocalDateTime K2 = LocalDateTime.K(j13 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(K2);
            if (K2.b.c == 0) {
                sb.append(":00");
            }
            if (j12 < 0) {
                if (K2.a.getYear() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j12 - 1));
                } else if (j13 == 0) {
                    sb.insert(length, j12);
                } else {
                    sb.insert(length + 1, Math.abs(j12));
                }
            }
        }
        if (a10 > 0) {
            sb.append('.');
            int i11 = 100000000;
            while (true) {
                if (a10 <= 0 && i10 % 3 == 0 && i10 >= -2) {
                    break;
                }
                int i12 = a10 / i11;
                sb.append((char) (i12 + 48));
                a10 -= i12 * i11;
                i11 /= 10;
                i10++;
            }
        }
        sb.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
