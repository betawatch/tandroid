// default package

import java.io.EOFException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class fh5 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public fh5(xl3 xl3Var) {
        int b0;
        byte b;
        byte b2;
        zy8 zy8Var = (zy8) xl3Var.b;
        long j = zy8Var.b;
        z24 z24Var = (z24) xl3Var.d;
        a51 a51Var = (a51) z24Var.b;
        int i = ((hh5) xl3Var.c).a;
        byte b3 = 2;
        if (i == 2) {
            byte[] bArr = new byte[3];
            int i2 = 0;
            while (i2 < 3) {
                int read = a51Var.read(bArr, i2, 3 - i2);
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
                int read2 = a51Var.read(bArr2, i3, 4 - i3);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i3 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b4 = 8;
        if (i == 2) {
            b0 = ((z24Var.Z() & 255) << 16) | ((z24Var.Z() & 255) << 8) | (z24Var.Z() & 255);
            this.c = b0;
        } else if (i == 3) {
            b0 = z24Var.a0();
            this.c = b0;
        } else {
            b0 = z24Var.b0();
            this.c = b0;
        }
        if (i > 2) {
            z24Var.Z();
            byte Z = z24Var.Z();
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
            boolean z = (b4 & Z) != 0;
            this.e = z;
            this.d = (b3 & Z) != 0;
            boolean z2 = (b5 & Z) != 0;
            this.f = z2;
            if (i == 3) {
                if (z) {
                    this.g = z24Var.a0();
                    b0 -= 4;
                    this.c = b0;
                }
                if (z2) {
                    z24Var.Z();
                    b0--;
                    this.c = b0;
                }
                if ((Z & b) != 0) {
                    z24Var.Z();
                    this.c = b0 - 1;
                }
            } else {
                if ((b & Z) != 0) {
                    z24Var.Z();
                    b0--;
                    this.c = b0;
                }
                if (z2) {
                    z24Var.Z();
                    b0--;
                    this.c = b0;
                }
                if ((Z & b2) != 0) {
                    this.g = z24Var.b0();
                    this.c = b0 - 4;
                }
            }
        }
        this.b = (int) (zy8Var.b - j);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", fh5.class.getSimpleName(), this.a, Integer.valueOf(this.c));
    }
}
