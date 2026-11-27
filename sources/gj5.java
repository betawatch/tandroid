// default package

import java.io.EOFException;
import java.io.InputStream;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class gj5 {
    public static final v84 e = new v84((byte) 1);
    public final m29 a;
    public final jj5 b;
    public final hj5 c;
    public final xh4 d;

    public gj5(InputStream inputStream, long j, int i, jj5 jj5Var, hj5 hj5Var) {
        m29 m29Var = new m29(inputStream, j, i);
        this.a = m29Var;
        this.d = new xh4(m29Var, (byte) 7);
        this.b = jj5Var;
        this.c = hj5Var;
    }

    public static String a(byte[] bArr, int i, dj5 dj5Var, boolean z) {
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                if (bArr[i3] == 0 && (dj5Var != dj5.d || i2 != 0 || i3 % 2 == 0)) {
                    i2++;
                    byte b = dj5Var.b;
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
            String str = new String(bArr, 0, i, dj5Var.a.name());
            return (str.length() <= 0 || str.charAt(0) != 65279) ? str : str.substring(1);
        } catch (Exception unused) {
            return "";
        }
    }

    public final dj5 b() {
        byte J = this.d.J();
        if (J == 0) {
            return dj5.c;
        }
        if (J == 1) {
            return dj5.d;
        }
        if (J == 2) {
            return dj5.e;
        }
        if (J == 3) {
            return dj5.f;
        }
        throw new ej5(uh9.k(J, "Invalid encoding: "));
    }

    public final String c(int i, dj5 dj5Var) {
        if (i > this.a.e()) {
            throw new ej5(uh9.k(i, "Could not read fixed-length string of length: "));
        }
        fj5 fj5Var = (fj5) e.get();
        byte[] bArr = fj5Var.a;
        if (i > bArr.length) {
            int length = bArr.length << 1;
            while (i > length) {
                length <<= 1;
            }
            bArr = new byte[length];
            fj5Var.a = bArr;
        }
        int i2 = 0;
        while (i2 < i) {
            int read = ((i51) this.d.b).read(bArr, i2, i - i2);
            if (read <= 0) {
                throw new EOFException();
            }
            i2 += read;
        }
        return a(bArr, i, dj5Var, true);
    }

    public final String d(int i, dj5 dj5Var) {
        int min = Math.min(i, (int) this.a.e());
        fj5 fj5Var = (fj5) e.get();
        byte[] bArr = fj5Var.a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length <<= 1;
            } while (min > length);
            bArr = new byte[length];
            fj5Var.a = bArr;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < min; i3++) {
            byte J = this.d.J();
            bArr[i3] = J;
            if (J != 0 || (dj5Var == dj5.d && i2 == 0 && i3 % 2 != 0)) {
                i2 = 0;
            } else {
                i2++;
                byte b = dj5Var.b;
                if (i2 == b) {
                    return a(bArr, (i3 + 1) - b, dj5Var, false);
                }
            }
        }
        throw new ej5("Could not read zero-termiated string");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("id3v2frame[pos=");
        m29 m29Var = this.a;
        sb.append(m29Var.b);
        sb.append(", ");
        sb.append(m29Var.e());
        sb.append(" left]");
        return sb.toString();
    }
}
