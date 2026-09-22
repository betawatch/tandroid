package fb;

import db.u;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class f extends u {
    public volatile u a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ db.g d;
    public final /* synthetic */ kb.a e;
    public final /* synthetic */ g f;

    public f(g gVar, boolean z10, boolean z11, db.g gVar2, kb.a aVar) {
        this.f = gVar;
        this.b = z10;
        this.c = z11;
        this.d = gVar2;
        this.e = aVar;
    }

    @Override // db.u
    public final Object read(lb.a aVar) {
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

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
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
