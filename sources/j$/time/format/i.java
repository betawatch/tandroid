package j$.time.format;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public class i implements f {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final j$.time.temporal.o a;
    public final byte b;
    public final byte c;
    public final x d;
    public final int e;

    /* JADX WARN: Multi-variable type inference failed */
    public i(j$.time.temporal.o oVar, int i, int i2, x xVar) {
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = xVar;
        this.e = 0;
    }

    public i a() {
        if (this.e == -1) {
            return this;
        }
        return new i(this.a, this.b, this.c, this.d, -1);
    }

    public i b(int i) {
        return new i(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.f
    public boolean j(r rVar, StringBuilder sb) {
        j$.time.temporal.o oVar = this.a;
        Long a = rVar.a(oVar);
        if (a == null) {
            return false;
        }
        long longValue = a.longValue();
        v vVar = rVar.b.c;
        String l = longValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(longValue));
        int length = l.length();
        byte b = this.c;
        if (length > b) {
            throw new j$.time.c("Field " + oVar + " cannot be printed as the value " + longValue + " exceeds the maximum print width of " + ((int) b));
        }
        vVar.getClass();
        byte b2 = this.b;
        x xVar = this.d;
        if (longValue >= 0) {
            int i = c.a[xVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    sb.append('+');
                }
            } else if (b2 < 19 && longValue >= f[b2]) {
                sb.append('+');
            }
        } else {
            int i2 = c.a[xVar.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                sb.append('-');
            } else if (i2 == 4) {
                throw new j$.time.c("Field " + oVar + " cannot be printed as the value " + longValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i3 = 0; i3 < b2 - l.length(); i3++) {
            sb.append('0');
        }
        sb.append(l);
        return true;
    }

    public String toString() {
        byte b = this.c;
        j$.time.temporal.o oVar = this.a;
        x xVar = this.d;
        byte b2 = this.b;
        if (b2 == 1 && b == 19 && xVar == x.NORMAL) {
            return "Value(" + oVar + ")";
        }
        if (b2 == b && xVar == x.NOT_NEGATIVE) {
            return "Value(" + oVar + "," + ((int) b2) + ")";
        }
        return "Value(" + oVar + "," + ((int) b2) + "," + ((int) b) + "," + xVar + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(j$.time.temporal.o oVar, int i, int i2, x xVar, int i3) {
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = xVar;
        this.e = i3;
    }
}
