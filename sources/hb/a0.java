package hb;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class a0 extends y {
    public final eb.o a;
    public final eb.g b;
    public final lb.a c;
    public final eb.v d;
    public final ya.d e = new ya.d(this, 22);
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
