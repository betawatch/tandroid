package e9;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class r extends t {
    public final /* synthetic */ int f;
    public final /* synthetic */ v h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(v vVar, int i10) {
        super(vVar);
        this.f = i10;
        this.h = vVar;
    }

    @Override // e9.t
    public final Object a(int i10) {
        switch (this.f) {
            case 0:
                return this.h.i()[i10];
            case 1:
                return new u(this.h, i10);
            default:
                return this.h.j()[i10];
        }
    }
}
