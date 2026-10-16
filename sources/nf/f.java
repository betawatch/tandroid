package nf;

import java.io.EOFException;
import ji.h5;
import m.h3;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public f(h3 h3Var) {
        byte b10;
        byte b11;
        of.a aVar = (of.a) h3Var.b;
        long j10 = aVar.b;
        h5 h5Var = (h5) h3Var.d;
        h hVar = (h) h3Var.c;
        int i10 = hVar.a;
        int i11 = hVar.a;
        byte b12 = 2;
        if (i10 == 2) {
            h5Var.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) h5Var.b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            h5Var.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) h5Var.b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.c = ((h5Var.c() & 255) << 16) | ((h5Var.c() & 255) << 8) | (h5Var.c() & 255);
        } else if (i11 == 3) {
            this.c = h5Var.g();
        } else {
            this.c = h5Var.i();
        }
        if (i11 > 2) {
            h5Var.c();
            byte c10 = h5Var.c();
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
            boolean z10 = (b13 & c10) != 0;
            this.e = z10;
            this.d = (b12 & c10) != 0;
            boolean z11 = (c10 & b14) != 0;
            this.f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.g = h5Var.g();
                    this.c -= 4;
                }
                if (z11) {
                    h5Var.c();
                    this.c--;
                }
                if ((c10 & b10) != 0) {
                    h5Var.c();
                    this.c--;
                }
            } else {
                if ((c10 & b10) != 0) {
                    h5Var.c();
                    this.c--;
                }
                if (z11) {
                    h5Var.c();
                    this.c--;
                }
                if ((c10 & b11) != 0) {
                    this.g = h5Var.i();
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
