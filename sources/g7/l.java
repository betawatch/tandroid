package g7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l implements r9.g {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public r9.c d;
    public final r9.e e;

    public /* synthetic */ l(r9.e eVar, int i10) {
        this.a = i10;
        this.e = eVar;
    }

    @Override // r9.g
    public final r9.g b(String str) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((k) this.e).f(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((h7.f) this.e).f(this.d, str, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((i7.j0) this.e).f(this.d, str, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((k7.y) this.e).f(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((u9.e) this.e).h(this.d, str, this.c);
                return this;
        }
    }

    @Override // r9.g
    public final r9.g f(boolean z10) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((k) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((h7.f) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((i7.j0) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((k7.y) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new r9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((u9.e) this.e).f(this.d, z10 ? 1 : 0, this.c);
                return this;
        }
    }
}
