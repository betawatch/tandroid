package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
