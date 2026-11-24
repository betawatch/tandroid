// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hwd extends cxd {
    public final int d;

    public hwd(int i, byte[] bArr) {
        super(bArr);
        cxd.k(0, i, bArr.length);
        this.d = i;
    }

    @Override // cxd
    public final byte h(int i) {
        int i2 = this.d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(hg9.j(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(b10.g(i, i2, "Index > length: ", ", "));
    }

    @Override // cxd
    public final byte i(int i) {
        return this.b[i];
    }

    @Override // cxd
    public final int j() {
        return this.d;
    }
}
