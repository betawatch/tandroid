package j$.time.format;

/* loaded from: classes2.dex */
final class i implements f {
    static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    final j$.time.temporal.l a;
    final int b;
    final int c;
    private final x d;
    final int e;

    i(j$.time.temporal.l lVar, int i, int i2, x xVar) {
        this.a = lVar;
        this.b = i;
        this.c = i2;
        this.d = xVar;
        this.e = 0;
    }

    protected i(j$.time.temporal.l lVar, int i, int i2, x xVar, int i3) {
        this.a = lVar;
        this.b = i;
        this.c = i2;
        this.d = xVar;
        this.e = i3;
    }

    final i b() {
        if (this.e == -1) {
            return this;
        }
        return new i(this.a, this.b, this.c, this.d, -1);
    }

    final i c(int i) {
        return new i(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.f
    public final boolean f(r rVar, StringBuilder sb) {
        j$.time.temporal.l lVar = this.a;
        Long e = rVar.e(lVar);
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        v b = rVar.b();
        String l = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.c("Field " + lVar + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i);
        }
        b.getClass();
        int i2 = this.b;
        x xVar = this.d;
        if (longValue >= 0) {
            int i3 = c.a[xVar.ordinal()];
            if (i3 == 1 ? !(i2 >= 19 || longValue < f[i2]) : i3 == 2) {
                sb.append('+');
            }
        } else {
            int i4 = c.a[xVar.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new j$.time.c("Field " + lVar + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - l.length(); i5++) {
            sb.append('0');
        }
        sb.append(l);
        return true;
    }

    public final String toString() {
        j$.time.temporal.l lVar = this.a;
        x xVar = this.d;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && xVar == x.NORMAL) {
            return "Value(" + lVar + ")";
        }
        if (i2 == i && xVar == x.NOT_NEGATIVE) {
            return "Value(" + lVar + "," + i2 + ")";
        }
        return "Value(" + lVar + "," + i2 + "," + i + "," + xVar + ")";
    }
}
