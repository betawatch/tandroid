package j4;

import java.util.Arrays;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
