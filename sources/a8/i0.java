package a8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i0 implements ka.g {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public ka.c d;
    public final ka.e e;

    public /* synthetic */ i0(ka.e eVar, int i10) {
        this.a = i10;
        this.e = eVar;
    }

    @Override // ka.g
    public final ka.g b(String str) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new ka.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((g0) this.e).c(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new ka.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((na.e) this.e).h(this.d, str, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new ka.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((w7.j) this.e).c(this.d, str, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new ka.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((x7.f) this.e).c(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new ka.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((y7.d0) this.e).c(this.d, str, this.c);
                return this;
        }
    }

    @Override // ka.g
    public final ka.g c(boolean z10) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new ka.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((g0) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new ka.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((na.e) this.e).c(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new ka.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((w7.j) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new ka.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((x7.f) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new ka.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((y7.d0) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
        }
    }
}
