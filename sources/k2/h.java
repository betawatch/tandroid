package k2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class h extends Exception {
    public final int a;
    public final boolean b;

    public h(int i10, boolean z10) {
        super(i2.d.i(i10, "AudioOutput write failed: "));
        this.b = z10;
        this.a = i10;
    }
}
