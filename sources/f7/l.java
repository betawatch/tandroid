package f7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l implements q9.g {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public q9.c d;
    public final q9.e e;

    public /* synthetic */ l(q9.e eVar, int i9) {
        this.a = i9;
        this.e = eVar;
    }

    @Override // q9.g
    public final q9.g e(String str) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new q9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((k) this.e).f(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new q9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((g7.f) this.e).f(this.d, str, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new q9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((h7.j0) this.e).f(this.d, str, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new q9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((j7.y) this.e).f(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new q9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((t9.e) this.e).h(this.d, str, this.c);
                return this;
        }
    }

    @Override // q9.g
    public final q9.g f(boolean z10) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new q9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((k) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new q9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((g7.f) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new q9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((h7.j0) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new q9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((j7.y) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new q9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((t9.e) this.e).f(this.d, z10 ? 1 : 0, this.c);
                return this;
        }
    }
}
