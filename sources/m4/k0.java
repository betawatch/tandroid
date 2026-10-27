package m4;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ k0(p0 p0Var, int i10, int i11) {
        this.a = i11;
        this.b = p0Var;
        this.c = i10;
    }

    @Override // m4.o0
    public final void i(w wVar) {
        int i10 = this.a;
        int i11 = 0;
        r0 = false;
        boolean z10 = false;
        i11 = 0;
        i11 = 0;
        int i12 = this.c;
        p0 p0Var = this.b;
        switch (i10) {
            case 0:
                n1 n1Var = p0Var.g.t;
                int i13 = o.a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 == 1) {
                        i11 = 1;
                    } else if (i12 == 2 || i12 == 3) {
                        i11 = 2;
                    } else {
                        e2.a.l("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i12 + " was converted to `Player.REPEAT_MODE_OFF`");
                    }
                }
                n1Var.j(i11);
                return;
            default:
                n1 n1Var2 = p0Var.g.t;
                int i14 = o.a;
                if (i12 != -1 && i12 != 0) {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalArgumentException(ic.a.i(i12, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                n1Var2.w(z10);
                return;
        }
    }
}
