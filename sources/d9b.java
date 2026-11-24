// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class d9b implements qk4 {
    public final /* synthetic */ v9b a;

    public d9b(v9b v9bVar) {
        this.a = v9bVar;
    }

    @Override // qk4
    public final void setInvert(float f) {
        v9b v9bVar = this.a;
        gm.j3(v9bVar.n, f > 0.5f);
        gm.m3(v9bVar.n, f > 0.5f);
    }

    @Override // qk4
    public final void invalidate() {
    }
}
