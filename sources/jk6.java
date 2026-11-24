// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class jk6 extends Exception {
    public final String a;
    public final boolean b;
    public final ik6 c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jk6(fm4 fm4Var, nk6 nk6Var, boolean z, int i) {
        this(r3, nk6Var, r5, z, null, r10.toString());
        String str = "Decoder init failed: [" + i + "], " + fm4Var;
        String str2 = fm4Var.t;
        StringBuilder k = b00.k("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_", i < 0 ? "neg_" : "");
        k.append(Math.abs(i));
    }

    public jk6(String str, Throwable th, String str2, boolean z, ik6 ik6Var, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = ik6Var;
        this.d = str3;
    }
}
