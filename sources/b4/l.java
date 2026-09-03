package b4;

import java.util.Arrays;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l {
    public static final byte[] f = {0, 0, 1};
    public boolean a;
    public int b;
    public int c;
    public int d;
    public byte[] e;

    public final void a(int i10, int i11, byte[] bArr) {
        if (this.a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.e;
            int length = bArr2.length;
            int i13 = this.c + i12;
            if (length < i13) {
                this.e = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.e, this.c, i12);
            this.c += i12;
        }
    }
}
