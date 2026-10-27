package ib;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a0 extends y {
    public final fb.o a;
    public final fb.g b;
    public final mb.a c;
    public final fb.v d;
    public final rb.c e = new rb.c(this, 28);
    public final boolean f;
    public volatile fb.u g;

    public a0(fb.o oVar, fb.g gVar, mb.a aVar, fb.v vVar, boolean z10) {
        this.a = oVar;
        this.b = gVar;
        this.c = aVar;
        this.d = vVar;
        this.f = z10;
    }

    @Override // ib.y
    public final fb.u a() {
        if (this.a != null) {
            return this;
        }
        fb.u uVar = this.g;
        if (uVar != null) {
            return uVar;
        }
        fb.u c10 = this.b.c(this.d, this.c);
        this.g = c10;
        return c10;
    }

    @Override // fb.u
    public final Object read(nb.a aVar) {
        fb.u uVar = this.g;
        if (uVar == null) {
            uVar = this.b.c(this.d, this.c);
            this.g = uVar;
        }
        return uVar.read(aVar);
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        fb.o oVar = this.a;
        if (oVar == null) {
            fb.u uVar = this.g;
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
            hb.d.l(oVar.serialize(obj, this.c.b, this.e), bVar);
        }
    }
}
