// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kv8 implements abc {
    public final /* synthetic */ byte a;
    public boolean b = false;
    public boolean c = false;
    public wa4 d;
    public final dq7 e;

    public /* synthetic */ kv8(dq7 dq7Var, byte b) {
        this.a = b;
        this.e = dq7Var;
    }

    @Override // abc
    public final abc b(String str) {
        byte b = this.a;
        dq7 dq7Var = this.e;
        switch (b) {
            case 0:
                if (this.b) {
                    throw new e44("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((iv8) dq7Var).i(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new e44("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((aad) dq7Var).c(this.d, str, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new e44("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((qad) dq7Var).c(this.d, str, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new e44("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((rkd) dq7Var).c(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new e44("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((vmd) dq7Var).c(this.d, str, this.c);
                return this;
        }
    }

    @Override // abc
    public final abc c(boolean z) {
        byte b = this.a;
        dq7 dq7Var = this.e;
        switch (b) {
            case 0:
                if (this.b) {
                    throw new e44("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((iv8) dq7Var).c(this.d, z ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new e44("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((aad) dq7Var).h(this.d, z ? 1 : 0, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new e44("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((qad) dq7Var).h(this.d, z ? 1 : 0, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new e44("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((rkd) dq7Var).h(this.d, z ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new e44("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((vmd) dq7Var).h(this.d, z ? 1 : 0, this.c);
                return this;
        }
    }
}
