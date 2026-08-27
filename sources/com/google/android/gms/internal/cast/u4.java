package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u4 extends v4 {
    public final int d;

    public u4(byte[] bArr) {
        super(bArr);
        v4.p(bArr.length);
        this.d = 47;
    }

    @Override // com.google.android.gms.internal.cast.v4
    public final byte i(int i10) {
        int i11 = this.d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(i0.a.k(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a9.p.j(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.cast.v4
    public final byte n(int i10) {
        return this.b[i10];
    }

    @Override // com.google.android.gms.internal.cast.v4
    public final int o() {
        return this.d;
    }
}
