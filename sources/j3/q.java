package j3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q extends Exception {
    public final int a;
    public final boolean b;
    public final h3.t0 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(int i10, int i11, int i12, int i13, h3.t0 t0Var, boolean z10, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        StringBuilder p6 = com.google.android.recaptcha.internal.a.p("AudioTrack init failed ", i10, " Config(", i11, ", ");
        i0.a.x(p6, i12, ", ", i13, ")");
        p6.append(z10 ? " (recoverable)" : "");
        this.a = i10;
        this.b = z10;
        this.c = t0Var;
    }
}
