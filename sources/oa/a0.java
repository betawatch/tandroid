package oa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a0 extends y {
    public final la.o a;
    public final la.g b;
    public final sa.a c;
    public final la.v d;
    public final n5.a0 e = new n5.a0(this, 4);
    public final boolean f;
    public volatile la.u g;

    public a0(la.o oVar, la.g gVar, sa.a aVar, la.v vVar, boolean z10) {
        this.a = oVar;
        this.b = gVar;
        this.c = aVar;
        this.d = vVar;
        this.f = z10;
    }

    @Override // oa.y
    public final la.u a() {
        if (this.a != null) {
            return this;
        }
        la.u uVar = this.g;
        if (uVar != null) {
            return uVar;
        }
        la.u c10 = this.b.c(this.d, this.c);
        this.g = c10;
        return c10;
    }

    @Override // la.u
    public final Object read(ta.a aVar) {
        la.u uVar = this.g;
        if (uVar == null) {
            uVar = this.b.c(this.d, this.c);
            this.g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        la.o oVar = this.a;
        if (oVar == null) {
            la.u uVar = this.g;
            if (uVar == null) {
                uVar = this.b.c(this.d, this.c);
                this.g = uVar;
            }
            uVar.write(cVar, obj);
            return;
        }
        if (this.f && obj == null) {
            cVar.i();
        } else {
            na.d.l(oVar.serialize(obj, this.c.b, this.e), cVar);
        }
    }
}
