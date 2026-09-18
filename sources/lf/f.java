package lf;

import java.io.EOFException;
import k2.c0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public f(i iVar) {
        byte b10;
        byte b11;
        mf.a aVar = (mf.a) iVar.b;
        long j3 = aVar.b;
        c0 c0Var = (c0) iVar.d;
        j jVar = (j) iVar.c;
        int i10 = jVar.a;
        int i11 = jVar.a;
        byte b12 = 2;
        if (i10 == 2) {
            c0Var.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) c0Var.b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            c0Var.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) c0Var.b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.c = ((c0Var.o() & 255) << 16) | ((c0Var.o() & 255) << 8) | (c0Var.o() & 255);
        } else if (i11 == 3) {
            this.c = c0Var.p();
        } else {
            this.c = c0Var.q();
        }
        if (i11 > 2) {
            c0Var.o();
            byte o9 = c0Var.o();
            byte b14 = 64;
            if (i11 == 3) {
                b13 = 128;
                b12 = 0;
                b10 = 32;
                b11 = 0;
            } else {
                b14 = 4;
                b10 = 64;
                b11 = 1;
            }
            boolean z10 = (b13 & o9) != 0;
            this.e = z10;
            this.d = (b12 & o9) != 0;
            boolean z11 = (o9 & b14) != 0;
            this.f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.g = c0Var.p();
                    this.c -= 4;
                }
                if (z11) {
                    c0Var.o();
                    this.c--;
                }
                if ((o9 & b10) != 0) {
                    c0Var.o();
                    this.c--;
                }
            } else {
                if ((o9 & b10) != 0) {
                    c0Var.o();
                    this.c--;
                }
                if (z11) {
                    c0Var.o();
                    this.c--;
                }
                if ((o9 & b11) != 0) {
                    this.g = c0Var.q();
                    this.c -= 4;
                }
            }
        }
        this.b = (int) (aVar.b - j3);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.a, Integer.valueOf(this.c));
    }
}
