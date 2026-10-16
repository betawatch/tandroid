package i2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
