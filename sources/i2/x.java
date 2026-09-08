package i2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements e2.n, e2.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ x(f0 f0Var, int i10) {
        this.a = i10;
        this.b = f0Var;
    }

    @Override // e2.n
    public void c(Object obj, b2.q qVar) {
        ((b2.z0) obj).onEvents(this.b.f, new b2.y0(qVar));
    }

    @Override // e2.m
    public void invoke(Object obj) {
        b2.z0 z0Var = (b2.z0) obj;
        switch (this.a) {
            case 3:
                z0Var.onAvailableCommandsChanged(this.b.N);
                break;
            default:
                z0Var.onPlaylistMetadataChanged(this.b.P);
                break;
        }
    }
}
