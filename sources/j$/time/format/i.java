package j$.time.format;

/* loaded from: classes2.dex */
public class i implements f {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final j$.time.temporal.o a;
    public final int b;
    public final int c;
    public final x d;
    public final int e;

    public i(j$.time.temporal.o oVar, int i9, int i10, x xVar) {
        this.a = oVar;
        this.b = i9;
        this.c = i10;
        this.d = xVar;
        this.e = 0;
    }

    public i(j$.time.temporal.o oVar, int i9, int i10, x xVar, int i11) {
        this.a = oVar;
        this.b = i9;
        this.c = i10;
        this.d = xVar;
        this.e = i11;
    }

    public i a() {
        if (this.e == -1) {
            return this;
        }
        return new i(this.a, this.b, this.c, this.d, -1);
    }

    public i b(int i9) {
        return new i(this.a, this.b, this.c, this.d, this.e + i9);
    }

    @Override // j$.time.format.f
    public boolean j(r rVar, StringBuilder sb2) {
        j$.time.temporal.o oVar = this.a;
        Long a2 = rVar.a(oVar);
        if (a2 == null) {
            return false;
        }
        long longValue = a2.longValue();
        v vVar = rVar.b.c;
        String l10 = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l10.length();
        int i9 = this.c;
        if (length > i9) {
            throw new j$.time.b("Field " + oVar + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i9);
        }
        vVar.getClass();
        int i10 = this.b;
        x xVar = this.d;
        if (longValue >= 0) {
            int i11 = c.a[xVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    sb2.append('+');
                }
            } else if (i10 < 19 && longValue >= f[i10]) {
                sb2.append('+');
            }
        } else {
            int i12 = c.a[xVar.ordinal()];
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                sb2.append('-');
            } else if (i12 == 4) {
                throw new j$.time.b("Field " + oVar + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i13 = 0; i13 < i10 - l10.length(); i13++) {
            sb2.append('0');
        }
        sb2.append(l10);
        return true;
    }

    public String toString() {
        int i9 = this.c;
        j$.time.temporal.o oVar = this.a;
        x xVar = this.d;
        int i10 = this.b;
        if (i10 == 1 && i9 == 19 && xVar == x.NORMAL) {
            return "Value(" + oVar + ")";
        }
        if (i10 == i9 && xVar == x.NOT_NEGATIVE) {
            return "Value(" + oVar + "," + i10 + ")";
        }
        return "Value(" + oVar + "," + i10 + "," + i9 + "," + xVar + ")";
    }
}
