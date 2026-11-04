package o4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements n0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ j0(o0 o0Var, int i3, int i10) {
        this.a = i10;
        this.b = o0Var;
        this.c = i3;
    }

    @Override // o4.n0
    public final void c(v vVar) {
        int i3 = this.a;
        int i10 = 0;
        r0 = false;
        boolean z10 = false;
        i10 = 0;
        i10 = 0;
        int i11 = this.c;
        o0 o0Var = this.b;
        switch (i3) {
            case 0:
                l1 l1Var = o0Var.h.t;
                int i12 = n.a;
                if (i11 != -1 && i11 != 0) {
                    if (i11 == 1) {
                        i10 = 1;
                    } else if (i11 == 2 || i11 == 3) {
                        i10 = 2;
                    } else {
                        g2.a.l("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i11 + " was converted to `Player.REPEAT_MODE_OFF`");
                    }
                }
                l1Var.k(i10);
                return;
            default:
                l1 l1Var2 = o0Var.h.t;
                int i13 = n.a;
                if (i11 != -1 && i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalArgumentException(k2.p1.i(i11, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                l1Var2.x(z10);
                return;
        }
    }
}
