// default package

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nk {
    public final ok a;
    public final long b;

    public nk(long j, ok okVar) {
        this.a = okVar;
        this.b = j;
    }

    public static nk h(long j, ok okVar) {
        if (okVar == null) {
            return null;
        }
        return new nk(j * 1000000000, okVar);
    }

    public static nk i(String str, ok okVar) {
        try {
            BigDecimal multiply = new BigDecimal(str).multiply(BigDecimal.valueOf(1000000000L));
            if (multiply.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) > 0) {
                return null;
            }
            return j(multiply.longValue(), okVar);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static nk j(long j, ok okVar) {
        if (okVar == null) {
            return null;
        }
        return new nk(j, okVar);
    }

    public static nk k(double d, ok okVar) {
        ok okVar2 = ok.b;
        if (okVar == okVar2) {
            return new nk((long) ((d / oc7.r1(z8c.t0).l4.k.i) * 1.0E9d), okVar2).o(2);
        }
        ok okVar3 = ok.a;
        return okVar == okVar3 ? new nk((long) (((d * 100000.0d) / oc7.r1(z8c.t0).l4.r3.i) * 1.0E9d), okVar3).o(0) : h(0L, okVar);
    }

    public static nk m(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            return j((starsAmount.amount * 1000000000) + starsAmount.nanos, ok.a);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return j(starsAmount.amount, ok.b);
        }
        return null;
    }

    public static nk n(TL_stars.StarsAmount starsAmount) {
        nk m = m(starsAmount);
        return m != null ? m : j(0L, ok.a);
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
        StringBuilder sb = new StringBuilder(jb6.E(a(), ','));
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

    public final nk e(ok okVar) {
        return this.a == okVar ? this : k(f(), okVar);
    }

    public final boolean equals(Object obj) {
        nk nkVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof nk) && (this == (nkVar = (nk) obj) || (this.a == nkVar.a && this.b == nkVar.b));
    }

    public final double f() {
        ok okVar = this.a;
        if (okVar == ok.a) {
            return ((c() / 1000.0d) * oc7.r1(z8c.t0).l4.r3.i) / 100.0d;
        }
        if (okVar == ok.b) {
            return c() * oc7.r1(z8c.t0).l4.k.i;
        }
        return 0.0d;
    }

    public final String g() {
        long j = this.b % 1000000000;
        ok okVar = this.a;
        if (j == 0) {
            int ordinal = okVar.ordinal();
            return ordinal != 0 ? ordinal == 1 ? jb6.H(' ', "TonCount", (int) a()) : "" : jb6.H(' ', "StarsCount", (int) a());
        }
        int ordinal2 = okVar.ordinal();
        return ordinal2 != 0 ? ordinal2 != 1 ? "" : jb6.a0(null, null, 2131743735, b()) : jb6.a0(null, null, 2131744802, b());
    }

    public final boolean l() {
        return this.b == 0;
    }

    public final nk o(int i) {
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

    public final nk p() {
        nk o = o(2);
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
        ok okVar = ok.a;
        long j = this.b;
        ok okVar2 = this.a;
        if (okVar2 == okVar) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            tL_starsAmount.amount = j / 1000000000;
            tL_starsAmount.nanos = (int) (j % 1000000000);
            return tL_starsAmount;
        }
        if (okVar2 != ok.b) {
            return null;
        }
        TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
        tL_starsTonAmount.amount = j;
        return tL_starsTonAmount;
    }
}
