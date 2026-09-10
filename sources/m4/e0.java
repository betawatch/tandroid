package m4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements k0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ e0(l0 l0Var, int i10, int i11) {
        this.a = i11;
        this.b = l0Var;
        this.c = i10;
    }

    @Override // m4.k0
    public final void h(r rVar) {
        int i10 = this.a;
        int i11 = 0;
        r0 = false;
        boolean z10 = false;
        i11 = 0;
        i11 = 0;
        int i12 = this.c;
        l0 l0Var = this.b;
        switch (i10) {
            case 0:
                l1 l1Var = l0Var.g.t;
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
                l1Var.j(i11);
                return;
            default:
                l1 l1Var2 = l0Var.g.t;
                int i14 = k.a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalArgumentException(hc.b.j(i12, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                l1Var2.x(z10);
                return;
        }
    }
}
