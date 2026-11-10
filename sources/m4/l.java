package m4;

import java.util.Arrays;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class l {
    public static final byte[] f = {0, 0, 1};
    public boolean a;
    public int b;
    public int c;
    public int d;
    public byte[] e;

    public final void a(int i7, int i10, byte[] bArr) {
        if (this.a) {
            int i11 = i10 - i7;
            byte[] bArr2 = this.e;
            int length = bArr2.length;
            int i12 = this.c + i11;
            if (length < i12) {
                this.e = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i7, this.e, this.c, i11);
            this.c += i11;
        }
    }
}
