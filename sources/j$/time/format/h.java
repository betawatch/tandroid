package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
public final class h implements f {
    @Override // j$.time.format.f
    public final boolean j(r rVar, StringBuilder sb2) {
        Long a10 = rVar.a(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.l lVar = rVar.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = lVar.e(aVar) ? Long.valueOf(lVar.y(aVar)) : null;
        int i7 = 0;
        if (a10 == null) {
            return false;
        }
        long longValue = a10.longValue();
        int a11 = aVar.b.a(valueOf != null ? valueOf.longValue() : 0L, aVar);
        if (longValue >= -62167219200L) {
            long j3 = longValue - 253402300800L;
            long R = j$.com.android.tools.r8.a.R(j3, 315569520000L) + 1;
            LocalDateTime K = LocalDateTime.K(j$.com.android.tools.r8.a.Q(j3, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (R > 0) {
                sb2.append('+');
                sb2.append(R);
            }
            sb2.append(K);
            if (K.b.c == 0) {
                sb2.append(":00");
            }
        } else {
            long j10 = longValue + 62167219200L;
            long j11 = j10 / 315569520000L;
            long j12 = j10 % 315569520000L;
            LocalDateTime K2 = LocalDateTime.K(j12 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(K2);
            if (K2.b.c == 0) {
                sb2.append(":00");
            }
            if (j11 < 0) {
                if (K2.a.getYear() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j11 - 1));
                } else if (j12 == 0) {
                    sb2.insert(length, j11);
                } else {
                    sb2.insert(length + 1, Math.abs(j11));
                }
            }
        }
        if (a11 > 0) {
            sb2.append('.');
            int i10 = 100000000;
            while (true) {
                if (a11 <= 0 && i7 % 3 == 0 && i7 >= -2) {
                    break;
                }
                int i11 = a11 / i10;
                sb2.append((char) (i11 + 48));
                a11 -= i11 * i10;
                i10 /= 10;
                i7++;
            }
        }
        sb2.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
