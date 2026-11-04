package m2;

import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends Exception {
    public final int a;
    public final boolean b;

    public g(int i3, boolean z10) {
        super(p1.i(i3, "AudioOutput write failed: "));
        this.b = z10;
        this.a = i3;
    }
}
