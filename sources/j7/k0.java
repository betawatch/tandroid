package j7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class k0 {
    public static boolean a(r3.l lVar) {
        h5.w wVar = new h5.w(8);
        int i10 = c4.e.b(lVar, wVar).a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        lVar.b(0, 4, wVar.a);
        wVar.F(0);
        int g10 = wVar.g();
        if (g10 == 1463899717) {
            return true;
        }
        h5.a.o("WavHeaderReader", "Unsupported form type: " + g10);
        return false;
    }

    public static c4.e b(int i10, r3.l lVar, h5.w wVar) {
        c4.e b10 = c4.e.b(lVar, wVar);
        while (true) {
            int i11 = b10.a;
            if (i11 == i10) {
                return b10;
            }
            e2.c.q(i11, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j10 = b10.b + 8;
            if (j10 > 2147483647L) {
                throw j3.r1.c("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            lVar.s((int) j10);
            b10 = c4.e.b(lVar, wVar);
        }
    }
}
