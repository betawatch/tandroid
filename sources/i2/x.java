package i2;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements e2.n, e2.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ x(f0 f0Var, int i10) {
        this.a = i10;
        this.b = f0Var;
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
