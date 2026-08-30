package l3;

import kh.a2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class u extends Exception {
    public final int a;
    public final boolean b;
    public final j3.n0 c;

    public u(int i10, j3.n0 n0Var, boolean z4) {
        super(a2.j(i10, "AudioTrack write failed: "));
        this.b = z4;
        this.a = i10;
        this.c = n0Var;
    }
}
