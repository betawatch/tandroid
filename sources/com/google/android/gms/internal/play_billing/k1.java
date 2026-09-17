package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
            throw new ArrayIndexOutOfBoundsException(i2.g.i(i10, "Index < 0: "));
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
