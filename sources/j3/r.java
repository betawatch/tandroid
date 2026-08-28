package j3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r extends Exception {
    public final int a;
    public final boolean b;
    public final h3.t0 c;

    public r(int i9, h3.t0 t0Var, boolean z10) {
        super(r0.l(i9, "AudioTrack write failed: "));
        this.b = z10;
        this.a = i9;
        this.c = t0Var;
    }
}
