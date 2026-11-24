// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
