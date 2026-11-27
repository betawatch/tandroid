// default package

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class oj {
    public final pj a;
    public final long b;

    public oj(long j, pj pjVar) {
        this.a = pjVar;
        this.b = j;
    }

    public static oj h(long j, pj pjVar) {
        if (pjVar == null) {
            return null;
        }
        return new oj(j * 1000000000, pjVar);
    }

    public static oj i(String str, pj pjVar) {
        try {
            BigDecimal multiply = new BigDecimal(str).multiply(BigDecimal.valueOf(1000000000L));
            if (multiply.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) > 0) {
                return null;
            }
            return j(multiply.longValue(), pjVar);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static oj j(long j, pj pjVar) {
        if (pjVar == null) {
            return null;
        }
        return new oj(j, pjVar);
    }

    public static oj k(double d, pj pjVar) {
        pj pjVar2 = pj.b;
        if (pjVar == pjVar2) {
            return new oj((long) ((d / uc7.s1(yac.t0).k4.k.i) * 1.0E9d), pjVar2).o(2);
        }
        pj pjVar3 = pj.a;
        return pjVar == pjVar3 ? new oj((long) (((d * 100000.0d) / uc7.s1(yac.t0).k4.z3.i) * 1.0E9d), pjVar3).o(0) : h(0L, pjVar);
    }

    public static oj m(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            return j((starsAmount.amount * 1000000000) + starsAmount.nanos, pj.a);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return j(starsAmount.amount, pj.b);
        }
        return null;
    }

    public static oj n(TL_stars.StarsAmount starsAmount) {
        oj m = m(starsAmount);
        return m != null ? m : j(0L, pj.a);
    }

    public final long a() {
        return this.b / 1000000000;
    }

    public final String b() {
        BigDecimal divide = new BigDecimal(this.b).divide(BigDecimal.valueOf(1000000000L), MathContext.UNLIMITED);
        return (divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros()).toPlainString();
    }

    public final double c() {
        return this.b / 1.0E9d;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder(ob6.E(a(), ','));
        long j = this.b % 1000000000;
        if (j == 0) {
            return sb.toString();
        }
        sb.append('.');
        String l = Long.toString(j);
        int length = 9 - l.length();
        for (int i = 0; i < length; i++) {
            sb.append('0');
        }
        int length2 = l.length();
        while (length2 > 0 && l.charAt(length2 - 1) == '0') {
            length2--;
        }
        sb.append((CharSequence) l, 0, length2);
        return sb.toString();
    }

    public final oj e(pj pjVar) {
        return this.a == pjVar ? this : k(f(), pjVar);
    }

    public final boolean equals(Object obj) {
        oj ojVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof oj) && (this == (ojVar = (oj) obj) || (this.a == ojVar.a && this.b == ojVar.b));
    }

    public final double f() {
        pj pjVar = this.a;
        if (pjVar == pj.a) {
            return ((c() / 1000.0d) * uc7.s1(yac.t0).k4.z3.i) / 100.0d;
        }
        if (pjVar == pj.b) {
            return c() * uc7.s1(yac.t0).k4.k.i;
        }
        return 0.0d;
    }

    public final String g() {
        long j = this.b % 1000000000;
        pj pjVar = this.a;
        if (j == 0) {
            int ordinal = pjVar.ordinal();
            return ordinal != 0 ? ordinal == 1 ? ob6.H(' ', "TonCount", (int) a()) : "" : ob6.H(' ', "StarsCount", (int) a());
        }
        int ordinal2 = pjVar.ordinal();
        return ordinal2 != 0 ? ordinal2 != 1 ? "" : ob6.a0(null, null, 2131743703, b()) : ob6.a0(null, null, 2131744770, b());
    }

    public final boolean l() {
        return this.b == 0;
    }

    public final oj o(int i) {
        long j = 9 - i;
        if (j <= 0) {
            return this;
        }
        long j2 = 1;
        for (int i2 = 0; i2 < j; i2++) {
            j2 *= 10;
        }
        return j((this.b / j2) * j2, this.a);
    }

    public final oj p() {
        oj o = o(2);
        if (o.b == this.b) {
            return this;
        }
        long j = 1;
        for (int i = 0; i < 7; i++) {
            j *= 10;
        }
        return j(o.b + j, this.a);
    }

    public final TL_stars.StarsAmount q() {
        pj pjVar = pj.a;
        long j = this.b;
        pj pjVar2 = this.a;
        if (pjVar2 == pjVar) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            tL_starsAmount.amount = j / 1000000000;
            tL_starsAmount.nanos = (int) (j % 1000000000);
            return tL_starsAmount;
        }
        if (pjVar2 != pj.b) {
            return null;
        }
        TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
        tL_starsTonAmount.amount = j;
        return tL_starsTonAmount;
    }
}
