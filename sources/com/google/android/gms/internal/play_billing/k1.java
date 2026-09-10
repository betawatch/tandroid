package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class k1 extends l1 {
    public final int d;

    public k1(byte[] bArr, int i10) {
        super(bArr);
        l1.p(0, i10, bArr.length);
        this.d = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.l1
    public final byte i(int i10) {
        int i11 = this.d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(hc.b.j(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a4.a.l(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.l1
    public final byte n(int i10) {
        return this.b[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.l1
    public final int o() {
        return this.d;
    }
}
