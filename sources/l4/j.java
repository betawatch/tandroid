package l4;

import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j {
    public static final byte[] e = {0, 0, 1};
    public boolean a;
    public int b;
    public int c;
    public byte[] d;

    public final void a(int i3, int i10, byte[] bArr) {
        if (this.a) {
            int i11 = i10 - i3;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i12 = this.b + i11;
            if (length < i12) {
                this.d = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i3, this.d, this.b, i11);
            this.b += i11;
        }
    }
}
