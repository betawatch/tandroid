package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p0 extends q0 {
    public final int e;
    public final int f;

    public p0(byte[] bArr, int i9, int i10) {
        super(bArr);
        q0.q(i9, i9 + i10, bArr.length);
        this.e = i9;
        this.f = i10;
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final byte i(int i9) {
        int i10 = this.f;
        if (((i10 - (i9 + 1)) | i9) >= 0) {
            return this.b[this.e + i9];
        }
        if (i9 < 0) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append("Index < 0: ");
            sb2.append(i9);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Index > length: ");
        sb3.append(i9);
        sb3.append(", ");
        sb3.append(i10);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final int n() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final byte p(int i9) {
        return this.b[this.e + i9];
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final int r() {
        return this.e;
    }
}
