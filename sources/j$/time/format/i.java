package j$.time.format;

/* loaded from: classes2.dex */
class i implements f {
    static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    final Enum a;
    final int b;
    final int c;
    private final x d;
    final int e;

    /* JADX WARN: Multi-variable type inference failed */
    i(j$.time.temporal.r rVar, int i, int i2, x xVar) {
        this.a = (Enum) rVar;
        this.b = i;
        this.c = i2;
        this.d = xVar;
        this.e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected i(j$.time.temporal.r rVar, int i, int i2, x xVar, int i3) {
        this.a = (Enum) rVar;
        this.b = i;
        this.c = i2;
        this.d = xVar;
        this.e = i3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.r, java.lang.Enum] */
    i b() {
        return this.e == -1 ? this : new i(this.a, this.b, this.c, this.d, -1);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j$.time.temporal.r, java.lang.Enum] */
    i c(int i) {
        int i2 = this.e + i;
        return new i(this.a, this.b, this.c, this.d, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.r, java.lang.Enum, java.lang.Object] */
    @Override // j$.time.format.f
    public boolean i(r rVar, StringBuilder sb) {
        ?? r0 = this.a;
        Long e = rVar.e(r0);
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        v b = rVar.b();
        String l = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.c("Field " + ((Object) r0) + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i);
        }
        b.getClass();
        int i2 = this.b;
        x xVar = this.d;
        if (longValue >= 0) {
            int i3 = c.a[xVar.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && longValue >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = c.a[xVar.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new j$.time.c("Field " + ((Object) r0) + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - l.length(); i5++) {
            sb.append('0');
        }
        sb.append(l);
        return true;
    }

    public String toString() {
        Enum r0 = this.a;
        int i = this.c;
        x xVar = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && xVar == x.NORMAL) {
            return "Value(" + r0 + ")";
        }
        if (i2 == i && xVar == x.NOT_NEGATIVE) {
            return "Value(" + r0 + "," + i2 + ")";
        }
        return "Value(" + r0 + "," + i2 + "," + i + "," + xVar + ")";
    }
}
