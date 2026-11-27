// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class l51 extends n51 {
    public final int e;
    public final int f;

    public l51(byte[] bArr, int i, int i2) {
        super(bArr);
        n51.i(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // n51
    public final byte h(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(uh9.k(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(c00.h(i, i2, "Index > length: ", ", "));
    }

    @Override // n51
    public final void k(int i, byte[] bArr) {
        System.arraycopy(this.b, this.e, bArr, 0, i);
    }

    @Override // n51
    public final int l() {
        return this.e;
    }

    @Override // n51
    public final byte m(int i) {
        return this.b[this.e + i];
    }

    @Override // n51
    public final int size() {
        return this.f;
    }
}
