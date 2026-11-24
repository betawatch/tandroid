// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class om0 implements mm0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ylb b;

    public /* synthetic */ om0(ylb ylbVar, byte b) {
        this.a = b;
        this.b = ylbVar;
    }

    @Override // mm0
    public final int o(ylb ylbVar, boolean z) {
        byte b = this.a;
        ylb ylbVar2 = this.b;
        switch (b) {
            case 0:
                if (qqd.d(z8c.t0, ylbVar2)) {
                    return cmb.p1(e86.e(262144) ? 0.85f : 0.76f, cmb.v0(cmb.Ie, ylbVar));
                }
                return on2.p(cmb.v0(cmb.Ie, ylbVar), nm7.d4);
            case 1:
                if (qqd.d(z8c.t0, ylbVar2)) {
                    return cmb.p1(e86.e(262144) ? 0.85f : 0.76f, cmb.v0(cmb.Se, ylbVar));
                }
                return on2.p(cmb.v0(z ? cmb.r8 : cmb.Se, ylbVar), nm7.d4);
            default:
                if (qqd.d(z8c.t0, ylbVar2)) {
                    return cmb.p1(e86.e(262144) ? 0.85f : 0.76f, cmb.v0(cmb.Se, ylbVar));
                }
                return on2.p(cmb.v0(z ? cmb.r8 : cmb.Se, ylbVar), nm7.d4);
        }
    }
}
