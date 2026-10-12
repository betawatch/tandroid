package k4;

import a1.g;
import b2.x0;
import c3.p;
import e2.x;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class e {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(p pVar) {
        x xVar = new x(8);
        int i10 = d.b(pVar, xVar).a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        pVar.a(0, 4, xVar.a);
        xVar.N(0);
        int m10 = xVar.m();
        if (m10 == 1463899717) {
            return true;
        }
        e2.a.c("WavHeaderReader", "Unsupported form type: " + m10);
        return false;
    }

    public static d b(int i10, p pVar, x xVar) {
        d b10 = d.b(pVar, xVar);
        while (true) {
            int i11 = b10.a;
            if (i11 == i10) {
                return b10;
            }
            g.x(i11, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j10 = b10.b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                throw x0.c("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            pVar.r((int) j11);
            b10 = d.b(pVar, xVar);
        }
    }
}
