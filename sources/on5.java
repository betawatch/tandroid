// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class on5 extends zg2 {
    public final f31 s;
    public tg2 w;
    public long x;
    public volatile boolean y;

    public on5(o63 o63Var, u63 u63Var, fm4 fm4Var, int i, Object obj, f31 f31Var) {
        super(o63Var, u63Var, 2, fm4Var, i, obj, -9223372036854775807L, -9223372036854775807L, null);
        this.s = f31Var;
    }

    @Override // k86
    public final void a() {
        if (this.x == 0) {
            this.s.b(this.w, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            u63 b = this.b.b(this.x);
            zxa zxaVar = this.r;
            ja3 ja3Var = new ja3(zxaVar, b.e, zxaVar.open(b));
            while (!this.y) {
                try {
                    int b2 = this.s.a.b(ja3Var, f31.s);
                    boolean z = false;
                    gre.p(b2 != 1);
                    if (b2 == 0) {
                        z = true;
                    }
                    if (!z) {
                        break;
                    }
                } finally {
                    this.x = ja3Var.d - this.b.e;
                    this.s.a();
                }
            }
        } finally {
            vbe.a(this.r);
        }
    }

    @Override // k86
    public final void d() {
        this.y = true;
    }
}
