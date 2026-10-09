package mf;

import java.io.EOFException;
import k2.g0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public f(la.h hVar) {
        byte b10;
        byte b11;
        nf.a aVar = (nf.a) hVar.b;
        long j3 = aVar.b;
        g0 g0Var = (g0) hVar.d;
        i iVar = (i) hVar.c;
        int i10 = iVar.a;
        int i11 = iVar.a;
        byte b12 = 2;
        if (i10 == 2) {
            g0Var.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) g0Var.b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            g0Var.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) g0Var.b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.c = ((g0Var.U0() & 255) << 16) | ((g0Var.U0() & 255) << 8) | (g0Var.U0() & 255);
        } else if (i11 == 3) {
            this.c = g0Var.W0();
        } else {
            this.c = g0Var.Y0();
        }
        if (i11 > 2) {
            g0Var.U0();
            byte U0 = g0Var.U0();
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
            boolean z10 = (b13 & U0) != 0;
            this.e = z10;
            this.d = (b12 & U0) != 0;
            boolean z11 = (U0 & b14) != 0;
            this.f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.g = g0Var.W0();
                    this.c -= 4;
                }
                if (z11) {
                    g0Var.U0();
                    this.c--;
                }
                if ((U0 & b10) != 0) {
                    g0Var.U0();
                    this.c--;
                }
            } else {
                if ((U0 & b10) != 0) {
                    g0Var.U0();
                    this.c--;
                }
                if (z11) {
                    g0Var.U0();
                    this.c--;
                }
                if ((U0 & b11) != 0) {
                    this.g = g0Var.Y0();
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
