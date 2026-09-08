package m4;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements j0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d0(k0 k0Var, int i10, int i11) {
        this.a = i11;
        this.b = k0Var;
        this.c = i10;
    }

    @Override // m4.j0
    public final void f(r rVar) {
        int i10 = this.a;
        int i11 = 0;
        r0 = false;
        boolean z10 = false;
        i11 = 0;
        i11 = 0;
        int i12 = this.c;
        k0 k0Var = this.b;
        switch (i10) {
            case 0:
                j1 j1Var = k0Var.g.t;
                int i13 = k.a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 == 1) {
                        i11 = 1;
                    } else if (i12 == 2 || i12 == 3) {
                        i11 = 2;
                    } else {
                        e2.a.n("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i12 + " was converted to `Player.REPEAT_MODE_OFF`");
                    }
                }
                j1Var.j(i11);
                return;
            default:
                j1 j1Var2 = k0Var.g.t;
                int i14 = k.a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalArgumentException(i2.g.i(i12, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                j1Var2.x(z10);
                return;
        }
    }
}
