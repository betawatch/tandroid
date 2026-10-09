package gb;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class a0 extends y {
    public final db.o a;
    public final db.g b;
    public final kb.a c;
    public final db.v d;
    public final a4.l e = new a4.l(this, 18);
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
