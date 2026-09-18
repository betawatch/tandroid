package i2;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements e2.n, e2.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ w(e0 e0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
    }

    @Override // e2.n
    public void e(Object obj, b2.q qVar) {
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
