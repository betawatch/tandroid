package gb;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
