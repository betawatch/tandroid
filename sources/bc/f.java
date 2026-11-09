package bc;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class f extends d {
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public f(int i7, int i10, int i11, int i12, int i13, int i14) {
        super(i13, i14);
        if (i13 + i11 > i7 || i14 + i12 > i10) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.c = i7;
        this.d = i10;
        this.e = i11;
        this.f = i12;
    }

    @Override // bc.d
    public final byte[] a() {
        int i7 = this.a;
        int i10 = this.b;
        int i11 = this.c;
        if (i7 == i11 && i10 == this.d) {
            return null;
        }
        int i12 = i7 * i10;
        byte[] bArr = new byte[i12];
        int i13 = (this.f * i11) + this.e;
        if (i7 == i11) {
            System.arraycopy(null, i13, bArr, 0, i12);
            return bArr;
        }
        for (int i14 = 0; i14 < i10; i14++) {
            System.arraycopy(null, i13, bArr, i14 * i7, i7);
            i13 += i11;
        }
        return bArr;
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
        System.arraycopy(null, ((i7 + this.f) * this.c) + this.e, bArr, 0, i10);
        return bArr;
    }
}
