// default package

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ae5 {
    public static final byte[] f = {0, 0, 1};
    public int a;
    public int b;
    public boolean c;
    public byte d;
    public Serializable e;

    public final d90 a() {
        String str;
        if (this.d == 7 && (str = (String) this.e) != null) {
            return new d90(this.a, this.b, str, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (((String) this.e) == null) {
            sb.append(" processName");
        }
        if ((this.d & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.d & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.d & 4) == 0) {
            sb.append(" defaultProcess");
        }
        grb.i(bs2.o("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [byte[], java.io.Serializable] */
    public final void b(int i, int i2, byte[] bArr) {
        if (this.c) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.e;
            int length = bArr2.length;
            int i4 = this.a + i3;
            byte[] bArr3 = bArr2;
            if (length < i4) {
                ?? copyOf = Arrays.copyOf(bArr2, i4 << 1);
                this.e = copyOf;
                bArr3 = copyOf;
            }
            System.arraycopy(bArr, i, bArr3, this.a, i3);
            this.a += i3;
        }
    }
}
