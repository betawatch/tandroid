// default package

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nj {
    public final oj a;
    public final long b;

    public nj(long j, oj ojVar) {
        this.a = ojVar;
        this.b = j;
    }

    public static nj h(long j, oj ojVar) {
        if (ojVar == null) {
            return null;
        }
        return new nj(j * 1000000000, ojVar);
    }

    public static nj i(String str, oj ojVar) {
        try {
            BigDecimal multiply = new BigDecimal(str).multiply(BigDecimal.valueOf(1000000000L));
            if (multiply.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) > 0) {
                return null;
            }
            return j(multiply.longValue(), ojVar);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static nj j(long j, oj ojVar) {
        if (ojVar == null) {
            return null;
        }
        return new nj(j, ojVar);
    }

    public static nj k(double d, oj ojVar) {
        oj ojVar2 = oj.b;
        if (ojVar == ojVar2) {
            return new nj((long) ((d / na7.q1(y6c.t0).k4.k.i) * 1.0E9d), ojVar2).o(2);
        }
        oj ojVar3 = oj.a;
        return ojVar == ojVar3 ? new nj((long) (((d * 100000.0d) / na7.q1(y6c.t0).k4.r3.i) * 1.0E9d), ojVar3).o(0) : h(0L, ojVar);
    }

    public static nj m(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            return j((starsAmount.amount * 1000000000) + starsAmount.nanos, oj.a);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return j(starsAmount.amount, oj.b);
        }
        return null;
    }

    public static nj n(TL_stars.StarsAmount starsAmount) {
        nj m = m(starsAmount);
        return m != null ? m : j(0L, oj.a);
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
        StringBuilder sb = new StringBuilder(k96.E(a(), ','));
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

    public final nj e(oj ojVar) {
        return this.a == ojVar ? this : k(f(), ojVar);
    }

    public final boolean equals(Object obj) {
        nj njVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof nj) && (this == (njVar = (nj) obj) || (this.a == njVar.a && this.b == njVar.b));
    }

    public final double f() {
        oj ojVar = this.a;
        if (ojVar == oj.a) {
            return ((c() / 1000.0d) * na7.q1(y6c.t0).k4.r3.i) / 100.0d;
        }
        if (ojVar == oj.b) {
            return c() * na7.q1(y6c.t0).k4.k.i;
        }
        return 0.0d;
    }

    public final String g() {
        long j = this.b % 1000000000;
        oj ojVar = this.a;
        if (j == 0) {
            int ordinal = ojVar.ordinal();
            return ordinal != 0 ? ordinal == 1 ? k96.H(' ', "TonCount", (int) a()) : "" : k96.H(' ', "StarsCount", (int) a());
        }
        int ordinal2 = ojVar.ordinal();
        return ordinal2 != 0 ? ordinal2 != 1 ? "" : k96.a0(null, null, 2131743809, b()) : k96.a0(null, null, 2131744876, b());
    }

    public final boolean l() {
        return this.b == 0;
    }

    public final nj o(int i) {
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

    public final nj p() {
        nj o = o(2);
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
        oj ojVar = oj.a;
        long j = this.b;
        oj ojVar2 = this.a;
        if (ojVar2 == ojVar) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            tL_starsAmount.amount = j / 1000000000;
            tL_starsAmount.nanos = (int) (j % 1000000000);
            return tL_starsAmount;
        }
        if (ojVar2 != oj.b) {
            return null;
        }
        TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
        tL_starsTonAmount.amount = j;
        return tL_starsTonAmount;
    }
}
