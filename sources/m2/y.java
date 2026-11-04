package m2;

import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y extends Exception {
    public final int a;
    public final boolean b;
    public final d2.v c;

    public y(int i3, d2.v vVar, boolean z10) {
        super(p1.i(i3, "AudioTrack write failed: "));
        this.b = z10;
        this.a = i3;
        this.c = vVar;
    }
}
