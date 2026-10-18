package i2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements e2.p, e2.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;

    public /* synthetic */ w(h0 h0Var, int i10) {
        this.a = i10;
        this.b = h0Var;
    }

    @Override // e2.p
    public void c(Object obj, b2.u uVar) {
        ((b2.d1) obj).onEvents(this.b.f, new b2.c1(uVar));
    }

    @Override // e2.o
    public void invoke(Object obj) {
        b2.d1 d1Var = (b2.d1) obj;
        switch (this.a) {
            case 3:
                d1Var.onAvailableCommandsChanged(this.b.P);
                break;
            default:
                d1Var.onPlaylistMetadataChanged(this.b.R);
                break;
        }
    }
}
