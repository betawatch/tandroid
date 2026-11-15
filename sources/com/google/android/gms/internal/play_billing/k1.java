package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class k1 extends l1 {
    public final int d;

    public k1(byte[] bArr, int i7) {
        super(bArr);
        l1.k(0, i7, bArr.length);
        this.d = i7;
    }

    @Override // com.google.android.gms.internal.play_billing.l1
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

    @Override // com.google.android.gms.internal.play_billing.l1
    public final byte i(int i7) {
        return this.b[i7];
    }

    @Override // com.google.android.gms.internal.play_billing.l1
    public final int j() {
        return this.d;
    }
}
