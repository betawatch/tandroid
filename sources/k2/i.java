package k2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i extends Exception {
    public final int a;
    public final boolean b;

    public i(int i10, boolean z10) {
        super(ic.a.i(i10, "AudioOutput write failed: "));
        this.b = z10;
        this.a = i10;
    }
}
