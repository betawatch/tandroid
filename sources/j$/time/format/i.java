package j$.time.format;

/* loaded from: classes2.dex */
public class i implements f {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final j$.time.temporal.o a;
    public final int b;
    public final int c;
    public final x d;
    public final int e;

    public i(j$.time.temporal.o oVar, int i10, int i11, x xVar) {
        this.a = oVar;
        this.b = i10;
        this.c = i11;
        this.d = xVar;
        this.e = 0;
    }

    public i(j$.time.temporal.o oVar, int i10, int i11, x xVar, int i12) {
        this.a = oVar;
        this.b = i10;
        this.c = i11;
        this.d = xVar;
        this.e = i12;
    }

    public i a() {
        if (this.e == -1) {
            return this;
        }
        return new i(this.a, this.b, this.c, this.d, -1);
    }

    public i b(int i10) {
        return new i(this.a, this.b, this.c, this.d, this.e + i10);
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
        String l4 = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l4.length();
        int i10 = this.c;
        if (length > i10) {
            throw new j$.time.b("Field " + oVar + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + i10);
        }
        vVar.getClass();
        int i11 = this.b;
        x xVar = this.d;
        if (longValue >= 0) {
            int i12 = c.a[xVar.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    sb2.append('+');
                }
            } else if (i11 < 19 && longValue >= f[i11]) {
                sb2.append('+');
            }
        } else {
            int i13 = c.a[xVar.ordinal()];
            if (i13 == 1 || i13 == 2 || i13 == 3) {
                sb2.append('-');
            } else if (i13 == 4) {
                throw new j$.time.b("Field " + oVar + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i14 = 0; i14 < i11 - l4.length(); i14++) {
            sb2.append('0');
        }
        sb2.append(l4);
        return true;
    }

    public String toString() {
        int i10 = this.c;
        j$.time.temporal.o oVar = this.a;
        x xVar = this.d;
        int i11 = this.b;
        if (i11 == 1 && i10 == 19 && xVar == x.NORMAL) {
            return "Value(" + oVar + ")";
        }
        if (i11 == i10 && xVar == x.NOT_NEGATIVE) {
            return "Value(" + oVar + "," + i11 + ")";
        }
        return "Value(" + oVar + "," + i11 + "," + i10 + "," + xVar + ")";
    }
}
