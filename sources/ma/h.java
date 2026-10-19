package ma;

import v7.j;
import x7.e0;
import z7.y;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class h implements ja.g {
    public final /* synthetic */ int a;
    public boolean b = false;
    public boolean c = false;
    public ja.c d;
    public final ja.e e;

    public /* synthetic */ h(ja.e eVar, int i10) {
        this.a = i10;
        this.e = eVar;
    }

    @Override // ja.g
    public final ja.g b(String str) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new ja.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((f) this.e).h(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new ja.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((j) this.e).c(this.d, str, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new ja.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((w7.f) this.e).c(this.d, str, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new ja.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((e0) this.e).c(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new ja.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((y) this.e).c(this.d, str, this.c);
                return this;
        }
    }

    @Override // ja.g
    public final ja.g c(boolean z10) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    throw new ja.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((f) this.e).c(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new ja.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((j) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new ja.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((w7.f) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new ja.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((e0) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new ja.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((y) this.e).h(this.d, z10 ? 1 : 0, this.c);
                return this;
        }
    }
}
