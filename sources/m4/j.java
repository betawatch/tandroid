package m4;

import java.util.Arrays;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
