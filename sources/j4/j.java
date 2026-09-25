package j4;

import java.util.Arrays;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
