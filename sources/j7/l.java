package j7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l implements u9.g {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public u9.c d;
    public final u9.e e;

    public /* synthetic */ l(u9.e eVar, int i10) {
        this.a = i10;
        this.e = eVar;
    }

    @Override // u9.g
    public final u9.g f(String str) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new u9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((k) this.e).g(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new u9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((k7.f) this.e).g(this.d, str, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new u9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((l7.j0) this.e).g(this.d, str, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new u9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((n7.y) this.e).g(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new u9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((x9.e) this.e).h(this.d, str, this.c);
                return this;
        }
    }

    @Override // u9.g
    public final u9.g g(boolean z4) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new u9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((k) this.e).h(this.d, z4 ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new u9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((k7.f) this.e).h(this.d, z4 ? 1 : 0, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new u9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((l7.j0) this.e).h(this.d, z4 ? 1 : 0, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new u9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((n7.y) this.e).h(this.d, z4 ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new u9.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((x9.e) this.e).g(this.d, z4 ? 1 : 0, this.c);
                return this;
        }
    }
}
