package n2;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class u extends Exception {
    public final boolean a;
    public final e2.u b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(int i7, int i10, int i11, int i12, e2.u uVar, boolean z9, l lVar) {
        super(r3.toString(), lVar);
        StringBuilder o4 = jg.g.o("AudioTrack init failed 0 Config(", i7, ", ", i10, ", ");
        jg.g.x(o4, i11, ", ", i12, ") ");
        o4.append(uVar);
        o4.append(z9 ? " (recoverable)" : "");
        this.a = z9;
        this.b = uVar;
    }
}
