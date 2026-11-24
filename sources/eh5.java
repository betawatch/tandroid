// default package

import java.io.EOFException;
import java.io.InputStream;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class eh5 {
    public static final a84 e = new a84((byte) 1);
    public final zy8 a;
    public final hh5 b;
    public final fh5 c;
    public final z24 d;

    public eh5(InputStream inputStream, long j, int i, hh5 hh5Var, fh5 fh5Var) {
        zy8 zy8Var = new zy8(inputStream, j, i);
        this.a = zy8Var;
        this.d = new z24(zy8Var, (byte) 9);
        this.b = hh5Var;
        this.c = fh5Var;
    }

    public static String a(byte[] bArr, int i, bh5 bh5Var, boolean z) {
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                if (bArr[i3] == 0 && (bh5Var != bh5.d || i2 != 0 || i3 % 2 == 0)) {
                    i2++;
                    byte b = bh5Var.b;
                    if (i2 == b) {
                        i = (i3 + 1) - b;
                        break;
                    }
                } else {
                    i2 = 0;
                }
            }
        }
        try {
            String str = new String(bArr, 0, i, bh5Var.a.name());
            return (str.length() <= 0 || str.charAt(0) != 65279) ? str : str.substring(1);
        } catch (Exception unused) {
            return "";
        }
    }

    public final bh5 b() {
        byte Z = this.d.Z();
        if (Z == 0) {
            return bh5.c;
        }
        if (Z == 1) {
            return bh5.d;
        }
        if (Z == 2) {
            return bh5.e;
        }
        if (Z == 3) {
            return bh5.f;
        }
        throw new ch5(de9.k(Z, "Invalid encoding: "));
    }

    public final String c(int i, bh5 bh5Var) {
        if (i > this.a.e()) {
            throw new ch5(de9.k(i, "Could not read fixed-length string of length: "));
        }
        dh5 dh5Var = (dh5) e.get();
        byte[] bArr = dh5Var.a;
        if (i > bArr.length) {
            int length = bArr.length << 1;
            while (i > length) {
                length <<= 1;
            }
            bArr = new byte[length];
            dh5Var.a = bArr;
        }
        int i2 = 0;
        while (i2 < i) {
            int read = ((a51) this.d.b).read(bArr, i2, i - i2);
            if (read <= 0) {
                throw new EOFException();
            }
            i2 += read;
        }
        return a(bArr, i, bh5Var, true);
    }

    public final String d(int i, bh5 bh5Var) {
        int min = Math.min(i, (int) this.a.e());
        dh5 dh5Var = (dh5) e.get();
        byte[] bArr = dh5Var.a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length <<= 1;
            } while (min > length);
            bArr = new byte[length];
            dh5Var.a = bArr;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < min; i3++) {
            byte Z = this.d.Z();
            bArr[i3] = Z;
            if (Z != 0 || (bh5Var == bh5.d && i2 == 0 && i3 % 2 != 0)) {
                i2 = 0;
            } else {
                i2++;
                byte b = bh5Var.b;
                if (i2 == b) {
                    return a(bArr, (i3 + 1) - b, bh5Var, false);
                }
            }
        }
        throw new ch5("Could not read zero-termiated string");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("id3v2frame[pos=");
        zy8 zy8Var = this.a;
        sb.append(zy8Var.b);
        sb.append(", ");
        sb.append(zy8Var.e());
        sb.append(" left]");
        return sb.toString();
    }
}
