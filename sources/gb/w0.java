package gb;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class w0 implements ib.b {
    public final /* synthetic */ int a;
    public final ib.c b;
    public final ib.c c;

    public /* synthetic */ w0(ib.c cVar, ib.c cVar2, int i7) {
        this.a = i7;
        this.b = cVar;
        this.c = cVar2;
    }

    @Override // fd.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new v0((j1) this.b.get(), (k1) this.c.get());
            default:
                return new jb.l((jb.q) this.b.get(), (jb.q) this.c.get());
        }
    }
}
