package gb;

import eb.u;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class f extends u {
    public volatile u a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ eb.g d;
    public final /* synthetic */ lb.a e;
    public final /* synthetic */ g f;

    public f(g gVar, boolean z10, boolean z11, eb.g gVar2, lb.a aVar) {
        this.f = gVar;
        this.b = z10;
        this.c = z11;
        this.d = gVar2;
        this.e = aVar;
    }

    @Override // eb.u
    public final Object read(mb.a aVar) {
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

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
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
