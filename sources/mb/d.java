package mb;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class d {
    public final int a;
    public final int b;

    public d(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public abstract byte[] a();

    public abstract byte[] b(int i10, byte[] bArr);

    public final String toString() {
        int i10 = this.a;
        byte[] bArr = new byte[i10];
        int i11 = this.b;
        StringBuilder sb2 = new StringBuilder((i10 + 1) * i11);
        for (int i12 = 0; i12 < i11; i12++) {
            bArr = b(i12, bArr);
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = bArr[i13] & 255;
                sb2.append(i14 < 64 ? '#' : i14 < 128 ? '+' : i14 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
