package a4;

import j3.t0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s extends Exception {
    public final String a;
    public final boolean b;
    public final q c;
    public final String d;

    public s(t0 t0Var, y yVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + t0Var, yVar, t0Var.B, z10, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public s(String str, Throwable th2, String str2, boolean z10, q qVar, String str3) {
        super(str, th2);
        this.a = str2;
        this.b = z10;
        this.c = qVar;
        this.d = str3;
    }
}
