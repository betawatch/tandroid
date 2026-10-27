package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class t4 extends u4 {
    public final int d;

    public t4(byte[] bArr) {
        super(bArr);
        u4.o(bArr.length);
        this.d = 47;
    }

    @Override // com.google.android.gms.internal.cast.u4
    public final byte h(int i10) {
        int i11 = this.d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(ic.a.i(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a1.g.l(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.cast.u4
    public final byte m(int i10) {
        return this.b[i10];
    }

    @Override // com.google.android.gms.internal.cast.u4
    public final int n() {
        return this.d;
    }
}
