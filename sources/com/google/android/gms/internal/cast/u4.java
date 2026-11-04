package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u4 extends v4 {
    public final int d;

    public u4(byte[] bArr) {
        super(bArr);
        v4.k(bArr.length);
        this.d = 47;
    }

    @Override // com.google.android.gms.internal.cast.v4
    public final byte h(int i3) {
        int i10 = this.d;
        if (((i10 - (i3 + 1)) | i3) >= 0) {
            return this.b[i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(k2.p1.i(i3, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a1.g.n(i3, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.cast.v4
    public final byte i(int i3) {
        return this.b[i3];
    }

    @Override // com.google.android.gms.internal.cast.v4
    public final int j() {
        return this.d;
    }
}
