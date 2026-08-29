package i7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class v8 {
    public static boolean a(o3.l lVar) {
        f5.w wVar = new f5.w(8);
        int i10 = com.google.android.exoplayer2.upstream.k0.b(lVar, wVar).a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        lVar.a(0, 4, wVar.a);
        wVar.C(0);
        int e10 = wVar.e();
        if (e10 == 1463899717) {
            return true;
        }
        f5.a.o("WavHeaderReader", "Unsupported form type: " + e10);
        return false;
    }

    public static com.google.android.exoplayer2.upstream.k0 b(int i10, o3.l lVar, f5.w wVar) {
        com.google.android.exoplayer2.upstream.k0 b10 = com.google.android.exoplayer2.upstream.k0.b(lVar, wVar);
        while (true) {
            int i11 = b10.a;
            if (i11 == i10) {
                return b10;
            }
            com.google.android.recaptcha.internal.a.s(i11, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j10 = b10.b + 8;
            if (j10 > 2147483647L) {
                throw j3.t1.c("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            lVar.t((int) j10);
            b10 = com.google.android.exoplayer2.upstream.k0.b(lVar, wVar);
        }
    }
}
