package l3;

import j7.l1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s extends Exception {
    public final int a;
    public final boolean b;
    public final j3.t0 c;

    public s(int i10, j3.t0 t0Var, boolean z10) {
        super(l1.k(i10, "AudioTrack write failed: "));
        this.b = z10;
        this.a = i10;
        this.c = t0Var;
    }
}
