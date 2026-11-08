package m4;

import java.util.Arrays;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class j {
    public static final byte[] e = {0, 0, 1};
    public boolean a;
    public int b;
    public int c;
    public byte[] d;

    public final void a(int i7, int i10, byte[] bArr) {
        if (this.a) {
            int i11 = i10 - i7;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i12 = this.b + i11;
            if (length < i12) {
                this.d = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i7, this.d, this.b, i11);
            this.b += i11;
        }
    }
}
