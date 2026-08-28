package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w4 extends x4 {
    public final int d;

    public w4(byte[] bArr) {
        super(bArr);
        x4.p(bArr.length);
        this.d = 47;
    }

    @Override // com.google.android.gms.internal.cast.x4
    public final byte i(int i9) {
        int i10 = this.d;
        if (((i10 - (i9 + 1)) | i9) >= 0) {
            return this.b[i9];
        }
        if (i9 < 0) {
            throw new ArrayIndexOutOfBoundsException(j3.r0.l(i9, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(aa.d.k(i9, i10, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.cast.x4
    public final byte n(int i9) {
        return this.b[i9];
    }

    @Override // com.google.android.gms.internal.cast.x4
    public final int o() {
        return this.d;
    }
}
