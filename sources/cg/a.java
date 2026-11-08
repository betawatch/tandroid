package cg;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.telegram.messenger.i0;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a {
    public final b a;
    public final long b;

    public a(long j3, b bVar) {
        this.a = bVar;
        this.b = j3;
    }

    public static a g(long j3, b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(j3 * 1000000000, bVar);
    }

    public static a h(String str, b bVar) {
        try {
            BigDecimal multiply = new BigDecimal(str).multiply(BigDecimal.valueOf(1000000000L));
            if (multiply.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) > 0) {
                return null;
            }
            return i(multiply.longValue(), bVar);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static a i(long j3, b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(j3, bVar);
    }

    public static a j(double d, b bVar) {
        b bVar2 = b.b;
        if (bVar == bVar2) {
            return new a((long) ((d / ((i0) qp.s1(p10.s0).x7.l.b).a) * 1000000000), bVar2).n(2);
        }
        b bVar3 = b.a;
        return bVar == bVar3 ? new a((long) (((d * 100000.0d) / qp.s1(p10.s0).b6) * 1000000000), bVar3).n(0) : g(0L, bVar);
    }

    public static a l(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            return i((starsAmount.amount * 1000000000) + starsAmount.nanos, b.a);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return i(starsAmount.amount, b.b);
        }
        return null;
    }

    public static a m(TL_stars.StarsAmount starsAmount) {
        a l10 = l(starsAmount);
        return l10 != null ? l10 : i(0L, b.a);
    }

    public final long a() {
        return this.b / 1000000000;
    }

    public final String b() {
        BigDecimal divide = new BigDecimal(this.b).divide(BigDecimal.valueOf(1000000000L), MathContext.UNLIMITED);
        return (divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros()).toPlainString();
    }

    public final double c() {
        return this.b / 1000000000;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder(id.E(a(), ','));
        long j3 = this.b % 1000000000;
        if (j3 == 0) {
            return sb2.toString();
        }
        sb2.append('.');
        String l10 = Long.toString(j3);
        int length = 9 - l10.length();
        for (int i7 = 0; i7 < length; i7++) {
            sb2.append('0');
        }
        int length2 = l10.length();
        while (length2 > 0 && l10.charAt(length2 - 1) == '0') {
            length2--;
        }
        sb2.append((CharSequence) l10, 0, length2);
        return sb2.toString();
    }

    public final a e(b bVar) {
        b bVar2 = this.a;
        if (bVar2 == bVar) {
            return this;
        }
        return j(bVar2 == b.a ? ((c() / 1000.0d) * qp.s1(p10.s0).b6) / 100.0d : bVar2 == b.b ? c() * ((i0) qp.s1(p10.s0).x7.l.b).a : 0.0d, bVar);
    }

    public final boolean equals(Object obj) {
        a aVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && (this == (aVar = (a) obj) || (this.a == aVar.a && this.b == aVar.b));
    }

    public final String f() {
        long j3 = this.b % 1000000000;
        b bVar = this.a;
        if (j3 == 0) {
            int ordinal = bVar.ordinal();
            return ordinal != 0 ? ordinal != 1 ? "" : id.H(' ', "TonCount", (int) a()) : id.H(' ', "StarsCount", (int) a());
        }
        int ordinal2 = bVar.ordinal();
        return ordinal2 != 0 ? ordinal2 != 1 ? "" : id.a0(null, null, 2131744053, b()) : id.a0(null, null, 2131745116, b());
    }

    public final boolean k() {
        return this.b == 0;
    }

    public final a n(int i7) {
        long j3 = 9 - i7;
        if (j3 <= 0) {
            return this;
        }
        long j10 = 1;
        for (int i10 = 0; i10 < j3; i10++) {
            j10 *= 10;
        }
        return i((this.b / j10) * j10, this.a);
    }

    public final TL_stars.StarsAmount o() {
        b bVar = b.a;
        long j3 = this.b;
        b bVar2 = this.a;
        if (bVar2 == bVar) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            tL_starsAmount.amount = j3 / 1000000000;
            tL_starsAmount.nanos = (int) (j3 % 1000000000);
            return tL_starsAmount;
        }
        if (bVar2 != b.b) {
            return null;
        }
        TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
        tL_starsTonAmount.amount = j3;
        return tL_starsTonAmount;
    }
}
