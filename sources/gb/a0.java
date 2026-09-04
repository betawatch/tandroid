package gb;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a0 extends y {
    public final db.o a;
    public final db.g b;
    public final kb.a c;
    public final db.v d;
    public final a4.m e = new a4.m(this, 22);
    public final boolean f;
    public volatile db.u g;

    public a0(db.o oVar, db.g gVar, kb.a aVar, db.v vVar, boolean z10) {
        this.a = oVar;
        this.b = gVar;
        this.c = aVar;
        this.d = vVar;
        this.f = z10;
    }

    @Override // gb.y
    public final db.u a() {
        if (this.a != null) {
            return this;
        }
        db.u uVar = this.g;
        if (uVar != null) {
            return uVar;
        }
        db.u c10 = this.b.c(this.d, this.c);
        this.g = c10;
        return c10;
    }

    @Override // db.u
    public final Object read(lb.a aVar) {
        db.u uVar = this.g;
        if (uVar == null) {
            uVar = this.b.c(this.d, this.c);
            this.g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        db.o oVar = this.a;
        if (oVar == null) {
            db.u uVar = this.g;
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
            fb.d.l(oVar.serialize(obj, this.c.b, this.e), bVar);
        }
    }
}
