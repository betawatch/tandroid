package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class v4 extends w4 {
    public final int d;

    public v4(byte[] bArr) {
        super(bArr);
        w4.p(bArr.length);
        this.d = 47;
    }

    @Override // com.google.android.gms.internal.cast.w4
    public final byte i(int i10) {
        int i11 = this.d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(l.d.j(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(android.support.v4.media.a.k(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.cast.w4
    public final byte n(int i10) {
        return this.b[i10];
    }

    @Override // com.google.android.gms.internal.cast.w4
    public final int o() {
        return this.d;
    }
}
