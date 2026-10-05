package k2;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class n extends Exception {
    public final int a;
    public final boolean b;
    public final b2.s c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(int i10, int i11, int i12, int i13, int i14, b2.s sVar, boolean z10, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        StringBuilder k10 = hg.c.k("AudioTrack init failed ", i10, " Config(", i11, ", ");
        hg.c.t(k10, i12, ", ", i13, ", ");
        k10.append(i14);
        k10.append(") ");
        k10.append(sVar);
        k10.append(z10 ? " (recoverable)" : "");
        this.a = i10;
        this.b = z10;
        this.c = sVar;
    }
}
