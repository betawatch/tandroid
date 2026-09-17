package n7;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class r0 extends s0 {
    public final int d;
    public final int e;

    public r0(byte[] bArr, int i10, int i11) {
        super(bArr);
        s0.s(i10, i10 + i11, bArr.length);
        this.d = i10;
        this.e = i11;
    }

    @Override // n7.s0
    public final byte i(int i10) {
        int i11 = this.e;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[this.d + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(i2.g.i(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a4.a.l(i10, i11, "Index > length: ", ", "));
    }

    @Override // n7.s0
    public final byte n(int i10) {
        return this.b[this.d + i10];
    }

    @Override // n7.s0
    public final int o() {
        return this.d;
    }

    @Override // n7.s0
    public final int p() {
        return this.e;
    }

    @Override // n7.s0
    public final void q(int i10, byte[] bArr) {
        System.arraycopy(this.b, this.d, bArr, 0, i10);
    }
}
