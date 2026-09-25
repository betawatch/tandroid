package k2;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class o extends Exception {
    public final int a;
    public final boolean b;
    public final b2.s c;

    public o(int i10, b2.s sVar, boolean z10) {
        super(hg.c.h(i10, "AudioTrack write failed: "));
        this.b = z10;
        this.a = i10;
        this.c = sVar;
    }
}
