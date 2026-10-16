package k2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class y extends Exception {
    public final int a;
    public final boolean b;
    public final b2.x c;

    public y(int i10, b2.x xVar, boolean z10) {
        super(i2.d.j(i10, "AudioTrack write failed: "));
        this.b = z10;
        this.a = i10;
        this.c = xVar;
    }
}
