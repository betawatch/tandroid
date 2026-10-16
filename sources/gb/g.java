package gb;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class g extends eb.u {
    public volatile eb.u a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ eb.g d;
    public final /* synthetic */ lb.a e;
    public final /* synthetic */ h f;

    public g(h hVar, boolean z10, boolean z11, eb.g gVar, lb.a aVar) {
        this.f = hVar;
        this.b = z10;
        this.c = z11;
        this.d = gVar;
        this.e = aVar;
    }

    @Override // eb.u
    public final Object read(mb.a aVar) {
        if (this.b) {
            aVar.C();
            return null;
        }
        eb.u uVar = this.a;
        if (uVar == null) {
            uVar = this.d.c(this.f, this.e);
            this.a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        if (this.c) {
            bVar.i();
            return;
        }
        eb.u uVar = this.a;
        if (uVar == null) {
            uVar = this.d.c(this.f, this.e);
            this.a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
