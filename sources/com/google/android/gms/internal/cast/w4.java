package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class w4 extends x4 {
    public final int d;

    public w4(byte[] bArr) {
        super(bArr);
        x4.o(bArr.length);
        this.d = 47;
    }

    @Override // com.google.android.gms.internal.cast.x4
    public final byte h(int i10) {
        int i11 = this.d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(i2.d.i(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a1.g.l(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.cast.x4
    public final byte m(int i10) {
        return this.b[i10];
    }

    @Override // com.google.android.gms.internal.cast.x4
    public final int n() {
        return this.d;
    }
}
