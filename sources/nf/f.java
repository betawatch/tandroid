package nf;

import java.io.EOFException;
import m.g3;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
        k0.b bVar = (k0.b) g3Var.d;
        h hVar = (h) g3Var.c;
        int i10 = hVar.a;
        int i11 = hVar.a;
        byte b12 = 2;
        if (i10 == 2) {
            bVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) bVar.b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            bVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) bVar.b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.c = ((bVar.Z() & 255) << 16) | ((bVar.Z() & 255) << 8) | (bVar.Z() & 255);
        } else if (i11 == 3) {
            this.c = bVar.a0();
        } else {
            this.c = bVar.b0();
        }
        if (i11 > 2) {
            bVar.Z();
            byte Z = bVar.Z();
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
            boolean z10 = (b13 & Z) != 0;
            this.e = z10;
            this.d = (b12 & Z) != 0;
            boolean z11 = (Z & b14) != 0;
            this.f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.g = bVar.a0();
                    this.c -= 4;
                }
                if (z11) {
                    bVar.Z();
                    this.c--;
                }
                if ((Z & b10) != 0) {
                    bVar.Z();
                    this.c--;
                }
            } else {
                if ((Z & b10) != 0) {
                    bVar.Z();
                    this.c--;
                }
                if (z11) {
                    bVar.Z();
                    this.c--;
                }
                if ((Z & b11) != 0) {
                    this.g = bVar.b0();
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
