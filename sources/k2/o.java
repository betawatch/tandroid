package k2;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class o extends Exception {
    public final int a;
    public final boolean b;
    public final b2.s c;

    public o(int i10, b2.s sVar, boolean z10) {
        super(hg.c.i(i10, "AudioTrack write failed: "));
        this.b = z10;
        this.a = i10;
        this.c = sVar;
    }
}
