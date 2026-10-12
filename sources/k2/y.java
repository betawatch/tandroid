package k2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class y extends Exception {
    public final int a;
    public final boolean b;
    public final b2.x c;

    public y(int i10, b2.x xVar, boolean z10) {
        super(i2.d.i(i10, "AudioTrack write failed: "));
        this.b = z10;
        this.a = i10;
        this.c = xVar;
    }
}
