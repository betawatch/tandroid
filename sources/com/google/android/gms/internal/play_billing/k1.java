package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k1 extends l1 {
    public final int d;

    public k1(byte[] bArr, int i9) {
        super(bArr);
        l1.p(0, i9, bArr.length);
        this.d = i9;
    }

    @Override // com.google.android.gms.internal.play_billing.l1
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

    @Override // com.google.android.gms.internal.play_billing.l1
    public final byte n(int i9) {
        return this.b[i9];
    }

    @Override // com.google.android.gms.internal.play_billing.l1
    public final int o() {
        return this.d;
    }
}
