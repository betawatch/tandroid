// default package

import java.io.EOFException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hj5 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public hj5(pm3 pm3Var) {
        int L;
        byte b;
        byte b2;
        m29 m29Var = (m29) pm3Var.b;
        long j = m29Var.b;
        xh4 xh4Var = (xh4) pm3Var.d;
        i51 i51Var = (i51) xh4Var.b;
        int i = ((jj5) pm3Var.c).a;
        byte b3 = 2;
        if (i == 2) {
            byte[] bArr = new byte[3];
            int i2 = 0;
            while (i2 < 3) {
                int read = i51Var.read(bArr, i2, 3 - i2);
                if (read <= 0) {
                    throw new EOFException();
                }
                i2 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            byte[] bArr2 = new byte[4];
            int i3 = 0;
            while (i3 < 4) {
                int read2 = i51Var.read(bArr2, i3, 4 - i3);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i3 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b4 = 8;
        if (i == 2) {
            L = ((xh4Var.J() & 255) << 16) | ((xh4Var.J() & 255) << 8) | (xh4Var.J() & 255);
            this.c = L;
        } else if (i == 3) {
            L = xh4Var.K();
            this.c = L;
        } else {
            L = xh4Var.L();
            this.c = L;
        }
        if (i > 2) {
            xh4Var.J();
            byte J = xh4Var.J();
            byte b5 = 64;
            if (i == 3) {
                b4 = 128;
                b2 = 0;
                b = 32;
                b3 = 0;
            } else {
                b = 64;
                b2 = 1;
                b5 = 4;
            }
            boolean z = (b4 & J) != 0;
            this.e = z;
            this.d = (b3 & J) != 0;
            boolean z2 = (b5 & J) != 0;
            this.f = z2;
            if (i == 3) {
                if (z) {
                    this.g = xh4Var.K();
                    L -= 4;
                    this.c = L;
                }
                if (z2) {
                    xh4Var.J();
                    L--;
                    this.c = L;
                }
                if ((J & b) != 0) {
                    xh4Var.J();
                    this.c = L - 1;
                }
            } else {
                if ((b & J) != 0) {
                    xh4Var.J();
                    L--;
                    this.c = L;
                }
                if (z2) {
                    xh4Var.J();
                    L--;
                    this.c = L;
                }
                if ((J & b2) != 0) {
                    this.g = xh4Var.L();
                    this.c = L - 4;
                }
            }
        }
        this.b = (int) (m29Var.b - j);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", hj5.class.getSimpleName(), this.a, Integer.valueOf(this.c));
    }
}
