package k2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class z extends Exception {
    public final int a;
    public final boolean b;
    public final b2.x c;

    public z(int i10, b2.x xVar, boolean z10) {
        super(ic.a.i(i10, "AudioTrack write failed: "));
        this.b = z10;
        this.a = i10;
        this.c = xVar;
    }
}
