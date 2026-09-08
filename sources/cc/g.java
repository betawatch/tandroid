package cc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class g extends d {
    public final byte[] c;
    public final int d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i10, int i11, int[] iArr) {
        super(i10, i11);
        int i12 = i10 * i11;
        if (iArr.length < i12) {
            throw new IllegalArgumentException("Pixel array length is less than width * height");
        }
        byte[] bArr = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = iArr[i13];
            bArr[i13] = (byte) (((((i14 >> 16) & 255) + ((i14 >> 7) & 510)) + (i14 & 255)) / 4);
        }
        this.c = bArr;
        this.d = i10;
        this.e = i11;
    }

    @Override // cc.d
    public final byte[] a() {
        byte[] bArr = this.c;
        int i10 = this.a;
        int i11 = this.b;
        int i12 = this.d;
        if (i10 == i12 && i11 == this.e) {
            return bArr;
        }
        int i13 = i10 * i11;
        byte[] bArr2 = new byte[i13];
        if (i10 == i12) {
            System.arraycopy(bArr, 0, bArr2, 0, i13);
            return bArr2;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            System.arraycopy(bArr, i14, bArr2, i15 * i10, i10);
            i14 += i12;
        }
        return bArr2;
    }

    @Override // cc.d
    public final byte[] b(int i10, byte[] bArr) {
        if (i10 < 0 || i10 >= this.b) {
            throw new IllegalArgumentException(i2.g.i(i10, "Requested row is outside the image: "));
        }
        int i11 = this.a;
        if (bArr == null || bArr.length < i11) {
            bArr = new byte[i11];
        }
        System.arraycopy(this.c, i10 * this.d, bArr, 0, i11);
        return bArr;
    }
}
