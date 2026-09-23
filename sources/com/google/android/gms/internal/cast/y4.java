package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class y4 extends z4 {
    public final int d;

    public y4(byte[] bArr) {
        super(bArr);
        z4.p(bArr.length);
        this.d = 47;
    }

    @Override // com.google.android.gms.internal.cast.z4
    public final byte i(int i10) {
        int i11 = this.d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(hg.c.i(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a4.a.m(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.cast.z4
    public final byte n(int i10) {
        return this.b[i10];
    }

    @Override // com.google.android.gms.internal.cast.z4
    public final int o() {
        return this.d;
    }
}
