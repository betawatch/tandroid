// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class gi6 {
    public final int a;
    public final int b;

    public gi6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i, byte[] bArr);

    public final String toString() {
        int i = this.a;
        byte[] bArr = new byte[i];
        int i2 = this.b;
        StringBuilder sb = new StringBuilder((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            bArr = b(i3, bArr);
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArr[i4] & 255;
                sb.append(i5 < 64 ? '#' : i5 < 128 ? '+' : i5 < 192 ? '.' : ' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
