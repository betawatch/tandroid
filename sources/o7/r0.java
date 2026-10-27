package o7;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r0 extends s0 {
    public final int d;
    public final int e;

    public r0(byte[] bArr, int i10, int i11) {
        super(bArr);
        s0.r(i10, i10 + i11, bArr.length);
        this.d = i10;
        this.e = i11;
    }

    @Override // o7.s0
    public final byte h(int i10) {
        int i11 = this.e;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[this.d + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(ic.a.i(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a1.g.l(i10, i11, "Index > length: ", ", "));
    }

    @Override // o7.s0
    public final byte m(int i10) {
        return this.b[this.d + i10];
    }

    @Override // o7.s0
    public final int n() {
        return this.d;
    }

    @Override // o7.s0
    public final int o() {
        return this.e;
    }

    @Override // o7.s0
    public final void p(int i10, byte[] bArr) {
        System.arraycopy(this.b, this.d, bArr, 0, i10);
    }
}
