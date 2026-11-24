// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class jt8 implements z8c {
    public final /* synthetic */ byte a;
    public boolean b = false;
    public boolean c = false;
    public w84 d;
    public final ao7 e;

    public /* synthetic */ jt8(ao7 ao7Var, byte b) {
        this.a = b;
        this.e = ao7Var;
    }

    @Override // z8c
    public final z8c b(String str) {
        byte b = this.a;
        ao7 ao7Var = this.e;
        switch (b) {
            case 0:
                if (this.b) {
                    throw new t24("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((ht8) ao7Var).i(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new t24("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((y7d) ao7Var).c(this.d, str, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new t24("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((o8d) ao7Var).c(this.d, str, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new t24("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((pid) ao7Var).c(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new t24("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((tkd) ao7Var).c(this.d, str, this.c);
                return this;
        }
    }

    @Override // z8c
    public final z8c c(boolean z) {
        byte b = this.a;
        ao7 ao7Var = this.e;
        switch (b) {
            case 0:
                if (this.b) {
                    throw new t24("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((ht8) ao7Var).c(this.d, z ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new t24("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((y7d) ao7Var).h(this.d, z ? 1 : 0, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new t24("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((o8d) ao7Var).h(this.d, z ? 1 : 0, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new t24("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((pid) ao7Var).h(this.d, z ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new t24("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((tkd) ao7Var).h(this.d, z ? 1 : 0, this.c);
                return this;
        }
    }
}
