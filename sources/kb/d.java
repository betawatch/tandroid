package kb;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class d {
    public final int a;
    public final int b;

    public d(int i9, int i10) {
        this.a = i9;
        this.b = i10;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i9, byte[] bArr);

    public final String toString() {
        int i9 = this.a;
        byte[] bArr = new byte[i9];
        int i10 = this.b;
        StringBuilder sb2 = new StringBuilder((i9 + 1) * i10);
        for (int i11 = 0; i11 < i10; i11++) {
            bArr = b(i11, bArr);
            for (int i12 = 0; i12 < i9; i12++) {
                int i13 = bArr[i12] & 255;
                sb2.append(i13 < 64 ? '#' : i13 < 128 ? '+' : i13 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
