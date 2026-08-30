package d4;

import j3.n0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class p extends Exception {
    public final String a;
    public final boolean b;
    public final n c;
    public final String d;

    public p(n0 n0Var, v vVar, boolean z4, int i10) {
        this("Decoder init failed: [" + i10 + "], " + n0Var, vVar, n0Var.C, z4, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z4, n nVar, String str3) {
        super(str, th2);
        this.a = str2;
        this.b = z4;
        this.c = nVar;
        this.d = str3;
    }
}
