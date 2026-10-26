package of;

import java.io.EOFException;
import li.e3;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public f(k6.c cVar) {
        byte b10;
        byte b11;
        pf.a aVar = (pf.a) cVar.b;
        long j10 = aVar.b;
        e3 e3Var = (e3) cVar.d;
        h hVar = (h) cVar.c;
        int i10 = hVar.a;
        int i11 = hVar.a;
        byte b12 = 2;
        if (i10 == 2) {
            e3Var.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) e3Var.b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            e3Var.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) e3Var.b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.c = ((e3Var.z0() & 255) << 16) | ((e3Var.z0() & 255) << 8) | (e3Var.z0() & 255);
        } else if (i11 == 3) {
            this.c = e3Var.B0();
        } else {
            this.c = e3Var.G0();
        }
        if (i11 > 2) {
            e3Var.z0();
            byte z02 = e3Var.z0();
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
            boolean z10 = (b13 & z02) != 0;
            this.e = z10;
            this.d = (b12 & z02) != 0;
            boolean z11 = (z02 & b14) != 0;
            this.f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.g = e3Var.B0();
                    this.c -= 4;
                }
                if (z11) {
                    e3Var.z0();
                    this.c--;
                }
                if ((z02 & b10) != 0) {
                    e3Var.z0();
                    this.c--;
                }
            } else {
                if ((z02 & b10) != 0) {
                    e3Var.z0();
                    this.c--;
                }
                if (z11) {
                    e3Var.z0();
                    this.c--;
                }
                if ((z02 & b11) != 0) {
                    this.g = e3Var.G0();
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
