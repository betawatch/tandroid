// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class op5 extends ni2 {
    public final n41 s;
    public lx6 w;
    public long x;
    public volatile boolean y;

    public op5(a83 a83Var, g83 g83Var, go4 go4Var, int i, Object obj, n41 n41Var) {
        super(a83Var, g83Var, 2, go4Var, i, obj, -9223372036854775807L, -9223372036854775807L, null);
        this.s = n41Var;
    }

    @Override // ja6
    public final void a() {
        if (this.x == 0) {
            this.s.b(this.w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g83 b = this.b.b(this.x);
            c0b c0bVar = this.r;
            vb3 vb3Var = new vb3(c0bVar, b.e, c0bVar.open(b));
            while (!this.y) {
                try {
                    int b2 = this.s.a.b(vb3Var, n41.s);
                    boolean z = false;
                    jte.p(b2 != 1);
                    if (b2 == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } finally {
                    this.x = vb3Var.d - this.b.e;
                    this.s.a();
                }
            }
        } finally {
            wde.a(this.r);
        }
    }

    @Override // ja6
    public final void e() {
        this.y = true;
    }
}
