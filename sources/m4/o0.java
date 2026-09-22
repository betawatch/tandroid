package m4;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ o0(float f7, int i10) {
        this.a = i10;
        this.b = f7;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((j1) obj).a(this.b);
                break;
            default:
                ((j1) obj).U(this.b);
                break;
        }
    }
}
