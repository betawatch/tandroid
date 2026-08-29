package h7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l implements s9.g {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public s9.c d;
    public final s9.e e;

    public /* synthetic */ l(s9.e eVar, int i10) {
        this.a = i10;
        this.e = eVar;
    }

    @Override // s9.g
    public final s9.g f(String str) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new s9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((k) this.e).g(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new s9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((i7.f) this.e).g(this.d, str, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new s9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((j7.j0) this.e).g(this.d, str, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new s9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((l7.y) this.e).g(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new s9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((v9.e) this.e).h(this.d, str, this.c);
                return this;
        }
    }

    @Override // s9.g
    public final s9.g g(boolean z10) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new s9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((k) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new s9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((i7.f) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new s9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((j7.j0) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new s9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((l7.y) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new s9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((v9.e) this.e).g(this.d, z10 ? 1 : 0, this.c);
                return this;
        }
    }
}
