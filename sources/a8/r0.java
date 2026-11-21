package a8;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class r0 implements na.g {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public na.c d;
    public final na.e e;

    public /* synthetic */ r0(na.e eVar, int i7) {
        this.a = i7;
        this.e = eVar;
    }

    @Override // na.g
    public final na.g f(String str) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new na.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((q0) this.e).g(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new na.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((c8.y) this.e).g(this.d, str, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new na.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((qa.e) this.e).h(this.d, str, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new na.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((y7.j) this.e).g(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new na.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((z7.f) this.e).g(this.d, str, this.c);
                return this;
        }
    }

    @Override // na.g
    public final na.g g(boolean z10) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new na.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((q0) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new na.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((c8.y) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new na.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((qa.e) this.e).g(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new na.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((y7.j) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new na.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((z7.f) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
        }
    }
}
