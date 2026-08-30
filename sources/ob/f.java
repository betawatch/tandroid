package ob;

import kh.a2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f extends d {
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public f(int i10, int i11, int i12, int i13, int i14, int i15) {
        super(i14, i15);
        if (i14 + i12 > i10 || i15 + i13 > i11) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.c = i10;
        this.d = i11;
        this.e = i12;
        this.f = i13;
    }

    @Override // ob.d
    public final byte[] a() {
        int i10 = this.a;
        int i11 = this.b;
        int i12 = this.c;
        if (i10 == i12 && i11 == this.d) {
            return null;
        }
        int i13 = i10 * i11;
        byte[] bArr = new byte[i13];
        int i14 = (this.f * i12) + this.e;
        if (i10 == i12) {
            System.arraycopy(null, i14, bArr, 0, i13);
            return bArr;
        }
        for (int i15 = 0; i15 < i11; i15++) {
            System.arraycopy(null, i14, bArr, i15 * i10, i10);
            i14 += i12;
        }
        return bArr;
    }

    @Override // ob.d
    public final byte[] b(int i10, byte[] bArr) {
        if (i10 < 0 || i10 >= this.b) {
            throw new IllegalArgumentException(a2.j(i10, "Requested row is outside the image: "));
        }
        int i11 = this.a;
        if (bArr == null || bArr.length < i11) {
            bArr = new byte[i11];
        }
        System.arraycopy(null, ((i10 + this.f) * this.c) + this.e, bArr, 0, i11);
        return bArr;
    }
}
