package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h0 implements ma.g {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public ma.c d;
    public final ma.e e;

    public /* synthetic */ h0(ma.e eVar, int i3) {
        this.a = i3;
        this.e = eVar;
    }

    @Override // ma.g
    public final ma.g d(String str) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new ma.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((g0) this.e).g(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new ma.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((pa.e) this.e).h(this.d, str, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new ma.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((x7.j) this.e).g(this.d, str, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new ma.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((y7.f) this.e).g(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new ma.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((z7.d0) this.e).g(this.d, str, this.c);
                return this;
        }
    }

    @Override // ma.g
    public final ma.g g(boolean z10) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new ma.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((g0) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new ma.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((pa.e) this.e).g(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new ma.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((x7.j) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new ma.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((y7.f) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new ma.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((z7.d0) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
        }
    }
}
