package n4;

import b3.i;
import e2.t0;
import f3.p;
import h2.x;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class d {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(p pVar) {
        x xVar = new x(8);
        int i7 = i.b(pVar, xVar).a;
        if (i7 != 1380533830 && i7 != 1380333108) {
            return false;
        }
        pVar.b(0, 4, xVar.a);
        xVar.N(0);
        int m10 = xVar.m();
        if (m10 == 1463899717) {
            return true;
        }
        h2.a.c("WavHeaderReader", "Unsupported form type: " + m10);
        return false;
    }

    public static i b(int i7, p pVar, x xVar) {
        i b10 = i.b(pVar, xVar);
        while (true) {
            int i10 = b10.a;
            if (i10 == i7) {
                return b10;
            }
            com.google.android.recaptcha.internal.a.o(i10, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j3 = b10.b;
            long j10 = 8 + j3;
            if (j3 % 2 != 0) {
                j10 = 9 + j3;
            }
            if (j10 > 2147483647L) {
                throw t0.c("Chunk is too large (~2GB+) to skip; id: " + i10);
            }
            pVar.s((int) j10);
            b10 = i.b(pVar, xVar);
        }
    }
}
