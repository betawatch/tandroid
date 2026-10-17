package n7;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class s0 extends t0 {
    public final int d;
    public final int e;

    public s0(byte[] bArr, int i10, int i11) {
        super(bArr);
        t0.r(i10, i10 + i11, bArr.length);
        this.d = i10;
        this.e = i11;
    }

    @Override // n7.t0
    public final byte h(int i10) {
        int i11 = this.e;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[this.d + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(i0.a.j(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a1.g.l(i10, i11, "Index > length: ", ", "));
    }

    @Override // n7.t0
    public final byte m(int i10) {
        return this.b[this.d + i10];
    }

    @Override // n7.t0
    public final int n() {
        return this.d;
    }

    @Override // n7.t0
    public final int o() {
        return this.e;
    }

    @Override // n7.t0
    public final void p(int i10, byte[] bArr) {
        System.arraycopy(this.b, this.d, bArr, 0, i10);
    }
}
