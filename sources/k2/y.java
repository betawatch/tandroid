package k2;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class y extends Exception {
    public final int a;
    public final boolean b;
    public final b2.w c;

    public y(int i10, b2.w wVar, boolean z10) {
        super(i2.e.j(i10, "AudioTrack write failed: "));
        this.b = z10;
        this.a = i10;
        this.c = wVar;
    }
}
