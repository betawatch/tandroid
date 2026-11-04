package db;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v0 implements fb.b {
    public final /* synthetic */ int a;
    public final fb.c b;
    public final fb.c c;

    public /* synthetic */ v0(fb.c cVar, fb.c cVar2, int i3) {
        this.a = i3;
        this.b = cVar;
        this.c = cVar2;
    }

    @Override // cd.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new u0((i1) this.b.get(), (j1) this.c.get());
            default:
                return new gb.l((gb.q) this.b.get(), (gb.q) this.c.get());
        }
    }
}
