// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ace extends rce {
    public final int d;
    public final int e;

    public ace(byte[] bArr, int i, int i2) {
        super(bArr);
        rce.n(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    @Override // rce
    public final byte h(int i) {
        int i2 = this.e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.d + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(hg9.j(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(b10.g(i, i2, "Index > length: ", ", "));
    }

    @Override // rce
    public final byte i(int i) {
        return this.b[this.d + i];
    }

    @Override // rce
    public final int j() {
        return this.d;
    }

    @Override // rce
    public final int k() {
        return this.e;
    }

    @Override // rce
    public final void l(int i, byte[] bArr) {
        System.arraycopy(this.b, this.d, bArr, 0, i);
    }
}
