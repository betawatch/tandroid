package hb;

import fb.u;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f extends u {
    public volatile u a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ fb.g d;
    public final /* synthetic */ mb.a e;
    public final /* synthetic */ g f;

    public f(g gVar, boolean z10, boolean z11, fb.g gVar2, mb.a aVar) {
        this.f = gVar;
        this.b = z10;
        this.c = z11;
        this.d = gVar2;
        this.e = aVar;
    }

    @Override // fb.u
    public final Object read(nb.a aVar) {
        if (this.b) {
            aVar.C();
            return null;
        }
        u uVar = this.a;
        if (uVar == null) {
            uVar = this.d.c(this.f, this.e);
            this.a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        if (this.c) {
            bVar.i();
            return;
        }
        u uVar = this.a;
        if (uVar == null) {
            uVar = this.d.c(this.f, this.e);
            this.a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
