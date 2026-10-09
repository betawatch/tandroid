package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class w4 extends x4 {
    public final int d;

    public w4(byte[] bArr) {
        super(bArr);
        x4.p(bArr.length);
        this.d = 47;
    }

    @Override // com.google.android.gms.internal.cast.x4
    public final byte i(int i10) {
        int i11 = this.d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(hg.c.h(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a1.g.m(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.cast.x4
    public final byte n(int i10) {
        return this.b[i10];
    }

    @Override // com.google.android.gms.internal.cast.x4
    public final int o() {
        return this.d;
    }
}
