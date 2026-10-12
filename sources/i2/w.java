package i2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements e2.p, e2.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ w(h0 h0Var, int i10) {
        this.a = i10;
        this.b = h0Var;
    }

    @Override // e2.p
    public void c(Object obj, b2.v vVar) {
        ((b2.e1) obj).onEvents(this.b.f, new b2.d1(vVar));
    }

    @Override // e2.o
    public void invoke(Object obj) {
        b2.e1 e1Var = (b2.e1) obj;
        switch (this.a) {
            case 3:
                e1Var.onAvailableCommandsChanged(this.b.P);
                break;
            default:
                e1Var.onPlaylistMetadataChanged(this.b.R);
                break;
        }
    }
}
