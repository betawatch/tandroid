package k2;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class o extends Exception {
    public final int a;
    public final boolean b;
    public final b2.s c;

    public o(int i10, b2.s sVar, boolean z10) {
        super(i2.g.i(i10, "AudioTrack write failed: "));
        this.b = z10;
        this.a = i10;
        this.c = sVar;
    }
}
