package bc;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class d {
    public final int a;
    public final int b;

    public d(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i7, byte[] bArr);

    public final String toString() {
        int i7 = this.a;
        byte[] bArr = new byte[i7];
        int i10 = this.b;
        StringBuilder sb2 = new StringBuilder((i7 + 1) * i10);
        for (int i11 = 0; i11 < i10; i11++) {
            bArr = b(i11, bArr);
            for (int i12 = 0; i12 < i7; i12++) {
                int i13 = bArr[i12] & 255;
                sb2.append(i13 < 64 ? '#' : i13 < 128 ? '+' : i13 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
