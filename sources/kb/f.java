package kb;

import j3.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends d {
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public f(int i9, int i10, int i11, int i12, int i13, int i14) {
        super(i13, i14);
        if (i13 + i11 > i9 || i14 + i12 > i10) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.c = i9;
        this.d = i10;
        this.e = i11;
        this.f = i12;
    }

    @Override // kb.d
    public final byte[] a() {
        int i9 = this.a;
        int i10 = this.b;
        int i11 = this.c;
        if (i9 == i11 && i10 == this.d) {
            return null;
        }
        int i12 = i9 * i10;
        byte[] bArr = new byte[i12];
        int i13 = (this.f * i11) + this.e;
        if (i9 == i11) {
            System.arraycopy(null, i13, bArr, 0, i12);
            return bArr;
        }
        for (int i14 = 0; i14 < i10; i14++) {
            System.arraycopy(null, i13, bArr, i14 * i9, i9);
            i13 += i11;
        }
        return bArr;
    }

    @Override // kb.d
    public final byte[] b(int i9, byte[] bArr) {
        if (i9 < 0 || i9 >= this.b) {
            throw new IllegalArgumentException(r0.l(i9, "Requested row is outside the image: "));
        }
        int i10 = this.a;
        if (bArr == null || bArr.length < i10) {
            bArr = new byte[i10];
        }
        System.arraycopy(null, ((i9 + this.f) * this.c) + this.e, bArr, 0, i10);
        return bArr;
    }
}
