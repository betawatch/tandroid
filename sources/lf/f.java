package lf;

import java.io.EOFException;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
        mf.a aVar = (mf.a) hVar.b;
        long j3 = aVar.b;
        l2.g gVar = (l2.g) hVar.d;
        i iVar = (i) hVar.c;
        int i10 = iVar.a;
        int i11 = iVar.a;
        byte b12 = 2;
        if (i10 == 2) {
            gVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) gVar.b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            gVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) gVar.b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.c = ((gVar.d0() & 255) << 16) | ((gVar.d0() & 255) << 8) | (gVar.d0() & 255);
        } else if (i11 == 3) {
            this.c = gVar.j0();
        } else {
            this.c = gVar.k0();
        }
        if (i11 > 2) {
            gVar.d0();
            byte d02 = gVar.d0();
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
            boolean z10 = (b13 & d02) != 0;
            this.e = z10;
            this.d = (b12 & d02) != 0;
            boolean z11 = (d02 & b14) != 0;
            this.f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.g = gVar.j0();
                    this.c -= 4;
                }
                if (z11) {
                    gVar.d0();
                    this.c--;
                }
                if ((d02 & b10) != 0) {
                    gVar.d0();
                    this.c--;
                }
            } else {
                if ((d02 & b10) != 0) {
                    gVar.d0();
                    this.c--;
                }
                if (z11) {
                    gVar.d0();
                    this.c--;
                }
                if ((d02 & b11) != 0) {
                    this.g = gVar.k0();
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
