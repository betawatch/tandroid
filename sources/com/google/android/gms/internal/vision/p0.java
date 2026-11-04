package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p0 extends q0 {
    public final int e;
    public final int f;

    public p0(byte[] bArr, int i3, int i10) {
        super(bArr);
        q0.l(i3, i3 + i10, bArr.length);
        this.e = i3;
        this.f = i10;
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final byte h(int i3) {
        int i10 = this.f;
        if (((i10 - (i3 + 1)) | i3) >= 0) {
            return this.b[this.e + i3];
        }
        if (i3 < 0) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append("Index < 0: ");
            sb2.append(i3);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Index > length: ");
        sb3.append(i3);
        sb3.append(", ");
        sb3.append(i10);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final int i() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final byte k(int i3) {
        return this.b[this.e + i3];
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final int m() {
        return this.e;
    }
}
