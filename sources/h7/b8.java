package h7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class b8 {
    public static boolean a(m3.l lVar) {
        d5.z zVar = new d5.z(8);
        int i10 = com.google.android.exoplayer2.upstream.k0.b(lVar, zVar).a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        lVar.b(0, 4, zVar.a);
        zVar.C(0);
        int e9 = zVar.e();
        if (e9 == 1463899717) {
            return true;
        }
        d5.a.o("WavHeaderReader", "Unsupported form type: " + e9);
        return false;
    }

    public static com.google.android.exoplayer2.upstream.k0 b(int i10, m3.l lVar, d5.z zVar) {
        com.google.android.exoplayer2.upstream.k0 b10 = com.google.android.exoplayer2.upstream.k0.b(lVar, zVar);
        while (true) {
            int i11 = b10.a;
            if (i11 == i10) {
                return b10;
            }
            com.google.android.recaptcha.internal.a.s(i11, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j10 = b10.b + 8;
            if (j10 > 2147483647L) {
                throw h3.t1.c("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            lVar.t((int) j10);
            b10 = com.google.android.exoplayer2.upstream.k0.b(lVar, zVar);
        }
    }
}
