// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bob extends rob {
    public final /* synthetic */ yv1 m2;
    public final /* synthetic */ boolean n2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bob(Object obj, yv1 yv1Var, boolean z) {
        super(obj, null, true);
        this.m2 = yv1Var;
        this.n2 = z;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        wv1 wv1Var = this.m2.Ba;
        wv1Var.q(wv1Var.f, wv1Var.g, false, Boolean.valueOf(this.n2), false);
    }
}
