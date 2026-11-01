package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class u4 extends v4 {
    public final int d;

    public u4(byte[] bArr) {
        super(bArr);
        v4.o(bArr.length);
        this.d = 47;
    }

    @Override // com.google.android.gms.internal.cast.v4
    public final byte l(int i10) {
        int i11 = this.d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(i0.a.i(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a1.g.j(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.cast.v4
    public final byte m(int i10) {
        return this.b[i10];
    }

    @Override // com.google.android.gms.internal.cast.v4
    public final int n() {
        return this.d;
    }
}
