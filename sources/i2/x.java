package i2;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements e2.p, e2.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ x(i0 i0Var, int i10) {
        this.a = i10;
        this.b = i0Var;
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
