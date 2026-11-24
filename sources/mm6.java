// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mm6 extends Exception {
    public final String a;
    public final boolean b;
    public final lm6 c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mm6(go4 go4Var, qm6 qm6Var, boolean z, int i) {
        this(r3, qm6Var, r5, z, null, r10.toString());
        String str = "Decoder init failed: [" + i + "], " + go4Var;
        String str2 = go4Var.t;
        StringBuilder k = b10.k("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_", i < 0 ? "neg_" : "");
        k.append(Math.abs(i));
    }

    public mm6(String str, Throwable th, String str2, boolean z, lm6 lm6Var, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = lm6Var;
        this.d = str3;
    }
}
