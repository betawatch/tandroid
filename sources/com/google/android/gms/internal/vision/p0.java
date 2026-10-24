package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class p0 extends q0 {
    public final int e;
    public final int f;

    public p0(byte[] bArr, int i10, int i11) {
        super(bArr);
        q0.p(i10, i10 + i11, bArr.length);
        this.e = i10;
        this.f = i11;
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final byte h(int i10) {
        int i11 = this.f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[this.e + i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append("Index < 0: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Index > length: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final int m() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final byte o(int i10) {
        return this.b[this.e + i10];
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final int q() {
        return this.e;
    }
}
