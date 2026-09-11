package k4;

import b2.s0;
import c3.p;
import com.google.android.gms.internal.vision.e2;
import e2.v;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class e {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(p pVar) {
        v vVar = new v(8);
        int i10 = d.b(pVar, vVar).a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        pVar.b(0, 4, vVar.a);
        vVar.J(0);
        int j3 = vVar.j();
        if (j3 == 1463899717) {
            return true;
        }
        e2.a.e("WavHeaderReader", "Unsupported form type: " + j3);
        return false;
    }

    public static d b(int i10, p pVar, v vVar) {
        d b10 = d.b(pVar, vVar);
        while (true) {
            int i11 = b10.a;
            if (i11 == i10) {
                return b10;
            }
            e2.n(i11, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j3 = b10.b;
            long j10 = 8 + j3;
            if (j3 % 2 != 0) {
                j10 = 9 + j3;
            }
            if (j10 > 2147483647L) {
                throw s0.c("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            pVar.r((int) j10);
            b10 = d.b(pVar, vVar);
        }
    }
}
