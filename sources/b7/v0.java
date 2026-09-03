package b7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            throw new ArrayIndexOutOfBoundsException(l.d.j(i10, "Index < 0: "));
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
