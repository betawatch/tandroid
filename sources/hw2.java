// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hw2 extends ph0 {
    public final int F;
    public final long G;
    public final n41 H;
    public long I;
    public volatile boolean J;
    public boolean K;

    public hw2(a83 a83Var, g83 g83Var, go4 go4Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, n41 n41Var) {
        super(a83Var, g83Var, go4Var, i, obj, j, j2, j3, j4, j5);
        this.F = i2;
        this.G = j6;
        this.H = n41Var;
    }

    @Override // ja6
    public final void a() {
        lx6 lx6Var = this.y;
        lx6Var.getClass();
        if (this.I == 0) {
            long j = this.G;
            for (hr9 hr9Var : (hr9[]) lx6Var.c) {
                if (hr9Var.I != j) {
                    hr9Var.I = j;
                    hr9Var.C = true;
                }
            }
            n41 n41Var = this.H;
            long j2 = this.w;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.G;
            long j4 = this.x;
            n41Var.b(lx6Var, j3, j4 != -9223372036854775807L ? j4 - this.G : -9223372036854775807L);
        }
        try {
            g83 b = this.b.b(this.I);
            c0b c0bVar = this.r;
            vb3 vb3Var = new vb3(c0bVar, b.e, c0bVar.open(b));
            while (!this.J) {
                try {
                    int b2 = this.H.a.b(vb3Var, n41.s);
                    jte.p(b2 != 1);
                    if (!(b2 == 0)) {
                        break;
                    }
                } finally {
                    this.I = vb3Var.d - this.b.e;
                }
            }
            go4 go4Var = this.d;
            String str = go4Var.s;
            int i = go4Var.V;
            int i2 = go4Var.W;
            if (wf7.k(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                yzb R = lx6Var.R(4);
                int i3 = i * i2;
                long j5 = (this.n - this.h) / i3;
                for (int i4 = 1; i4 < i3; i4++) {
                    R.e(0, new yw7());
                    R.a(i4 * j5, 0, 0, 0, null);
                }
            }
            wde.a(this.r);
            this.K = !this.J;
        } catch (Throwable th) {
            wde.a(this.r);
            throw th;
        }
    }

    @Override // dm6
    public final long b() {
        return this.s + this.F;
    }

    @Override // dm6
    public final boolean c() {
        return this.K;
    }

    @Override // ja6
    public final void e() {
        this.J = true;
    }
}
