package k2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class y extends Exception {
    public final int a;
    public final boolean b;
    public final b2.w c;

    public y(int i10, b2.w wVar, boolean z10) {
        super(i2.d.j(i10, "AudioTrack write failed: "));
        this.b = z10;
        this.a = i10;
        this.c = wVar;
    }
}
