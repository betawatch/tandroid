package k2;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        StringBuilder l4 = hg.k0.l("AudioTrack init failed ", i10, " Config(", i11, ", ");
        hg.k0.t(l4, i12, ", ", i13, ", ");
        l4.append(i14);
        l4.append(") ");
        l4.append(sVar);
        l4.append(z10 ? " (recoverable)" : "");
        this.a = i10;
        this.b = z10;
        this.c = sVar;
    }
}
