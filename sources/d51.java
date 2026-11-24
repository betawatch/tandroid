// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class d51 extends f51 {
    public final int e;
    public final int f;

    public d51(byte[] bArr, int i, int i2) {
        super(bArr);
        f51.i(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // f51
    public final byte h(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(de9.k(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(b00.g(i, i2, "Index > length: ", ", "));
    }

    @Override // f51
    public final void k(int i, byte[] bArr) {
        System.arraycopy(this.b, this.e, bArr, 0, i);
    }

    @Override // f51
    public final int l() {
        return this.e;
    }

    @Override // f51
    public final byte m(int i) {
        return this.b[this.e + i];
    }

    @Override // f51
    public final int size() {
        return this.f;
    }
}
