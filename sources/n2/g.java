package n2;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class g extends Exception {
    public final int a;
    public final boolean b;

    public g(int i7, boolean z10) {
        super(i5.c.i(i7, "AudioOutput write failed: "));
        this.b = z10;
        this.a = i7;
    }
}
