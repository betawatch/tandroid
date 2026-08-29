package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j1 extends k1 {
    public final int d;

    public j1(byte[] bArr, int i10) {
        super(bArr);
        k1.p(0, i10, bArr.length);
        this.d = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final byte i(int i10) {
        int i11 = this.d;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(j7.l1.k(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a4.w.k(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final byte n(int i10) {
        return this.b[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.k1
    public final int o() {
        return this.d;
    }
}
