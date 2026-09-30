package k2;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class o extends Exception {
    public final int a;
    public final boolean b;
    public final b2.s c;

    public o(int i10, b2.s sVar, boolean z10) {
        super(hg.c.h(i10, "AudioTrack write failed: "));
        this.b = z10;
        this.a = i10;
        this.c = sVar;
    }
}
