// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ef8 extends ki6 {
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public ef8(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i5 + i3 > i || i6 + i4 > i2) {
            lq5.j("Crop rectangle does not fit within image data.");
            throw null;
        }
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    @Override // ki6
    public final byte[] a() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        if (i == i3 && i2 == this.d) {
            return null;
        }
        int i4 = i * i2;
        byte[] bArr = new byte[i4];
        int i5 = (this.f * i3) + this.e;
        if (i == i3) {
            System.arraycopy(null, i5, bArr, 0, i4);
            throw null;
        }
        if (i2 <= 0) {
            return bArr;
        }
        System.arraycopy(null, i5, bArr, 0, i);
        throw null;
    }

    @Override // ki6
    public final byte[] b(int i, byte[] bArr) {
        if (i < 0 || i >= this.b) {
            throw new IllegalArgumentException(uh9.k(i, "Requested row is outside the image: "));
        }
        int i2 = this.a;
        if (bArr == null || bArr.length < i2) {
            bArr = new byte[i2];
        }
        System.arraycopy(null, ((i + this.f) * this.c) + this.e, bArr, 0, i2);
        throw null;
    }
}
