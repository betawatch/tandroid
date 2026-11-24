// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k61 extends m61 {
    public final int e;
    public final int f;

    public k61(byte[] bArr, int i, int i2) {
        super(bArr);
        m61.i(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // m61
    public final byte h(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(hg9.j(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(b10.g(i, i2, "Index > length: ", ", "));
    }

    @Override // m61
    public final void k(int i, byte[] bArr) {
        System.arraycopy(this.b, this.e, bArr, 0, i);
    }

    @Override // m61
    public final int l() {
        return this.e;
    }

    @Override // m61
    public final byte m(int i) {
        return this.b[this.e + i];
    }

    @Override // m61
    public final int size() {
        return this.f;
    }
}
