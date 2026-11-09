package bc;

import org.telegram.messenger.qs;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class g extends d {
    public final byte[] c;
    public final int d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i7, int i10, int[] iArr) {
        super(i7, i10);
        int i11 = i7 * i10;
        if (iArr.length < i11) {
            throw new IllegalArgumentException("Pixel array length is less than width * height");
        }
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            bArr[i12] = (byte) (((((i13 >> 16) & qs.e4) + ((i13 >> 7) & 510)) + (i13 & qs.e4)) / 4);
        }
        this.c = bArr;
        this.d = i7;
        this.e = i10;
    }

    @Override // bc.d
    public final byte[] a() {
        byte[] bArr = this.c;
        int i7 = this.a;
        int i10 = this.b;
        int i11 = this.d;
        if (i7 == i11 && i10 == this.e) {
            return bArr;
        }
        int i12 = i7 * i10;
        byte[] bArr2 = new byte[i12];
        if (i7 == i11) {
            System.arraycopy(bArr, 0, bArr2, 0, i12);
            return bArr2;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            System.arraycopy(bArr, i13, bArr2, i14 * i7, i7);
            i13 += i11;
        }
        return bArr2;
    }

    @Override // bc.d
    public final byte[] b(int i7, byte[] bArr) {
        if (i7 < 0 || i7 >= this.b) {
            throw new IllegalArgumentException(jg.g.j(i7, "Requested row is outside the image: "));
        }
        int i10 = this.a;
        if (bArr == null || bArr.length < i10) {
            bArr = new byte[i10];
        }
        System.arraycopy(this.c, i7 * this.d, bArr, 0, i10);
        return bArr;
    }
}
