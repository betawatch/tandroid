package n2;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class u extends Exception {
    public final boolean a;
    public final e2.u b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(int i7, int i10, int i11, int i12, e2.u uVar, boolean z10, l lVar) {
        super(r3.toString(), lVar);
        StringBuilder n10 = i5.c.n("AudioTrack init failed 0 Config(", i7, ", ", i10, ", ");
        i5.c.z(n10, i11, ", ", i12, ") ");
        n10.append(uVar);
        n10.append(z10 ? " (recoverable)" : "");
        this.a = z10;
        this.b = uVar;
    }
}
