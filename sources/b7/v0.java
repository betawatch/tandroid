package b7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class v0 extends w0 {
    public final int d;
    public final int e;

    public v0(byte[] bArr, int i10, int i11) {
        super(bArr);
        w0.s(i10, i10 + i11, bArr.length);
        this.d = i10;
        this.e = i11;
    }

    @Override // b7.w0
    public final byte i(int i10) {
        int i11 = this.e;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[this.d + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(kf.k0.j(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(android.support.v4.media.a.k(i10, i11, "Index > length: ", ", "));
    }

    @Override // b7.w0
    public final byte n(int i10) {
        return this.b[this.d + i10];
    }

    @Override // b7.w0
    public final int o() {
        return this.d;
    }

    @Override // b7.w0
    public final int p() {
        return this.e;
    }

    @Override // b7.w0
    public final void q(int i10, byte[] bArr) {
        System.arraycopy(this.b, this.d, bArr, 0, i10);
    }
}
