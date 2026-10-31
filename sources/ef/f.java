package ef;

import android.support.v4.media.session.a0;
import java.io.EOFException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public f(a0 a0Var) {
        byte b10;
        byte b11;
        ff.b bVar = (ff.b) a0Var.b;
        long j10 = bVar.b;
        k6.h hVar = (k6.h) a0Var.d;
        h hVar2 = (h) a0Var.c;
        int i10 = hVar2.a;
        int i11 = hVar2.a;
        byte b12 = 2;
        if (i10 == 2) {
            hVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((ff.a) hVar.b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            hVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((ff.a) hVar.b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.c = ((hVar.v() & 255) << 16) | ((hVar.v() & 255) << 8) | (hVar.v() & 255);
        } else if (i11 == 3) {
            this.c = hVar.C();
        } else {
            this.c = hVar.D();
        }
        if (i11 > 2) {
            hVar.v();
            byte v = hVar.v();
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
            boolean z10 = (b13 & v) != 0;
            this.e = z10;
            this.d = (b12 & v) != 0;
            boolean z11 = (v & b14) != 0;
            this.f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.g = hVar.C();
                    this.c -= 4;
                }
                if (z11) {
                    hVar.v();
                    this.c--;
                }
                if ((v & b10) != 0) {
                    hVar.v();
                    this.c--;
                }
            } else {
                if ((v & b10) != 0) {
                    hVar.v();
                    this.c--;
                }
                if (z11) {
                    hVar.v();
                    this.c--;
                }
                if ((v & b11) != 0) {
                    this.g = hVar.D();
                    this.c -= 4;
                }
            }
        }
        this.b = (int) (bVar.b - j10);
    }

    public final String toString() {
        return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), this.a, Integer.valueOf(this.c));
    }
}
