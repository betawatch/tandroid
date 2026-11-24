// default package

import java.io.EOFException;
import java.io.InputStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dj5 {
    public static final j94 e = new j94((byte) 1);
    public final a19 a;
    public final gj5 b;
    public final ej5 c;
    public final ai4 d;

    public dj5(InputStream inputStream, long j, int i, gj5 gj5Var, ej5 ej5Var) {
        a19 a19Var = new a19(inputStream, j, i);
        this.a = a19Var;
        this.d = new ai4(a19Var, (byte) 7);
        this.b = gj5Var;
        this.c = ej5Var;
    }

    public static String a(byte[] bArr, int i, aj5 aj5Var, boolean z) {
        if (z) {
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                if (bArr[i3] == 0 && (aj5Var != aj5.d || i2 != 0 || i3 % 2 == 0)) {
                    i2++;
                    byte b = aj5Var.b;
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
            String str = new String(bArr, 0, i, aj5Var.a.name());
            return (str.length() <= 0 || str.charAt(0) != 65279) ? str : str.substring(1);
        } catch (Exception unused) {
            return "";
        }
    }

    public final aj5 b() {
        byte K = this.d.K();
        if (K == 0) {
            return aj5.c;
        }
        if (K == 1) {
            return aj5.d;
        }
        if (K == 2) {
            return aj5.e;
        }
        if (K == 3) {
            return aj5.f;
        }
        throw new bj5(hg9.j(K, "Invalid encoding: "));
    }

    public final String c(int i, aj5 aj5Var) {
        if (i > this.a.e()) {
            throw new bj5(hg9.j(i, "Could not read fixed-length string of length: "));
        }
        cj5 cj5Var = (cj5) e.get();
        byte[] bArr = cj5Var.a;
        if (i > bArr.length) {
            int length = bArr.length << 1;
            while (i > length) {
                length <<= 1;
            }
            bArr = new byte[length];
            cj5Var.a = bArr;
        }
        int i2 = 0;
        while (i2 < i) {
            int read = ((h61) this.d.b).read(bArr, i2, i - i2);
            if (read <= 0) {
                throw new EOFException();
            }
            i2 += read;
        }
        return a(bArr, i, aj5Var, true);
    }

    public final String d(int i, aj5 aj5Var) {
        int min = Math.min(i, (int) this.a.e());
        cj5 cj5Var = (cj5) e.get();
        byte[] bArr = cj5Var.a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length <<= 1;
            } while (min > length);
            bArr = new byte[length];
            cj5Var.a = bArr;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < min; i3++) {
            byte K = this.d.K();
            bArr[i3] = K;
            if (K != 0 || (aj5Var == aj5.d && i2 == 0 && i3 % 2 != 0)) {
                i2 = 0;
            } else {
                i2++;
                byte b = aj5Var.b;
                if (i2 == b) {
                    return a(bArr, (i3 + 1) - b, aj5Var, false);
                }
            }
        }
        throw new bj5("Could not read zero-termiated string");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("id3v2frame[pos=");
        a19 a19Var = this.a;
        sb.append(a19Var.b);
        sb.append(", ");
        sb.append(a19Var.e());
        sb.append(" left]");
        return sb.toString();
    }
}
