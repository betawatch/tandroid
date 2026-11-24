// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class aje extends tke {
    public final int e;
    public final int f;

    public aje(byte[] bArr, int i, int i2) {
        super(bArr);
        tke.l(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // tke
    public final byte h(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.e + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // tke
    public final int i() {
        return this.f;
    }

    @Override // tke
    public final byte k(int i) {
        return this.b[this.e + i];
    }

    @Override // tke
    public final int m() {
        return this.e;
    }
}
