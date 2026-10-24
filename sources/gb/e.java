package gb;

import eb.u;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class e extends u {
    public volatile u a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ eb.g d;
    public final /* synthetic */ lb.a e;
    public final /* synthetic */ f f;

    public e(f fVar, boolean z10, boolean z11, eb.g gVar, lb.a aVar) {
        this.f = fVar;
        this.b = z10;
        this.c = z11;
        this.d = gVar;
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
