package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class p0 extends q0 {
    public final int e;
    public final int f;

    public p0(byte[] bArr, int i7, int i10) {
        super(bArr);
        q0.l(i7, i7 + i10, bArr.length);
        this.e = i7;
        this.f = i10;
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final byte f(int i7) {
        int i10 = this.f;
        if (((i10 - (i7 + 1)) | i7) >= 0) {
            return this.b[this.e + i7];
        }
        if (i7 < 0) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append("Index < 0: ");
            sb2.append(i7);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Index > length: ");
        sb3.append(i7);
        sb3.append(", ");
        sb3.append(i10);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final int i() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final byte k(int i7) {
        return this.b[this.e + i7];
    }

    @Override // com.google.android.gms.internal.vision.q0
    public final int m() {
        return this.e;
    }
}
