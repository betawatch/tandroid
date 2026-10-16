package k2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class h extends Exception {
    public final int a;
    public final boolean b;

    public h(int i10, boolean z10) {
        super(i2.d.j(i10, "AudioOutput write failed: "));
        this.b = z10;
        this.a = i10;
    }
}
