// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class om6 extends Exception {
    public final String a;
    public final boolean b;
    public final nm6 c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public om6(ko4 ko4Var, tm6 tm6Var, boolean z, int i) {
        this(r3, tm6Var, r5, z, null, r10.toString());
        String str = "Decoder init failed: [" + i + "], " + ko4Var;
        String str2 = ko4Var.t;
        StringBuilder l = c00.l("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_", i < 0 ? "neg_" : "");
        l.append(Math.abs(i));
    }

    public om6(String str, Throwable th, String str2, boolean z, nm6 nm6Var, String str3) {
        super(str, th);
        this.a = str2;
        this.b = z;
        this.c = nm6Var;
        this.d = str3;
    }
}
