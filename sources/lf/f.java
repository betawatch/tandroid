package lf;

import java.io.EOFException;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        a4.m mVar = (a4.m) hVar.d;
        i iVar = (i) hVar.c;
        int i10 = iVar.a;
        int i11 = iVar.a;
        byte b12 = 2;
        if (i10 == 2) {
            mVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) mVar.b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.a = new String(bArr, "ISO-8859-1");
        } else {
            mVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) mVar.b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.a = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.c = ((mVar.x0() & 255) << 16) | ((mVar.x0() & 255) << 8) | (mVar.x0() & 255);
        } else if (i11 == 3) {
            this.c = mVar.A0();
        } else {
            this.c = mVar.B0();
        }
        if (i11 > 2) {
            mVar.x0();
            byte x02 = mVar.x0();
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
            boolean z10 = (b13 & x02) != 0;
            this.e = z10;
            this.d = (b12 & x02) != 0;
            boolean z11 = (x02 & b14) != 0;
            this.f = z11;
            if (i11 == 3) {
                if (z10) {
                    this.g = mVar.A0();
                    this.c -= 4;
                }
                if (z11) {
                    mVar.x0();
                    this.c--;
                }
                if ((x02 & b10) != 0) {
                    mVar.x0();
                    this.c--;
                }
            } else {
                if ((x02 & b10) != 0) {
                    mVar.x0();
                    this.c--;
                }
                if (z11) {
                    mVar.x0();
                    this.c--;
                }
                if ((x02 & b11) != 0) {
                    this.g = mVar.B0();
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
