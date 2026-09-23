package i2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements e2.m, e2.h {
    public final /* synthetic */ b2.n0 a;

    public /* synthetic */ t(b2.n0 n0Var) {
        this.a = n0Var;
    }

    @Override // e2.h
    public void accept(Object obj) {
        ((m4.f1) obj).C(this.a);
    }

    @Override // e2.m
    public void invoke(Object obj) {
        ((b2.z0) obj).onMediaMetadataChanged(this.a);
    }
}
