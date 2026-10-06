package i2;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements e2.m, e2.h {
    public final /* synthetic */ b2.n0 a;

    public /* synthetic */ t(b2.n0 n0Var) {
        this.a = n0Var;
    }

    @Override // e2.h
    public void accept(Object obj) {
        ((m4.e1) obj).C(this.a);
    }

    @Override // e2.m
    public void invoke(Object obj) {
        ((b2.z0) obj).onMediaMetadataChanged(this.a);
    }
}
