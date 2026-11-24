// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cob implements job {
    public boolean a;
    public final /* synthetic */ yv1 b;

    public cob(yv1 yv1Var, boolean z) {
        this.b = yv1Var;
        this.a = z;
    }

    @Override // job
    public final boolean a() {
        return this.a;
    }

    @Override // job
    public final boolean s() {
        return true;
    }

    @Override // job
    public final void w(boolean z) {
        boolean z2 = !this.a;
        this.a = z2;
        wv1 wv1Var = this.b.Ba;
        wv1Var.q(wv1Var.f, wv1Var.g, z, Boolean.valueOf(z2), false);
    }
}
