package hb;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class a0 extends y {
    public final eb.o a;
    public final eb.g b;
    public final lb.a c;
    public final eb.v d;
    public final a6.i e = new a6.i(this, 23);
    public final boolean f;
    public volatile eb.u g;

    public a0(eb.o oVar, eb.g gVar, lb.a aVar, eb.v vVar, boolean z10) {
        this.a = oVar;
        this.b = gVar;
        this.c = aVar;
        this.d = vVar;
        this.f = z10;
    }

    @Override // hb.y
    public final eb.u a() {
        if (this.a != null) {
            return this;
        }
        eb.u uVar = this.g;
        if (uVar != null) {
            return uVar;
        }
        eb.u c10 = this.b.c(this.d, this.c);
        this.g = c10;
        return c10;
    }

    @Override // eb.u
    public final Object read(mb.a aVar) {
        eb.u uVar = this.g;
        if (uVar == null) {
            uVar = this.b.c(this.d, this.c);
            this.g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        eb.o oVar = this.a;
        if (oVar == null) {
            eb.u uVar = this.g;
            if (uVar == null) {
                uVar = this.b.c(this.d, this.c);
                this.g = uVar;
            }
            uVar.write(bVar, obj);
            return;
        }
        if (this.f && obj == null) {
            bVar.i();
        } else {
            gb.d.l(oVar.serialize(obj, this.c.b, this.e), bVar);
        }
    }
}
