package j4;

import java.util.Arrays;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class j {
    public static final byte[] e = {0, 0, 1};
    public boolean a;
    public int b;
    public int c;
    public byte[] d;

    public final void a(int i10, int i11, byte[] bArr) {
        if (this.a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i13 = this.b + i12;
            if (length < i13) {
                this.d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.d, this.b, i12);
            this.b += i12;
        }
    }
}
