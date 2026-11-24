// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nif implements uif {
    public final kff a;
    public final ejf b;

    public nif(ejf ejfVar, pgf pgfVar, kff kffVar) {
        this.b = ejfVar;
        this.a = kffVar;
    }

    @Override // uif
    public final void a(Object obj) {
        this.b.getClass();
        djf djfVar = ((wgf) obj).zzc;
        if (djfVar.d) {
            djfVar.d = false;
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // uif
    public final boolean b(wgf wgfVar, wgf wgfVar2) {
        this.b.getClass();
        return wgfVar.zzc.equals(wgfVar2.zzc);
    }

    @Override // uif
    public final void c(Object obj, Object obj2) {
        vif.o(this.b, obj, obj2);
    }

    @Override // uif
    public final void d(Object obj, hoe hoeVar) {
        ts2.t(obj);
        throw null;
    }

    @Override // uif
    public final int e(wgf wgfVar) {
        this.b.getClass();
        djf djfVar = wgfVar.zzc;
        int i = djfVar.c;
        if (i != -1) {
            return i;
        }
        djfVar.c = 0;
        return 0;
    }

    @Override // uif
    public final int f(wgf wgfVar) {
        this.b.getClass();
        wgfVar.zzc.getClass();
        return 506991;
    }

    @Override // uif
    public final boolean g(Object obj) {
        ts2.t(obj);
        throw null;
    }

    @Override // uif
    public final wgf zzc() {
        kff kffVar = this.a;
        return kffVar instanceof wgf ? (wgf) ((wgf) kffVar).h(4, null) : ((vgf) ((wgf) kffVar).h(5, null)).b();
    }
}
