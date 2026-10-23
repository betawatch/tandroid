package nf;

import java.io.EOFException;
import k2.w0;
import m.g3;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public f(g3 g3Var) {
        byte b10;
        byte b11;
        of.a aVar = (of.a) g3Var.b;
        long j10 = aVar.b;
        w0 w0Var = (w0) g3Var.d;
        h hVar = (h) g3Var.c;
        int i10 = hVar.a;
        int i11 = hVar.a;
        byte b12 = 2;
        if (i10 == 2) {
            w0Var.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) w0Var.b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            w0Var.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) w0Var.b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.c = ((w0Var.n() & 255) << 16) | ((w0Var.n() & 255) << 8) | (w0Var.n() & 255);
        } else if (i11 == 3) {
            this.c = w0Var.q();
        } else {
            this.c = w0Var.r();
        }
        if (i11 > 2) {
            w0Var.n();
            byte n10 = w0Var.n();
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
            boolean z10 = (b13 & n10) != 0;
            this.e = z10;
            this.d = (b12 & n10) != 0;
            boolean z11 = (n10 & b14) != 0;
            this.f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.g = w0Var.q();
                    this.c -= 4;
                }
                if (z11) {
                    w0Var.n();
                    this.c--;
                }
                if ((n10 & b10) != 0) {
                    w0Var.n();
                    this.c--;
                }
            } else {
                if ((n10 & b10) != 0) {
                    w0Var.n();
                    this.c--;
                }
                if (z11) {
                    w0Var.n();
                    this.c--;
                }
                if ((n10 & b11) != 0) {
                    this.g = w0Var.r();
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
