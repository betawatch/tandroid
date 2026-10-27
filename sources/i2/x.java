package i2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements e2.p, e2.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ x(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // e2.p
    public void f(Object obj, b2.v vVar) {
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
