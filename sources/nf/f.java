package nf;

import java.io.EOFException;
import ji.d4;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public f(li.k kVar) {
        byte b10;
        byte b11;
        of.a aVar = (of.a) kVar.b;
        long j10 = aVar.b;
        d4 d4Var = (d4) kVar.d;
        h hVar = (h) kVar.c;
        int i10 = hVar.a;
        int i11 = hVar.a;
        byte b12 = 2;
        if (i10 == 2) {
            d4Var.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) d4Var.b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            d4Var.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) d4Var.b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.c = ((d4Var.g() & 255) << 16) | ((d4Var.g() & 255) << 8) | (d4Var.g() & 255);
        } else if (i11 == 3) {
            this.c = d4Var.i();
        } else {
            this.c = d4Var.j();
        }
        if (i11 > 2) {
            d4Var.g();
            byte g10 = d4Var.g();
            byte b14 = 64;
            if (i11 == 3) {
                b13 = 128;
                b11 = 0;
                b10 = 32;
                b12 = 0;
            } else {
                b10 = 64;
                b11 = 1;
                b14 = 4;
            }
            boolean z10 = (b13 & g10) != 0;
            this.e = z10;
            this.d = (b12 & g10) != 0;
            boolean z11 = (g10 & b14) != 0;
            this.f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.g = d4Var.i();
                    this.c -= 4;
                }
                if (z11) {
                    d4Var.g();
                    this.c--;
                }
                if ((g10 & b10) != 0) {
                    d4Var.g();
                    this.c--;
                }
            } else {
                if ((g10 & b10) != 0) {
                    d4Var.g();
                    this.c--;
                }
                if (z11) {
                    d4Var.g();
                    this.c--;
                }
                if ((g10 & b11) != 0) {
                    this.g = d4Var.j();
                    this.c -= 4;
                }
            }
        }
        this.b = (int) (aVar.b - j10);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.a, Integer.valueOf(this.c));
    }
}
