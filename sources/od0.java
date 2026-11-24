// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class od0 implements ix9 {
    public final /* synthetic */ byte a;
    public final long b;
    public final Object c;

    public od0(long j, long j2) {
        this.a = (byte) 2;
        this.b = j;
        kx9 kx9Var = j2 == 0 ? kx9.c : new kx9(0L, j2);
        this.c = new hx9(kx9Var, kx9Var);
    }

    @Override // ix9
    public final boolean c() {
        switch (this.a) {
            case 0:
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // ix9
    public final boolean d() {
        byte b = this.a;
        return false;
    }

    @Override // ix9
    public final hx9 f(long j) {
        long j2;
        long j3;
        byte b = this.a;
        int i = 1;
        Object obj = this.c;
        switch (b) {
            case 0:
                qd0 qd0Var = (qd0) obj;
                hx9 b2 = qd0Var.i[0].b(j);
                while (true) {
                    qi2[] qi2VarArr = qd0Var.i;
                    if (i >= qi2VarArr.length) {
                        return b2;
                    }
                    hx9 b3 = qi2VarArr[i].b(j);
                    if (b3.a.b < b2.a.b) {
                        b2 = b3;
                    }
                    i++;
                }
            case 1:
                gk4 gk4Var = (gk4) obj;
                gk4Var.k.getClass();
                lx6 lx6Var = gk4Var.k;
                long[] jArr = (long[]) lx6Var.b;
                long[] jArr2 = (long[]) lx6Var.c;
                int f = hac.f(jArr, hac.j((gk4Var.e * j) / 1000000, 0L, gk4Var.j - 1), false);
                if (f == -1) {
                    j3 = 0;
                    j2 = 0;
                } else {
                    j2 = jArr[f];
                    j3 = jArr2[f];
                }
                int i2 = gk4Var.e;
                long j4 = (j2 * 1000000) / i2;
                long j5 = this.b;
                kx9 kx9Var = new kx9(j4, j3 + j5);
                if (j4 == j || f == jArr.length - 1) {
                    return new hx9(kx9Var, kx9Var);
                }
                int i3 = f + 1;
                return new hx9(kx9Var, new kx9((jArr[i3] * 1000000) / i2, j5 + jArr2[i3]));
            default:
                return (hx9) obj;
        }
    }

    @Override // ix9
    public final long h() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((gk4) this.c).b();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public od0(long j) {
        this(j, 0L);
        this.a = (byte) 2;
    }

    public /* synthetic */ od0(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
