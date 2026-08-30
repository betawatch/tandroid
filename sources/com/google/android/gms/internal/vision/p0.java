package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class p0 extends q0 {
    public final int e;
    public final int f;

    public p0(byte[] bArr, int i10, int i11) {
        super(bArr);
        q0.q(i10, i10 + i11, bArr.length);
        this.e = i10;
        this.f = i11;
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final byte i(int i10) {
        int i11 = this.f;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.b[this.e + i10];
        }
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final int n() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final byte p(int i10) {
        return this.b[this.e + i10];
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final int r() {
        return this.e;
    }
}
