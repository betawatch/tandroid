package na;

import la.u;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends u {
    public volatile u a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ la.g d;
    public final /* synthetic */ sa.a e;
    public final /* synthetic */ g f;

    public f(g gVar, boolean z10, boolean z11, la.g gVar2, sa.a aVar) {
        this.f = gVar;
        this.b = z10;
        this.c = z11;
        this.d = gVar2;
        this.e = aVar;
    }

    @Override // la.u
    public final Object read(ta.a aVar) {
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

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        if (this.c) {
            cVar.i();
            return;
        }
        u uVar = this.a;
        if (uVar == null) {
            uVar = this.d.c(this.f, this.e);
            this.a = uVar;
        }
        uVar.write(cVar, obj);
    }
}
