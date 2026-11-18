package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class t4 extends u4 {
    public final int d;

    public t4(byte[] bArr) {
        super(bArr);
        u4.k(bArr.length);
        this.d = 47;
    }

    @Override // com.google.android.gms.internal.cast.u4
    public final byte f(int i7) {
        int i10 = this.d;
        if (((i10 - (i7 + 1)) | i7) >= 0) {
            return this.b[i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(i5.c.i(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a8.p0.m(i7, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.cast.u4
    public final byte i(int i7) {
        return this.b[i7];
    }

    @Override // com.google.android.gms.internal.cast.u4
    public final int j() {
        return this.d;
    }
}
