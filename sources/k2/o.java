package k2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
