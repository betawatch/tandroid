package kb;

import j3.r0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends d {
    public final byte[] c;
    public final int d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i9, int i10, int[] iArr) {
        super(i9, i10);
        int i11 = i9 * i10;
        if (iArr.length < i11) {
            throw new IllegalArgumentException("Pixel array length is less than width * height");
        }
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            bArr[i12] = (byte) (((((i13 >> 16) & 255) + ((i13 >> 7) & 510)) + (i13 & 255)) / 4);
        }
        this.c = bArr;
        this.d = i9;
        this.e = i10;
    }

    @Override // kb.d
    public final byte[] a() {
        byte[] bArr = this.c;
        int i9 = this.a;
        int i10 = this.b;
        int i11 = this.d;
        if (i9 == i11 && i10 == this.e) {
            return bArr;
        }
        int i12 = i9 * i10;
        byte[] bArr2 = new byte[i12];
        if (i9 == i11) {
            System.arraycopy(bArr, 0, bArr2, 0, i12);
            return bArr2;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            System.arraycopy(bArr, i13, bArr2, i14 * i9, i9);
            i13 += i11;
        }
        return bArr2;
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
        System.arraycopy(this.c, i9 * this.d, bArr, 0, i10);
        return bArr;
    }
}
