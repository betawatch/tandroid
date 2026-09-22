package lf;

import java.io.EOFException;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class f {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public f(h hVar) {
        byte b10;
        byte b11;
        mf.a aVar = (mf.a) hVar.b;
        long j3 = aVar.b;
        android.support.v4.media.c cVar = (android.support.v4.media.c) hVar.d;
        i iVar = (i) hVar.c;
        int i10 = iVar.a;
        int i11 = iVar.a;
        byte b12 = 2;
        if (i10 == 2) {
            cVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) cVar.b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            cVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) cVar.b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.c = ((cVar.s0() & 255) << 16) | ((cVar.s0() & 255) << 8) | (cVar.s0() & 255);
        } else if (i11 == 3) {
            this.c = cVar.u0();
        } else {
            this.c = cVar.w0();
        }
        if (i11 > 2) {
            cVar.s0();
            byte s02 = cVar.s0();
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
            boolean z10 = (b13 & s02) != 0;
            this.e = z10;
            this.d = (b12 & s02) != 0;
            boolean z11 = (s02 & b14) != 0;
            this.f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.g = cVar.u0();
                    this.c -= 4;
                }
                if (z11) {
                    cVar.s0();
                    this.c--;
                }
                if ((s02 & b10) != 0) {
                    cVar.s0();
                    this.c--;
                }
            } else {
                if ((s02 & b10) != 0) {
                    cVar.s0();
                    this.c--;
                }
                if (z11) {
                    cVar.s0();
                    this.c--;
                }
                if ((s02 & b11) != 0) {
                    this.g = cVar.w0();
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
