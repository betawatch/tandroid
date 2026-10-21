package k2;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
