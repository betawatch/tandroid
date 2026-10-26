package k2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
