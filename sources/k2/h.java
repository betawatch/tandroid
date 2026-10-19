package k2;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class h extends Exception {
    public final int a;
    public final boolean b;

    public h(int i10, boolean z10) {
        super(i2.e.j(i10, "AudioOutput write failed: "));
        this.b = z10;
        this.a = i10;
    }
}
