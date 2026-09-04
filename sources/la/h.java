package la;

import v7.j;
import x7.e0;
import z7.y;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class h implements ia.g {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public ia.c d;
    public final ia.e e;

    public /* synthetic */ h(ia.e eVar, int i10) {
        this.a = i10;
        this.e = eVar;
    }

    @Override // ia.g
    public final ia.g b(String str) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new ia.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((f) this.e).h(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new ia.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((j) this.e).d(this.d, str, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new ia.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((w7.f) this.e).d(this.d, str, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new ia.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((e0) this.e).d(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new ia.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((y) this.e).d(this.d, str, this.c);
                return this;
        }
    }

    @Override // ia.g
    public final ia.g d(boolean z10) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new ia.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((f) this.e).d(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new ia.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((j) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new ia.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((w7.f) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new ia.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((e0) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new ia.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((y) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
        }
    }
}
