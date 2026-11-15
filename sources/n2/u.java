package n2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        i5.c.y(n10, i11, ", ", i12, ") ");
        n10.append(uVar);
        n10.append(z10 ? " (recoverable)" : "");
        this.a = z10;
        this.b = uVar;
    }
}
