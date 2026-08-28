package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
public final class h implements f {
    @Override // j$.time.format.f
    public final boolean j(r rVar, StringBuilder sb2) {
        Long a2 = rVar.a(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.l lVar = rVar.a;
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = lVar.e(aVar) ? Long.valueOf(lVar.y(aVar)) : null;
        int i9 = 0;
        if (a2 == null) {
            return false;
        }
        long longValue = a2.longValue();
        int a3 = aVar.b.a(valueOf != null ? valueOf.longValue() : 0L, aVar);
        if (longValue >= -62167219200L) {
            long j10 = longValue - 253402300800L;
            long S = 1 + j$.com.android.tools.r8.a.S(j10, 315569520000L);
            LocalDateTime K = LocalDateTime.K(j$.com.android.tools.r8.a.R(j10, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (S > 0) {
                sb2.append('+');
                sb2.append(S);
            }
            sb2.append(K);
            if (K.b.c == 0) {
                sb2.append(":00");
            }
        } else {
            long j11 = longValue + 62167219200L;
            long j12 = j11 / 315569520000L;
            long j13 = j11 % 315569520000L;
            LocalDateTime K2 = LocalDateTime.K(j13 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(K2);
            if (K2.b.c == 0) {
                sb2.append(":00");
            }
            if (j12 < 0) {
                if (K2.a.getYear() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j12 - 1));
                } else if (j13 == 0) {
                    sb2.insert(length, j12);
                } else {
                    sb2.insert(length + 1, Math.abs(j12));
                }
            }
        }
        if (a3 > 0) {
            sb2.append('.');
            int i10 = 100000000;
            while (true) {
                if (a3 <= 0 && i9 % 3 == 0 && i9 >= -2) {
                    break;
                }
                int i11 = a3 / i10;
                sb2.append((char) (i11 + 48));
                a3 -= i11 * i10;
                i10 /= 10;
                i9++;
            }
        }
        sb2.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
