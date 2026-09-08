package mf;

import java.io.EOFException;
import m2.t;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public f(t tVar) {
        byte b10;
        byte b11;
        nf.a aVar = (nf.a) tVar.b;
        long j3 = aVar.b;
        l.d dVar = (l.d) tVar.d;
        h hVar = (h) tVar.c;
        int i10 = hVar.a;
        int i11 = hVar.a;
        byte b12 = 2;
        if (i10 == 2) {
            dVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) dVar.b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            dVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) dVar.b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.c = ((dVar.y() & 255) << 16) | ((dVar.y() & 255) << 8) | (dVar.y() & 255);
        } else if (i11 == 3) {
            this.c = dVar.A();
        } else {
            this.c = dVar.B();
        }
        if (i11 > 2) {
            dVar.y();
            byte y3 = dVar.y();
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
            boolean z10 = (b13 & y3) != 0;
            this.e = z10;
            this.d = (b12 & y3) != 0;
            boolean z11 = (y3 & b14) != 0;
            this.f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.g = dVar.A();
                    this.c -= 4;
                }
                if (z11) {
                    dVar.y();
                    this.c--;
                }
                if ((y3 & b10) != 0) {
                    dVar.y();
                    this.c--;
                }
            } else {
                if ((y3 & b10) != 0) {
                    dVar.y();
                    this.c--;
                }
                if (z11) {
                    dVar.y();
                    this.c--;
                }
                if ((y3 & b11) != 0) {
                    this.g = dVar.B();
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
