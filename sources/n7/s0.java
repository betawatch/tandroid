package n7;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class s0 extends t0 {
    public final int d;
    public final int e;

    public s0(byte[] bArr, int i10, int i11) {
        super(bArr);
        t0.s(i10, i10 + i11, bArr.length);
        this.d = i10;
        this.e = i11;
    }

    @Override // n7.t0
    public final byte i(int i10) {
        int i11 = this.e;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[this.d + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(hg.k0.i(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a4.a.l(i10, i11, "Index > length: ", ", "));
    }

    @Override // n7.t0
    public final byte n(int i10) {
        return this.b[this.d + i10];
    }

    @Override // n7.t0
    public final int o() {
        return this.d;
    }

    @Override // n7.t0
    public final int p() {
        return this.e;
    }

    @Override // n7.t0
    public final void q(int i10, byte[] bArr) {
        System.arraycopy(this.b, this.d, bArr, 0, i10);
    }
}
